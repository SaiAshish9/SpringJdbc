package com.jdbc.jdbc.springData;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdbc.jdbc.entity.Person;

public interface PersonSpringData extends JpaRepository<Person,Integer>  {
	
	
	
}
