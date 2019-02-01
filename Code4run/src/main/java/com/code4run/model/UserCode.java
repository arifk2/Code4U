package com.code4run.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "user_code")
public class UserCode {
	@Id
	@Column(name = "id", nullable  = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
//	@Column(name="user_id", length= 10)
//	private int userId;
//	@Column(name="problem_id", length= 10)
//	private int problemId;
	
	@OneToMany
	@ForeignKey(name = "fk_problem")
	private Problem problem;
	
	@Column(name="saved_code", length= 10000)
	private String savedCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public int getProblemId() {
//		return problemId;
//	}
//	public void setProblemId(int problemId) {
//		this.problemId = problemId;
//	}
//	public int getUserId() {
//		return userId;
//	}
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}

}
