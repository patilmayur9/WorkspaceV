package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//Class Level Annotation are also called as Stereotype annotion
@Controller
public class HomeController {
	@RequestMapping("/") 
	 public String display() 
	 { 
	 return "Index"; 
	 } 
}
