package com.citi.xzf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/test")
public class Test {
	@Autowired
	private Student student;
	
	@RequestMapping(method = RequestMethod.GET)
	public String showTeacherStudent(@RequestParam(value="name", required=false, defaultValue="xizaifa") String name, ModelMap model) {
		// TODO Auto-generated constructor stub
		System.out.println("in method!");
		System.out.println(Teacher.getStudent());
		System.out.println(student.getName());
		student.setName(name);
		System.out.println(student.getName());
		model.addAttribute("message", "Spring MVC test!! " + name);
	    return "hello";
	}

}
