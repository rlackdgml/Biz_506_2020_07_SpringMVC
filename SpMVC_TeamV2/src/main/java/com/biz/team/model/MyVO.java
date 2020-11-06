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
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyVO {
	
    private long m_seq; //NUMBER,
    private String m_id; //NVARCHAR2(30), 
    private String m_pw; //VARCHAR2(30),
    private String m_pwc; //VARCHAR2(30) 
	
	
	

}
