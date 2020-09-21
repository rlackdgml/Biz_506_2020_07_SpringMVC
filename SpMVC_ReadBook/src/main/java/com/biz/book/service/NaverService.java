package com.biz.book.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import com.biz.book.config.NaverSecret;
import com.biz.book.model.BookVO;

/*
 * naver API 통하여 도서명을 보내고
 * 그 결과를 JSON형태로 수신하여 Parsing 처리를 수행하는 서비스 클래스
 * naver가 server가 되고 ReadBook 프로젝트가 client가 된다.
 * 1. naver API 에 보낼 쿼리 문자열이 포함된 URL을 생성
 * 2. naver API 에서 보내온 문자열을 JSON 객체로 변환
 * 3. Parsing을 수행하고
 * 4. BookVO에 담고
 * 5. List<BookVO>에 담기 
 */

@Service
public class NaverService {

	// 도서명을 매개변수로 받아서 queryURL을 생성
	public String queryURL(String category,String bookName) {

		String queryURL = NaverSecret.NAVER_BOOK_JSON;
		
		if(category.equalsIgnoreCase("NEWS")) {
			queryURL = NaverSecret.NAVER_NEWS_JSON;
		}else if ( category.contentEquals())
			queryUR
		}

		String encodeText = null;
		try {
			// 한글 검색을 위해서 검색어를 UTF로 encoding 처리해주어야 한다.
			encodeText = URLEncoder.encode(bookName.trim(), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // queryURL += "?query=" + bookName;

		// url?query=자바
		 queryURL += String.format("?query=%s", encodeText);
		// 한번에 조회할 데이터 개수를 지정할수 있다
		queryURL += "&display=10";

		return queryURL;

	}

	// queryURL 을 naver API에게 보내고 데이터를 수신하는
	public String getNaverBook(String queryURL) {

		// queryURL 문자열을 http 프로토콜을 통해서 전송하기 위한
		// 형식으로 만드는 클래스
		URL url = null;

		// http 프로토콜을 사용하여 데이터 주고받는 Helper Class
		HttpURLConnection httpConn = null;

		try {
			url = new URL(queryURL);
			httpConn = (HttpURLConnection) url.openConnection();

			httpConn.setRequestMethod("GET");

			// http 프로토콜에 X-Naver-Client-Id 라는 변수로
			// Client id값 저장(심기)
			httpConn.setRequestProperty("X-Naver-Client-Id", NaverSecret.NAVER_CLIENT_ID);
			httpConn.setRequestProperty("X-Naver-Client-Secret", NaverSecret.NAVER_CLIENT_SECRET);

			// 내가 URL을만들고, GET으로 요청을 하면서
			// Property에 Client Id와 Client Secret를 저장하여 보냈는데
			// 나에게 응답을 해줄래 ?
			int resCode = httpConn.getResponseCode();

			BufferedReader buffer = null;
			InputStreamReader is = null;

			if (resCode == 200) {

				// naver가 정상적으로 응답을 할것이다.
				is = new InputStreamReader(httpConn.getInputStream());
			} else {
				is = new InputStreamReader(httpConn.getErrorStream());
			}

			// InputStream 와 BufferedReader를 파이프로 연결
			buffer = new BufferedReader(is);
			StringBuffer sBuffer = new StringBuffer();
			// String sBuffer = "";
			String reader = new String();
			while ((reader = buffer.readLine()) != null) {
				sBuffer.append(reader);
				// sBuffer += reader;
			}

//			while (true) {
//				reader = buffer.readLine();
//				if (reader == null)
//					break;
//				sBuffer.append(reader);
//
//			}
			buffer.close();
			return sBuffer.toString();

		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;

	}

	// jsonString을 parsing 하여 Object(vo 등등)으로 바꾸는 기능
	public List<BookVO> getJsonObject(String jsonString) {

		List<BookVO> bookList = new ArrayList<BookVO>();
		JSONParser jParser = new JSONParser();
		try {
			// jsonparser 도구를 사용하여 json형태의 문자열을
			// jsonobject(객체)로 변환하기
			JSONObject jObject = (JSONObject) jParser.parse(jsonString);
			JSONArray jArray = (JSONArray) jObject.get("items");

			int size = jArray.size();
			for (int i = 0; i < size; i++) {
				JSONObject jo = (JSONObject) jArray.get(i);
				// BookVO bookVO = new BookVO();
				// bookVO = new BookVO(title,link,image,autho,price..);
				/*
				 * bookVO.setTitle(jo.get("title").toString());
				 * bookVO.setImage(jo.get("image").toString());
				 * bookVO.setLink(jo.get("link").toString());
				 */
				/*
				 * VO @Builder 를 설정하므로써 VO객체를 생성할때 Builder 패턴을 사용할수 있다. GoF 패턴중 생성자 패턴중 1가지
				 */
					
					BookVO bookVO = BookVO.builder().title(jo.get("title").toString()).image(jo.get("image")== null ? "noImage"
						: jo.get("image").toString())
						.link(jo.get("link").toString()).description(jo.get("description").toString()).build();

				bookList.add(bookVO);
			}

			return bookList;

		} catch (ParseException e) {

			e.printStackTrace();
		}
		return null;

	}

}
