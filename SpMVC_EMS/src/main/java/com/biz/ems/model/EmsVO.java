package com.biz.ems.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class EmsVO {
	
	private long s_seq;
	private int id;
	private String from_email;
	private String to_email;
	private String s_date;
	private String s_time;
	private String s_subject;
	private String s_content;
	private String s_file1;
	private String s_file2;

		
		

}
