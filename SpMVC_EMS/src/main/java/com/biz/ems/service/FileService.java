package com.biz.ems.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.biz.ems.model.EmsVO;



public interface FileService {
	
	public String fileUp(MultipartFile file);
	public List<EmsVO> filesUp(MultipartHttpServletRequest files);

	public boolean fileDelete(String b_file);

	

}
