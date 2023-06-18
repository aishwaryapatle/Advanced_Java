package com.springboot.tutorial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.tutorial.model.User;
import com.springboot.tutorial.repository.UserRepository;

@Controller
public class HomeController {

	@Autowired
	UserRepository db;
	
	@RequestMapping(path = {"/", "/index"})
	String showUserList(Model m)
	{	
		List<User> list = db.findAll();	 
	    m.addAttribute("users", list);
	    return "index";
	}
	
	
	@RequestMapping("/signup")
    public String showSignUpForm(Model m) {
		User u = new User();
		m.addAttribute("user", u);
        return "add-user";
    }
	
	
	@RequestMapping("/adduser")
	String myfun1(@ModelAttribute("user") User e)
	{
	   System.out.println(e.toString());
	   db.save(e);
	   return "index";
	}
	
	@RequestMapping("/edit/{id}")	
	public String showUpdateForm(@PathVariable("id") int id, Model model) {
	    User user = db.findById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	    
	    model.addAttribute("user", user);
	    return "update-user";
	}
	
	@RequestMapping("/update/{id}")
	public String updateUser(@PathVariable("id") int id, User user, BindingResult result) {
	    if (result.hasErrors()) {
	        user.setId(id);
	        return "update-user";
	    }
	        
	    db.save(user);
	    return "redirect:/index";
	}
	
	
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") int id) {
	    User user = db.findById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	    db.delete(user);
	    return "redirect:/index";
	}
	
	
}
