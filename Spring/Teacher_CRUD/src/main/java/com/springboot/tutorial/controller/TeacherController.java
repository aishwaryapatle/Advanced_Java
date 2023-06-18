package com.springboot.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.tutorial.model.LiveSession;
import com.springboot.tutorial.service.LiveSessionImpl;
import com.springboot.tutorial.service.TeacherServiceImpl;

@Controller
public class TeacherController {

	@Autowired
	TeacherServiceImpl db;
	
	@Autowired
	LiveSessionImpl db1;
	
	
	/*************************
	 * TEACHER DASHBOARD * 
	 *************************/
	
	
	//GO TO CREATE LIVE SESSION PAGE
	@RequestMapping("/liveSession")
	public String goToLiveSession(Model m) {
		
		LiveSession liveSession = new LiveSession();
		m.addAttribute("liveSession", liveSession);
		return "live_session";
	}
	
	
	// SAVE LIVE SESSION INFO
	@RequestMapping("/savelivesession")
	String saveLiveSession (@ModelAttribute ("liveSession") LiveSession liveSession) {
		db1.saveLiveSession(liveSession);
		System.out.println("Saved successfully!");
		return "redirect:/all_live_sessions";
	}
	
	
	//DISPLAY ALL LIVE SESSIONS
	@GetMapping("/all_live_sessions")	
	String showAllLiveSessions(Model m) {
		List<LiveSession> list = db1.getAllLiveSession();	 
	    m.addAttribute("liveSessionList", list);
		return "all_live_sessions";
	}
	
	
	//GO TO EDIT LIVE SESSION PAGE
	@GetMapping("/editSessionPage")
	public String editSession() {
		return "redirect:/all_live_sessions";
	}
	
	
	//GETTING ALL DATA OF LIVE SESSION TO EDIT IT
	@GetMapping("/editSession/{id}")	
	public String showSessionUpdateForm(@PathVariable("id") int id, Model model) {
		LiveSession liveSession = db1.getLiveSessionById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid Session Id:" + id));
	    model.addAttribute("liveSession", liveSession);
	    return "edit_live_session";
	}
	
	
	//UPDATING THE LIVE SESSION
	@RequestMapping("/updateSession/{id}")
	public String updateSession(@PathVariable("id") int id, LiveSession liveSession, BindingResult result) {
	    if (result.hasErrors()) {
	        liveSession.setId(id);
	        return "redirect:/all_live_sessions";
	    }
	    db1.saveLiveSession(liveSession);
		System.out.println("Updated successfully!");

	    return "redirect:/all_live_sessions";
	}
	
	
	//GO TO DELETE LIVE SESSION PAGE
	@GetMapping("/deleteSessionPage")
	public String deleteSession() {
		return "redirect:/all_live_sessions";
	}
	
	
	//DELETE LIVE SESSION PAGE
	@RequestMapping("/deleteSession/{id}")
	public String deleteSession(@PathVariable("id") int id) {
		LiveSession user = db1.getLiveSessionById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
	    db1.deleteLiveSession(user);
		System.out.println("Deleted successfully!");
	    return "redirect:/all_live_sessions";
	}
}
