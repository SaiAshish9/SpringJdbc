package com.jdbc.jdbc.entity.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jdbc.jdbc.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entityManager;

//	HQL -> hibernate query language

//	java persistent query language
	
//	Entity manager is an interface to persistent context

	public List<Person> findAll() {
	    TypedQuery<Person> namedQuery =  entityManager.createNamedQuery("find_all_persons",Person.class);
	    return namedQuery.getResultList();
	}


	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

	public Person update(Person person) {
		return entityManager.merge(person);
	}

	public Person insert(Person person) {
		return entityManager.merge(person);
	}

	public void delete(int id) {
		Person person = findById(id);
		entityManager.remove(person);
	}

}
