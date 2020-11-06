package com.biz.team.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.team.model.NotVO;
import com.biz.team.sql.NotSQL;

public interface NotDao {
	@Select("SELECT * FROM tbl_not order by n_seq desc")
	public List<NotVO> selectAll();

	@Select("SELECT * FROM tbl_not WHERE n_seq = #{seq}")
	public NotVO findBySeq(long seq);
	
	@InsertProvider(type=NotSQL.class,method="not_insert")
	public int insert(NotVO notVO);

	@UpdateProvider(type=NotSQL.class,method="not_update")
	public int update(NotVO notVO);

	@Delete("DELETE FROM tbl_not WHERE n_seq =#{n_seq}")
	public int delete(long seq);

}
