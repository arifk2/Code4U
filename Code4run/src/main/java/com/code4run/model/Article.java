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
@Table(name = "article")
public class Article {
	@Id
	@Column(name = "id", nullable  = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="heading", length= 100)
	private String heading;
	@Column(name="topic", length= 1000)
	private String topic;
	@Column(name="date_posted", length= 10)
	private Date datePosted;
	@OneToMany
	@ForeignKey(name = "fk_User")
	private User user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public Date getDatePosted() {
		return datePosted;
	}
	public void setDatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}
	
	
}
