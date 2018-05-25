package ims.props.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ims.manager.domain.User;
import ims.manager.service.UserService;

/**
 * 
 * @ClassName:  AdminController   
 * @Description:TODO
 * @author: yueling
 * @date:   2018年5月22日 下午3:29:59   
 *     
 * @Copyright: 2018 yueling Inc. All rights reserved.
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    private final UserService userService;


    @Autowired
    public AdminController( UserService userService) {

        this.userService = userService;

    }

    /**
     * 论坛管理中心
     *
     * @param request 请求
     * @return 页面
     */
    @RequestMapping(value = "/manageCenter")
    public String manageCenter(HttpServletRequest request) {
        if (request.getSession().getAttribute("username").equals("admin")) {
            return "admin/manageCenter";
        }
        return "redirect:/error";
    }

    
    /**
     * 管理用户信息
     *
     * @param request 请求
     * @return 页面
     */
    @RequestMapping(value = "manageUser")
    public String manageUser(HttpServletRequest request) {
        List<User> users = userService.getAllUser();
        if (users != null) {
            request.setAttribute("users", users);
            return "/admin/allUserInfo";
        }

        return "redirect:/error";
    }

    
}
