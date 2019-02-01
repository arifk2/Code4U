package com.code4run.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "user")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id", nullable  = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	@Column(name="name", length= 50)
	private String name ;
	@Column(name="email", length= 50)
	private String email; 
	@Column(name="password", length= 50)
	private String password;
	@Column(name="college_name", length= 40)
	private String college_name; 
	@Column(name="phone_no", length= 15)
	private int phone_no;
	
//	List<UserRole> userRoles = new List();
	//
	@ManyToOne
	@ForeignKey(name = "fk_UserRole")
	private UserRole userRole;
	
	@Column(name="role", length= 2)
	private int userRole_id;

	public int getUserRole_id() {
		return userRole_id;
	}
	public void setUserRole_id(int userRole_id) {
		this.userRole_id = userRole_id;
	}
	//
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private Set<Article> article;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="comment_id")
	private Set<Comment> comment;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	
	

}
