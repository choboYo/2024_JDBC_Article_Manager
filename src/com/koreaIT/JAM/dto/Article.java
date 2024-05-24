package com.koreaIT.JAM.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class Article {
	public int id;
	public String regDate;
	public String updateDate;
	public String title;
	public String body;
	
	public Article(Map<String, Object> articleMap) {
		this.id = (int) articleMap.get("id");
		this.regDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format( (LocalDateTime)articleMap.get("regDate"));
		this.updateDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format( (LocalDateTime)articleMap.get("updateDate"));;
		this.title = (String) articleMap.get("title");
		this.body = (String) articleMap.get("body");
	}

}