package com.example.CommentService.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CommentService.model.Comments;
import com.example.CommentService.service.CommentService;

@RestController
@RequestMapping("/Comments")
public class CommentController {
	@Value("${server.port}")
	String port;
	
	@GetMapping("/port")
	public String getPort() {
		return port;
	}
	
   @Autowired
   CommentService service;
   @GetMapping("/all")
	public List<Comments> showAll(){
		return service.getAllComments();
	}
   @PostMapping("/added")
	public Comments createRecord(@RequestBody Comments comment) {
		return service.insertComment(comment);
	}
   @DeleteMapping("/delete/{cid}")
	public String deleteRecord(@PathVariable("cid")Integer cid) {
		service.deleteComment(cid);
		return "Record deleted";
	}
   @GetMapping("/findByPid/{pid}")
	public List<Comments> showAllByPid(@PathVariable("pid")Integer pid){
		return service.findAllCommentsByPid(pid);
	}
}
