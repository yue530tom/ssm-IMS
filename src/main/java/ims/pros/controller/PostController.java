package ims.pros.controller;

import ims.pros.domain.Post;
import ims.pros.domain.Reply;
import ims.pros.service.BoardService;
import ims.pros.service.PostService;
import ims.pros.service.ReplyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.List;

/**
 * 
 * @ClassName:  PostController   
 * @Description:TODO
 * @author: yueling
 * @date:   2018年5月22日 下午3:30:18   
 *     
 * @Copyright: 2018 yueling Inc. All rights reserved.
 */
@Controller
@RequestMapping(value = "/post")
public class PostController {
    private final PostService postService;
    private final BoardService boardService;
    private final ReplyService replyService;

    @Autowired
    public PostController(PostService postService, BoardService boardService, ReplyService replyService) {
        this.postService = postService;
        this.boardService = boardService;
        this.replyService = replyService;
    }

    /**
     * 添加帖子
     *
     * @param post 新增的文章
     * @return 返回页面
     */
    @RequestMapping(value = "/addPost")
    public String addPost(Post post) {
        if (post != null) {
            Post newPost = post;
            Timestamp createLoginTime = new Timestamp(System.currentTimeMillis());
            newPost.setPostCreateTime(createLoginTime);
            newPost.setPostUpdateTime(createLoginTime);

            postService.addPostByPost(newPost);
            boardService.updatePostNum(newPost.getPostBoardId());

            return "redirect:postContent-" + post.getPostId();
        }
        return "error";
    }

    /**
     * 查看帖子
     *
     * @param postId  帖子 id
     * @param request 请求
     * @return 返回页面
     */
    @RequestMapping(value = "postContent-{postId}")
    public String intoPost(@PathVariable int postId, HttpServletRequest request) {
        System.out.println(postId);
        Post post = postService.listPostContent(postId);
        List<Reply> replies = replyService.listReplyByPostId(postId);

        if (post == null) {
            return "/error";
        }
        // 帖子有回复则添加回复信息
        if (replies != null) {
            request.setAttribute("replies", replies);
        }

        request.setAttribute("post", post);
        return "post/postContent";
    }
}
