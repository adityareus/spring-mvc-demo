package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a controller method to show the HTML form
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	//need a controller method to process the html form
	
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	//a new controller to read data from model
	
	/*//add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model){
		
		//read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		//convert data to all caps
		theName = theName.toUpperCase();
		
		//create message
		String result = "Yo! "+theName;
		
		//add message to model
		model.addAttribute("message",result);
		
		return "helloworld";
	}*/
	
	
	
	
	
	//add data to the model
		@RequestMapping("/processFormVersionThree")
		public String letsShoutDude(@RequestParam("studentName") String theName, Model model){
			
			//convert data to all caps
			theName = theName.toUpperCase();
			
			//create message
			String result = "Hey friend!"+theName;
			
			//add message to model
			model.addAttribute("message",result);
			
			return "helloworld";
		}
	
}
