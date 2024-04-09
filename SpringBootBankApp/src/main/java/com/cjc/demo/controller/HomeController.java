package com.cjc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.demo.model.Person;
import com.cjc.demo.servicei.HomeServiceI;


@Controller
public class HomeController {
	
	@Autowired
	HomeServiceI hs;
	

	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping("/openlogin")
	public String Prelogin() {
		return "login";
	}
	@RequestMapping("/logout")
	public String logout() {
		return "login";
	}
	
	@RequestMapping("/openregpage")
	public String PreRegister() {
		return "register";
	}
	
	@RequestMapping("/save")
	public String saveData(@ModelAttribute Person p) {
		hs.saveData(p);
		return "login";
		
	}
	
	
	@RequestMapping("/login")
	public String logincheck(@RequestParam String username,@RequestParam String password,Model m) {
		
		if(username.equals("admin") && password.equals("admin")) {
			Iterable<Person> list=hs.loginCheck(username,password);
			m.addAttribute("data",list);
			return "adminlogin";
		}else {
			Person p=hs.loginSingleCheck(username, password);
			m.addAttribute("pr",p);
			return "singleuserlogin";
		}
	}
		
		@RequestMapping("/delete")
		public String deleteData(@ModelAttribute Person p,Model m) {
			Iterable<Person> list=hs.deleteData(p);
			
				m.addAttribute("data",list);
				return "adminlogin";
			}
		
		@RequestMapping("/edit")
		public String deleteData(@RequestParam int pid,Model m) {
			Person p=hs.editData(pid);
				m.addAttribute("ps",p);
				return "edit";
			}
		
		@RequestMapping("/update")
		public String updateData(@ModelAttribute Person p,Model m) {
			Iterable<Person> list=hs.updateData(p);
				m.addAttribute("data",list);
				return "adminlogin";
			}
		
	
		@RequestMapping("/openwithdraw")
		public String WithdrawBalance(@RequestParam String username,Model m) {
			Person p=hs.WithdrawBalance(username);
				m.addAttribute("ps",p);
				return "withdraw";
			}
		
//		
		@RequestMapping("/withdraw")
		public String WithdrawData(@RequestParam String name,@RequestParam int bal,Model m) {
			Person p=hs.withdrawData(name,bal);
				m.addAttribute("pr",p);
				return "singleuserlogin";
			}
//		
		@RequestMapping("/opendeposite")
		public String DepositeBalance(@RequestParam String username,Model m) {
			Person p=hs.depositeBalance(username);
				m.addAttribute("ps",p);
				return "deposite";
			}
		
		@RequestMapping("/deposite")
		public String DepositeData(@RequestParam String name,@RequestParam int bal,Model m) {
			Person p=hs.depositeData(name,bal);
				m.addAttribute("pr",p);
				return "singleuserlogin";
			}
		
		@RequestMapping("/opencheckbal")
		public String CheckBalance(@RequestParam String username,Model m) {
			Person p=hs.checkBal(username);
				m.addAttribute("ps",p);
				return "checkbalance";
			}
		
}

