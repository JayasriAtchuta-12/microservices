package com.example.springbootRest.service;

import java.util.List;
import java.util.Optional;

import com.example.springbootRest.model.CommentsDto;
import com.example.springbootRest.model.Post;

public interface PostService {
	public List<Post> getAllPosts();
	public Post insertPost(Post post);
	public Optional<Post> findPost(Integer pid);
	public void deletePost(Integer pid);
	public List<Post> findByAuthor(String author);
	public List<Post> findByTitle(String title);
	public List<Post> findByTitleAuthor(String title,String author);
	public List<CommentsDto> getCommentsForPostId(Integer pid);
	public String getCommentsPort();
}
