package com.mcq.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Subject")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "subject")
	private String subject;
	@Column(name = "lecturer_name")
	private String lecturer_name;
	@Column(name = "book_name")
	private String book_name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getLecturer_name() {
		return lecturer_name;
	}
	public void setLecturer_name(String lecturer_name) {
		this.lecturer_name = lecturer_name;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", subject=" + subject + ", lecturer_name=" + lecturer_name + ", book_name="
				+ book_name + "]";
	}	
}
