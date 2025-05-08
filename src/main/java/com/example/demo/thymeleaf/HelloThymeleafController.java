package com.example.demo.thymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.jpa.entity.Student;

/** CODE ON SECTION #12: Thymeleaf*/
@Controller
@RequestMapping("/hello-thymeleaf")
public class HelloThymeleafController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello" ;
	}
	
	@RequestMapping("/send-data")
	public ModelAndView sendData() {
		ModelAndView mav = new ModelAndView("data");
		mav.addObject("message", "Random Message") ;
		
		mav.addObject("student", new Student(1994, "NGUYEN THI BINH AN", 100)) ;
		return mav;
	}
	
	
	@RequestMapping("/students")
	public ModelAndView studentList() {
		ModelAndView mav = new ModelAndView("students");
		List<Student> list = new ArrayList<>();
		list.add(new Student(1994, "NGUYEN THI BINH AN", 100));
		list.add(new Student(2022, "DO THI TU NHI", 99));
		list.add(new Student(1960, "PHAN THI NON", 88));
		mav.addObject("students", list) ;
		return mav;
	}
	
	@RequestMapping("/studentForm")
	public ModelAndView studentForm() {
		ModelAndView mav = new ModelAndView("studentForm");
		mav.addObject("student", new Student(1994, "NGUYEN THI BINH AN", 100)) ;
		return mav;
	}
	
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		ModelAndView mav = new ModelAndView("data");
		mav.addObject("student", student) ;
		return mav;
	}
}
