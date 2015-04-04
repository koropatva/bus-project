package com.bus.service.dao.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bus.service.dao.interfaces.StationDAO;
import com.bus.service.dao.models.Station;

@Component
public class StationDAOImpl implements StationDAO {

	private SessionFactory sessionFactory;

	@Autowired
	@Qualifier("busSessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Station p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(p);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Station> list() {
		Session session = this.sessionFactory.openSession();
		List<Station> personList = session.createQuery("from Station").list();
		session.close();
		return personList;
	}
}
