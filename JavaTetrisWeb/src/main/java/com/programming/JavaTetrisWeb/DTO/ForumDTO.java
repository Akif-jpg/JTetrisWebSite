package com.programming.JavaTetrisWeb.DTO;

import java.util.List;

import com.programming.JavaTetrisWeb.models.Comment;

public class ForumDTO {

	private int id;
	private String forumTitle;
	private String forumContext;
	private List<Comment> comments;
	
	public String getForumTitle() {
		return forumTitle;
	}
	public void setForumTitle(String forumTitle) {
		this.forumTitle = forumTitle;
	}
	public String getForumContext() {
		return forumContext;
	}
	public void setForumContext(String forumContext) {
		this.forumContext = forumContext;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
