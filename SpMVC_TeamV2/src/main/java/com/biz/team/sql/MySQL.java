package com.biz.team.sql;

import org.apache.ibatis.jdbc.SQL;

public class MySQL {
	
	public String my_insert() {

		SQL sql = new SQL();
		sql.INSERT_INTO("tbl_my");
		sql.INTO_COLUMNS("m_seq").INTO_VALUES("seq_my.NEXTVAL");
		sql.INTO_COLUMNS("m_id").INTO_VALUES("#{m_id}");
		sql.INTO_COLUMNS("m_pw").INTO_VALUES("#{m_pw}");
		sql.INTO_COLUMNS("m_pwc").INTO_VALUES("#{m_pwc}");
		return sql.toString();

	}

	public String my_update() {

		SQL sql = new SQL();
		sql.UPDATE("tbl_my");
		sql.SET("m_id = #{m_id}");
		sql.SET("m_pw = #{m_pw}");
		sql.SET("m_pwc = #{m_pwc}");
		sql.WHERE("m_seq = #{m_seq}");
		return sql.toString();

	}

}
