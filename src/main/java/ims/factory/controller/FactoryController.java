package ims.factory.controller;

import javax.servlet.http.HttpServletRequest;

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

	@Autowired
	public FactoryController(FactoryService factoryService) {
		this.factoryService = factoryService;
	}

	@RequestMapping(value = "/toFactoryAddPage", method = RequestMethod.POST)
	public String toFactoryAddPage() {
		return "factory/factoryAdd";
	}

	@RequestMapping(value = "/toFactoryListPage", method = RequestMethod.POST)
	public String toFactoryListPage() {
		return "factory/factoryList";
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

	@RequestMapping(value = "/factoryList", method = RequestMethod.POST)
	public String factoryList(Factory factoryObj, HttpServletRequest request) {
		//通过综合条件查询工厂信息
		factoryService.getFactoryInfo(factoryObj);
		request.setAttribute("errorMessage", "同名工厂信息已经存在");
		return "error";
	}
}
