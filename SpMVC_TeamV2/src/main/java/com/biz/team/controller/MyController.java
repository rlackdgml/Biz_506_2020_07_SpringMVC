package com.biz.team.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


import com.biz.team.model.MyVO;
import com.biz.team.service.MyService;
@SessionAttributes("MyVO")
@Controller
@RequestMapping(value="/user")
public class MyController {
	
	@Autowired
	private MyService myService ;
	
	
	@RequestMapping(value="/mypage",method=RequestMethod.GET)
	public String mypage(String seq,MyVO myVO,Model model) {
		
		myService.update(myVO, seq);
		
		
		model.addAttribute("myVO",myVO);
		
		return "/user/mypage";
	}
	@RequestMapping(value="/mypage/{seq}",method=RequestMethod.POST)
	public String mypage(@ModelAttribute("user") MyVO myVO, String seq) {
		myService.update(myVO,seq);
	
		return "redirect:/bbs/list";
	}
}


