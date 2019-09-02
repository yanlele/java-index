package com.yanle.mybatis.repository;

import com.yanle.mybatis.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    public UserRepository userRepository;

    @Test
    public void queryUserById() throws Exception {
        User user = userRepository.queryUserById(1);

        System.out.println(user);
    }

    @Test
    public void insertUser() throws Exception {
        User user = new User();
        user.setAge(16);
        user.setBirthday(new Date("1900/12/12"));
        user.setName("孙中山");
        user.setPassword("123456");
        user.setSex(1);
        user.setUserName("five");
        this.userRepository.insertUser(user);
    }

    @Test
    public void updateUser() throws Exception {
        User user = userRepository.queryUserById(3);
        user.setUserName("王大雕");
        this.userRepository.updateUser(user);
    }

    @Test
    public void deleteUser() throws Exception {
        userRepository.deleteUser("3");
    }
}