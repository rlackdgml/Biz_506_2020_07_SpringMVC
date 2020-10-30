package com.biz.grade.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.biz.grade.model.GradeVO;
import com.biz.grade.service.GradeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	
	@Autowired
	@Qualifier("gradeServiceV1")
	private GradeService gradeService ;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "home";
	}

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write(Model model) {

		return "grade-write";

	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(@ModelAttribute GradeVO gradeVO,Model model) {

		
		model.addAttribute("GRADE", gradeVO);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(String num, Model model) {

		
		Long long_num = Long.valueOf(num);
		GradeVO gradeVO = gradeService.findById(long_num );
		model.addAttribute("GRADE", gradeVO);
		return "grade-write";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(GradeVO gradeVO, Model model) {
		
		
		 
		
		return "redirect:/";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(String num) {

		Long long_num = Long.valueOf(num);

		GradeVO gradeVO = gradeService.findById(long_num);
		
		int ret = gradeService.delete(long_num);
		if (ret > 0) {
			log.debug("삭제된 데이터 개수 {}", ret);
		}

		return "redirect:/";

	}
}
