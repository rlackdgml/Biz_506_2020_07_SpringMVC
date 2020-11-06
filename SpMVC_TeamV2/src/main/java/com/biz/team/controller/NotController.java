package com.biz.team.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biz.team.model.BbsVO;
import com.biz.team.model.NotVO;
import com.biz.team.service.NotService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/not")
public class NotController {

	@Autowired
	private NotService notService;
	
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {

		List<NotVO> notList = notService.selectAll();
		model.addAttribute("notList", notList);
		return "not/not-list";
	}
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write(Model model) {
		LocalDateTime ldt = LocalDateTime.now();
		String cd = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(ldt);
		String ct = DateTimeFormatter.ofPattern("HH:mm:ss").format(ldt);
		
		NotVO notVO = NotVO.builder()
				.n_date(cd)
				.n_time(ct)
				.build();
		model.addAttribute("NotVO",notVO);
		return "not/not-write";
	}

	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(NotVO notVO) {

		notService.insert(notVO);
		return "redirect:/not/list";

	}

	@RequestMapping(value = "/detail/{seq}", method = RequestMethod.GET)
	public String detail(@PathVariable("seq") String seq, Model model) {

		long long_seq = Long.valueOf(seq);
		NotVO notVO = notService.findBySeq(long_seq);
		int count = notVO.getN_count();
		notVO.setN_count(++count);
		notService.update(notVO);
		model.addAttribute("NotVO", notVO);
		return "/not/not-detail";
	}

	@RequestMapping(value = "/delete/{seq}", method = RequestMethod.GET)
	public String update(@PathVariable("seq") String seq) {

		Long long_seq = Long.valueOf(seq);
		notService.delete(long_seq);

		return "redirect:/not/list";
	}

	@RequestMapping(value = "/update/{seq}", method = RequestMethod.GET)
	public String update(@PathVariable("seq") String seq, NotVO notVO, Model model) {
		Long long_seq = Long.valueOf(seq);
		notVO = notService.findBySeq(long_seq);
		model.addAttribute("NotVO", notVO);
		return "/not/not-write";
	}

	@RequestMapping(value = "/update/{seq}", method = RequestMethod.POST)
	public String update(NotVO notVO) {
		notService.update(notVO);
		return "redirect:/not/list";

	}

}