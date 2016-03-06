package com.mcq.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Definition")
public class Definition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "keyword_id")
	private Integer keyword_id;
	@Column(name = "definition")
	private String definition;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getKeyword_id() {
		return keyword_id;
	}
	public void setKeyword_id(Integer keyword_id) {
		this.keyword_id = keyword_id;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	@Override
	public String toString() {
		return "Definition [id=" + id + ", keyword_id=" + keyword_id + ", definition=" + definition + "]";
	}	
}
