package com.mcq.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Keyword")
public class Keyword {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "key")
	private String key;
	@Column(name = "type")
	private String type;
	@Column(name = "definition_id")
	private Integer definition_id;
	@Column(name = "chapter")
	private Integer chapter;
	@Column(name = "subject_id")
	private Integer subject_id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getDefinition_id() {
		return definition_id;
	}
	public void setDefinition_id(Integer definition_id) {
		this.definition_id = definition_id;
	}
	public Integer getChapter() {
		return chapter;
	}
	public void setChapter(Integer chapter) {
		this.chapter = chapter;
	}
	public Integer getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(Integer subject_id) {
		this.subject_id = subject_id;
	}
	@Override
	public String toString() {
		return "Keyword [id=" + id + ", key=" + key + ", type=" + type + ", definition_id=" + definition_id
				+ ", chapter=" + chapter + ", subject_id=" + subject_id + "]";
	}	
}
