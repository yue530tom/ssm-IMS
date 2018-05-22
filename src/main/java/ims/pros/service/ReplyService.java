package ims.pros.service;

import java.util.List;

import ims.pros.domain.Reply;

/**
 * 
 * @ClassName:  ReplyService   
 * @Description:TODO
 * @author: yueling
 * @date:   2018年5月22日 下午3:31:33   
 *     
 * @Copyright: 2018 yueling Inc. All rights reserved.
 */
public interface ReplyService {
    /**
     * 添加回复
     *
     * @param reply 回复实例
     */
    void addReply(Reply reply);

    /**
     * 获取指定文章的回复
     *
     * @param postId 文章 id
     * @return 回复列表
     */
    List<Reply> listReplyByPostId(int postId);

    /**
     * 删除回复
     *
     * @param replyId 回复 id
     */
    void deleteReply(int replyId);
}
