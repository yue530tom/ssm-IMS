package ims.pros.dao;

import org.springframework.stereotype.Repository;

import ims.pros.domain.Reply;

import java.util.List;

/**
 * 
 * @ClassName:  ReplyDao   
 * @Description:TODO
 * @author: yueling
 * @date:   2018年5月22日 下午3:30:51   
 *     
 * @Copyright: 2018 yueling Inc. All rights reserved.
 */
@Repository
public interface ReplyDao {
    /**
     * 添加回复
     *
     * @param reply 需要添加的回复
     */
    void addReply(Reply reply);

    /**
     * 指定文章的回复
     *
     * @param postId 指定的文章 id
     * @return 回复列表
     */
    List<Reply> listReplyByPostId(int postId);

    /**
     * 删除回复
     *
     * @param postId 回复 id
     */
    void deleteReplyById(int postId);

    /**
     * 通过回复 id 查找回复
     *
     * @param replyId 回复 id
     * @return 查找到的回复
     */
    Reply findReplyByReplyId(int replyId);
}
