package com.yang.myshop.dao;

import com.yang.myshop.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserDao {
    //添加用户
    int insertUser (User user);
    //通过用户的ID来搜索用户信息
    User getUserById(int id);
    //用户通过账号密码登录
    User getUserByPassword(String loginId,String password);
}
