package com.biz.service;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.model.BlogVO;

@Service
public class BlogService {
	
	/*
	 * SerlvetContext
	 * tomcat 위에서 실행되는 WA(Web App)의 모든 정보를
	 * 담고있는 객체
	 * 이미 Spring project에서는 ServletContext 클래스의
	 * 객체 인스턴스가 만들어 있기 때문에 가져다 사용하기 위해서
	 * Autowired로 묶어주기
	 */
	
	@Autowired
	private ServletContext context;
	
	private String blogFile; 
	private String serverRootPath;
	
	public BlogService() {
		this.blogFile ="blog.txt";
		// this.serverRootPath = context.getRealPath("/");
		
	}
	
	
	public void selectAll() {
		
		this.serverRootPath = context.getRealPath("/");
		Path path = null;
		
		try {
			System.out.println("서버 rootPath :" + this.serverRootPath);
			
			// 서버와 root path와 blog파일 이름을 묶어서
			// 파일관련 연산을 수행할때 사용할 file 객체 생성
			
			File file = new File(this.serverRootPath);
			
			path =Paths.get(file.toString());
			
			List<String> blogList = Files.readAllLines(path);
			for(String str : blogList) {
				System.out.println(str);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	// java 1.8 이상에서만 정상작동 되는 코드
	public void insert(BlogVO blogVO) {
		
		
		
		Path path = null;
		FileWriter fileWriter = null;
		PrintWriter print = null;
	/*	
		try {
			path = Paths.get(rs.getURI());
			fileWriter = new FileWriter(path.toString(),true);
			print = new PrintWriter(fileWriter);
			
			String strBlog = String.format("%s:%s:%s",
					blogVO.getTitle(),
					blogVO.getContent(),
					blogVO.getUser());
			
			print.println(strBlog);
			print.flush();
			print.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	*/	
		
		
	}

}
