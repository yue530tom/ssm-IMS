package ims.factory.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
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

import ims.factory.domain.Factory;
import ims.factory.domain.Produces;
import ims.factory.domain.ProducesOrder;
import ims.factory.service.FactoryService;
import ims.factory.service.ProducesOrderService;
import ims.factory.service.ProducesService;
import ims.product.domain.Product;
import ims.product.service.ProductService;
import ims.props.domain.Props;
import ims.props.domain.PropsDetails;
import ims.props.service.PropsDetailsService;
import ims.props.service.PropsService;

@Controller
@RequestMapping("/factory")
public class FactoryController {

	private final FactoryService factoryService;
	private final PropsService propsService;
	private final PropsDetailsService propsDetailsService;
	private final ProductService productService;
	private final ProducesService producesService;
	private final ProducesOrderService producesOrderService;
	private final int pageSize = 5;

	@Autowired
	public FactoryController(FactoryService factoryService,PropsService propsService,PropsDetailsService propsDetailsService,ProductService productService,ProducesService producesService,ProducesOrderService producesOrderService) {
		this.factoryService = factoryService;
		this.propsService=propsService;
		this.propsDetailsService=propsDetailsService;
		this.productService = productService;
		this.producesService= producesService;
		this.producesOrderService=producesOrderService;
	}

	@RequestMapping(value = "/toFactoryAddPage", method = RequestMethod.GET)
	public String toFactoryAddPage() {
		return "factory/factoryAdd";
	}

	@RequestMapping(value = "/toFactoryPage", method = RequestMethod.GET)
	public String toFactoryListPage() {
		return "factory/factory";
	}
	@RequestMapping(value = "/toProducesPage", method = RequestMethod.GET)
	public String toProducesPage(Model model) throws JSONException {
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
		return "factory/produces";
	}
	
	@RequestMapping(value = "/toProducesDetailsPage", method = RequestMethod.GET)
	public String toProceducesDetailsPage() {
		return "factory/producesdetails";
	}
	@RequestMapping(value = "/addToProduces", method = RequestMethod.POST)
	public void addToProduces(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String filter = request.getParameter("filter");
		Map<String, Object> filterMap = new HashMap<String, Object>();
		String method = "";
		Produces produces = new Produces();
		JSONObject js = new JSONObject();
		try {
			
			//POST不用转字符，GET需要转
			if (filter != null) {
				JSONObject filterJson = new JSONObject(filter);
				if (filterJson.has("method")) {
					method = filterJson.get("method").toString();
				}
				if (filterJson.has("productId")) {
					filterMap.put("productId", filterJson.get("productId"));
					produces.setProductId(Long.valueOf(filterJson.get("productId").toString()));
				}
				if (filterJson.has("productCount")) {
					filterMap.put("productCount", filterJson.get("productCount"));
					produces.setProductCount(Long.valueOf(filterJson.get("productCount").toString()));
				}
				if (filterJson.has("productPrice")) {
					filterMap.put("productPrice", filterJson.get("productPrice"));
					produces.setProductId(Long.valueOf(filterJson.get("productPrice").toString()));
				}
				if (filterJson.has("productCategory")) {
					filterMap.put("productCategory", filterJson.get("productCategory").toString());
					produces.setProductCategory(filterJson.get("productCategory").toString());
				}
				if (filterJson.has("productColor")) {
					filterMap.put("productColor", filterJson.get("productColor").toString());
					produces.setProductColor(filterJson.get("productColor").toString());
				}
				if (filterJson.has("productSize")) {
					filterMap.put("productSize", filterJson.get("productSize").toString());
					produces.setProductSize(filterJson.get("productSize").toString());
				}
				if (filterJson.has("productMaterial")) {
					filterMap.put("productMaterial", filterJson.get("productMaterial").toString());
					produces.setProductMaterial(filterJson.get("productMaterial").toString());
				}
				if (filterJson.has("productCollar")) {
					filterMap.put("productCollar", filterJson.get("productCollar").toString());
					produces.setProductCollar(filterJson.get("productCollar").toString());
				}
				if (filterJson.has("productPocket")) {
					filterMap.put("productPocket", filterJson.get("productPocket").toString());
					produces.setProductPocket(filterJson.get("productPocket").toString());
				}
				if (filterJson.has("productOperation")) {
					filterMap.put("productOperation",
							new String(filterJson.get("productOperation").toString().getBytes("iso8859-1"), "utf-8"));
				}
				if (filterJson.has("productDatetime")) {
					filterMap.put("productDatetime",
							new String(filterJson.get("productDatetime").toString().getBytes("iso8859-1"), "utf-8"));
					produces.setProductCreate(new String(filterJson.get("productDatetime").toString().getBytes("iso8859-1"), "utf-8"));
				}
			} else {
				// 完善，如果filter为空，说明是初始化，我们要增加工厂状态的过滤
				js.put("msg", "未选择任何属性，请选择属性再添加");
			}

			
			if (method.equals("addtoproduces")) {
				producesService.addProduces(produces);
				js.put("msg", "成功组织做货信息");
			}
			
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(js.toString());

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/producesList", method = RequestMethod.POST)
	public void producesList(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws IOException {

		// 通过综合条件查询工厂信息
		request.setCharacterEncoding("utf-8");
		String filter = request.getParameter("filter");
		List<Produces> list = new ArrayList<Produces>();
		Map<String, Object> filterMap = new HashMap<String, Object>();
		String method = "";
		Produces produces = new Produces();
		ProducesOrder producesOrder = new ProducesOrder();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date now = new Date();
		try {
			
			//POST不用转字符，GET需要转
			if (filter != null) {
				JSONObject filterJson = new JSONObject(filter);
				if (filterJson.has("method")) {
					method = filterJson.get("method").toString();
				}
				if (filterJson.has("producesId")) {
					filterMap.put("producesId", filterJson.get("producesId"));
					produces.setProducesId(Long.valueOf(filterJson.get("producesId").toString()));
				}
				if (filterJson.has("producesOrderNo")) {
					filterMap.put("producesOrderNo", filterJson.get("producesOrderNo"));
					producesOrder.setProducesOrderNo(Long.valueOf(filterJson.get("producesOrderNo").toString()));
				}
				if (filterJson.has("producesOrderFactoryId")) {
					filterMap.put("producesOrderFactoryId", filterJson.get("producesOrderFactoryId"));
					producesOrder.setProducesOrderFactoryId(Long.valueOf(filterJson.get("producesOrderFactoryId").toString()));
				}
				if (filterJson.has("producesOrderCount")) {
					filterMap.put("producesOrderCount", filterJson.get("producesOrderCount"));
					producesOrder.setProducesOrderCount(Long.valueOf(filterJson.get("producesOrderCount").toString()));
				}
				if (filterJson.has("producesOrderDepost")) {
					filterMap.put("producesOrderDepost", filterJson.get("producesOrderDepost"));
					producesOrder.setProducesOrderDepost(filterJson.get("producesOrderDepost").toString());
				}
				if (filterJson.has("producesOrderRemarks")) {
					filterMap.put("producesOrderRemarks", filterJson.get("producesOrderRemarks"));
					producesOrder.setProducesOrderDepost(filterJson.get("producesOrderRemarks").toString());
				}
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

			
			if (method.equals("delete")) {
				producesService.deleteProducesByProducesId(produces.getProducesId());
				js.put("msg", "从做货明细中移除编号为【"+produces.getProducesId()+"】的做货清单");
			}
			if (method.equals("create")) {
				producesOrder.setProducesOrderCreate(sdf.format(now));
				producesOrder.setProducesOrderModify(sdf.format(now));
				producesOrderService.addProducesOrder(producesOrder);
				long producesId= producesOrder.getProducesOrderId();
				producesService.producesCalc(producesId);
				producesService.producesClean();
				js.put("msg", "做货单生成成功");
			}

			int count = producesService.getProducesInfo(filterMap).size();// 获取总数
			System.err.println("count:" + count);
			int size = (int) Math.ceil((float) count / pageSize);
			if (size == 0) {
				size = 1;
			}
			js.put("page", size);
			// System.out.println("=======" + size);
			filterMap.put("start", start);
			filterMap.put("size", (int) pageSize);
			list = producesService.getProducesInfo(filterMap);
			JSONArray jsonArray = new JSONArray();
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd
			// HH:mm:ss");
			//顺便把总价格带过去
			long sumMoney=0;
			for (Produces producesTmp : list) {
				JSONObject tempJsonObject = new JSONObject();
				tempJsonObject.put("producesId", producesTmp.getProducesId());
				tempJsonObject.put("productId", producesTmp.getProductId());
				tempJsonObject.put("productCount", producesTmp.getProductCount());
				tempJsonObject.put("productPrice", producesTmp.getProductPrice());
				//根据id查出图片
				Product product=productService.findProductByProductId(producesTmp.getProductId());
				if(product!=null) {
					if(product.getProductImg()!=null&&product.getProductImg()!="") {
						tempJsonObject.put("productImg", product.getProductImg().replaceAll(" ", "+"));
					}else {
						tempJsonObject.put("productImg", "");
					}
				}
				tempJsonObject.put("productCategory", producesTmp.getProductCategory());
				tempJsonObject.put("productColor", producesTmp.getProductColor());
				tempJsonObject.put("productSize", producesTmp.getProductSize());
				tempJsonObject.put("productMaterial", producesTmp.getProductMaterial());
				tempJsonObject.put("productCollar", producesTmp.getProductCollar());
				tempJsonObject.put("productPocket", producesTmp.getProductPocket());
				tempJsonObject.put("productCreate", producesTmp.getProductCreate());
				tempJsonObject.put("productModify", producesTmp.getProductModify());
				sumMoney=sumMoney+producesTmp.getProductCount()*producesTmp.getProductPrice();
				jsonArray.put(tempJsonObject);
				//System.err.println("propsTmp.getProductImg():" + propsTmp.getProductImg().replaceAll(" ", "+"));
			}

			js.put("list", jsonArray);
			js.put("sumMoney", sumMoney);
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(js.toString());

		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/productList", method = RequestMethod.POST)
	public void productList(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws IOException {


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
	@RequestMapping(value = "/factoryAdd", method = RequestMethod.POST)
	public String factoryAdd(Factory newFactoryObj, HttpServletRequest request) {
		// 通过工厂名称精确查找工厂
		Factory factory = factoryService.findFactoryByEqualFactoryName(newFactoryObj.getFactoryName());
		if (factory == null) {
			factoryService.addFactory(newFactoryObj);
			// 登陆成功，根据前台传来的标记进行跳转：前台传入是否连续添加
			if (request.getParameter("goon") != null && request.getParameter("goon").equals("T")) {
				return "redirect:/toFactoryAddPage";
			} else {
				return "factory/factoryList";
			}
		}
		request.setAttribute("errorMessage", "同名工厂信息已经存在");
		return "error";
	}

	@RequestMapping(value = "/factoryList", method = RequestMethod.GET)
	public void factoryList(Factory factoryObj, HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException {
		// 通过综合条件查询工厂信息
		request.setCharacterEncoding("utf-8");
		String filter = request.getParameter("filter");
		List<Factory> list = new ArrayList<Factory>();
		Map<String, Object> filterMap = new HashMap<String, Object>();
		String method = "";
		Factory factory = new Factory();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		try {
			if (filter != null) {
				JSONObject filterJson = new JSONObject(filter);
				if (filterJson.has("method")) {
					method = new String(filterJson.get("method").toString().getBytes("iso8859-1"), "utf-8");
				}
				if (filterJson.has("factoryId")) {
					filterMap.put("factoryId", filterJson.get("factoryId"));
					factory.setFactoryId(Long.valueOf(filterJson.get("factoryId").toString()));
				}
				if (filterJson.has("factoryName")) {
					filterMap.put("factoryName",
							new String(filterJson.get("factoryName").toString().getBytes("iso8859-1"), "utf-8"));
					factory.setFactoryName(
							new String(filterJson.get("factoryName").toString().getBytes("iso8859-1"), "utf-8"));
				}
				if (filterJson.has("factoryContacts")) {
					filterMap.put("factoryContacts",
							new String(filterJson.get("factoryContacts").toString().getBytes("iso8859-1"), "utf-8"));
					factory.setFactoryContacts(
							new String(filterJson.get("factoryContacts").toString().getBytes("iso8859-1"), "utf-8"));
				}
				if (filterJson.has("factoryPhone")) {
					filterMap.put("factoryPhone",
							new String(filterJson.get("factoryPhone").toString().getBytes("iso8859-1"), "utf-8"));
					factory.setFactoryPhone(
							new String(filterJson.get("factoryPhone").toString().getBytes("iso8859-1"), "utf-8"));
				}
				if (filterJson.has("factoryTelephone")) {
					filterMap.put("factoryTelephone",
							new String(filterJson.get("factoryTelephone").toString().getBytes("iso8859-1"), "utf-8"));
					factory.setFactoryTelephone(
							new String(filterJson.get("factoryTelephone").toString().getBytes("iso8859-1"), "utf-8"));
				}
				if (filterJson.has("factoryAddress")) {
					filterMap.put("factoryAddress",
							new String(filterJson.get("factoryAddress").toString().getBytes("iso8859-1"), "utf-8"));
					factory.setFactoryAddress(
							new String(filterJson.get("factoryAddress").toString().getBytes("iso8859-1"), "utf-8"));
				}
				if (filterJson.has("factoryScale")) {
					filterMap.put("factoryScale",
							new String(filterJson.get("factoryScale").toString().getBytes("iso8859-1"), "utf-8"));
					factory.setFactoryScale(
							new String(filterJson.get("factoryScale").toString().getBytes("iso8859-1"), "utf-8"));
				}
				if (filterJson.has("factoryRemarks")) {
					filterMap.put("factoryRemarks",
							new String(filterJson.get("factoryRemarks").toString().getBytes("iso8859-1"), "utf-8"));
					factory.setFactoryRemarks(
							new String(filterJson.get("factoryRemarks").toString().getBytes("iso8859-1"), "utf-8"));
				}
				if (filterJson.has("factoryDatetime")) {
					filterMap.put("factoryDatetime",
							new String(filterJson.get("factoryDatetime").toString().getBytes("iso8859-1"), "utf-8"));
				}
				if (filterJson.has("factoryOperation")) {
					filterMap.put("factoryOperation",
							new String(filterJson.get("factoryOperation").toString().getBytes("iso8859-1"), "utf-8"));
				}
				if (filterJson.has("factoryStatus")) {
					filterMap.put("factoryStatus",
							new String(filterJson.get("factoryStatus").toString().getBytes("iso8859-1"), "utf-8"));
					factory.setFactoryStatus(
							new String(filterJson.get("factoryStatus").toString().getBytes("iso8859-1"), "utf-8"));
				}
				
			}else {
				//完善，如果filter为空，说明是初始化，我们要增加工厂状态的过滤
				filterMap.put("factoryStatus","1");
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
				factory.setFactoryStatus("1");
				factory.setFactoryCreate(sdf.format(now));
				factory.setFactoryModify(sdf.format(now));
				// 添加之前做判断 是否具有同名属性

				if (factoryService.findFactoryByEqualFactoryName(factory.getFactoryName()) == null) {
					factoryService.addFactory(factory);
				} else {
					js.put("msg", "同名属性已存在，请查看");
				}
			}
			if (method.equals("modify")) {
				factory.setFactoryStatus("1");
				factory.setFactoryModify(sdf.format(now));
				factoryService.updateFactoryByFactoryId(factory);
			}
			if (method.equals("delete")) {
				factory.setFactoryStatus("0");
				factoryService.updateFactoryByFactoryId(factory);
				// 重置filterMap为空
				// filterMap=null;
			}

			int count = factoryService.getFactoryInfo(filterMap).size();// 获取总数
			System.err.println("count:"+count);
			int size = (int) Math.ceil((float) count / pageSize);
			if (size == 0) {
				size = 1;
			}
			js.put("page", size);
			// System.out.println("=======" + size);
			filterMap.put("start", start);
			filterMap.put("size", (int) pageSize);
			list = factoryService.getFactoryInfo(filterMap);
			JSONArray ja = new JSONArray();
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd
			// HH:mm:ss");
			for (Factory propsTmp : list) {
				JSONObject tem_jo = new JSONObject();
				tem_jo.put("factoryId", propsTmp.getFactoryId());
				tem_jo.put("factoryName", propsTmp.getFactoryName());
				tem_jo.put("factoryContacts", propsTmp.getFactoryContacts());
				tem_jo.put("factoryPhone", propsTmp.getFactoryPhone());
				tem_jo.put("factoryTelephone", propsTmp.getFactoryTelephone());
				tem_jo.put("factoryAddress", propsTmp.getFactoryAddress());
				tem_jo.put("factoryScale", propsTmp.getFactoryScale());
				tem_jo.put("factoryRemarks", propsTmp.getFactoryRemarks());
				tem_jo.put("factoryStatus", propsTmp.getFactoryStatus());
				ja.put(tem_jo);
			}

			js.put("list", ja);
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(js.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
