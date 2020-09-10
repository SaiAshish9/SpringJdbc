package com.jdbc.jdbc;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jdbc.jdbc.entity.Person;
import com.jdbc.jdbc.entity.jpa.PersonJpaRepository;

//@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
//	PersonJdbcDao repository;
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 1001 -> {}", repository.findById(1001));
//		logger.info("Delete User id 1001 -> {}", repository.deleteById(1001));
		logger.info("Insert", repository.insert(new Person("Sai9", "India", new Date())));		
		logger.info("Update", repository.update(new Person(1, "Sai7", "India", new Date())));
		repository.delete(1001);
		logger.info("All users -> {}", repository.findAll());

		// repository.findAll();
	}

}
