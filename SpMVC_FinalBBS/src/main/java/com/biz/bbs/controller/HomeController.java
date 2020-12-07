package com.biz.bbs.controller;


import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.bbs.Service.FinalService;
import com.biz.bbs.model.FinalVO;

@Controller
public class HomeController {
	
	@Autowired
	@Qualifier("finalServiceV1")
	FinalService finalService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		List<FinalVO> finalList = finalService.selectAll();
		model.addAttribute("FINAL_LIST",finalList);


		return "home";
	}
	

}
