package com.example.CommentService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CommentService.dao.CommentDao;
import com.example.CommentService.model.Comments;
@Service
public class CommentServiceImpl implements CommentService{
	@Autowired
     CommentDao dao;
	@Override
	public List<Comments> getAllComments() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public Comments insertComment(Comments comment) {
		// TODO Auto-generated method stub
		return dao.save(comment);
	}
	@Override
	public void deleteComment(Integer cid) {
		// TODO Auto-generated method stub
		dao.deleteById(cid);
	}
	@Override
	public List<Comments> findAllCommentsByPid(Integer pid) {
		// TODO Auto-generated method stub
		return dao.findAllCommentsByPid(pid);
	}

}
