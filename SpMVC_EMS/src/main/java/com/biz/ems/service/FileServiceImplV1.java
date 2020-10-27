package com.biz.ems.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.biz.ems.model.EmsVO;

public class FileServiceImplV1 implements EmsService {

	@Override
	public List<EmsVO> selectAll() {
		
		return null;
	}

	@Override
	public void insert(EmsVO emsVO) {
		
		
	}

	@Override
	public void insert(EmsVO emsVO, MultipartFile file) {
		
		
	}

	@Override
	public List<String> insert(EmsVO emsVO, MultipartHttpServletRequest files) {
		
		return null;
	}

	@Override
	public int delete(long long_seq) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmsVO findBySeq(long long_seq) {
		// TODO Auto-generated method stub
		return null;
	}

}
