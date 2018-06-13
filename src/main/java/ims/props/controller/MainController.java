package ims.props.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ims.order.domain.Order;
import ims.order.domain.OrderDetails;
import ims.order.service.OrderDetailsService;
import ims.order.service.OrderService;
import ims.product.domain.Product;
import ims.product.service.ProductService;
import ims.props.domain.PropsDetails;
import ims.props.service.PropsDetailsService;

/**
 * 
 * @ClassName:  MainController   
 * @Description:TODO
 * @author: yueling
 * @date:   2018年5月22日 下午3:30:13   
 *     
 * @Copyright: 2018 yueling Inc. All rights reserved.
 */
@Controller
public class MainController {
    
	private final OrderService orderService;
	private final OrderDetailsService orderDetailsService;
	private final ProductService productService;
	private final PropsDetailsService propsDetailsService;
	

	@Autowired
	public MainController(OrderService orderService,OrderDetailsService orderDetailsService,ProductService productService,PropsDetailsService propsDetailsService) {
		this.orderService=orderService;
		this.orderDetailsService=orderDetailsService;
		this.productService = productService;
		this.propsDetailsService = propsDetailsService;
	}
    /**
     * 主页
     *
     * @return 主页
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/userTest")
    public String userTest(Model model) throws JSONException {
    	SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd");
        Date nowDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nowDate);
        Date now = calendar.getTime();
        
        calendar.setTime(nowDate);
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE)-1);
        Date yestaday = calendar.getTime();
        
        calendar.setTime(nowDate);
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE)-7);
        Date aweekago = calendar.getTime();
        
        calendar.setTime(nowDate);
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)-1);
        Date amonthago = calendar.getTime();
        
        //一下四类数据为滚动统计展示使用
        //1、从订单中统计数据：总共订单数、当天订单数、近一周订单数、近一个月订单数
        HashMap<String, Object> map = new HashMap<>();
        map.put("orderStatus", "5");
        long countOrder=orderService.getOrderInfo(map).size();
        map.put("orderDatetime", sdf.format(now));
        long nowOrder=orderService.getOrderInfo(map).size();
        map.put("orderDatetime", sdf.format(yestaday));
        long yestodayOrder=orderService.getOrderInfo(map).size();
        map.put("orderOperation", "1");
        map.put("orderDatetime", sdf.format(aweekago));
        long weekOrder=orderService.getOrderInfo(map).size();
        map.put("orderDatetime", sdf.format(amonthago));
        long monthOrder=orderService.getOrderInfo(map).size();
        
        model.addAttribute("countOrder",countOrder);
        model.addAttribute("yestodayOrder",yestodayOrder);
        model.addAttribute("nowOrder",nowOrder);
        model.addAttribute("weekOrder",weekOrder);
        model.addAttribute("monthOrder",monthOrder);
        
        
        //获取近一周每天的订单
        ArrayList<JSONObject> listOrder = new ArrayList<>();
        Date dateTemp=null;
        
        map.remove("orderOperation");
        List<Order> listByDay = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
        	long countOrderTemp=0,sumCount=0,sumMoney=0;
        	calendar.setTime(nowDate);
        	HashMap<String, List<Long>> orderTemp= new HashMap<>();
        	List<Long> sizeCountMoney = new ArrayList<>();
        	calendar.set(Calendar.DATE, calendar.get(Calendar.DATE)-i);
            dateTemp = calendar.getTime();
            map.put("orderDatetime", sdf.format(dateTemp));
            
            listByDay=orderService.getOrderInfo(map);
            countOrderTemp=listByDay.size();
            for(Order order : listByDay) {
            	sumCount+=Long.valueOf(order.getOrderSumCount());
            	sumMoney+=Long.valueOf(order.getOrderSumMoney());
            }
            
            sizeCountMoney.add(countOrderTemp);
            sizeCountMoney.add(sumCount);
            sizeCountMoney.add(sumMoney);
            
            
            orderTemp.put(sdf.format(dateTemp), sizeCountMoney);
            listOrder.add(new JSONObject(orderTemp));
		}
        model.addAttribute("listOrder",listOrder);
        
	    //获取近一周每天的件数
        
	    //获取近一周每天的金额
        
        
        
        //再来一组按月份的统计报表，按订单数
        
        ArrayList<JSONObject> listOrderByMonth = new ArrayList<>();
        Date dateYMTemp=null;
        long countOrderByMonthTemp=0,countOrderMoneyByMonthTemp=0;
        List<Order> listByMonth= new ArrayList<>();
        map.remove("orderOperation");
        SimpleDateFormat sdfYM= new SimpleDateFormat("yyyy-MM");
        for (int i = 0; i < 12; i++) {
        	countOrderMoneyByMonthTemp=0;
        	List<Long> countMoney = new ArrayList<>();
        	calendar.setTime(nowDate);
        	HashMap<String, List<Long>> orderTemp= new HashMap<>();
        	calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH)-i);
        	dateYMTemp = calendar.getTime();
            map.put("orderDatetime", sdfYM.format(dateYMTemp));
            listByMonth=orderService.getOrderInfo(map);
            
            countOrderByMonthTemp=listByMonth.size();
            for(Order order : listByMonth) {
            	countOrderMoneyByMonthTemp+=Long.valueOf(order.getOrderSumMoney());
            }
            
            countMoney.add(countOrderByMonthTemp);
            countMoney.add(countOrderMoneyByMonthTemp);
            
            orderTemp.put(sdfYM.format(dateYMTemp), countMoney);
            listOrderByMonth.add(new JSONObject(orderTemp));
		}
        model.addAttribute("listOrderByMonth",listOrderByMonth);
        
        
        //2、从订单明细中统计数据：产品销售件数最多，产品涉及订单最多，产品按材料销售最多，产品按颜色销售最多
        
        HashMap<String, String> statsResultMap = new HashMap<>();
        statsResultMap=orderDetailsService.getOrderDetailsGroupBySum(null);
        model.addAttribute("bysum", new JSONObject(statsResultMap));

        System.err.println(JSONObject.quote(statsResultMap.toString()));
        
        statsResultMap=orderDetailsService.getOrderDetailsGroupByOrder(null);
        model.addAttribute("byorder",new JSONObject(statsResultMap));
        
        statsResultMap=orderDetailsService.getOrderDetailsGroupByMaterial(null);
        model.addAttribute("bymaterial",new JSONObject(statsResultMap));
        
        statsResultMap=orderDetailsService.getOrderDetailsGroupByColor(null);
        model.addAttribute("bycolor",new JSONObject(statsResultMap));
        //3、从做货明细中统计：正在做货的量，已完结做货量，未做货量
        //未做货：从订单明细中统计总的-已完结做货量-正在做货量
        
        map.clear();
        map.put("orderStatus", "1");
        List<Order> listAll= new ArrayList<>();
        listAll= orderService.getOrderInfo(map);
        long allNewSumCount=0;
        for(Order order : listAll) {
        	allNewSumCount+=Long.valueOf(order.getOrderSumCount());
        }
        
        model.addAttribute("allNewSumCount",allNewSumCount);
        
        //4、从产品中统计：按日期倒序前5个产品
        List<Product> list=productService.getTopFive();
        JSONArray jsonArray = new JSONArray();
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd
		// HH:mm:ss");
		for (Product productTmp : list) {
			JSONObject tempJsonObject = new JSONObject();
			tempJsonObject.put("productId", productTmp.getProductId());
			tempJsonObject.put("productNo", productTmp.getProductNo());
			tempJsonObject.put("productName", productTmp.getProductName());
			if(productTmp.getProductImg()!=null&&productTmp.getProductImg()!="") {
				tempJsonObject.put("productImg", productTmp.getProductImg().replaceAll(" ", "+"));
			}else {
				tempJsonObject.put("productImg", "");
			}
			
			tempJsonObject.put("productCategory", productTmp.getProductCategory());
			tempJsonObject.put("productColor", productTmp.getProductColor());
			tempJsonObject.put("productSize", productTmp.getProductSize());
			tempJsonObject.put("productMaterial", productTmp.getProductMaterial());
			tempJsonObject.put("productCollar", productTmp.getProductCollar());
			tempJsonObject.put("productPocket", productTmp.getProductPocket());
			tempJsonObject.put("productRemarks", productTmp.getProductRemarks());
			tempJsonObject.put("productStatus", productTmp.getProductStatus());
			tempJsonObject.put("productCreate", productTmp.getProductCreate());
			tempJsonObject.put("productModify", productTmp.getProductModify());
			jsonArray.put(tempJsonObject);
			//System.err.println("propsTmp.getProductImg():" + propsTmp.getProductImg().replaceAll(" ", "+"));
		}

		model.addAttribute("toplist", jsonArray);
        //推荐产品：从产品中读取推荐产品（在产品中增加推荐属性，并控制推荐总数量） 作用：为推荐画廊提供数据
		//SELECT * from product WHERE product_recommend='1' and product_status='1';
        list=productService.getRecommend();
        jsonArray = new JSONArray();
        String idList="";
        for (Product productTmp : list) {
			JSONObject tempJsonObject = new JSONObject();
			tempJsonObject.put("productId", productTmp.getProductId());
			tempJsonObject.put("productNo", productTmp.getProductNo());
			tempJsonObject.put("productName", productTmp.getProductName());
			if(productTmp.getProductImg()!=null&&productTmp.getProductImg()!="") {
				tempJsonObject.put("productImg", productTmp.getProductImg().replaceAll(" ", "+"));
			}else {
				tempJsonObject.put("productImg", "");
			}
			
			tempJsonObject.put("productCategory", productTmp.getProductCategory());
			tempJsonObject.put("productColor", productTmp.getProductColor());
			tempJsonObject.put("productSize", productTmp.getProductSize());
			tempJsonObject.put("productMaterial", productTmp.getProductMaterial());
			tempJsonObject.put("productCollar", productTmp.getProductCollar());
			tempJsonObject.put("productPocket", productTmp.getProductPocket());
			tempJsonObject.put("productRemarks", productTmp.getProductRemarks());
			tempJsonObject.put("productStatus", productTmp.getProductStatus());
			tempJsonObject.put("productCreate", productTmp.getProductCreate());
			tempJsonObject.put("productModify", productTmp.getProductModify());
			jsonArray.put(tempJsonObject);
			
			idList=idList+","+String.valueOf(productTmp.getProductId());
			//System.err.println("propsTmp.getProductImg():" + propsTmp.getProductImg().replaceAll(" ", "+"));
		}

		model.addAttribute("recommendlist", jsonArray);
        
        if (idList.substring(1, idList.length())!="") {
        	List<OrderDetails> orderDetailsList= new ArrayList<>();
        	long orderDetailsSumCount=0;
        	orderDetailsList=orderDetailsService.getOrderDetailsByIds(idList.substring(1, idList.length()));
        	for(OrderDetails orderDetails:orderDetailsList ) {
        		orderDetailsSumCount+=Long.valueOf(orderDetails.getOrderDetailsProductNum());
        	}
        	model.addAttribute("orderDetailsSumCount", orderDetailsSumCount);
		}
        
        HashMap<String, Object> filterMap= new HashMap<>();
		filterMap.put("propsDetailsStatus", 1);
		List<PropsDetails> listPropsDetails = propsDetailsService.getPropsDetailsInfo(filterMap);
		JSONArray allPropsDetails = new JSONArray();
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (PropsDetails propsDetailsTmp : listPropsDetails) {
			JSONObject tem_jsonoObject = new JSONObject();
			tem_jsonoObject.put("queryPropsDetailsId", propsDetailsTmp.getPropsDetailsId());
			tem_jsonoObject.put("queryPropsDetailsName", propsDetailsTmp.getPropsDetailsName());
			allPropsDetails.put(tem_jsonoObject);
		}
		System.err.println(allPropsDetails);
		model.addAttribute("propsDetails", allPropsDetails);
    	return "indexa";
    }
    @RequestMapping("/help")
    public String help() {
        return "/help/index";
    }
    /**
     * 显示用户登录页面
     *
     * @return 返回页面
     */
    @RequestMapping("/userLogin")
    public String userLogin() {
        return "user/userLogin";
    }

    /**
     * 显示注册页面
     *
     * @return 返回页面
     */
    @RequestMapping("/userRegister")
    public String userRegister() {
        return "user/userRegister";
    }

    /**
     * 显示添加文章的页面
     *
     * @param userName 用户名
     * @param boardId  板块 id
     * @param request  请求
     * @return 返回页面
     */
    @RequestMapping("addPost")
    public String addPost(String userName, String boardId, HttpServletRequest request) {
        if (userName != null && boardId != null) {
            request.setAttribute("username", userName);
            request.setAttribute("boardId", boardId);

            return "/post/addPost";
        }

        return "redirect:/error";
    }

    /**
     * 显示添加回复的页面
     *
     * @param replyPostId   回复的文章的 id
     * @param replyUserName 回复用户的姓名
     * @param request       请求
     * @return 返回页面
     */
    @RequestMapping("addReply")
    public String addReply(int replyPostId, String replyUserName, HttpServletRequest request) {
        if (replyPostId > 0 && replyUserName != null) {
            request.setAttribute("replyPostId", replyPostId);
            request.setAttribute("replyUserName", replyUserName);

            return "reply/reply";
        }
        return "redirect:/error";
    }

    /**
     * 显示添加板块的页面
     *
     * @return 返回页面
     */
    @RequestMapping(value = "addBoard")
    public String addBoardPage() {
        return "/admin/addBoard";
    }

   
    /**
     * 错误页面
     *
     * @return 返回错误页面
     */
    @RequestMapping(value = "error")
    public String error() {
        return "error";
    }
}
