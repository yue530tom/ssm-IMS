package ims.order.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ims.order.domain.Cart;
import ims.order.domain.Order;
import ims.order.service.CartService;
import ims.order.service.OrderService;
import ims.product.domain.Product;
import ims.product.service.ProductService;
import ims.props.domain.Props;
import ims.props.domain.PropsDetails;
import ims.props.service.PropsDetailsService;
import ims.props.service.PropsService;


@Controller
@RequestMapping("/view")
public class ViewController {

	private final OrderService orderService;

	private final ProductService productService;
	private final PropsService propsService;
	private final PropsDetailsService propsDetailsService;
	private final CartService cartService;
	private final int pageSize = 5;
	@Autowired
	public ViewController(OrderService orderService,ProductService productService,PropsService propsService,PropsDetailsService propsDetailsService,CartService cartService) {
		this.orderService = orderService;
		this.productService=productService;
		this.propsService=propsService;
		this.propsDetailsService= propsDetailsService;
		this.cartService=cartService;
	}

	//需要携带数据到前台页面
	@RequestMapping(value = "/toViewPage", method = RequestMethod.GET)
	public String toOrderListPage(Model model) throws JSONException {
		HashMap<String, Object> filterMap= new HashMap<>();
		filterMap.put("propsStatus", 1);
		List<Props> list = propsService.getPropsInfo(filterMap);
		JSONArray allProps = new JSONArray();
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (Props propsTmp : list) {
			JSONObject tem_jsonoObject = new JSONObject();
			tem_jsonoObject.put("propsId", propsTmp.getPropsId());
			tem_jsonoObject.put("propsName", propsTmp.getPropsName());
			allProps.put(tem_jsonoObject);
		}
		
		filterMap= new HashMap<>();
		filterMap.put("propsDetailsStatus", 1);
		List<PropsDetails> listDetails = propsDetailsService.getPropsDetailsInfo(filterMap);
		ArrayList<JSONArray> propsDetails = new ArrayList<>();
		for(int propsCount=0;propsCount<6;propsCount++) {
			propsDetails.add(new JSONArray());
		}
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (PropsDetails propsDetailsTmp : listDetails) {
			JSONObject tem_jsonoObject = new JSONObject();
			tem_jsonoObject.put("propsDetailsId", propsDetailsTmp.getPropsDetailsId());
			tem_jsonoObject.put("propsId", propsDetailsTmp.getPropsId());
			tem_jsonoObject.put("propsDetailsName", propsDetailsTmp.getPropsDetailsName());
			propsDetails.get(Integer.valueOf(String.valueOf(propsDetailsTmp.getPropsId()-1))).put(tem_jsonoObject);
		}
		for(int propsCount=0;propsCount<6;propsCount++) {
			model.addAttribute("propsDetails"+(propsCount+1), propsDetails.get(propsCount));
		}
		return "order/view";
	}

	@RequestMapping(value = "/orderAdd", method = RequestMethod.POST)
	public String orderAdd(Order newOrderObj, HttpServletRequest request) {
		// 通过工厂名称精确查找工厂
		Order order = orderService.findOrderByEqualOrderName(newOrderObj.getOrderCustName());
		if (order == null) {
			orderService.addOrder(newOrderObj);
			// 登陆成功，根据前台传来的标记进行跳转：前台传入是否连续添加
			if (request.getParameter("goon") != null && request.getParameter("goon").equals("T")) {
				return "redirect:/toOrderAddPage";
			} else {
				return "order/orderList";
			}
		}
		request.setAttribute("errorMessage", "同名工厂信息已经存在");
		return "error";
	}

	@RequestMapping(value = "/addToCart", method = RequestMethod.POST)
	public void orderList(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String filter = request.getParameter("filter");
		Map<String, Object> filterMap = new HashMap<String, Object>();
		String method = "";
		Cart cart = new Cart();
		JSONObject js = new JSONObject();
		try {
			
			//POST不用转字符，GET需要转
			if (filter != null) {
				JSONObject filterJson = new JSONObject(filter);
				if (filterJson.has("method")) {
					method = filterJson.get("method").toString();
				}
				if (filterJson.has("productId")) {
					filterMap.put("productId", filterJson.get("productId"));
					cart.setProductId(Long.valueOf(filterJson.get("productId").toString()));
				}
				if (filterJson.has("productCount")) {
					filterMap.put("productCount", filterJson.get("productCount"));
					cart.setProductCount(Long.valueOf(filterJson.get("productCount").toString()));
				}
				if (filterJson.has("productPrice")) {
					filterMap.put("productPrice", filterJson.get("productPrice"));
					cart.setProductId(Long.valueOf(filterJson.get("productPrice").toString()));
				}
				if (filterJson.has("productCategory")) {
					filterMap.put("productCategory", filterJson.get("productCategory").toString());
					cart.setProductCategory(filterJson.get("productCategory").toString());
				}
				if (filterJson.has("productColor")) {
					filterMap.put("productColor", filterJson.get("productColor").toString());
					cart.setProductColor(filterJson.get("productColor").toString());
				}
				if (filterJson.has("productSize")) {
					filterMap.put("productSize", filterJson.get("productSize").toString());
					cart.setProductSize(filterJson.get("productSize").toString());
				}
				if (filterJson.has("productMaterial")) {
					filterMap.put("productMaterial", filterJson.get("productMaterial").toString());
					cart.setProductMaterial(filterJson.get("productMaterial").toString());
				}
				if (filterJson.has("productCollar")) {
					filterMap.put("productCollar", filterJson.get("productCollar").toString());
					cart.setProductCollar(filterJson.get("productCollar").toString());
				}
				if (filterJson.has("productPocket")) {
					filterMap.put("productPocket", filterJson.get("productPocket").toString());
					cart.setProductPocket(filterJson.get("productPocket").toString());
				}
			} else {
				// 完善，如果filter为空，说明是初始化，我们要增加工厂状态的过滤
				js.put("msg", "未选择任何属性，请选择属性再添加");
			}

			
			if (method.equals("addtocart")) {
				cartService.addCart(cart);
				js.put("msg", "成功加入购物车");
			}
			
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(js.toString());

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
