package com.biz.hello.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.biz.hello.model.StudentVO;

@Service
public class StudentServiceimpl implements StudentService {

	@Override
	public List<StudentVO> selectAll() {
		
		return null;
	}

	@Override
	public StudentVO findByStNum(String st_num) {
		
		StudentVO stVO = new StudentVO();
		
		stVO.setSt_num(st_num);
		stVO.setSt_name("홍길동");
		stVO.setSt_tel("010-111-1111");
		stVO.setSt_addr("서울특별시");
		stVO.setSt_grade(3);
		
		return stVO;
	}

	@Override
	public int insert(StudentVO studentVO) {
		
		return 0;
	}

	@Override
	public int update(StudentVO studentVO) {
		
		return 0;
	}

	@Override
	public int delete(String st_num) {
		
		return 0;
	}

}
