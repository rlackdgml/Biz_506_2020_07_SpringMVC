package com.biz.bbs.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.bbs.mapper.FinalDao;
import com.biz.bbs.model.FinalVO;

@Service("finalServiceV1")
public class FinalServiceImplV1 implements FinalService {

	
	
	private FinalDao finalDao;
	
	@Override
	public List<FinalVO> selectAll() {
		 
		List<FinalVO> finalList = finalDao.selectAll();
		
		return finalList;
	}

	@Override
	public FinalVO findById(Long id) {
		
		FinalVO finalVO = finalDao.findById(id);
		
		
		return finalVO;
	}

	@Override
	public int insert(FinalVO finalVO) {
		
		int ret = finalDao.insert(finalVO);
		
		return ret;
	}

	@Override
	public int update(FinalVO finalVO) {
		
		return finalDao.update(finalVO);
	}

	@Override
	public int delete(Long id) {
		
		int ret = finalDao.delete(id);
		
		return ret;
	}

}
