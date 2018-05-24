package ims.order.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ims.order.domain.Order;
import ims.order.service.OrderService;


@Controller
@RequestMapping("/order")
public class OrderController {

	private final OrderService orderService;

	@Autowired
	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@RequestMapping(value = "/toOrderAddPage", method = RequestMethod.GET)
	public String toOrderAddPage() {
		return "order/orderAdd";
	}

	@RequestMapping(value = "/toOrderListPage", method = RequestMethod.GET)
	public String toOrderListPage() {
		return "order/orderList";
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
	
}
