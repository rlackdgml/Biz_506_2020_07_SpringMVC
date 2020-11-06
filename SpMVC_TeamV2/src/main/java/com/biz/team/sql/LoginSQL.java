package com.biz.team.sql;

import org.apache.ibatis.jdbc.SQL;

public class LoginSQL {
	public String login_insert() {

		SQL sql = new SQL();
		sql.INSERT_INTO("tbl_login");
		sql.INTO_COLUMNS("g_seq").INTO_VALUES("seq_login.NEXTVAL");
		sql.INTO_COLUMNS("g_id").INTO_VALUES("#{g_id}");
		sql.INTO_COLUMNS("g_pw").INTO_VALUES("#{g_pw}");

		return sql.toString();

	}

	public String login_update() {

		SQL sql = new SQL();
		sql.UPDATE("tbl_login");
		sql.SET("g_id = #{g_id}");
		sql.SET("g_pw= #{g_pw}");
		
		sql.WHERE("g_seq = #{g_seq}");
		return sql.toString();
	}
}