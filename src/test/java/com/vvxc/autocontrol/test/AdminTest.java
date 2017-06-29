package com.vvxc.autocontrol.test;

import com.vvxc.autocontrol.controller.AdminLoginController;
import com.vvxc.autocontrol.dao.AdminMapper;
import com.vvxc.autocontrol.model.Admin;
import com.vvxc.autocontrol.util.MD5Utils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vvxc on 2017/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-mybatis.xml","classpath*:spring-mvc.xml"})
public class AdminTest {
    @Autowired
    public AdminLoginController controller;
    @Autowired
    public AdminMapper mapper;

    @Test
    public void loginTest(){
            Admin admin=mapper.selectByUsernameAndPassword("admin",MD5Utils.md5("0"));
            System.out.print(admin);
    }
}
