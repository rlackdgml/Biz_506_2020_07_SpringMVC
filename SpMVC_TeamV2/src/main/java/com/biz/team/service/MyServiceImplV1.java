package com.biz.team.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.team.mapper.MyDao;
import com.biz.team.model.MyVO;

@Service("myServiceV1")
public class MyServiceImplV1 implements MyService {

	@Autowired
	private MyDao myDao;
	
	@Override
	public int insert(MyVO myVO, String id) {
		
		return myDao.insert(myVO);
	}

	@Override
	public int update(MyVO myVO, String id) {
	
		return myDao.update(myVO);
	}

}
