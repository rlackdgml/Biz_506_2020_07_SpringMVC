package com.biz.bbs.mapper;

import org.apache.ibatis.jdbc.SQL;

public class FinalSQL {

	public String insert() {
		
		SQL sql = new SQL();
		sql.INSERT_INTO("tbl_notice");
		sql.INTO_COLUMNS("id").INTO_VALUES("SEQ_NOTICE.NEXTVAL");
		sql.INTO_COLUMNS("date_time").INTO_VALUES("#{date_time}");
		sql.INTO_COLUMNS("writer").INTO_VALUES("#{writer}");
		sql.INTO_COLUMNS("subject").INTO_VALUES("#{subject}");
		sql.INTO_COLUMNS("text").INTO_VALUES("#{text}");
		
		return sql.toString();
	}
	
	public String update() {
		
		SQL sql = new SQL();
		sql.UPDATE("tbl_notice");
		sql.WHERE("id = #{id}");
		sql.SET("date_time = #{date_time}");
		sql.SET("writer = #{writer}");
		sql.SET("subject = #{subject}");
		sql.SET("text = #{text}");
		
		return sql.toString();
	}

}
