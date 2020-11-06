package com.biz.team.service;

import java.util.List;

import com.biz.team.model.BbsVO;
import com.biz.team.model.NotVO;

public interface NotService {
	public List<NotVO> selectAll();
	public NotVO findBySeq(long seq);
	public int insert(NotVO notVO);
	public int update(NotVO notVO);
	public int delete(long seq);
	
}