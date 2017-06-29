package com.vvxc.autocontrol.controller;

import com.vvxc.autocontrol.model.Admin;
import com.vvxc.autocontrol.service.AdminService;
import com.vvxc.autocontrol.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by vvxc on 2017/6/27.
 */
@Controller
@RequestMapping(value = {"/admin"})
public class AdminLoginController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    public @ResponseBody String login(String username, String password, HttpServletRequest request){
        Admin admin=adminService.login(username, MD5Utils.md5(password));
        if (admin==null){
            return "{\"code\":\"1\",\"msg\":\"登陆失败\"}";
        }else{
            request.getSession().setAttribute("admin",admin);
        }
        return "{\"code\":\"0\"}";
    }

    @RequestMapping(value = {"/",""})
    public String index(){
        return "login";
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request){
        request.getSession().setAttribute("admin",null);
        return "redirect:/autocontrol/admin";
    }
}
