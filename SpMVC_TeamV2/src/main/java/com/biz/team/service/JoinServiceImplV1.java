package com.biz.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.team.mapper.JoinDao;
import com.biz.team.model.JoinVO;
import com.biz.team.model.LoginVO;

@Service("joinServiceV1")
public class JoinServiceImplV1 implements JoinService{

	@Autowired
	private JoinDao joinDao;

	@Override
	public List<JoinVO> selectAll() {
		// TODO Auto-generated method stub
		return joinDao.selectAll();
	}

	@Override
	public JoinVO findBySeq(long seq) {
		// TODO Auto-generated method stub
		return joinDao.findBySeq(seq);
	}

	@Override
	public int insert(JoinVO joinVO) {
		// TODO Auto-generated method stub
		return joinDao.insert(joinVO);
	}

	@Override
	public int update(JoinVO joinVO) {
		// TODO Auto-generated method stub
		return joinDao.update(joinVO);
	}

	@Override
	public int delete(long seq) {
		// TODO Auto-generated method stub
		return joinDao.delete(seq);
	}

}