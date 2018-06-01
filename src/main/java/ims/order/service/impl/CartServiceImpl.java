package ims.order.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import ims.order.dao.CartDao;
import ims.order.domain.Cart;
import ims.order.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	
	private final CartDao cartDao;
	
	
	public CartServiceImpl(CartDao cartDao) {
		// TODO Auto-generated constructor stub
		this.cartDao=cartDao;
	}
	@Override
	public void addCart(Cart cart) {
		// TODO Auto-generated method stub
		if (cartDao!=null) {
			cartDao.addCart(cart);
		}
	}

	@Override
	public void deleteCartByCartId(long cartId) {
		// TODO Auto-generated method stub
		if (cartDao!=null) {
			cartDao.deleteCartByCartId(cartId);
		}
	}

	@Override
	public void updateCartByCartId(Cart cart) {
		// TODO Auto-generated method stub
		if (cartDao!=null) {
			cartDao.updateCartByCartId(cart);
		}
	}

	@Override
	public List<Cart> getCartInfo(Map<String, Object> map) {
		// TODO Auto-generated method stub
		if (cartDao!=null) {
			return cartDao.getCartInfo(map);
		}
		return null;
	}

	@Override
	public List<Cart> findCartByLikeCartName(String cartName) {
		// TODO Auto-generated method stub
		if (cartDao!=null) {
			return cartDao.findCartByLikeCartName(cartName);
		}
		return null;
	}

	@Override
	public Cart findCartByEqualCartName(String cartName) {
		// TODO Auto-generated method stub
		if (cartDao!=null) {
			return cartDao.findCartByEqualCartName(cartName);
		}
		return null;
	}

	@Override
	public Cart findCartByCartId(int cartId) {
		// TODO Auto-generated method stub
		if (cartDao!=null) {
			return cartDao.findCartByCartId(cartId);
		}
		return null;
	}
	@Override
	public void cartCalc(long orderId) {
		// TODO Auto-generated method stub
		if (cartDao!=null) {
			 cartDao.cartCalc(orderId);
		}
	}
	@Override
	public void cartClean() {
		// TODO Auto-generated method stub
		if (cartDao!=null) {
			cartDao.cartClean();
		}
	}

}
