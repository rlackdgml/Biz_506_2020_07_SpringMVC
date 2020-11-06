package com.biz.team.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class JoinVO {
	
	
	private long j_seq;		//NUMBER		PRIMARY KEY,
	private int j_id;		//NUMBER	NOT NULL,
	private String j_pw ;	//VARCHAR2(30)	NOT NULL,	
				

	


	
	

}
