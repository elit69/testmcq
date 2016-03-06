package com.mcq.app.repo;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.mcq.app.entities.Definition;

@Repository("DefinitionRepo")
public class DefinitionRepo {
	
	public Definition get(Session session, Integer id){		
		Definition definition = new Definition();
		try {
			definition = session.get(Definition.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return definition;		
	}
}
