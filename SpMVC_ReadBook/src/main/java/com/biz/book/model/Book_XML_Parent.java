package com.biz.book.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// 중요함 키워드
@XmlRootElement(name="rss")
public class Book_XML_Parent {
	
	
	// 실제로 안써도됨
	@XmlElement(name="channel")
	public Book_XML_Channel channel;
	
	

}
