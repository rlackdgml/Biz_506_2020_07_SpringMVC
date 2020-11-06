package com.biz.team.sql;

import org.apache.ibatis.jdbc.SQL;

public class JoinSQL {

	public String join_insert() {

		SQL sql = new SQL();
		sql.INSERT_INTO("tbl_join");
		sql.INTO_COLUMNS("j_seq").INTO_VALUES("seq_join.NEXTVAL");
		sql.INTO_COLUMNS("j_id").INTO_VALUES("#{j_id}");
		sql.INTO_COLUMNS("j_pw").INTO_VALUES("#{j_pw}");

		return sql.toString();

	}

	public String join_update() {

		SQL sql = new SQL();
		sql.UPDATE("tbl_join");
		sql.SET("j_id = #{j_id}");
		sql.SET("j_pw= #{j_pw}");
		
		sql.WHERE("j_seq = #{j_seq}");
		return sql.toString();
	}
}