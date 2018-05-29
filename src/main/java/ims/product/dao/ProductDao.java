package ims.product.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import ims.product.domain.Product;

@Repository
public interface ProductDao {

	/**
	 * 
	 * @Title: addProduct 
	 * @Description: 添加产品信息 
	 * @param: @param Product 
	 * @return:void 
	 * @throws
	 */
	void addProduct(Product product);

	/**
	 * 
	 * @Title: deleteProductByProductId 
	 * @Description: 通过产品id删除产品信息 
	 * @param: @param ProductId 
	 * @return: void 
	 * @throws
	 */
	void deleteProductByProductId(long productId);

	/**
	 * 
	 * @Title: updateProductByProductId 
	 * @Description: 通过产品id更新产品信息 
	 * @param: @param Product 
	 * @return: void 
	 * @throws
	 */
	void updateProductByProductId(Product product);

	/**
	 * 
	 * @Title: getProductInfo 
	 * @Description: 综合查询的产品信息
	 * @param: 
	 * @return @return:List<Product> 
	 * @throws
	 */
	List<Product> getProductInfo(Map<String, Object> map);

	/**
	 * 
	 * @Title: findProductByProductName 
	 * @Description:通过产品名称查询产品，使用模糊匹配 
	 * @param: @param ProductName 
	 * @return @return:List<Product> 
	 * @throws
	 */
	List<Product> findProductByLikeProductName(String productName);
	List<Product> findProductByEqualProductNo(String productNo);
	/**
	 * 
	 * @Title: findProductByEqualProductName 
	 * @Description:通过产品名称查询产品，使用精确匹配 
	 * @param: @param productName 
	 * @param: 
	 * @return @return:Product 
	 * @throws
	 */
	Product findProductByEqualProductName(String productName);

	/**
	 * 
	 * @Title: findProductByProductId 
	 * @Description: 通过产品的id来精确查询产品 
	 * @param: @param ProductId 
	 * @return @return: Product 
	 * @throws
	 */
	Product findProductByProductId(int productId);

}
