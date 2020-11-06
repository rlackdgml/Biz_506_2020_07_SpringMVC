package com.biz.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.team.model.LoginVO;
import com.biz.team.sql.BbsSQL;
import com.biz.team.sql.LoginSQL;

public interface LoginDao {
	
	@Select("SELECT * FROM tbl_login order by l_seq desc")
	public List<LoginVO> selectAll();


	@Select("SELECT * FROM tbl_login WHERE l_seq = #{seq}")
	public LoginVO findBySeq(long seq);
	
	@InsertProvider(type=LoginSQL.class,method="login_insert")
	public int insert(LoginVO logVO);

	@UpdateProvider(type=LoginSQL.class,method="login_update")
	public int update(LoginVO logVO);

	
	public int delete(long seq);


}
