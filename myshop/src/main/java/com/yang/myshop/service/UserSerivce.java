package com.yang.myshop.service;

import com.yang.myshop.pojo.User;
import org.springframework.stereotype.Service;


public interface UserSerivce {
    //用于注册用户
    public int insertUser(User user);
    //用于登录
    User loginUser(String loginId,String password);
}
