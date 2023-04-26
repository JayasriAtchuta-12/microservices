package com.example.springbootRest.model;

public class CommentsDto {
	int cid;
	String commentor; 
	int pid;
	String comment;
	public CommentsDto() {
		
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
	public CommentsDto(int cid, String commentor, int pid, String comment) {
		super();
		this.cid = cid;
		this.commentor = commentor;
		this.pid = pid;
		this.comment = comment;
	}
}
