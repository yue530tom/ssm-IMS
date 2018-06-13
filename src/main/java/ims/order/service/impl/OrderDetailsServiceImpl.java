package ims.order.service.impl;

import java.util.HashMap;
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

	@Override
	public void deleteOrderDetailsByOrderId(long orderId) {
		// TODO Auto-generated method stub
		if (orderDetailsDao != null) {
			orderDetailsDao.deleteOrderDetailsByOrderId(orderId);
		}

	}

	@Override
	public HashMap<String, String> getOrderDetailsGroupBySum(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		if (orderDetailsDao != null) {
			return orderDetailsDao.getOrderDetailsGroupBySum(map);
		}
		return null;
	}

	@Override
	public HashMap<String, String> getOrderDetailsGroupByOrder(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		if (orderDetailsDao != null) {
			return orderDetailsDao.getOrderDetailsGroupByOrder(map);
		}
		return null;
	}

	@Override
	public HashMap<String, String> getOrderDetailsGroupByMaterial(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		if (orderDetailsDao != null) {
			return orderDetailsDao.getOrderDetailsGroupByMaterial(map);
		}
		return null;
	}

	@Override
	public HashMap<String, String> getOrderDetailsGroupByColor(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		if (orderDetailsDao != null) {
			return orderDetailsDao.getOrderDetailsGroupByColor(map);
		}
		return null;
	}

	@Override
	public List<OrderDetails> getOrderDetailsByIds(String ids) {
		// TODO Auto-generated method stub
		if (orderDetailsDao != null) {
			return orderDetailsDao.getOrderDetailsByIds(ids);
		}
		return null;
	}

}
