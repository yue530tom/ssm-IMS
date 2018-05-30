package ims.factory.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ims.factory.domain.Factory;
import ims.factory.service.FactoryService;

@Controller
@RequestMapping("/factory")
public class FactoryController {

	private final FactoryService factoryService;
	private final int pageSize = 5;

	@Autowired
	public FactoryController(FactoryService factoryService) {
		this.factoryService = factoryService;
	}

	@RequestMapping(value = "/toFactoryAddPage", method = RequestMethod.GET)
	public String toFactoryAddPage() {
		return "factory/factoryAdd";
	}

	@RequestMapping(value = "/toFactoryPage", method = RequestMethod.GET)
	public String toFactoryListPage() {
		return "factory/factory";
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
				// 添加之前做判断 是否具有同名属性

				if (factoryService.findFactoryByEqualFactoryName(factory.getFactoryName()) == null) {
					factoryService.addFactory(factory);
				} else {
					js.put("msg", "同名属性已存在，请查看");
				}
			}
			if (method.equals("modify")) {
				factory.setFactoryStatus("1");
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
