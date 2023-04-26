package com.example.springbootRest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springbootRest.model.Post;
@Repository
public interface PostDao extends JpaRepository<Post,Integer> {
	public List<Post> findByAuthor(String author);
	public List<Post> findByTitle(String title);
	
	@Query("select u from Post u where u.title=?1 and u.author=?2")
	public List<Post> findByTitleAndAuthor(String title,String author);
}
