package ims.order.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ims.order.domain.Cart;
import ims.order.domain.Order;
import ims.order.service.CartService;
import ims.order.service.OrderService;


@Controller
@RequestMapping("/buy")
public class CartController {

	private final OrderService orderService;
	private final CartService cartService;
	@Autowired
	public CartController(OrderService orderService,CartService cartService) {
		this.orderService = orderService;
		this.cartService=cartService;
	}

	@RequestMapping(value = "/toOrderAddPage", method = RequestMethod.GET)
	public String toOrderAddPage() {
		return "order/orderAdd";
	}

	@RequestMapping(value = "/toCartPage", method = RequestMethod.GET)
	public String toOrderListPage() {
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

	@RequestMapping(value = "/orderList", method = RequestMethod.POST)
	public String orderList(Order orderObj, HttpServletRequest request) {
		//通过综合条件查询工厂信息
		orderService.getOrderInfo(orderObj);
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
