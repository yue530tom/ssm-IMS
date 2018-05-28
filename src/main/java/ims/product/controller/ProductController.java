package ims.product.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ims.product.domain.Product;
import ims.product.service.ProductService;
@Controller
@RequestMapping("/product")
public class ProductController {

	private final ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService=productService;
	}
	
	@RequestMapping(value = "/toProductAddPage", method = RequestMethod.GET)
	public String toProductAddPage() {
		return "product/productAdd";
	}

	@RequestMapping(value = "/toProductPage", method = RequestMethod.GET)
	public String toProductListPage() {
		return "product/productList";
	}

	@RequestMapping(value = "/productAdd", method = RequestMethod.POST)
	public String productAdd(Product newProductObj, HttpServletRequest request) {
		// 通过产品名称精确查找产品
		Product product = productService.findProductByEqualProductName(newProductObj.getProductName());
		if (product == null) {
			productService.addProduct(newProductObj);
			// 登陆成功，根据前台传来的标记进行跳转：前台传入是否连续添加
			if (request.getParameter("goon") != null && request.getParameter("goon").equals("T")) {
				return "redirect:/toProductAddPage";
			} else {
				return "product/productList";
			}
		}
		request.setAttribute("errorMessage", "同名产品信息已经存在");
		return "error";
	}

	@RequestMapping(value = "/productList", method = RequestMethod.POST)
	public String productList(Product productObj, HttpServletRequest request) {
		//通过综合条件查询产品信息
		productService.getProductInfo(productObj);
		request.setAttribute("errorMessage", "同名产品信息已经存在");
		return "error";
	}
}

