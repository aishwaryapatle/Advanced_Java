package com.springboot.tutorial.controller;

import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.tutorial.model.User;
import com.springboot.tutorial.repository.UserRepository;
import com.springboot.tutorial.service.UserServiceImplementation;


@Controller
public class HomefcfgnController {

	@Autowired
	UserServiceImplementation db1;
	
	@RequestMapping(path = {"/", "/index"})	
	String myHome() {
		return "index";
	}
	
	
	@RequestMapping("/saveuser")
    String registration(@Validated @ModelAttribute("user") User userDto,
                               BindingResult result,  Model model, 
                               HttpSession session)
	{
		
        User existingUser = db1.findUserByEmail(userDto.getEmail());

        if(existingUser != null && existingUser.getEmail() != null && !existingUser.getEmail().isEmpty()){
            result.rejectValue("email", null,
                    "There is already an account registered with the same email");
        }

        if(result.hasErrors()){
            model.addAttribute("user", userDto);
            return "redirect:/login-page";
        }

        db1.saveUser(userDto);
        List<User> u = db1.getUserEmail(userDto.getEmail());
		System.out.println(u.toString());
		model.addAttribute("user", u);
		session.setAttribute("email", userDto.getEmail());
		return "profile";
    }
	 
	
	@GetMapping("/login-page")	
	String loginPage(Model m) {
		User user1 = new User();
		m.addAttribute("user", user1);
		return "login_page";
	}
	
	@GetMapping("/login")
    public String lhgfhsogin(@RequestParam("email") String email,
                        @RequestParam("password") String password,
                        HttpSession session, Model m) {
        
		User oauthUser = db1.login(email, password);
		if(Objects.nonNull(oauthUser))
		{
            session.setAttribute("email", email);
            System.out.println("Login!!!");
            return "redirect:/profile";
        } else {
//        	m.addAttribute("error", "Invalid Email or Password");
            return "redirect:/login-page";
        }
    }
	
	@GetMapping("/logout")
    public String logoutUser(HttpSession session) {
        // Remove session attribute
        session.removeAttribute("email");
        return "redirect:/login-page";
    }
	
	
	
	@GetMapping("/profile")
	public String goToProfile(HttpSession session, Model m) {
		
		if (session.getAttribute("email") == null || session.getAttribute("email").equals(""))
		{
			return "redirect:/login-page";
		}
		else 
		{
			String email = (String) session.getAttribute("email");
			List<User> u = db1.getUserEmail(email);
			System.out.println(u.toString());
			m.addAttribute("user", u);
			session.setAttribute("email", email);
			return "profile";
		
		}
	}
}
	
	

