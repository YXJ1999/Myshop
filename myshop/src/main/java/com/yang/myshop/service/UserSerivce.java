package com.yang.myshop.service;

import com.yang.myshop.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserSerivce {
    public int insertUser(User user);
}
