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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Varun Batra
 *
 */
@Entity
@Table(name = "user_role")
public class UserRole implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "role", length = 10)
	private String role;

	public void setId(int id) {
		this.id = id;
	}

	public int getId(int id) {
		return id;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole(String role) {
		return role;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userRole_id")
	private Set<User> user;

}
