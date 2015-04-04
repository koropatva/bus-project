package com.bus.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bus.service.configurations.Application;
import com.bus.service.dao.interfaces.StationDAO;
import com.bus.service.dao.models.Station;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new AnnotationConfigApplicationContext(Application.class);
		StationDAO dao = context.getBean(StationDAO.class);
		Station person = new Station();
		person.setName("Bla");

		dao.save(person);
		for (Station person2 : dao.list()) {
			System.out.println(person2);
		}
	}
}
