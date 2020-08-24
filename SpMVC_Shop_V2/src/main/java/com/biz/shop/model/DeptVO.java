package com.biz.shop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DeptVO {
	
	
    private String d_code;	    // CHAR(4)		PRIMARY KEY,
    private String d_name;	    // nVARCHAR2(50)	NOT NULL,	
    private String d_ceo;	    // nVARCHAR2(30)	NOT NULL,	
    private String d_tel;	    // VARCHAR(20),
    private String d_address;	// nVARCHAR2(255),
    private String d_manager;	// nVARCHAR2(50),
    private String d_mn_tel;	// VARCHAR(20)		
    

}
