package ims.pros.service.impl;

import ims.pros.dao.PostDao;
import ims.pros.dao.ReplyDao;
import ims.pros.domain.Post;
import ims.pros.domain.Reply;
import ims.pros.service.ReplyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * ReplyServiceImpl
 *
 * @author igaozp
 * @version 1.0
 * @since 2016
 */
@Service
public class ReplyServiceImpl implements ReplyService {
    private final ReplyDao replyDao;
    private final PostDao postDao;

    @Autowired
    public ReplyServiceImpl(ReplyDao replyDao, PostDao postDao) {
        this.replyDao = replyDao;
        this.postDao = postDao;
    }

    @Override
    public void addReply(Reply reply) {
        // 更新post信息
        Reply dbReply = reply;
        int postId = reply.getReplyPostId();
        Post post = postDao.findPostByPostId(postId);
        post.setPostReplyCount(post.getPostReplyCount() + 1);
        postDao.updatePostByPost(post);

        // 添加回复
        dbReply.setReplyCreateTime(new Timestamp(System.currentTimeMillis()));
        replyDao.addReply(dbReply);
    }

    @Override
    public List<Reply> listReplyByPostId(int replyPostId) {
        return replyDao.listReplyByPostId(replyPostId);
    }

    @Override
    public void deleteReply(int replyId) {
        // 更新post信息
        Reply reply = replyDao.findReplyByReplyId(replyId);
        Post post = postDao.findPostByPostId(reply.getReplyPostId());
        post.setPostReplyCount(post.getPostReplyCount() - 1);
        postDao.updatePostByPost(post);

        // 删除回复
        replyDao.deleteReplyById(replyId);
    }
}
