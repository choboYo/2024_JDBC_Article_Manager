package com.koreaIT.JAM.session;

import java.time.LocalDateTime;
import java.util.Map;

public class Session {
	public int id;
	public LocalDateTime regDate;
	public LocalDateTime updateDate;
	public String loginId;
	public String loginPw;
	public String name;

	public String getLoginId() {
		return loginId;
	}
	
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPw() {
		return loginPw;
	}
	
	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}
}
