package ims.order.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ims.order.dao.OrderDetailsDao;
import ims.order.domain.OrderDetails;
import ims.order.service.OrderDetailsService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	private final OrderDetailsDao orderDetailsDao;

	public OrderDetailsServiceImpl(OrderDetailsDao orderDetailsDao) {
		this.orderDetailsDao = orderDetailsDao;
	}

	@Override
	public void addOrderDetails(OrderDetails orderDetails) {
		if (orderDetailsDao != null) {
			orderDetailsDao.addOrderDetails(orderDetails);
		}

	}

	@Override
	public void deleteOrderDetailsByOrderDetailsId(long orderDetailsId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOrderDetailsByOrderDetailsId(OrderDetails orderDetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<OrderDetails> getOrderDetailsInfo(OrderDetails orderDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDetails> findOrderDetailsByLikeOrderDetailsName(String orderDetailsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails findOrderDetailsByEqualOrderDetailsName(String orderDetailsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails findOrderDetailsByOrderDetailsId(int orderDetailsId) {
		// TODO Auto-generated method stub
		return null;
	}

}
