package com.vvxc.autocontrol.test;

import com.vvxc.autocontrol.controller.HomeworkController;
import com.vvxc.autocontrol.dao.HomeworkMapper;
import com.vvxc.autocontrol.model.Homework;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by vvxc on 2017/6/24.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-mybatis.xml","classpath*:spring-mvc.xml"})
public class HomeworkTest {
    @Autowired
    private HomeworkMapper homeworkMapper;

    @Autowired
    private HomeworkController controller;

    @Test
    public void listPage(){
        List<Homework> homeworkList=homeworkMapper.listPage(5,5);
        for (Homework entry:
             homeworkList) {
            System.out.println(entry.toString());
        }

    }
    @Test
    public  void selectByKey(){
        Homework homework=homeworkMapper.selectByPrimaryKey(1);
        System.out.println(homework);
    }

    @Test
    public void list(){
        System.out.println(controller.listHomework(1,5));
    }
}
