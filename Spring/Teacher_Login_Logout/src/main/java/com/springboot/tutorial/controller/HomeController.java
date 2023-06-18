package com.springboot.tutorial.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.tutorial.model.Teacher;
import com.springboot.tutorial.repository.AuthService;
import com.springboot.tutorial.repository.TeacherRepository;


@Controller
public class HomeController {

	@Autowired
	TeacherRepository db;
	
	@RequestMapping(path = {"/", "/index"})
    String home() {
        return "index";
    }
	
	@RequestMapping("/regform")
	String goToRegistration(Model m)
	{
		Teacher t = new Teacher();
		m.addAttribute("teacher", t);
		return "reg";
	}
	
	@RequestMapping("/signup")
	String myfun1(@ModelAttribute("teacher") Teacher t, HttpSession session)
	{
	   System.out.println(t.toString());
	   db.save(t);
	   // Set session attribute
       session.setAttribute("email", t.getEmail());
       // session.setAttribute("name", t.getName());
	   return "redirect:/profile";
	}
	
	
	@RequestMapping("/loginform")
    public String showLoginForm() {
        return "login";
    }

	@Autowired
    private AuthService authService;
	
	@RequestMapping("/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        HttpSession session) {
        if (authService.authenticate(email, password)) {
            session.setAttribute("email", email);
            return "redirect:/profile";
        } else {
            return "redirect:/loginform";
        }
    }
    
	@RequestMapping("/profile")
	String showProfilePage(Model model, HttpSession session) {
	    model.addAttribute("email", session.getAttribute("email"));
	    List<Teacher> list = db.findAll();	 
	    model.addAttribute("teachers", list);
	    return "profile";
	}
	
	
	@RequestMapping("/logout")
    public String logoutUser(HttpSession session) {
        // Remove session attribute
        session.removeAttribute("email");

        return "redirect:/loginform";
    }
}
