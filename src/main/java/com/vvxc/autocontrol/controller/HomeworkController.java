package com.vvxc.autocontrol.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vvxc.autocontrol.model.Homework;
import com.vvxc.autocontrol.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vvxc on 2017/6/24.
 */
@Controller
@RequestMapping("/homework")
public class HomeworkController {


    @Autowired
    private HomeworkService homeworkService;

    @RequestMapping("/list")
    public @ResponseBody List<Homework> listHomework(int currentPage,int pageSize){
        return homeworkService.listHomework((currentPage-1)*pageSize,pageSize);
    }

}
