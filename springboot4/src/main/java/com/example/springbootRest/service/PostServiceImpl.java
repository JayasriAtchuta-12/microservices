package com.example.springbootRest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.springbootRest.dao.PostDao;
import com.example.springbootRest.model.CommentsDto;
import com.example.springbootRest.model.IntefaceComment;
import com.example.springbootRest.model.Post;
@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostDao dao;
	@Autowired
	RestTemplate temp;
	@Autowired
	IntefaceComment ic;
	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public Post insertPost(Post post) {
		// TODO Auto-generated method stub
		return dao.save(post);
	}
	@Override
	public Optional<Post> findPost(Integer pid) {
		// TODO Auto-generated method stub
		return dao.findById(pid);
	}
	@Override
	public void deletePost(Integer pid) {
		// TODO Auto-generated method stub
		dao.deleteById(pid);
	}
	@Override
	public List<Post> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return dao.findByAuthor(author);
	}
	@Override
	public List<Post> findByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.findByTitle(title);
	}
	@Override
	public List<Post> findByTitleAuthor(String title, String author) {
		// TODO Auto-generated method stub
		return dao.findByTitleAndAuthor(title, author);
	}
	@Override
	public List<CommentsDto> getCommentsForPostId(Integer pid) {
		// TODO Auto-generated method stub
		//String url = "http://localhost:8081/Comments/findByPid/"+pid;
		String url = "http://COMMENT-SERVICE/Comments/findByPid/"+pid;
		return temp.getForObject(url,List.class);
		
	}
	@Override
	public String getCommentsPort() {
		// TODO Auto-generated method stub
		return ic.getPort();
		//return temp.getForObject("http://COMMENT-SERVICE/Comments/port",String.class);
	}
	
	


}
