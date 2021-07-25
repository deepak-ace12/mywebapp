package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(HttpServletRequest req, HttpServletResponse res) { //The parameter HttpServletRequest, HttpServletResponse are not compulsory, but if you put it, spring will connect you to the request object
		String name = req.getParameter("name");
		HttpSession session = req.getSession();
		session.setAttribute("name", name );
		return "home";
	}
}
