package com.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String helloPage() {
		return "home";
	}//Close helloPage.
	
	@RequestMapping("showForm")
	public String showForm() {
		return "showForm";
	}//Close showForm method.
	
	@RequestMapping("processForm")
	public String processForm() {
		return "processForm";
	}//Close processForm method.
	
	@RequestMapping("processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {
		
		String name = "UpperCase : " + request.getParameter("studentName").toUpperCase();
		model.addAttribute("message",name);
		return "processForm";
		
	}//Close processFromVerstionTwo

	@RequestMapping("processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName")String name, Model model) {
		
		model.addAttribute("message","Hey my friend from V3 ! : " + name.toUpperCase());
		return "processForm";
		
	}//Close processFromVerstionTwo	
	
	
	
}//Close HelloController.
