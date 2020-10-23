package com.biz.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.biz.bbs.model.ImageVO;
import com.biz.bbs.sql.ImageSql;

public interface ImageDao {
	
	@Select("SELECT * FROM tbl_images WHERE i_b_seq =#{i_b_seq}")
	public List<ImageVO> findBySeq(long i_b_seq);
	
	@InsertProvider(type = ImageSql.class,method = "insert")
	public int insert(@Param("vo") ImageVO imageVO, 
					  @Param("b_seq") long b_seq);
	public int insert_list(List<ImageVO> images,long b_seq);
	
	
	

}
