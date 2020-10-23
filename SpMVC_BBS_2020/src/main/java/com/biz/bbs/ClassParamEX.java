package com.biz.bbs;

import com.biz.bbs.model.BBsVO;

public class ClassParamEX {

	public static void main(String[] args) {

		BBsVO bbsVO = new BBsVO();
		long b_seq = 99;

		System.out.println(b_seq);
		b_seq(b_seq);

		bbsVO.setB_seq(b_seq);
		System.out.println(bbsVO.getB_seq()); //99
		b_seq(bbsVO);
		System.out.println(bbsVO.getB_seq()); //99

	}

	private static void b_seq(BBsVO vo) { // 참조형 밖으로나옴

		// vo = new BBsVO();
		
		vo.setB_seq(1000);

	}

	private static void b_seq(long b_seq) {

		b_seq = 999;

	}

}
