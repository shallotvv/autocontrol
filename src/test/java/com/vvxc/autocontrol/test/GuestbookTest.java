package com.vvxc.autocontrol.test;

import com.vvxc.autocontrol.controller.GuestbookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by vvxc on 2017/6/25.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-mybatis.xml","classpath*:spring-mvc.xml"})
public class GuestbookTest {
    @Autowired
    private GuestbookController controller;
    @Test
    public void listPageTest(){
        System.out.println(controller.listPage(1,10));
    }

    @Test
    public void addTest(){
        controller.addMessage("","");
    }
}
