package ims.product.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ims.product.domain.Product;
import ims.product.service.ProductService;
import ims.props.domain.Props;
import ims.props.domain.PropsDetails;
import ims.props.service.PropsDetailsService;
import ims.props.service.PropsService;

@Controller
@RequestMapping("/product")
public class ProductController {

	private final ProductService productService;
	private final PropsService propsService;
	private final PropsDetailsService propsDetailsService;
	private final int pageSize = 5;

	@Autowired
	public ProductController(ProductService productService,PropsService propsService,PropsDetailsService propsDetailsService) {
		this.productService = productService;
		this.propsService=propsService;
		this.propsDetailsService= propsDetailsService;
	}

	@RequestMapping(value = "/toProductAddPage", method = RequestMethod.GET)
	public String toProductAddPage() {
		return "product/productAdd";
	}
	@RequestMapping(value = "/toOrderTest", method = RequestMethod.GET)
	public String toOrderTest() {
		return "order/test";
	}
	//需要传数据过去
	@RequestMapping(value = "/toProductPage", method = RequestMethod.GET)
	public String toProductListPage(Model model) throws JSONException {
		HashMap<String, Object> filterMap= new HashMap<>();
		filterMap.put("propsStatus", 1);
		List<Props> list = propsService.getPropsInfo(filterMap);
		JSONArray allProps = new JSONArray();
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (Props propsTmp : list) {
			JSONObject tem_jsonoObject = new JSONObject();
			tem_jsonoObject.put("propsId", propsTmp.getPropsId());
			tem_jsonoObject.put("propsName", propsTmp.getPropsName());
			allProps.put(tem_jsonoObject);
		}
		
		filterMap= new HashMap<>();
		filterMap.put("propsDetailsStatus", 1);
		List<PropsDetails> listDetails = propsDetailsService.getPropsDetailsInfo(filterMap);
		ArrayList<JSONArray> propsDetails = new ArrayList<>();
		for(int propsCount=0;propsCount<6;propsCount++) {
			propsDetails.add(new JSONArray());
		}
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (PropsDetails propsDetailsTmp : listDetails) {
			JSONObject tem_jsonoObject = new JSONObject();
			tem_jsonoObject.put("propsDetailsId", propsDetailsTmp.getPropsDetailsId());
			tem_jsonoObject.put("propsId", propsDetailsTmp.getPropsId());
			tem_jsonoObject.put("propsDetailsName", propsDetailsTmp.getPropsDetailsName());
			propsDetails.get(Integer.valueOf(String.valueOf(propsDetailsTmp.getPropsId()-1))).put(tem_jsonoObject);
		}
		for(int propsCount=0;propsCount<6;propsCount++) {
			model.addAttribute("propsDetails"+(propsCount+1), propsDetails.get(propsCount));
		}
		return "product/product";
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
	public void productList(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws IOException {

		/*
		 * //获取图片 MultipartHttpServletRequest multipartRequest =
		 * (MultipartHttpServletRequest) request; // 根据前台name名称得到上传的文件
		 * MultipartFile img = multipartRequest.getFile("upimg"); //
		 * 定义一个数组，用于保存可上传的文件类型 List<String> fileTypes = new ArrayList<String>();
		 * fileTypes.add("jpg"); fileTypes.add("jpeg"); fileTypes.add("bmp");
		 * fileTypes.add("png"); String fileName = img.getOriginalFilename();
		 * if(!(fileName==null ||"".equals(fileName))){ String extensionName =
		 * fileName.substring(fileName.lastIndexOf(".")+1);
		 * if(fileTypes.contains(extensionName)){ //扩展名合法 try{ byte[]
		 * content=img.getBytes(); System.err.println(content.toString());
		 * }catch (IOException e){ e.printStackTrace(); } } } if (img.isEmpty())
		 * { System.out.println("文件未上传"); } else { byte[]
		 * content=img.getBytes(); System.err.println(content.toString()); }
		 */

		
		// 通过综合条件查询工厂信息
		request.setCharacterEncoding("utf-8");
		String filter = request.getParameter("filter");
		List<Product> list = new ArrayList<Product>();
		Map<String, Object> filterMap = new HashMap<String, Object>();
		String method = "";
		Product product = new Product();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		try {
			
			//POST不用转字符，GET需要转
			if (filter != null) {
				JSONObject filterJson = new JSONObject(filter);
				if (filterJson.has("method")) {
					method = filterJson.get("method").toString();
				}
				if (filterJson.has("productId")) {
					filterMap.put("productId", filterJson.get("productId"));
					product.setProductId(Long.valueOf(filterJson.get("productId").toString()));
				}
				if (filterJson.has("productNo")) {
					filterMap.put("productNo", filterJson.get("productNo"));
					product.setProductNo(Long.valueOf(filterJson.get("productNo").toString()));
				}
				if (filterJson.has("productName")) {
					filterMap.put("productName", filterJson.get("productName").toString());
					product.setProductName(filterJson.get("productName").toString());
				}
				if (filterJson.has("productImg")) {
					filterMap.put("productImg", filterJson.get("productImg").toString());
					product.setProductImg(filterJson.get("productImg").toString());
				}
				if (filterJson.has("productCategory")) {
					filterMap.put("productCategory", filterJson.get("productCategory").toString());
					product.setProductCategory(filterJson.get("productCategory").toString());
				}
				if (filterJson.has("productColor")) {
					filterMap.put("productColor", filterJson.get("productColor").toString());
					product.setProductColor(filterJson.get("productColor").toString());
				}
				if (filterJson.has("productSize")) {
					filterMap.put("productSize", filterJson.get("productSize").toString());
					product.setProductSize(filterJson.get("productSize").toString());
				}
				if (filterJson.has("productMaterial")) {
					filterMap.put("productMaterial", filterJson.get("productMaterial").toString());
					product.setProductMaterial(filterJson.get("productMaterial").toString());
				}
				if (filterJson.has("productCollar")) {
					filterMap.put("productCollar", filterJson.get("productCollar").toString());
					product.setProductCollar(filterJson.get("productCollar").toString());
				}
				if (filterJson.has("productPocket")) {
					filterMap.put("productPocket", filterJson.get("productPocket").toString());
					product.setProductPocket(filterJson.get("productPocket").toString());
				}
				if (filterJson.has("productRemarks")) {
					filterMap.put("productRemarks", filterJson.get("productRemarks").toString());
					product.setProductRemarks(filterJson.get("productRemarks").toString());
				}
				if (filterJson.has("productStatus")) {
					filterMap.put("productStatus", filterJson.get("productStatus").toString());
					product.setProductStatus(filterJson.get("productStatus").toString());
				}
				if (filterJson.has("productRecommend")) {
					filterMap.put("productRecommend", filterJson.get("productRecommend").toString());
					product.setProductRecommend(filterJson.get("productRecommend").toString());
				}
				if (filterJson.has("productOperation")) {
					filterMap.put("productOperation",filterJson.get("productOperation").toString());
				}
				if (filterJson.has("productDatetime")) {
					filterMap.put("productDatetime",filterJson.get("productDatetime").toString());
				}
			} else {
				// 完善，如果filter为空，说明是初始化，我们要增加工厂状态的过滤
				filterMap.put("productStatus", "1");
			}

			System.out.println("filter:" + filter);
			System.out.println("filterMap:" + filterMap);
			/* System.out.println("props.toString():"+props.toString()); */
			String page = request.getParameter("page");

			JSONObject js = new JSONObject();
			int start = 0;
			if (page != null) {
				JSONObject pageJo = new JSONObject(page);
				int curPage = Integer.parseInt(pageJo.get("cur_page").toString());
				start = (curPage + 1) * (int) pageSize;
			}

			if (method.equals("add")) {
				product.setProductStatus("1");
				product.setProductCreate(sdf.format(now));
				product.setProductModify(sdf.format(now));
				// 添加之前做判断 是否具有同名属性

				if (productService.findProductByEqualProductNo(String.valueOf(product.getProductNo())).size() == 0) {
					productService.addProduct(product);
				} else {
					js.put("msg", "相同编号的产品已存在，请查看");
				}
			}
			if (method.equals("modify")) {
				product.setProductStatus("1");
				product.setProductModify(sdf.format(now));
				productService.updateProductByProductId(product);
			}
			if (method.equals("delete")) {
				product.setProductStatus("0");
				productService.updateProductByProductId(product);
				// 重置filterMap为空
				// filterMap=null;
			}
			if (method.equals("recommend")) {
				productService.updateProductRecommendByProductId(product.getProductId());
				// 重置filterMap为空
				// filterMap=null;
			}
			int count = productService.getProductInfo(filterMap).size();// 获取总数
			System.err.println("count:" + count);
			int size = (int) Math.ceil((float) count / pageSize);
			if (size == 0) {
				size = 1;
			}
			js.put("page", size);
			// System.out.println("=======" + size);
			filterMap.put("start", start);
			filterMap.put("size", (int) pageSize);
			list = productService.getProductInfo(filterMap);
			JSONArray jsonArray = new JSONArray();
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd
			// HH:mm:ss");
			for (Product propsTmp : list) {
				JSONObject tempJsonObject = new JSONObject();
				tempJsonObject.put("productId", propsTmp.getProductId());
				tempJsonObject.put("productNo", propsTmp.getProductNo());
				tempJsonObject.put("productName", propsTmp.getProductName());
				if(propsTmp.getProductImg()!=null&&propsTmp.getProductImg()!="") {
					tempJsonObject.put("productImg", propsTmp.getProductImg().replaceAll(" ", "+"));
				}else {
					tempJsonObject.put("productImg", "");
				}
				
				tempJsonObject.put("productCategory", propsTmp.getProductCategory());
				tempJsonObject.put("productColor", propsTmp.getProductColor());
				tempJsonObject.put("productSize", propsTmp.getProductSize());
				tempJsonObject.put("productMaterial", propsTmp.getProductMaterial());
				tempJsonObject.put("productCollar", propsTmp.getProductCollar());
				tempJsonObject.put("productPocket", propsTmp.getProductPocket());
				tempJsonObject.put("productRemarks", propsTmp.getProductRemarks());
				tempJsonObject.put("productStatus", propsTmp.getProductStatus());
				tempJsonObject.put("productCreate", propsTmp.getProductCreate());
				tempJsonObject.put("productModify", propsTmp.getProductModify());
				tempJsonObject.put("productRecommend", propsTmp.getProductRecommend());
				
				jsonArray.put(tempJsonObject);
				//System.err.println("propsTmp.getProductImg():" + propsTmp.getProductImg().replaceAll(" ", "+"));
			}

			js.put("list", jsonArray);
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(js.toString());

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
