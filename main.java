package com.example.demo.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dataInput.Input;
import com.example.demo.service.LoginService;

import lombok.extern.slf4j.Slf4j;

	@Controller
	@Slf4j
	public class Main {

	    @Autowired
	    private LoginService service;

		
	    @GetMapping("/user")
	    public String hello(Model model) {
	        return "user";
	    }
	    
	    @RequestMapping("/regi")
	    public String defectDetails() {
	        return "regi";
	    }
	    
	    
	    
	    
	    @PostMapping("/logined")
	    public String loginCheck(HttpSession session,Input request,Model model) {
	    	
	    	service.checklogin(request,model);
	    
	    	
	    	return "hello2";
	    	
	    }
	    
	    
	    
	    }


	
	
	
	
	
	
	
	
	
	
