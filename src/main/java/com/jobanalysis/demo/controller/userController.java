package com.jobanalysis.demo.controller;
import com.jobanalysis.demo.entity.User;
import com.jobanalysis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
@Controller
public class userController {
    @Autowired
    private UserService userservice;

    @RequestMapping("/toLogin")
    public String index1() {
        return "login";
    }

    @RequestMapping(value = "login.action")
    public ModelAndView login(User user, HttpServletRequest request, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user.setUserName(username);
        user.setPassword(password);
        user = this.userservice.dologin(user);
        boolean ifadmin = false;
        if (user != null) {
            session.setAttribute("user", user);
            session.setAttribute("ifadmin",ifadmin);
            mav.setViewName("success");
            return mav;
        } else {
            session.setAttribute("errormsg", "账号或密码错误!请重新输入");
        }
        mav.setViewName("login");
        return mav;
    }

    @RequestMapping("/toRegister")
    public String index2() {
        return "register";
    }

    @RequestMapping(value = "register.action", method = RequestMethod.POST)
    public ModelAndView register1(User user,HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        user.setUserName(userName);
        user.setPassword(password);
        //return userservice.register(users);
        userservice.register(user);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    @RequestMapping("/toupdateusersinfo.action")
    public String index() {
        return "updateusersinfo";
    }

    @RequestMapping(value = "updateusersinfo.action",method = RequestMethod.POST)
    public ModelAndView register2(User users, HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        users.setUserName(username);
        users.setPassword(password);

        User user=(User) request.getSession(true).getAttribute("users");
        int id = user.getId();

        users.setId(id);

        request.getSession(true).setAttribute("users", users);

        userservice.updateusersinfo(users);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("success");
        return mav;
    }
}
