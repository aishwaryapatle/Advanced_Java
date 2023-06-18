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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.tutorial.model.LiveSession;
import com.springboot.tutorial.model.Teacher;
import com.springboot.tutorial.repository.LiveSessionRepository;
import com.springboot.tutorial.repository.TeacherRepository;
import com.springboot.tutorial.service.LiveSessionImpl;
import com.springboot.tutorial.service.TeacherServiceImpl;

@Controller
public class HomeController {
	
//	@Autowired
//	TeacherServiceImpl db;
//	
//	@Autowired
//	LiveSessionImpl db1;


	
//	/*************************
//	    * ADMIN DASHBOARD * 
//	 *************************/
//	
//	
//	
//	// GO TO INDEX PAGE //
//	@RequestMapping(path = {"/", "/index"})	
//	String home() {
//		return "index";
//	}
//	
//	// SHOW ALL REGISTERED TEACHERS //
//	@GetMapping("/all")	
//	String showDetailsPage(Model m) {
//		List<Teacher> list = db.getAllTeachers();	 
//	    m.addAttribute("teachers", list);
//		return "all_teachers";
//	}
//	
//	// ADD A TEACHER PAGE//
//	@RequestMapping("/addteacher")
//	String addTeacherPage(Model m) {
//		Teacher teacher = new Teacher();
//		m.addAttribute("teacher", teacher);
//		return "add-teacher";
//	}
//	
//	
//	// SAVE TEACHER INFO INTO DATABASE //
//	@RequestMapping("/saveteacher")
//	String saveTeacher (@ModelAttribute ("teacher") Teacher t) {
//		db.saveTeacher(t);
//		System.out.println("Saved successfully!");
//		return "redirect:/all";
//	}
//	
//	
//	// GO TO EDIT DETAILS PAGE OF TEACHER //
//	@GetMapping("/editPage")
//	public String editPage() {
//		return "redirect:/all";
//	}
//	
//	// FROM ID OF TEACHER DISPLAYING ALL DETAILS
//	// IN EDIT DETAILS PAGE
//	
//	@GetMapping("/edit/{id}")	
//	public String showUpdateForm(@PathVariable("id") int id, Model model) {
//	    Teacher teacher = db.getTeacherById(id)
//	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
////	    System.out.println("Updated! "+teacher);
//	    model.addAttribute("teacher", teacher);
//	    return "add-teacher2";
//	}
//	
//	
//	// UPDATING THE DETAILS OF TEACHER
//	@RequestMapping("/update/{id}")
//	public String updateTeacher(@PathVariable("id") int id, Teacher teacher, BindingResult result) {
//	    if (result.hasErrors()) {
//	        teacher.setId(id);
//	        return "redirect:/all";
//	    }
//	        
//	    db.saveTeacher(teacher);
//		System.out.println("Updated successfully!");
//
//	    return "redirect:/all";
//	}
//	
//	
//	// GO TO DELETE TEACHER PAGE
//	@GetMapping("/deletePage")
//	public String deletePage() {
//		return "redirect:/all";
//	}
//	
//	
//	// DELETE TEACHER FROM DATABASE
//	@RequestMapping("/delete/{id}")
//	public String deleteTeacher(@PathVariable("id") int id) {
//		Teacher user = db.getTeacherById(id)
//	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//	    db.deleteTeacher(user);
//		System.out.println("Deleted successfully!");
//	    return "redirect:/all";
//	}
//	
//	
//	// GO TO LOGIN PAGE
//	@GetMapping("/login-page")	
//	String loginPage() {
//		return "page_login";
//	}
//	
//	
//	// AUTHENTICATION
//	@GetMapping("/login")
//    public String login(@RequestParam("email") String email,
//                        @RequestParam("password") String password,
//                        HttpSession session) {
//        
//		Teacher oauthUser = db.login  (email, password);
//		if(Objects.nonNull(oauthUser))
//		{
//            session.setAttribute("email", email);
//            System.out.println("Login!!!");
//            return "teacher_dashboard";
//        } else {
//            return "redirect:/login-page";
//        }
//    }
//	
//	
//	// LOGOUT
//	@GetMapping("/logout")
//    public String logoutUser(HttpSession session) {
//        // Remove session attribute
//        session.removeAttribute("email");
//
//        return "redirect:/login-page";
//    }
//	
//	
//	
//	/*************************
//	 * TEACHER DASHBOARD * 
//	 *************************/
//	
//	
//	//GO TO CREATE LIVE SESSION PAGE
//	@RequestMapping("/liveSession")
//	public String goToLiveSession(Model m) {
//		
//		LiveSession liveSession = new LiveSession();
//		m.addAttribute("liveSession", liveSession);
//		return "live_session";
//	}
//	
//	
//	// SAVE LIVE SESSION INFO
//	@RequestMapping("/savelivesession")
//	String saveLiveSession (@ModelAttribute ("liveSession") LiveSession liveSession) {
//		db1.saveLiveSession(liveSession);
//		System.out.println("Saved successfully!");
//		return "redirect:/all_live_sessions";
//	}
//	
//	
//	//DISPLAY ALL LIVE SESSIONS
//	@GetMapping("/all_live_sessions")	
//	String showAllLiveSessions(Model m) {
//		List<LiveSession> list = db1.getAllLiveSession();	 
//	    m.addAttribute("liveSessionList", list);
//		return "all_live_sessions";
//	}
//	
//	
//	//GO TO EDIT LIVE SESSION PAGE
//	@GetMapping("/editSessionPage")
//	public String editSession() {
//		return "redirect:/all_live_sessions";
//	}
//	
//	
//	//GETTING ALL DATA OF LIVE SESSION TO EDIT IT
//	@GetMapping("/editSession/{id}")	
//	public String showSessionUpdateForm(@PathVariable("id") int id, Model model) {
//		LiveSession liveSession = db1.getLiveSessionById(id)
//	      .orElseThrow(() -> new IllegalArgumentException("Invalid Session Id:" + id));
//	    model.addAttribute("liveSession", liveSession);
//	    return "edit_live_session";
//	}
//	
//	
//	//UPDATING THE LIVE SESSION
//	@RequestMapping("/updateSession/{id}")
//	public String updateSession(@PathVariable("id") int id, LiveSession liveSession, BindingResult result) {
//	    if (result.hasErrors()) {
//	        liveSession.setId(id);
//	        return "redirect:/all_live_sessions";
//	    }
//	    db1.saveLiveSession(liveSession);
//		System.out.println("Updated successfully!");
//
//	    return "redirect:/all_live_sessions";
//	}
//	
//	
//	//GO TO DELETE LIVE SESSION PAGE
//	@GetMapping("/deleteSessionPage")
//	public String deleteSession() {
//		return "redirect:/all_live_sessions";
//	}
//	
//	
//	//DELETE LIVE SESSION PAGE
//	@RequestMapping("/deleteSession/{id}")
//	public String deleteSession(@PathVariable("id") int id) {
//		LiveSession user = db1.getLiveSessionById(id)
//	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//	    db1.deleteLiveSession(user);
//		System.out.println("Deleted successfully!");
//	    return "redirect:/all_live_sessions";
//	}
//	
//	
//	/*************************
//	   * STUDENT DASHBOARD * 
//	 *************************/
//	
//	
//	//DISPLAY ALL LIVE SESSIONS FOR STUDENTS
//	@RequestMapping("/live_session_student")
//	public String goToLiveSessionsForStudents(Model m) {
//		List<LiveSession> list = db1.getAllLiveSession();	 
//	    m.addAttribute("liveSessionList", list);
//	    
//		return "live_session_student";
//	}
//	
//	
//	//DISPLAY ALL LIVE SESSIONS FOR STUDENTS
//	@RequestMapping("/live_session_student")
//	public String goToUpcomingLiveSessions(Model m) {
//		List<LiveSession> list = db1.getAllLiveSession();	 
//	    m.addAttribute("liveSessionList", list);
//	    
//		return "live_session_student";
//	}
//


}
