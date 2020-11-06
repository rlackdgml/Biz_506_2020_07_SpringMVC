package com.biz.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.team.model.JoinVO;
import com.biz.team.model.LoginVO;
import com.biz.team.sql.JoinSQL;

public interface JoinDao {
	
	@Select("SELECT * FROM tbl_join order by j_seq desc")
	public List<JoinVO> selectAll();


	@Select("SELECT * FROM tbl_join WHERE j_seq = #{seq}")
	public JoinVO findBySeq(long seq);
	
	@InsertProvider(type=JoinSQL.class,method="join_insert")
	public int insert(JoinVO joinVO);

	@UpdateProvider(type=JoinSQL.class,method="join_update")
	public int update(JoinVO joinVO);

	
	public int delete(long seq);


}



