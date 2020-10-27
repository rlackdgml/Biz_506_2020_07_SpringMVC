package com.biz.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.biz.ems.mapper.EmsDao;
import com.biz.ems.model.EmsVO;

public class EmsServiceImplV1 implements EmsService {
	
	@Autowired
	protected EmsDao emsDao;
	
	@Autowired
	@Qualifier("fileServiceV1")
	protected FileService fileService;

	@Override
	public List<EmsVO> selectAll() {
		
		return emsDao.selectAll();
	}

	
	@Override
	public void insert(EmsVO emsVO, MultipartFile file) {
		
		String fileName = fileService.fileUp(file);
		emsVO.setS_file1(fileName);
		emsDao.insert(emsVO);
		
		
	}

	@Override
	public List<String> insert(EmsVO emsVO, MultipartHttpServletRequest files) {
		
		return null;
	}

	@Override
	public int delete(long long_seq) {
		
		return 0;
	}

	@Override
	public EmsVO findBySeq(long long_seq) {
		
		return null;
	}


	@Override
	public void insert(EmsVO emsVO) {
		
		
	}

}
