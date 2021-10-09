package com.yang.myshop.service.imp;

import com.yang.myshop.dao.UserDao;
import com.yang.myshop.pojo.User;
import com.yang.myshop.service.UserSerivce;

public class UserSerivceImp implements UserSerivce {
    private UserDao userDao;
    @Override
    public int insertUser(User user) {
        int result=userDao.insertUser(user);

        return result;
    }
}
