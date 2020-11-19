package com.jobanalysis.demo.controller;

import com.jobanalysis.demo.entity.Manager;
import com.jobanalysis.demo.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class managerController {
    @Autowired
    private ManagerService managerService;

    @RequestMapping("/toadminlogin.action")
    public String index() {
        return "adminlogin_zwq";
    }

    @RequestMapping(value = "adminlogin.action")
    public ModelAndView login(Manager manager, HttpServletRequest request, HttpSession session) {
        ModelAndView mav = new ModelAndView();

        String managername = request.getParameter("managername");
        String password = request.getParameter("password");

        manager.setManagerName(managername);
        manager.setPassword(password);

        manager = this.managerService.dologin(manager);

        boolean ifadmin = true;
        if (manager != null) {
            session.setAttribute("manager", manager);
            session.setAttribute("ifadmin",ifadmin);
            mav.setViewName("adminsuccess_zwq");
            return mav;
        } else {
            session.setAttribute("errormsg", "账号或密码错误!请重新输入");
        }
        mav.setViewName("adminlogin_zwq");
        return mav;
    }
}
