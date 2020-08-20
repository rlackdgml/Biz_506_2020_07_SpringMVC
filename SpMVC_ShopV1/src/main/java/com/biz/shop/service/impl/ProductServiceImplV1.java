package com.biz.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.shop.model.ProductVO;
import com.biz.shop.persistence.ProductDao;
import com.biz.shop.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(value = "proServiceV1")
public class ProductServiceImplV1 implements ProductService {
	
	@Autowired
	private ProductDao proDao;

	@Override
	public List<ProductVO> selectAll() {
		
		return proDao.selectAll();
	
		
	}

	@Override
	public ProductVO findById(String id) {
	
		return null;
	}

	@Override
	public int insert(ProductVO vo) {
		
		vo.setP_image("이미지 없음");
		int ret = proDao.insert(vo);
		
		if(ret > 0) {
			log.debug("INSERT 성공 {} 개 데이터 추가", ret);
			
		}else {
			log.debug("INSERT 실패 {}" ,ret);
		}
		
		return ret;
	
		
	}

	@Override
	public void update(ProductVO vo) {
		
		
	}

	@Override
	public void delete(String id) {
		
		
	}

	@Override
	public List<ProductVO> findByTitle(String title) {
		
		return null;
	}

}
