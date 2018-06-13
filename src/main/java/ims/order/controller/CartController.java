package ims.order.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
@RequestMapping("/buy")
public class CartController {

	private final OrderService orderService;
	private final ProductService productService;
	private final CartService cartService;
	private final PropsService propsService;
	private final PropsDetailsService propsDetailsService;
	private final int pageSize = 10;
	@Autowired
	public CartController(OrderService orderService,ProductService productService,CartService cartService,PropsService propsService,PropsDetailsService propsDetailsService) {
		this.orderService = orderService;
		this.productService =productService;
		this.cartService=cartService;
		this.propsService=propsService;
		this.propsDetailsService= propsDetailsService;
	}

	@RequestMapping(value = "/toOrderAddPage", method = RequestMethod.GET)
	public String toOrderAddPage() {
		return "order/orderAdd";
	}

	@RequestMapping(value = "/toCartPage", method = RequestMethod.GET)
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
		//把总价格带过去
		
		return "order/cart";
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
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
					cart.setProductPrice(Long.valueOf(filterJson.get("productPrice").toString()));
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
				cart.setProductCreate(sdf.format(now));
				cart.setProductModify(sdf.format(now));
				for (String productCategory:filterMap.get("productCategory").toString().split(",")) {
					cart.setProductCategory(productCategory);
					for (String productColor:filterMap.get("productColor").toString().split(",")) {
						cart.setProductColor(productColor);
						for (String productSize:filterMap.get("productSize").toString().split(",")) {
							cart.setProductSize(productSize);
							for (String productMaterial:filterMap.get("productMaterial").toString().split(",")) {
								cart.setProductMaterial(productMaterial);
								for (String productCollar:filterMap.get("productCollar").toString().split(",")) {
									cart.setProductCollar(productCollar);
									for (String productPocket:filterMap.get("productPocket").toString().split(",")) {
										cart.setProductPocket(productPocket);
										cartService.addCart(cart);
									}
								}
							}
						}
					}
				}
				
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
	@RequestMapping(value = "/cartList", method = RequestMethod.POST)
	public void productList(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws IOException {

		// 通过综合条件查询工厂信息
		request.setCharacterEncoding("utf-8");
		String filter = request.getParameter("filter");
		List<Cart> list = new ArrayList<Cart>();
		Map<String, Object> filterMap = new HashMap<String, Object>();
		String method = "";
		Cart cart = new Cart();
		Order order = new Order();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		try {
			
			//POST不用转字符，GET需要转
			if (filter != null) {
				JSONObject filterJson = new JSONObject(filter);
				if (filterJson.has("method")) {
					method = filterJson.get("method").toString();
				}
				if (filterJson.has("cartId")) {
					filterMap.put("cartId", filterJson.get("cartId"));
					cart.setCartId(Long.valueOf(filterJson.get("cartId").toString()));
				}
				if (filterJson.has("orderNo")) {
					filterMap.put("orderNo", filterJson.get("orderNo"));
					order.setOrderNo(Long.valueOf(filterJson.get("orderNo").toString()));
				}
				if (filterJson.has("orderCustName")) {
					filterMap.put("orderCustName", filterJson.get("orderCustName"));
					order.setOrderCustName(filterJson.get("orderCustName").toString());
				}
				if (filterJson.has("orderCustPhone")) {
					filterMap.put("orderCustPhone", filterJson.get("orderCustPhone"));
					order.setOrderCustPhone(filterJson.get("orderCustPhone").toString());
				}
				if (filterJson.has("orderCustSend")) {
					filterMap.put("orderCustSend", filterJson.get("orderCustSend"));
					order.setOrderCustSend(filterJson.get("orderCustSend").toString());
				}
				if (filterJson.has("orderSumCount")) {
					filterMap.put("orderSumCount", filterJson.get("orderSumCount"));
					order.setOrderSumCount(filterJson.get("orderSumCount").toString());
				}
				if (filterJson.has("orderSumMoney")) {
					filterMap.put("orderSumMoney", filterJson.get("orderSumMoney"));
					order.setOrderSumMoney(filterJson.get("orderSumMoney").toString());
				}
				if (filterJson.has("orderDeposit")) {
					filterMap.put("orderDeposit", filterJson.get("orderDeposit"));
					order.setOrderDeposit(filterJson.get("orderDeposit").toString());
				}
				if (filterJson.has("orderRemarks")) {
					filterMap.put("orderRemarks", filterJson.get("orderRemarks"));
					order.setOrderRemarks(filterJson.get("orderRemarks").toString());
				}
				if (filterJson.has("cartOperation")) {
					filterMap.put("cartOperation",filterJson.get("cartOperation").toString());
				}
				if (filterJson.has("productDatetime")) {
					filterMap.put("cartDatetime",filterJson.get("cartDatetime").toString());
				}
			}

			System.out.println("filter:" + filter);
			System.out.println("filterMap:" + filterMap);
			/* System.out.println("props.toString():"+props.toString()); */
			String page = request.getParameter("page");

			JSONObject js = new JSONObject();
			int start = 0;
			if (page != null) {
				JSONObject pageJo = new JSONObject(page);
				int curPage = Integer.parseInt(pageJo.get("cur_page").toString());
				start = (curPage + 1) * (int) pageSize;
			}

			
			if (method.equals("delete")) {
				cartService.deleteCartByCartId(cart.getCartId());
				js.put("msg", "从购物车移除编号为【"+cart.getCartId()+"】的清单");
			}
			if (method.equals("calc")) {
				order.setOrderStatus("1");
				order.setOrderCreate(simpleDateFormat.format(now));
				order.setOrderModify(simpleDateFormat.format(now));
				orderService.addOrder(order);
				long orderId= order.getOrderId();
				cartService.cartCalc(orderId);
				cartService.cartClean();
				js.put("msg", "订单生成成功");
			}

			int count = cartService.getCartInfo(filterMap).size();// 获取总数
			System.err.println("count:" + count);
			int size = (int) Math.ceil((float) count / pageSize);
			if (size == 0) {
				size = 1;
			}
			js.put("page", size);
			// System.out.println("=======" + size);
			filterMap.put("start", start);
			filterMap.put("size", (int) pageSize);
			list = cartService.getCartInfo(filterMap);
			JSONArray jsonArray = new JSONArray();
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd
			// HH:mm:ss");
			//顺便把总价格/总件数带过去
			long sumMoney=0,sumCount=0;
			for (Cart cartTmp : list) {
				JSONObject tempJsonObject = new JSONObject();
				tempJsonObject.put("cartId", cartTmp.getCartId());
				tempJsonObject.put("productId", cartTmp.getProductId());
				tempJsonObject.put("productCount", cartTmp.getProductCount());
				tempJsonObject.put("productPrice", cartTmp.getProductPrice());
				//根据id查出图片
				Product product=productService.findProductByProductId(cartTmp.getProductId());
				if(product!=null) {
					if(product.getProductImg()!=null&&product.getProductImg()!="") {
						tempJsonObject.put("productImg", product.getProductImg().replaceAll(" ", "+"));
					}else {
						tempJsonObject.put("productImg", "");
					}
				}
				tempJsonObject.put("productCategory", cartTmp.getProductCategory());
				tempJsonObject.put("productColor", cartTmp.getProductColor());
				tempJsonObject.put("productSize", cartTmp.getProductSize());
				tempJsonObject.put("productMaterial", cartTmp.getProductMaterial());
				tempJsonObject.put("productCollar", cartTmp.getProductCollar());
				tempJsonObject.put("productPocket", cartTmp.getProductPocket());
/*				tempJsonObject.put("productCreate", propsTmp.getProductCreate());
				tempJsonObject.put("productModify", propsTmp.getProductModify());*/
				sumMoney=sumMoney+cartTmp.getProductCount()*cartTmp.getProductPrice();
				sumCount+=cartTmp.getProductCount();
				jsonArray.put(tempJsonObject);
				//System.err.println("propsTmp.getProductImg():" + propsTmp.getProductImg().replaceAll(" ", "+"));
			}

			js.put("list", jsonArray);
			js.put("sumMoney", sumMoney);
			js.put("sumCount", sumCount);
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(js.toString());

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
