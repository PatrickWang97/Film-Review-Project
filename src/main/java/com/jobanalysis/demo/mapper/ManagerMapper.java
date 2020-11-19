package com.jobanalysis.demo.mapper;

import com.jobanalysis.demo.entity.Manager;
import com.jobanalysis.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerMapper {
    public Manager adminlogin(String username, String password);
}