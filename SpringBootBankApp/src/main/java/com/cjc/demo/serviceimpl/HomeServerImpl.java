package com.cjc.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.demo.model.Person;
import com.cjc.demo.repository.HomeRepository;
import com.cjc.demo.servicei.HomeServiceI;

@Service
public class HomeServerImpl implements HomeServiceI {
	
	@Autowired
	HomeRepository hr;
	
	@Override
	public void saveData(Person p) {
		hr.save(p);
		
	}

	@Override
	public Iterable<Person> loginCheck(String username, String password) {
			Iterable<Person> list=hr.findAll();
			return list;
	}

	@Override
	public Iterable<Person> deleteData(Person p) {
			hr.delete(p);
			Iterable<Person> list=hr.findAll();
			return list;

		
	}

	@Override
	public Person editData(int pid) {
		Person p=hr.findByPid(pid);
		return p;
	}

	@Override
	public Iterable<Person> updateData(Person p) {
		hr.save(p);
		Iterable<Person> list=hr.findAll();
		return list;
	}

	@Override
	public Person loginSingleCheck(String username, String password) {
		// TODO Auto-generated method stub
		Person p=hr.findByUsernameAndPassword(username,password);
		return p;
	}

	@Override
	public Person WithdrawBalance(String username) {
		// TODO Auto-generated method stub
		Person p=hr.findByUsername(username);
		return p;
	}

	@Override
	public Person withdrawData(String name, int bal) {
		Person p=hr.findByName(name);
		double newbal=p.getBal()-bal;
		p.setBal(newbal);
		hr.save(p);
		return p;
	}

	@Override
	public Person depositeBalance(String username) {
		// TODO Auto-generated method stub
		Person p=hr.findByUsername(username);
		return p;

	}

	@Override
	public Person depositeData(String name, int bal) {
		// TODO Auto-generated method stub
		Person p=hr.findByName(name);
		double newbal=p.getBal()+bal;
		p.setBal(newbal);
		hr.save(p);
		return p;
	}

	@Override
	public Person checkBal(String username) {
		Person p=hr.findByUsername(username);
		return p;
	}



}
