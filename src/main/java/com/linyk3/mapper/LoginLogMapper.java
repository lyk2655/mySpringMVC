package com.linyk3.mapper;

import org.springframework.stereotype.Repository;

import com.linyk3.bean.LoginLog;

@Repository("loginLogMapper")
public interface LoginLogMapper {

	void insertLoginLog(LoginLog loginLog);

}
