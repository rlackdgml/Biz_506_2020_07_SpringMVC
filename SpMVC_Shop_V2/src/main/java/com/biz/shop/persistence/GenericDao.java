package com.biz.shop.persistence;

import java.util.List;

import com.biz.shop.model.ProductVO;

public interface GenericDao<VO,PK> {
	
	public List<VO> selectAll();
	public VO findById(PK id); 
	
	public int insert(VO vo);
	public void update(VO vo);
	public void delete(PK id);
	ProductVO findById(String id);

	
}
