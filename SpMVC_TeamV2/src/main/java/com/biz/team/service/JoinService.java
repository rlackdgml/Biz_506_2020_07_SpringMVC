package com.biz.team.service;

import java.util.List;

import com.biz.team.model.JoinVO;
import com.biz.team.model.LoginVO;

public interface JoinService {

	public List<JoinVO> selectAll();
	public JoinVO findBySeq(long seq);
	public int insert(JoinVO joinVO);
	public int update(JoinVO joinVO);
	public int delete(long seq);
	
}