package ims.pros.service.impl;

import ims.pros.dao.BoardDao;
import ims.pros.dao.PostDao;
import ims.pros.domain.Board;
import ims.pros.domain.Post;
import ims.pros.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 * @ClassName:  PostServiceImpl   
 * @Description:TODO
 * @author: yueling
 * @date:   2018年5月22日 下午3:31:44   
 *     
 * @Copyright: 2018 yueling Inc. All rights reserved.
 */
@Service
public class PostServiceImpl implements PostService {
    private final PostDao postDao;
    private final BoardDao boardDao;

    @Autowired
    public PostServiceImpl(PostDao postDao, BoardDao boardDao) {
        this.postDao = postDao;
        this.boardDao = boardDao;
    }

    @Override
    public void addPostByPost(Post post) {
        postDao.addPost(post);
    }

    @Override
    public Post listPostContent(int postId) {
        return postDao.findPostByPostId(postId);
    }

    @Override
    public List<Post> listAllPost() {
        return postDao.listAllPostInfo();
    }

    @Override
    public void deletePost(int postId) {
        // 更新Board数据
        int boardId = postDao.findPostByPostId(postId).getPostBoardId();
        Board board = boardDao.findBoardByBoardId(boardId);
        board.setBoardPostNum(board.getBoardPostNum() - 1);
        boardDao.updateBoardByBoard(board);

        // 删除post
        postDao.deletePostById(postId);
    }
}
