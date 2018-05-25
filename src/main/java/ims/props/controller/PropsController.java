package ims.props.controller;

import javax.servlet.http.HttpServletRequest;

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

	@RequestMapping(value = "/propsList", method = RequestMethod.POST)
	public String propsList(Props propsObj, HttpServletRequest request) {
		//通过综合条件查询工厂信息
		propsService.getPropsInfo(propsObj);
		request.setAttribute("errorMessage", "同名工厂信息已经存在");
		return "error";
	}
}
