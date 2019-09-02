package com.yanle.mybatis.repository;

import com.yanle.mybatis.entity.User;
import com.yanle.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserRepository implements UserMapper {
    public SqlSession sqlSession;

    public UserRepository(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public User queryUserById(String id) {
        return this.sqlSession.selectOne("UserMapper.queryUserById", id);
    }

    @Override
    public List<User> queryUserAll() {
        return this.sqlSession.selectList("UserMapper.queryUserAll");
    }

    @Override
    public void insertUser(User user) {
        this.sqlSession.insert("UserMapper.insertUser", user);
    }

    @Override
    public void updateUser(User user) {
        this.sqlSession.update("UserMapper.updateUser", user);
    }

    @Override
    public void deleteUser(String id) {
        this.sqlSession.delete("UserMapper.deleteUser", id);
    }
}
