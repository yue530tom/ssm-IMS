package ims.order.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ims.order.domain.OrderDetails;

@Repository
public interface OrderDetailsDao {

	/**
	 * 
	 * @Title: addOrderDetails @Description: 添加订单信息 @param: @param OrderDetails @return:
	 * void @throws
	 */
	void addOrderDetails(OrderDetails orderDetails);

	/**
	 * 
	 * @Title: deleteOrderDetailsByOrderDetailsId @Description: 通过订单id删除订单信息 @param: @param
	 * OrderDetailsId @return: void @throws
	 */
	void deleteOrderDetailsByOrderDetailsId(long orderDetailsId);

	/**
	 * 
	 * @Title: updateOrderDetailsByOrderDetailsId @Description: 通过订单id更新订单信息 @param: @param
	 * OrderDetails @return: void @throws
	 */
	void updateOrderDetailsByOrderDetailsId(OrderDetails orderDetails);

	/**
	 * 
	 * @Title: getOrderDetailsInfo @Description: 综合查询的订单信息 @param: @return @return:
	 * List<OrderDetails> @throws
	 */
	List<OrderDetails> getOrderDetailsInfo(OrderDetails orderDetails);

	/**
	 * 
	 * @Title: findOrderDetailsByOrderDetailsName @Description: 通过订单名称查询订单，使用模糊匹配 @param: @param
	 * OrderDetailsName @param: @return @return: List<OrderDetails> @throws
	 */
	List<OrderDetails> findOrderDetailsByLikeOrderDetailsName(String orderDetailsName);

	/**
	 * 
	 * @Title: findOrderDetailsByEqualOrderDetailsName @Description:
	 * 通过订单名称查询订单，使用精确匹配 @param: @param orderDetailsName @param: @return @return:
	 * OrderDetails @throws
	 */
	OrderDetails findOrderDetailsByEqualOrderDetailsName(String orderDetailsName);

	/**
	 * 
	 * @Title: findOrderDetailsByOrderDetailsId @Description: 通过订单的id来精确查询订单 @param: @param
	 * OrderDetailsId @param: @return @return: OrderDetails @throws
	 */
	OrderDetails findOrderDetailsByOrderDetailsId(int orderDetailsId);

}
