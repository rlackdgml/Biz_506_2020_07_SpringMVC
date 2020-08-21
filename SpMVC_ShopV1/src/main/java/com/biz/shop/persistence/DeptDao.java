package com.biz.shop.persistence;

import java.util.List;

import com.biz.shop.model.DeptVO;

public interface DeptDao extends ChangeDao<DeptVO,String> {
	
	public List<DeptVO> findByTitle(String title);
	
	

}
