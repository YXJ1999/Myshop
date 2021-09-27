package com.yang.myshop.dao;

import com.yang.myshop.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    public int insertUser (User user);
    public User getUserById(int id);
}
