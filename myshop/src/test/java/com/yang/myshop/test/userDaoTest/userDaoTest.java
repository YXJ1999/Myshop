package com.yang.myshop.test.userDaoTest;

import com.yang.myshop.dao.UserDao;
import com.yang.myshop.test.BaseTest;
import com.yang.myshop.pojo.User;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class userDaoTest extends BaseTest {
    @Autowired
    public UserDao userDao;
//    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(userDaoTest.class);
    @Test
    @Ignore
    public void insertUser(){
        User user = new User();
        user.setUserName("王宝森");
        user.setLoginID("zzz0120302");
        user.setPassword("1qazcde3");
        Assert.assertEquals( userDao.insertUser(user),1);
    }
    @Test
    public void getUserByID(){
        User user=userDao.getUserById(1);
        System.out.println(user.getLoginID()+user.getUserName()+user.getPassword());
    }
}
