package ims.product.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ims.product.dao.ProductDao;
import ims.product.domain.Product;
import ims.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private final ProductDao productDao;
	@Autowired
	ProductServiceImpl(ProductDao productDao) {
		this.productDao=productDao;
	}
	
	@Override
	public void addProduct(Product product) {
		if (productDao!=null) {
			productDao.addProduct(product);
		}
		
	}

	@Override
	public void deleteProductByProductId(long productId) {
		if (productDao!=null) {
			productDao.deleteProductByProductId(productId);
		}
	}

	@Override
	public void updateProductByProductId(Product product) {
		if (productDao!=null) {
			productDao.updateProductByProductId(product);
		}
		
	}

	@Override
	public List<Product> getProductInfo(Map<String, Object> map) {
		if (productDao!=null) {
			return productDao.getProductInfo(map);
		}
		return null;
	}

	@Override
	public List<Product> findProductByLikeProductName(String productName) {
		// TODO Auto-generated method stub
		if (productDao!=null) {
			return productDao.findProductByLikeProductName(productName);
		}
		return null;
	}

	@Override
	public Product findProductByEqualProductName(String productName) {
		// TODO Auto-generated method stub
		if (productDao!=null) {
			return productDao.findProductByEqualProductName(productName);
		}
		return null;
	}

	@Override
	public Product findProductByProductId(long productId) {
		// TODO Auto-generated method stub
		if (productDao!=null) {
			return productDao.findProductByProductId(productId);
		}
		return null;
	}

	@Override
	public List<Product> findProductByEqualProductNo(String productNo) {
		// TODO Auto-generated method stub
		if (productDao!=null) {
			return productDao.findProductByEqualProductNo(productNo);
		}
		return null;
	}

	@Override
	public List<Product> getTopFive() {
		// TODO Auto-generated method stub
		if (productDao!=null) {
			return productDao.getTopFive();
		}
		return null;
	}

	@Override
	public List<Product> getRecommend() {
		// TODO Auto-generated method stub
		if (productDao!=null) {
			return productDao.getRecommend();
		}
		return null;
	}

	

}
