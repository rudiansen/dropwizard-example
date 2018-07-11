package com.example.helloworld.db;

import java.util.List;
import java.util.Optional;

import org.hibernate.SessionFactory;

import com.example.helloworld.core.Person;

import io.dropwizard.hibernate.AbstractDAO;

public class PersonDAO extends AbstractDAO<Person> {

	public PersonDAO(SessionFactory sessionFactory) {
		super(sessionFactory);		
	}

	public Optional<Person> findById(long id) {
		return Optional.ofNullable(get(id));
	}
	
	public Person create(Person person) {
		return persist(person);
	}
	
	@SuppressWarnings("unchecked")
	public List<Person> findAll() {
		return list(namedQuery("com.example.helloworld.core.Person.findAll"));
	}
}
