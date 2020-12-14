package com.biz.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.bbs.model.FinalVO;

public interface FinalDao {
	

	@Select("SELECT * FROM tbl_notice ORDER BY date_time DESC")
	public List<FinalVO> selectAll();
	
	@Select("SELECT * FROM tbl_notice WHERE id = #{id}")
	public FinalVO findById(Long id);
	
	@Delete("DELETE FROM tbl_notice WHERE id = #{id}")
	public int delete(Long id);
	
	@InsertProvider(type = FinalSQL.class,method = "insert")
	public int insert(FinalVO finalVO);
	
	@UpdateProvider(type = FinalSQL.class,method = "update")
	public int update(FinalVO finalVO);
	
	


}
