package com.example.CommentService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Comments")
public class Comments {
	@Id
	int cid;
	String commentor; 
	int pid;
	String comment;
	public Comments() {
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCommentor() {
		return commentor;
	}
	public void setCommentor(String commentor) {
		this.commentor = commentor;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Comments(int cid, String commentor, int pid, String comment) {
		super();
		this.cid = cid;
		this.commentor = commentor;
		this.pid = pid;
		this.comment = comment;
	}
}
