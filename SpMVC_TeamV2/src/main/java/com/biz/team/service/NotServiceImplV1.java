package com.biz.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.team.mapper.NotDao;

import com.biz.team.model.NotVO;

@Service
public class NotServiceImplV1 implements NotService{

	@Autowired
	private NotDao notDao;
	
	@Override
	public List<NotVO> selectAll() {
		// TODO Auto-generated method stub
		return notDao.selectAll();
	}

	@Override
	public NotVO findBySeq(long seq) {
		// TODO Auto-generated method stub
		return notDao.findBySeq(seq);
	}

	@Override
	public int insert(NotVO notVO) {
		// TODO Auto-generated method stub
		return notDao.insert(notVO);
	}

	@Override
	public int update(NotVO notVO) {
		// TODO Auto-generated method stub
		return notDao.update(notVO);
	}

	@Override
	public int delete(long seq) {
		// TODO Auto-generated method stub
		return notDao.delete(seq);
	}

}