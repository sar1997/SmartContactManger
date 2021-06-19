package com.demo.webservices.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.webservices.bean.HelloWorldBean;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class MyController {
  
	@GetMapping("/hello-world")
	public String helloWorld()
	{
		return "helloworld";
	}
	
	@GetMapping("/hello-world-bean/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name)
	{
    	return new HelloWorldBean("hello brother MR. " +name);
		//throw new RuntimeException("Opps!!....Some Error has occured. Please contact your Administrator");
	}
}
