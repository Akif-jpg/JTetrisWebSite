package com.programming.JavaTetrisWeb.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "forum")
public class ForumEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	@Size(min = 5, max = 20)
	private String forumTitle;
	@Column
	@Size(min = 50, max = 25000)
	private String forumContext;
	
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "forum_id")
    private List<Comment> comments;

    
	public ForumEntity(Integer id, @Size(min = 5, max = 20) String forumTitle,
			@Size(min = 50, max = 25000) String forumContext, List<Comment> comments) {
		super();
		this.id = id;
		this.forumTitle = forumTitle;
		this.forumContext = forumContext;
		this.comments = comments;
	}
	
	

	public ForumEntity() {
		super();
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
    
    
}
