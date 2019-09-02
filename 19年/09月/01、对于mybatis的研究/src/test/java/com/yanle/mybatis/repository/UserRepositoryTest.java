package com.yanle.mybatis.repository;

import com.yanle.mybatis.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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


}