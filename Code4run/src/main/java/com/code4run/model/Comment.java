package com.code4run.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "comment")
public class Comment {
	
	@Id
	@Column(name = "id", nullable  = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "userId", length = 10)
	private int userId;
	@Column(name = "articleId", length = 10)
	private int articleId;
	@Column(name = "problemId", length = 10)
	private int problemId;
	@Column(name = "description", length = 10000)
	private String description;
	@Column(name = "posted_date", length = 30)
	private Date postedDate;
	
	@OneToMany
	@ForeignKey(name = "fk_User")
	private Comment comment;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public int getProblemId() {
		return problemId;
	}
	public void setProblemId(int problemId) {
		this.problemId = problemId;
	}
	public String getCommentDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

}
