package net.codejava.spring.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import net.codejava.spring.model.Person;

public class PersonDaoImpl implements PersonDao  {
	
	
	
	DataSource dataSource;
	
	//criado
	private JdbcTemplate jdbcTemplate; 

	//criado
	public PersonDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void createPerson(String name, String surname) {
		jdbcTemplate.update("INSERT INTO PERSON_RECORD (NAME,SURNAME) VALUES (?,?)",
				new Object[]{name,surname});
	}

	public List<Person> selectPerson(String name, String surname) {
		return jdbcTemplate.query("SELECT NAME,SURNAME FROM PERSON_RECORD WHERE NAME=? AND SURNAME=?",
				new Object[] {name,surname},
				new PersonRowMapper());
	}

	public List<Person> selectAll() {
		return jdbcTemplate.query("SELECT NAME,SURNAME FROM PERSON_RECORD",
				new PersonRowMapper());
	}

	public void deletePerson(String name, String surname) {
		jdbcTemplate.update("DELETE FROM PERSON_RECORD WHERE NAME=? AND SURNAME=?",
				new Object[]{name,surname});		
	}

	public void deleteAll() {
		jdbcTemplate.update("DELETE FROM PERSON_RECORD");
	}
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
	}
	
	public List<Person> selectPersonByName(String name) {
		return jdbcTemplate.query("SELECT * FROM PERSON_RECORD WHERE NAME LIKE %?%;",
				new Object[] {name},
				new PersonRowMapper());
	}
	
	
	//EXERCICIO
	public List<Person> selectOrderedByName() {
		JdbcTemplate selectOrderedByName = new JdbcTemplate(dataSource);
		return selectOrderedByName.query("select name, surname from person_record order by name asc",
				new PersonRowMapper());
	}
	
	// TERMINAR
	public void updateAll(String name, String surname) {
		JdbcTemplate updateAll = new JdbcTemplate(dataSource);
		updateAll.update("update name ", new PersonRowMapper());
	}
}
