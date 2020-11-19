package com.jobanalysis.demo.service;

import com.jobanalysis.demo.entity.User;
import com.jobanalysis.demo.mapper.UserMapper;
import com.jobanalysis.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User dologin(User users) {
        users = this.userMapper.login(users.getUserName(), users.getPassword());
        return users;
    }

    public int register(User users) {
        this.userMapper.register(users.getUserName(), users.getPassword());
        return 0;
    }

    public int updateusersinfo(User user) {
        this.userMapper.updateusersinfo(user.getId(),user.getUserName(), user.getPassword());

        return 0;
    }

    public String favoritemovies(User users){
        return this.userMapper.favoritemovies(users.getId());
        //return 0;
    }
}
