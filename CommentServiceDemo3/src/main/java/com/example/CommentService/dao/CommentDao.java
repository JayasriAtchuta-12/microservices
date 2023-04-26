package com.example.CommentService.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CommentService.model.Comments;

@Repository
public interface CommentDao extends JpaRepository<Comments,Integer>{
	public List<Comments> findAllCommentsByPid(Integer pid);
}
