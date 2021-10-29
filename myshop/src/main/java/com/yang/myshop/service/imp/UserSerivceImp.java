package com.yang.myshop.service.imp;

import com.yang.myshop.dao.UserDao;
import com.yang.myshop.pojo.User;
import com.yang.myshop.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserSerivceImp implements UserSerivce {
    @Autowired
    private UserDao userDao;
    @Override
    public int insertUser(User user) {
        int result=userDao.insertUser(user);
        return result;
    }

    @Override
    public User loginUser(String loginId, String password) {
        User user =userDao.getUserByPassword(loginId,password);
        return user;
    }
}
