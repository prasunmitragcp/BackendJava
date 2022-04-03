package com.fd.webservices.webservicesframework.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class DBCollection {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="course_id")
	private int id;
	private String title;
	private String description;
	
	public DBCollection(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public DBCollection() {

		// TODO Auto-generated constructor stub
	}

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

	@Override
	public String toString() {
		return "DBCollection [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
	
	
	

}
