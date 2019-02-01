package com.code4run.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "problem")
public class Problem {
	@Id
	@Column(name = "id", nullable  = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 	
	@Column(name="title", length= 100)
	private String title;
	@Column(name="description", length= 10000)
	private String description;
	@Column(name="difficulty", length= 10)
	private String difficulty; 			
	@Column(name="status", length= 10)
	private String status; 		
	@Column(name="total_testcases", length= 10)
	private int totalTestcases;
	@Column(name="minpass_testcases", length= 10)
	private int minPassTestCases;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="problem_id")
	private Set<UserCode> userCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalTestcases() {
		return totalTestcases;
	}
	public void setTotalTestcases(int totalTestcases) {
		this.totalTestcases = totalTestcases;
	}
	public int getMinPassTestCases() {
		return minPassTestCases;
	}
	public void setMinPassTestCases(int minPassTestCases) {
		this.minPassTestCases = minPassTestCases;
	} 	
}
