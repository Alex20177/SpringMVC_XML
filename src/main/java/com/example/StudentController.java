package com.example;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentController {
	
	//This method is executed before any RequestMapping. Remove white spaces to String vars.
	//Pre-process every string form data
	//Remove white spaces , if the string only has white spaces .. trim it yo null
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,trimmer);
	}//Close initBinder method.

	@RequestMapping("showFormStudent")
	public String showFormStudent(Model model) {
		model.addAttribute("student", new Student());
		return "showFormStudent";
	}//Close showFormStudent.
	
	@RequestMapping("processFormStudent")
	public String processFormStudent(@Valid @ModelAttribute("student")Student student,BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "showFormStudent";
		}//Close if. 
		else {
			return "processFormStudent";
		}//Close else.
		
	}//Close processFormStudent.
	
}//Close StudentController class
