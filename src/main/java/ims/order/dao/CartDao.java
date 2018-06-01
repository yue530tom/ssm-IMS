package ims.order.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ims.order.domain.Cart;

@Repository
public interface CartDao {
	/**
	 * 
	 * @Title: addCart @Description: 添加订单信息 @param: @param Cart @return:
	 * void @throws
	 */
	void addCart(Cart cart);

	/**
	 * 
	 * @Title: deleteCartByCartId @Description: 通过订单id删除订单信息 @param: @param
	 * CartId @return: void @throws
	 */
	void deleteCartByCartId(long cartId);

	/**
	 * 
	 * @Title: updateCartByCartId @Description: 通过订单id更新订单信息 @param: @param
	 * Cart @return: void @throws
	 */
	void updateCartByCartId(Cart cart);

	/**
	 * 
	 * @Title: getCartInfo @Description: 综合查询的订单信息 @param: @return @return:
	 * List<Cart> @throws
	 */
	List<Cart> getCartInfo(Map<String, Object> map);

	/**
	 * 
	 * @Title: findCartByCartName @Description: 通过订单名称查询订单，使用模糊匹配 @param: @param
	 * CartName @param: @return @return: List<Cart> @throws
	 */
	List<Cart> findCartByLikeCartName(String cartName);

	/**
	 * 
	 * @Title: findCartByEqualCartName @Description:
	 * 通过订单名称查询订单，使用精确匹配 @param: @param cartName @param: @return @return:
	 * Cart @throws
	 */
	Cart findCartByEqualCartName(String cartName);

	/**
	 * 
	 * @Title: findCartByCartId @Description: 通过订单的id来精确查询订单 @param: @param
	 * CartId @param: @return @return: Cart @throws
	 */
	Cart findCartByCartId(int cartId);
	
	void cartCalc(long orderId);
	
	void cartClean();
}
