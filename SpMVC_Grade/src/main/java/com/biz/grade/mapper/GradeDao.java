package com.biz.grade.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.biz.grade.model.GradeVO;



public interface GradeDao {
	

	@Select("SELECT * FROM tbl_grade ORDER BY seq DESC")
	public List<GradeVO> selectAll();
	
	public int insert(GradeVO gradeVO);

	@Select("SELECT * FROM tbl_grade WHERE num = #{num}")
	public GradeVO findById(Long id);

	@Delete("DELETE FROM tbl_grade WHERE num = #{num}")
	public int delete(Long id);
	
	public int update(GradeVO gradeVO);
	

}
