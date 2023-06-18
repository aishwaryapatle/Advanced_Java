package com.springboot.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.tutorial.model.LiveSession;
import com.springboot.tutorial.service.LiveSessionImpl;

@Controller
public class StudentController {
	
	@Autowired
	LiveSessionImpl db2;

	
	/*************************
	   * STUDENT DASHBOARD * 
	 *************************/
	
	
	//DISPLAY ALL LIVE SESSIONS FOR STUDENTS
	@RequestMapping("/live_session_student")
	public String goToLiveSessionsForStudents(Model m) {
		List<LiveSession> list = db2.getAllLiveSession();	 
	    m.addAttribute("liveSessionList", list);
	    
		return "live_session_student";
	}
	
	
	//DISPLAY UPCOMING LIVE SESSIONS FOR STUDENTS
	@RequestMapping("/upcoming_live_session")
	public String goToUpcomingLiveSessions(Model m) {
		List<LiveSession> list = db2.getAllUpcomingSession();	 
	    m.addAttribute("liveSessionList", list);
	    
		return "upcoming_live_session";
	}
}
