package com.biz.blog;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.service.BlogService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	BlogService bService;
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		bService.selectAll();
		
		return "home";
	}
	// a href = "context/input"으로 request를 했을때
	// a href = "http://localhost/blog/input"으로 request를 했을때
	// 처리할 method을 지정
	
	@RequestMapping(value = "/input", method =RequestMethod.GET)
	public String input() {
		
	
		return "write";
	}
	
	
	
	@RequestMapping(value = "/writer",method= RequestMethod.POST)
	public String writer(String title, String content,Model model) {
		
		System.out.println("나는 POST Type writer method !!");
		System.out.println("제목 : " + title);
		System.out.println("내용 : " + content);
		
		model.addAttribute("TITLE",title);
		model.addAttribute("CONTENT",content);
		
		
		return "view";
		
	
	}
	
	
	@RequestMapping(value = "/writer",method= RequestMethod.GET)
	public String writer() {
		System.out.println("나는 GET Type writer method !!");
		
		return null;
	}

	

	
	
}
