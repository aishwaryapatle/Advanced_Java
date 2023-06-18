package com.springboot.tutorial.controller;

import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.tutorial.model.Teacher;
import com.springboot.tutorial.service.TeacherServiceImpl;

@Controller
public class AdminController {

	@Autowired
	TeacherServiceImpl db;
	


	
	/*************************
	    * ADMIN DASHBOARD * 
	 *************************/
	
	
	
	// GO TO INDEX PAGE //
	@RequestMapping(path = {"/", "/index"})	
	String home() {
		return "index";
	}
	
	// SHOW ALL REGISTERED TEACHERS //
	@GetMapping("/all")	
	String showDetailsPage(Model m) {
		List<Teacher> list = db.getAllTeachers();	 
	    m.addAttribute("teachers", list);
		return "all_teachers";
	}
	
	// ADD A TEACHER PAGE//
	@RequestMapping("/addteacher")
	String addTeacherPage(Model m) {
		Teacher teacher = new Teacher();
		m.addAttribute("teacher", teacher);
		return "add-teacher";
	}
	
	
	// SAVE TEACHER INFO INTO DATABASE //
	@RequestMapping("/saveteacher")
	String saveTeacher (@ModelAttribute ("teacher") Teacher t) {
		db.saveTeacher(t);
		System.out.println("Saved successfully!");
		return "redirect:/all";
	}
	
	
	// GO TO EDIT DETAILS PAGE OF TEACHER //
	@GetMapping("/editPage")
	public String editPage() {
		return "redirect:/all";
	}
	
	
	// FROM ID OF TEACHER DISPLAYING ALL DETAILS
	// IN EDIT DETAILS PAGE
	
	@GetMapping("/edit/{id}")	
	public String showUpdateForm(@PathVariable("id") int id, Model model) {
	    Teacher teacher = db.getTeacherById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//	    System.out.println("Updated! "+teacher);
	    model.addAttribute("teacher", teacher);
	    return "add-teacher2";
	}
	
	
	// UPDATING THE DETAILS OF TEACHER
	@RequestMapping("/update/{id}")
	public String updateTeacher(@PathVariable("id") int id, Teacher teacher, BindingResult result) {
	    if (result.hasErrors()) {
	        teacher.setId(id);
	        return "redirect:/all";
	    }
	        
	    db.saveTeacher(teacher);
		System.out.println("Updated successfully!");

	    return "redirect:/all";
	}
	
	
	// GO TO DELETE TEACHER PAGE
	@GetMapping("/deletePage")
	public String deletePage() {
		return "redirect:/all";
	}
	
	
	// DELETE TEACHER FROM DATABASE
	@RequestMapping("/delete/{id}")
	public String deleteTeacher(@PathVariable("id") int id) {
		Teacher user = db.getTeacherById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	    db.deleteTeacher(user);
		System.out.println("Deleted successfully!");
	    return "redirect:/all";
	}
	
	
	// GO TO LOGIN PAGE
	@GetMapping("/login-page")	
	String loginPage() {
		return "page_login";
	}
	
	
	// AUTHENTICATION
	@GetMapping("/login")
    public String login(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        HttpSession session) {
        
		Teacher oauthUser = db.login  (email, password);
		if(Objects.nonNull(oauthUser))
		{
            session.setAttribute("email", email);
            System.out.println("Login!!!");
            return "teacher_dashboard";
        } else {
            return "redirect:/login-page";
        }
    }
	
	
	// LOGOUT
	@GetMapping("/logout")
    public String logoutUser(HttpSession session) {
        // Remove session attribute
        session.removeAttribute("email");

        return "redirect:/login-page";
    }
	
	
}
