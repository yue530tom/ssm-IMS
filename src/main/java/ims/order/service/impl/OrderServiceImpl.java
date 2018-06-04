package ims.order.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ims.order.dao.OrderDao;
import ims.order.domain.Order;
import ims.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	private final OrderDao orderDao;

	public OrderServiceImpl(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public void addOrder(Order order) {
		if (orderDao != null) {
			orderDao.addOrder(order);
		}

	}

	@Override
	public void deleteOrderByOrderId(long orderId) {
		// TODO Auto-generated method stub
		if (orderDao!=null) {
			orderDao.deleteOrderByOrderId(orderId);
		}
	}

	@Override
	public void updateOrderByOrderId(Order order) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Order> getOrderInfo(Map<String, Object> map) {
		// TODO Auto-generated method stub
		if (orderDao!=null) {
			return orderDao.getOrderInfo(map);
		}
		return null;
	}

	@Override
	public List<Order> findOrderByLikeOrderName(String orderName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findOrderByEqualOrderName(String orderName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findOrderByOrderId(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
