package com.biz.team.sql;

import org.apache.ibatis.jdbc.SQL;

public class NotSQL {

	public String not_insert() {

		SQL sql = new SQL();
		sql.INSERT_INTO("tbl_not");
		sql.INTO_COLUMNS("n_seq").INTO_VALUES("SEQ_not.NEXTVAL");
		sql.INTO_COLUMNS("n_date").INTO_VALUES("#{n_date}");
		sql.INTO_COLUMNS("n_time").INTO_VALUES("#{n_time}");
		sql.INTO_COLUMNS("n_writer").INTO_VALUES("#{n_writer}");
		sql.INTO_COLUMNS("n_subject").INTO_VALUES("#{n_subject}");
		sql.INTO_COLUMNS("n_content").INTO_VALUES("#{n_content}");
		sql.INTO_COLUMNS("n_count").INTO_VALUES("#{n_count}");

		return sql.toString();

	}

	public String not_update() {

		SQL sql = new SQL();
		sql.UPDATE("tbl_not");
		sql.SET("n_date = #{n_date}");
		sql.SET("n_time= #{n_time}");
		sql.SET("n_writer= #{n_writer}");
		sql.SET("n_subject= #{n_subject}");
		sql.SET("n_content= #{n_content}");
		sql.SET("n_count= #{n_count}");
		sql.WHERE("n_seq = #{n_seq}");
		return sql.toString();
	}
	
}