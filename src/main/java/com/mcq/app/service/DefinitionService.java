package com.mcq.app.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mcq.app.entities.Definition;
import com.mcq.app.repo.DefinitionRepo;

@Service("DefinitionService")
public class DefinitionService {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	@Qualifier("DefinitionRepo")
	private DefinitionRepo definitionRepo;

	public Definition get(Integer id) {
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		Definition definition = new Definition();
		try {
			definition = definitionRepo.get(session, id);
			txn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			session.close();
		}
		return definition;
	}
}
