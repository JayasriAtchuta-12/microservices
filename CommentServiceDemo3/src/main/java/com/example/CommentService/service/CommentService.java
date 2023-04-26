package com.example.CommentService.service;

import java.util.List;

import com.example.CommentService.model.Comments;

public interface CommentService {
	public List<Comments> getAllComments();
	public Comments insertComment(Comments post);
	public void deleteComment(Integer cid);
	public List<Comments> findAllCommentsByPid(Integer pid);
}
