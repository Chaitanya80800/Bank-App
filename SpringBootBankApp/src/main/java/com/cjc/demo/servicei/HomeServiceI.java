package com.cjc.demo.servicei;

import org.springframework.stereotype.Service;

import com.cjc.demo.model.Person;


public interface HomeServiceI {

	 public void saveData(Person p);

	public Iterable<Person> loginCheck(String username, String password);

	public Iterable<Person> deleteData(Person p);

	public Person editData(int pid);

	public Iterable<Person> updateData(Person p);

	public Person loginSingleCheck(String username, String password);

	public Person WithdrawBalance(String username);

	public Person withdrawData(String name, int bal);

	public Person depositeBalance(String username);

	public Person depositeData(String name, int bal);

	public Person checkBal(String username);



}
