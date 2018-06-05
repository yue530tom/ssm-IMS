package ims.props.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @ClassName:  MainController   
 * @Description:TODO
 * @author: yueling
 * @date:   2018年5月22日 下午3:30:13   
 *     
 * @Copyright: 2018 yueling Inc. All rights reserved.
 */
@Controller
public class MainController {
    

    /**
     * 主页
     *
     * @return 主页
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/userTest")
    public String userTest() {
    	return "indexa";
    }
    @RequestMapping("/help")
    public String help() {
        return "/help/index";
    }
    /**
     * 显示用户登录页面
     *
     * @return 返回页面
     */
    @RequestMapping("/userLogin")
    public String userLogin() {
        return "user/userLogin";
    }

    /**
     * 显示注册页面
     *
     * @return 返回页面
     */
    @RequestMapping("/userRegister")
    public String userRegister() {
        return "user/userRegister";
    }

    /**
     * 显示添加文章的页面
     *
     * @param userName 用户名
     * @param boardId  板块 id
     * @param request  请求
     * @return 返回页面
     */
    @RequestMapping("addPost")
    public String addPost(String userName, String boardId, HttpServletRequest request) {
        if (userName != null && boardId != null) {
            request.setAttribute("username", userName);
            request.setAttribute("boardId", boardId);

            return "/post/addPost";
        }

        return "redirect:/error";
    }

    /**
     * 显示添加回复的页面
     *
     * @param replyPostId   回复的文章的 id
     * @param replyUserName 回复用户的姓名
     * @param request       请求
     * @return 返回页面
     */
    @RequestMapping("addReply")
    public String addReply(int replyPostId, String replyUserName, HttpServletRequest request) {
        if (replyPostId > 0 && replyUserName != null) {
            request.setAttribute("replyPostId", replyPostId);
            request.setAttribute("replyUserName", replyUserName);

            return "reply/reply";
        }
        return "redirect:/error";
    }

    /**
     * 显示添加板块的页面
     *
     * @return 返回页面
     */
    @RequestMapping(value = "addBoard")
    public String addBoardPage() {
        return "/admin/addBoard";
    }

   
    /**
     * 错误页面
     *
     * @return 返回错误页面
     */
    @RequestMapping(value = "error")
    public String error() {
        return "error";
    }
}
