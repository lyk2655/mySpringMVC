package com.linyk3.mapper;

import org.springframework.stereotype.Repository;

import com.linyk3.bean.User;

@Repository("userMapper")
public interface UserMapper {

    User selectUser1(String username);
    
    int getMatchCount(String username, String password);
    
    User findUserByName(final String name);
    
    void updateLoginInfo(User user);

}
