package com.biz.grade.model;

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

public class GradeVO {
	
private long seq;
	private int s_num;
	private String s_name;
	private int s_kor;
	private int	s_eng;
	private int s_math;
	private long s_sum;
	private long s_avg;
	private int s_us;

	
	
	
	

}
