package com.biz.book.controller;

import java.util.List;
import java.util.Locale;

import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.biz.book.model.BookVO;
import com.biz.book.model.SelectMap;
import com.biz.book.service.NaverServiceimplV1;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
			
		return "home";
	}
	
	@RequestMapping(value = "/select",method=RequestMethod.GET)
	public String select(Model model) {
		
		model.addAttribute("CAT_MAP",SelectMap.CAT_MAP);
		model.addAttribute("FLAG_MAP",SelectMap.FLAG_MAP);
		model.addAttribute("categoty","CAT_PROMISE");
		
		return "home";
		
		
	}
	
	
}
