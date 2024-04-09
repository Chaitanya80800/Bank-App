package com.cjc.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.demo.model.Person;

@Repository
public interface HomeRepository extends CrudRepository<Person, Integer> {

	public Person findByUsernameAndPassword(String username, String password);

	public Person findByPid(int pid);

	public Person findByUsername(String username);

	public Person findByName(String name);

}
