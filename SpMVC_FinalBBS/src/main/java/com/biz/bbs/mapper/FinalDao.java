package com.biz.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.biz.bbs.model.FinalVO;

public interface FinalDao {
	

	@Select("SELECT * FROM tbl_notice ORDER BY date_time DESC")
	public List<FinalVO> selectAll();
	
	public int insert(FinalVO finalVO);
	
	@Select("SELECT * FROM tbl_notice WHERE id = #{id}")
	public FinalVO findById(Long id);
	
	@Delete("DELETE FROM tbl_notice WHERE id = #{id}")
	public int delete(Long id);
	
	public int update(FinalVO finalVO);
	
	


}
