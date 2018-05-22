package ims.pros.service;

import java.util.List;

import ims.pros.domain.Post;

/**
 * 
 * @ClassName:  PostService   
 * @Description:TODO
 * @author: yueling
 * @date:   2018年5月22日 下午3:31:28   
 *     
 * @Copyright: 2018 yueling Inc. All rights reserved.
 */
public interface PostService {
    /**
     * 添加文章
     *
     * @param post 新增的文章
     */
    void addPostByPost(Post post);

    /**
     * 获取文章内容
     *
     * @param postId 文章 id
     * @return 文章内容
     */
    Post listPostContent(int postId);

    /**
     * 获取所有文章
     *
     * @return 文章列表
     */
    List<Post> listAllPost();

    /**
     * 删除文章
     *
     * @param postId 文章 id
     */
    void deletePost(int postId);
}
