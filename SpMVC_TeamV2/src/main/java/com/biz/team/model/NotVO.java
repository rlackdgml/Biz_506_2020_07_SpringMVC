package com.biz.team.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotVO {
	
	  private long n_seq;	
	  private String n_date;	
	  private String  n_time;		
	  private String n_writer;	
	  private String n_subject;	
	  private String n_content;
	  private int n_count;
}