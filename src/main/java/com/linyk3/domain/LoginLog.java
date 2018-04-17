package com.linyk3.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class LoginLog implements Serializable{
    private int loginLogId;
    private int userId;
    private String ip;
    private Timestamp loginDate;

    public int getLoginLogId() {
        return loginLogId;
    }

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Timestamp getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Timestamp loginDate) {
        this.loginDate = loginDate;
    }

	@Override
	public String toString() {
		return "LoginLog [loginLogId=" + loginLogId + ", userId=" + userId + ", ip=" + ip + ", loginDate=" + loginDate
				+ "]";
	}
    
}
