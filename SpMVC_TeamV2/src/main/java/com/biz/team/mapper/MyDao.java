package com.biz.team.mapper;

import org.apache.ibatis.annotations.InsertProvider;

import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.team.model.MyVO;
import com.biz.team.sql.MySQL;


public interface MyDao {
	
	@InsertProvider(type=MySQL.class,method="my_insert")
	public int insert(MyVO myVO);
	
	
	
	@UpdateProvider(type=MySQL.class,method="my_update")
	public int update(MyVO myVO);

}
