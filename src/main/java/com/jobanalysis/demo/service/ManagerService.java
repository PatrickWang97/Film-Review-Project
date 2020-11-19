package com.jobanalysis.demo.service;

import com.jobanalysis.demo.entity.Manager;
import com.jobanalysis.demo.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ManagerService {
    @Autowired
    private ManagerMapper managerMapper;

    public Manager dologin(Manager manager) {
        manager = this.managerMapper.adminlogin(manager.getManagerName(), manager.getPassword());
        return manager;
    }
}
