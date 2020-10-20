package com.biz.bbs.service;

import java.util.List;

import com.biz.bbs.model.BBsVO;

public interface BBsService {

	public List<BBsVO> seletAll();

	public void insert(BBsVO bbsVO);
	
	public BBsVO findBySeq(long long_seq);
	
	

}
