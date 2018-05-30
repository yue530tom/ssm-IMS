package ims.props.controller;

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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ims.props.domain.Props;
import ims.props.domain.PropsDetails;
import ims.props.service.PropsDetailsService;
import ims.props.service.PropsService;

@Controller
@RequestMapping("/props")
public class PropsController {
	private final PropsService propsService;
	private final PropsDetailsService propsDetailsService;
	private final int pageSize = 5;

	@Autowired
	public PropsController(PropsService propsService,PropsDetailsService propsDetailsService) {
		this.propsService = propsService;
		this.propsDetailsService=propsDetailsService;
	}

	@RequestMapping(value = "/toPropsDetailsPage", method = RequestMethod.GET)
	public String toPropsDetailsPage(Model model) throws JSONException {
		//要带值去页面
		HashMap<String, Object> filterMap= new HashMap<>();
		filterMap.put("propsStatus", 1);
		List<Props> list = propsService.getPropsInfo(filterMap);
		JSONArray allProps = new JSONArray();
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (Props propsTmp : list) {
			JSONObject tem_jsonoObject = new JSONObject();
			tem_jsonoObject.put("queryPropsId", propsTmp.getPropsId());
			tem_jsonoObject.put("queryPropsName", propsTmp.getPropsName());
			allProps.put(tem_jsonoObject);
		}
		//js.put("props", allProps);
		model.addAttribute("props", allProps);
		return "props/propsDetails";
	}

	@RequestMapping(value = "/toPropsPage", method = RequestMethod.GET)
	public String toPropsListPage() {
		return "props/props";
	}

	@RequestMapping(value = "/propsAdd", method = RequestMethod.POST)
	public String propsAdd(Props newPropsObj, HttpServletRequest request) {
		newPropsObj.setPropsName("color");
		newPropsObj.setPropsDesc("颜色");
		newPropsObj.setPropsRemarks("color");
		newPropsObj.setPropsStatus("1");

		// 通过工厂名称精确查找工厂
		Props props = propsService.findPropsByEqualPropsName(newPropsObj.getPropsName());
		if (props == null) {
			propsService.addProps(newPropsObj);
			// 登陆成功，根据前台传来的标记进行跳转：前台传入是否连续添加
			if (request.getParameter("goon") != null && request.getParameter("goon").equals("T")) {
				return "redirect:/toPropsAddPage";
			} else {
				return "props/propsList";
			}
		}
		request.setAttribute("errorMessage", "同名工厂信息已经存在");
		return "error";
	}

	/*
	 * @RequestMapping(value = "/propsList", method = RequestMethod.POST) public
	 * String propsList(Props propsObj, HttpServletRequest request) { //通过综合条件查询工厂信息
	 * propsService.getPropsInfo(propsObj); request.setAttribute("errorMessage",
	 * "同名工厂信息已经存在"); return "error"; }
	 */

	@RequestMapping(value = "/propsList", method = RequestMethod.GET)
	public void propsList(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String filter = request.getParameter("filter");
		List<Props> list = new ArrayList<Props>();
		Map<String, Object> filterMap = new HashMap<String, Object>();
		String method="";
		Props props=new Props();
		try {
			if(filter!=null) {
			JSONObject filterJson = new JSONObject(filter);
			if (filterJson.has("method")) {
				method=new String(filterJson.get("method").toString().getBytes("iso8859-1"), "utf-8");
			}
			if (filterJson.has("propsId")) {
				filterMap.put("propsId", filterJson.get("propsId"));
				props.setPropsId(Long.valueOf(filterJson.get("propsId").toString()));
			}
			if (filterJson.has("propsName")) {
				filterMap.put("propsName",
						new String(filterJson.get("propsName").toString().getBytes("iso8859-1"), "utf-8"));
				props.setPropsName(new String(filterJson.get("propsName").toString().getBytes("iso8859-1"), "utf-8"));
			}
			if (filterJson.has("propsDesc")) {
				filterMap.put("propsDesc",
						new String(filterJson.get("propsDesc").toString().getBytes("iso8859-1"), "utf-8"));
				props.setPropsDesc(new String(filterJson.get("propsDesc").toString().getBytes("iso8859-1"), "utf-8"));
			}
			if (filterJson.has("propsStatus")) {
				filterMap.put("propsStatus",
						new String(filterJson.get("propsStatus").toString().getBytes("iso8859-1"), "utf-8"));
				props.setPropsStatus(new String(filterJson.get("propsStatus").toString().getBytes("iso8859-1"), "utf-8"));
			}
			if (filterJson.has("propsRemarks")) {
				filterMap.put("propsRemarks",
						new String(filterJson.get("propsRemarks").toString().getBytes("iso8859-1"), "utf-8"));
				props.setPropsRemarks(new String(filterJson.get("propsRemarks").toString().getBytes("iso8859-1"), "utf-8"));
			}
			}
			System.out.println("filter:" + filter);
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
				props.setPropsStatus("1");
				//添加之前做判断 是否具有同名属性
				
				if(propsService.findPropsByEqualPropsName(props.getPropsName())==null) {
					propsService.addProps(props);
				}else {
					js.put("msg", "同名属性已存在，请查看");
				}
			}
			if (method.equals("modify")) {
				if (props.getPropsId()<=6) {
					js.put("msg", "该属性是初始化属性，不允许修改，默认初始化属性id范围为1~6");
				}else {
					props.setPropsStatus("1");
					propsService.updatePropsByPropsId(props);
				}
				
			}
			if (method.equals("delete")) {
				if (props.getPropsId()<=6) {
					js.put("msg", "该属性是初始化属性，不允许删除，默认初始化属性id范围为1~6");
				}else {
					props.setPropsStatus("0");
					propsService.updatePropsByPropsId(props);
				}
				
				//重置filterMap为空
				//filterMap=null;
			}
			
			
			
			int count = propsService.getPropsInfo(filterMap).size();// 获取总数
			int size = (int) Math.ceil((float) count / pageSize);
			if (size == 0) {
				size = 1;
			}
			js.put("page", size);
			// System.out.println("=======" + size);
			filterMap.put("start", start);
			filterMap.put("size", (int) pageSize);
			list = propsService.getPropsInfo(filterMap);
			JSONArray ja = new JSONArray();
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			for (Props propsTmp : list) {
				JSONObject tem_jo = new JSONObject();
				tem_jo.put("queryPropsId", propsTmp.getPropsId());
				tem_jo.put("queryPropsName", propsTmp.getPropsName());
				tem_jo.put("queryPropsDesc", propsTmp.getPropsDesc());
				tem_jo.put("queryPropsRemarks", propsTmp.getPropsRemarks());
				tem_jo.put("queryPropsStatus", propsTmp.getPropsStatus());
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
	@RequestMapping(value = "/propsDetailsList", method = RequestMethod.GET)
	public void propsDetailsList(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String filter = request.getParameter("filter");
		List<PropsDetails> list = new ArrayList<PropsDetails>();
		Map<String, Object> filterMap = new HashMap<String, Object>();
		String method="";
		PropsDetails propsDetails=new PropsDetails();
		try {
			if(filter!=null) {
			JSONObject filterJson = new JSONObject(filter);
			if (filterJson.has("method")) {
				method=new String(filterJson.get("method").toString().getBytes("iso8859-1"), "utf-8");
			}
			if (filterJson.has("propsDetailsId")) {
				filterMap.put("propsDetailsId", filterJson.get("propsDetailsId"));
				propsDetails.setPropsDetailsId(Long.valueOf(filterJson.get("propsDetailsId").toString()));
			}
			if (filterJson.has("propsId")) {
				filterMap.put("propsId", filterJson.get("propsId"));
				propsDetails.setPropsId(Long.valueOf(filterJson.get("propsId").toString()));
			}
			if (filterJson.has("propsDetailsName")) {
				filterMap.put("propsDetailsName",
						new String(filterJson.get("propsDetailsName").toString().getBytes("iso8859-1"), "utf-8"));
				propsDetails.setPropsDetailsName(new String(filterJson.get("propsDetailsName").toString().getBytes("iso8859-1"), "utf-8"));
			}
			if (filterJson.has("propsDetailsDesc")) {
				filterMap.put("propsDetailsDesc",
						new String(filterJson.get("propsDetailsDesc").toString().getBytes("iso8859-1"), "utf-8"));
				propsDetails.setPropsDetailsDesc(new String(filterJson.get("propsDetailsDesc").toString().getBytes("iso8859-1"), "utf-8"));
			}
			if (filterJson.has("propsDetailsStatus")) {
				filterMap.put("propsDetailsStatus",
						new String(filterJson.get("propsDetailsStatus").toString().getBytes("iso8859-1"), "utf-8"));
				propsDetails.setPropsDetailsStatus(new String(filterJson.get("propsDetailsStatus").toString().getBytes("iso8859-1"), "utf-8"));
			}
			if (filterJson.has("propsDetailsRemarks")) {
				filterMap.put("propsDetailsRemarks",
						new String(filterJson.get("propsDetailsRemarks").toString().getBytes("iso8859-1"), "utf-8"));
				propsDetails.setPropsDetailsRemarks(new String(filterJson.get("propsDetailsRemarks").toString().getBytes("iso8859-1"), "utf-8"));
			}
			}
			System.out.println("filter:" + filter);
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
				propsDetails.setPropsDetailsStatus("1");
				//添加之前做判断 是否具有同名属性
				System.err.println(propsDetails.toString());
				if(propsDetailsService.findPropsDetailsByEqualPropsDetailsName(propsDetails.getPropsDetailsName())==null) {
					propsDetailsService.addPropsDetails(propsDetails);
				}else {
					js.put("msg", "同名属性已存在，请查看");
				}
			}
			if (method.equals("modify")) {
				propsDetails.setPropsDetailsStatus("1");
				propsDetailsService.updatePropsDetailsByPropsDetailsId(propsDetails);
			}
			if (method.equals("delete")) {
				propsDetails.setPropsDetailsStatus("0");
				propsDetailsService.updatePropsDetailsByPropsDetailsId(propsDetails);
				//重置filterMap为空
				//filterMap=null;
			}
			
			
			
			int count = propsDetailsService.getPropsDetailsInfo(filterMap).size();// 获取总数
			int size = (int) Math.ceil((float) count / pageSize);
			if (size == 0) {
				size = 1;
			}
			js.put("page", size);
			// System.out.println("=======" + size);
			filterMap.put("start", start);
			filterMap.put("size", (int) pageSize);
			list = propsDetailsService.getPropsDetailsInfo(filterMap);
			JSONArray jsonArrayList = new JSONArray();
			// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			for (PropsDetails propsDetailsTmp : list) {
				JSONObject tem_jsonObject = new JSONObject();
				tem_jsonObject.put("queryPropsDetailsId", propsDetailsTmp.getPropsDetailsId());
				tem_jsonObject.put("queryPropsId", propsDetailsTmp.getPropsId());
				tem_jsonObject.put("queryPropsDetailsName", propsDetailsTmp.getPropsDetailsName());
				tem_jsonObject.put("queryPropsDetailsDesc", propsDetailsTmp.getPropsDetailsDesc());
				tem_jsonObject.put("queryPropsDetailsRemarks", propsDetailsTmp.getPropsDetailsRemarks());
				tem_jsonObject.put("queryPropsDetailsStatus", propsDetailsTmp.getPropsDetailsStatus());
				
				System.err.println("propsDetailsTmp.getPropsDetailsStatus():"+propsDetailsTmp.getPropsDetailsStatus());
				jsonArrayList.put(tem_jsonObject);
			}
			js.put("list", jsonArrayList);
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(js.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
