package ims.props.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
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

import ims.props.domain.Props;
import ims.props.service.PropsService;

@Controller
@RequestMapping("/props")
public class PropsController {
	private final PropsService propsService;
	private final int pageSize = 5;
	@Autowired
	public PropsController(PropsService propsService) {
		this.propsService = propsService;
	}

	@RequestMapping(value = "/toPropsAddPage", method = RequestMethod.GET)
	public String toPropsAddPage() {
		return "props/propsAdd";
	}

	@RequestMapping(value = "/toPropsListPage", method = RequestMethod.GET)
	public String toPropsListPage() {
		return "props/propsList";
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

/*	@RequestMapping(value = "/propsList", method = RequestMethod.POST)
	public String propsList(Props propsObj, HttpServletRequest request) {
		//通过综合条件查询工厂信息
		propsService.getPropsInfo(propsObj);
		request.setAttribute("errorMessage", "同名工厂信息已经存在");
		return "error";
	}*/
	
	@RequestMapping(value = "/propsList", method = RequestMethod.GET)
	public void propsList(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		String filter = request.getParameter("filter");
		List<Props> list = new ArrayList<Props>();
		Map<String, Object> filterMap = new HashMap<String, Object>();
		
		Props props = new Props();
		try {
			if (filter != null) {
				JSONObject filterJson = new JSONObject(filter);
				if (filterJson.has("queryPropsId")) {
					/*
					 * System.out.println(new
					 * String(filterJson.get("file_name").toString().getBytes(
					 * "iso8859-1"), "utf-8"));
					 * System.out.println(filterJson.get("file_name"));
					 */
					filterMap.put("queryPropsId", filterJson.get("queryPropsId"));
					props.setPropsId(Long.valueOf(filterJson.get("queryPropsId").toString()));
					
				}
				if (filterJson.has("queryPropsName")) {
					filterMap.put("queryPropsName", filterJson.get("queryPropsName"));
					props.setPropsName(filterJson.get("queryPropsName").toString());
				}
				if (filterJson.has("queryPropsDesc")) {
					filterMap.put("queryPropsDesc", filterJson.get("queryPropsDesc").toString());
					props.setPropsDesc(filterJson.get("queryPropsDesc").toString());
				}
				if (filterJson.has("queryPropsStatus")) {
					filterMap.put("queryPropsStatus", filterJson.get("queryPropsStatus"));
					props.setPropsStatus(filterJson.get("queryPropsStatus").toString());
				}
			}
			
			System.err.println(props.toString());
			String page = request.getParameter("page");

			int start = 0;
			if (page != null) {
				JSONObject pageJo = new JSONObject(page);
				int curPage = Integer.parseInt(pageJo.get("cur_page").toString());
				start = (curPage + 1) * (int) pageSize;
			}

			JSONObject js = new JSONObject();
			int count = propsService.getPropsInfo(props).size();// 获取总数
			int size = (int) Math.ceil((float) count / pageSize);
			if (size == 0) {
				size = 1;
			}
			js.put("page", size);
			// System.out.println("=======" + size);
			filterMap.put("start", start);
			filterMap.put("size", (int) pageSize);
			list = propsService.getPropsInfo(props);
			JSONArray ja = new JSONArray();
			//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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
}
