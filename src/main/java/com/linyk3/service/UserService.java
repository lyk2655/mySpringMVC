package com.linyk3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linyk3.bean.LoginLog;
import com.linyk3.bean.User;
import com.linyk3.mapper.LoginLogMapper;
import com.linyk3.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private LoginLogMapper loginLogMapper;

	public boolean hasMatchUser(String name, String password) {
		int matchCount = userMapper.getMatchCount(name, password);
		return matchCount > 0;
	}

	public User findUserByUsername(String username) {
		return userMapper.findUserByName(username);
	}

	public void loginSuccess(User user) {
		System.out.println("loginSuccess"+user);
		user.setCredits(user.getCredits() + 5);
		LoginLog loginLog = new LoginLog();
		loginLog.setUserId(user.getUserId());
		loginLog.setIp(user.getLastIp());
		loginLog.setLoginDate(user.getLastVisit());
		System.out.println("loginSuccess"+loginLog);
		user.setLastIp("222.111.111.333");
		System.out.println("loginSuccessafter"+user);
		userMapper.updateLoginInfo(user);
		loginLogMapper.insertLoginLog(loginLog);
	}
}
