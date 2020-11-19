package com.jobanalysis.demo.mapper;

import com.jobanalysis.demo.entity.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {
    public User login(String username, String password);
    public int register(String userName, String password);
    public int updateusersinfo(int id, String username, String password);
    public String favoritemovies(int id);
}
