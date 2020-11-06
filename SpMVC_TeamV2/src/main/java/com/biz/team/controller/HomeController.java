package com.biz.team.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.team.model.MyVO;


@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	
	@RequestMapping(value = "/my",method=RequestMethod.GET)
	public String my (MyVO myVO , Model model) {
		
		model.addAttribute("myVO",myVO);
		
		
		return "/user/mypage";
		
	}
	
}
