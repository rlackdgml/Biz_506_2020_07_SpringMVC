package com.biz.team.service;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("fileServiceV1")
public class FileServiceImplV1 implements FileService{

	/*
	 * 필드변수를 private final로 선언했을 경우
	 * 보통 final로 선언된 변수는  선언과 동시에 생성(초기화)를 해야한다.
	 * private final로 선언된 맴버변수는
	 * 클래스의 생성자  메서드에서 초기화하는 것을 허용한다.
	 * 
	 * private final로 선언된 멤버변수는 
	 * 반드시 클래스의 생성자 메서드에서 초기화 해야 한다.
	 */
	/*
	 * private 으로 선언된 rootFolder변수를
	 * protected로 변경
	 * protected로 선언된 변수들은 현재 클래스
	 */
	protected final String rootFolder;
	public FileServiceImplV1() {
		rootFolder = "C:/bizwork/workspace/upload/team";
	}
	
	@Override
	public String fileUp(MultipartFile file) {
		
		if(file == null) {
			return null;
		}
		
		File dir = new File(rootFolder);
		
		// file을 upload할 폴더를 검사하여 없으면 새로 생성해달라
		if(!dir.exists()) {
			// mkdir()은 제일끝의 폴더 1개만 생성
			// mkdirs() 모든 경로의 폴더를 한꺼번에 생성
			dir.mkdirs();
		}
		
		String fileName = file.getOriginalFilename();
		
		// 서버의 저장폴더 + 파일이름을 합성하여 파일 저장 준비
		File saveFile = new File(rootFolder,fileName);
		try {
			file.transferTo(saveFile);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// UUID가 부착된 파일이름을 controller로  return하여 DB에 저장하는 용도로
		return fileName;
	}

	/*
	 * 파일이름을 받아서 파일을 삭제
	 */
	@Override
	public boolean fileDelete(String h_file) {
		
		boolean ret = false;
		File deleteFile = new File(rootFolder,h_file);
		if(deleteFile.exists()) {
			// 파일을 삭제하면 true return
			ret = deleteFile.delete();
		}
		return ret;
	}

}
