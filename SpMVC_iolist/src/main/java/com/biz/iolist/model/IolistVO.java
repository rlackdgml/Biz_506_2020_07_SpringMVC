package com.biz.iolist.model;

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
public class IolistVO {
	
	private int seq;	    //NUMBER
	private String IO_DATE;	//VARCHAR2(10)
	private String IO_TIME;	//VARCHAR2(10)
	private String IO_INPUT;	//CHAR(1)
	private String IO_PNAME;	//NVARCHAR2(30)
	private int IO_PRICE;	//NUMBER
	private int IO_QUAN;	//NUMBER
	private int IO_TOTAL;   //NUMBER
	
}
