package com.jdbc.jdbc;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jdbc.jdbc.entity.Person;
import com.jdbc.jdbc.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {

//	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
//		SpringApplication.run(SpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("All users -> {}", dao.findAll());
//		logger.info("User id 1001 -> {}", dao.findById(1001));
//		logger.info("Delete User id 1001 -> {}", dao.deleteById(1001));
//		logger.info("Update 1002", dao.update(new Person(1002, "Sai7", "India", new Date())));
//		logger.info("All users -> {}", dao.findAll());

		// dao.findAll();
	}

}
