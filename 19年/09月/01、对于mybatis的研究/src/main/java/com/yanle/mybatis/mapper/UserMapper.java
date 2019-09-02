package com.yanle.mybatis.mapper;

import com.yanle.mybatis.entity.User;

import java.util.List;

public interface UserMapper {
    public User queryUserById(Integer id);

    public List<User> queryUserAll();

    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteUser(String id);
}
