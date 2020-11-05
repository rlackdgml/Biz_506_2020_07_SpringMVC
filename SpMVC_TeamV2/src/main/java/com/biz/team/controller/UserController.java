package com.biz.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		return "/user/login";
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public String logout() {
		return "/user/logout";
	}

	@RequestMapping(value="/mypage",method=RequestMethod.GET)
	public String mypage() {
		return "/user/mypage";
	}
}
