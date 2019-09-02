package com.yanle.mybatis.repository;

import com.yanle.mybatis.entity.User;
import com.yanle.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserRepository implements UserMapper{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(String id) {
        return userMapper.queryUserById(id);
    }

    @Override
    public List<User> queryUserAll() {
        return userMapper.queryUserAll();
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(String id) {
        userMapper.deleteUser(id);
    }
}
