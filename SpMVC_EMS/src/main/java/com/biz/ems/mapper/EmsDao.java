package com.biz.ems.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.UpdateProvider;


import com.biz.ems.model.EmsVO;
import com.biz.ems.sql.EmsSql;

public interface EmsDao {
	
	@Select("SELECT * FROM tbl_ems ORDER BY s_seq DESC")
	public List<EmsVO> selectAll();
	
	public EmsVO findBySeq(long seq);
	
	@InsertProvider(type=EmsSql.class,method="ems_insert")
	@SelectKey(keyProperty = "s_seq",
			   statement = "SELECT SEQ_EMS.NEXTVAL FROM DUAL",
			   resultType = Long.class,before = true)	
	
	public int insert(EmsVO emsVO);
	
	
	@UpdateProvider(type=EmsSql.class,method="ems_update")
	public int update(EmsVO emsVO);
	
	@Delete("DELETE FROM tbl_ems WHERE b_seq = #{seq} ")
	public int delete(long seq);

}
