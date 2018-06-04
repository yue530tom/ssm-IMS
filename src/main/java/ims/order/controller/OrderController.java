package ims.order.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ims.order.domain.Order;
import ims.order.service.OrderDetailsService;
import ims.order.service.OrderService;


@Controller
@RequestMapping("/order")
public class OrderController {

	private final OrderService orderService;
	private final OrderDetailsService orderDetailsService;
	private final int pageSize = 5;

	@Autowired
	public OrderController(OrderService orderService,OrderDetailsService orderDetailsService) {
		this.orderService = orderService;
		this.orderDetailsService=orderDetailsService;
	}

	@RequestMapping(value = "/toOrderAddPage", method = RequestMethod.GET)
	public String toOrderAddPage() {
		return "order/orderAdd";
	}

	@RequestMapping(value = "/toOrderPage", method = RequestMethod.GET)
	public String toOrderListPage() {
		return "order/order";
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
	public void orderList(Order orderObj, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String filter = request.getParameter("filter");
		List<Order> list = new ArrayList<Order>();
		Map<String, Object> filterMap = new HashMap<String, Object>();
		String method = "";
		Order order = new Order();
		try {
			
			//POST不用转字符，GET需要转
			if (filter != null) {
				JSONObject filterJson = new JSONObject(filter);
				if (filterJson.has("method")) {
					method = filterJson.get("method").toString();
				}
				if (filterJson.has("orderId")) {
					filterMap.put("orderId", filterJson.get("orderId"));
					order.setOrderId(Long.valueOf(filterJson.get("orderId").toString()));
				}
				if (filterJson.has("orderNo")) {
					filterMap.put("orderNo", filterJson.get("orderNo"));
					order.setOrderNo(Long.valueOf(filterJson.get("orderNo").toString()));
				}
				if (filterJson.has("orderCustName")) {
					filterMap.put("orderCustName", filterJson.get("orderCustName").toString());
					order.setOrderCustName(filterJson.get("orderCustName").toString());
				}
				if (filterJson.has("orderCustPhone")) {
					filterMap.put("orderCustPhone", filterJson.get("orderCustPhone").toString());
					order.setOrderCustPhone(filterJson.get("orderCustPhone").toString());
				}
				if (filterJson.has("orderCustSend")) {
					filterMap.put("orderCustSend", filterJson.get("orderCustSend").toString());
					order.setOrderCustSend(filterJson.get("orderCustSend").toString());
				}
				if (filterJson.has("orderSumMoney")) {
					filterMap.put("orderSumMoney", filterJson.get("orderSumMoney").toString());
					order.setOrderSumMoney(filterJson.get("orderSumMoney").toString());
				}
				if (filterJson.has("orderStatus")) {
					filterMap.put("orderStatus", filterJson.get("orderStatus").toString());
					order.setOrderStatus(filterJson.get("orderStatus").toString());
				}
			} else {
				filterMap.put("orderStatus", "1");
			}
			System.out.println("filter:" + filter);
			System.out.println("filterMap:" + filterMap);
			String page = request.getParameter("page");

			JSONObject js = new JSONObject();
			int start = 0;
			if (page != null) {
				JSONObject pageJo = new JSONObject(page);
				int curPage = Integer.parseInt(pageJo.get("cur_page").toString());
				start = (curPage + 1) * (int) pageSize;
			}

			int count = orderService.getOrderInfo(filterMap).size();// 获取总数
			int size = (int) Math.ceil((float) count / pageSize);
			if (size == 0) {
				size = 1;
			}
			
			if ("delete".equals(method)) {
				orderService.deleteOrderByOrderId(order.getOrderId());
				orderDetailsService.deleteOrderDetailsByOrderId(order.getOrderId());
				js.put("msg", "删除订单和订单明细成功");
			}
			
			js.put("page", size);
			filterMap.put("start", start);
			filterMap.put("size", (int) pageSize);
			list = orderService.getOrderInfo(filterMap);
			JSONArray jsonArray = new JSONArray();
			for (Order orderTmp : list) {
				JSONObject tempJsonObject = new JSONObject();
				tempJsonObject.put("orderId", orderTmp.getOrderId());
				tempJsonObject.put("orderNo", orderTmp.getOrderNo());
				tempJsonObject.put("orderCustName", orderTmp.getOrderCustName());
				
				tempJsonObject.put("orderCustPhone", orderTmp.getOrderCustPhone());
				tempJsonObject.put("orderCustSend", orderTmp.getOrderCustSend());
				tempJsonObject.put("orderSumMoney", orderTmp.getOrderSumMoney());
				tempJsonObject.put("orderDeposit", orderTmp.getOrderDeposit());
				tempJsonObject.put("orderStatus", orderTmp.getOrderStatus());

				jsonArray.put(tempJsonObject);
			}

			js.put("list", jsonArray);
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(js.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
