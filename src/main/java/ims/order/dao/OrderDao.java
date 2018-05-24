package ims.order.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ims.order.domain.Order;

@Repository
public interface OrderDao {

	/**
	 * 
	 * @Title: addOrder @Description: 添加订单信息 @param: @param Order @return:
	 * void @throws
	 */
	void addOrder(Order order);

	/**
	 * 
	 * @Title: deleteOrderByOrderId @Description: 通过订单id删除订单信息 @param: @param
	 * OrderId @return: void @throws
	 */
	void deleteOrderByOrderId(long orderId);

	/**
	 * 
	 * @Title: updateOrderByOrderId @Description: 通过订单id更新订单信息 @param: @param
	 * Order @return: void @throws
	 */
	void updateOrderByOrderId(Order order);

	/**
	 * 
	 * @Title: getOrderInfo @Description: 综合查询的订单信息 @param: @return @return:
	 * List<Order> @throws
	 */
	List<Order> getOrderInfo(Order order);

	/**
	 * 
	 * @Title: findOrderByOrderName @Description: 通过订单名称查询订单，使用模糊匹配 @param: @param
	 * OrderName @param: @return @return: List<Order> @throws
	 */
	List<Order> findOrderByLikeOrderName(String orderName);

	/**
	 * 
	 * @Title: findOrderByEqualOrderName @Description:
	 * 通过订单名称查询订单，使用精确匹配 @param: @param orderName @param: @return @return:
	 * Order @throws
	 */
	Order findOrderByEqualOrderName(String orderName);

	/**
	 * 
	 * @Title: findOrderByOrderId @Description: 通过订单的id来精确查询订单 @param: @param
	 * OrderId @param: @return @return: Order @throws
	 */
	Order findOrderByOrderId(int orderId);

}
