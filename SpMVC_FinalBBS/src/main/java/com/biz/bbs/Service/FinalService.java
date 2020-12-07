package com.biz.bbs.Service;

import java.util.List;

import com.biz.bbs.model.FinalVO;

public interface FinalService {
	
	public List<FinalVO> selectAll();
	public FinalVO findById(Long id);
	public int insert(FinalVO finalVO);
	public int update(FinalVO finalVO);
	public int delete(Long id);

}
