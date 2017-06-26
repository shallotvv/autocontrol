package com.vvxc.autocontrol.controller;

/**
 * Created by vvxc on 2017/6/25.
 */

import com.vvxc.autocontrol.model.Guestbook;
import com.vvxc.autocontrol.service.GuestbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
    @Autowired
    private GuestbookService guestbookService;

    @RequestMapping("/list")
    public @ResponseBody List<Guestbook> listPage(int currentPage,int pageSize){

        return guestbookService.listPage((currentPage-1)*pageSize,pageSize);
    }

    @RequestMapping("/add")
    public @ResponseBody String addMessage(String content,String username){
        Guestbook guestbook=new Guestbook();
        guestbook.setContent(content);
        if (username==null||"".equals(username)){
            guestbook.setUsername("游客");
        }else{
            guestbook.setUsername(username);
        }

        guestbook.setTime(new Date());

        try{
            guestbookService.add(guestbook);
        }catch (Exception e){
            return "{0}";
        }

        return "{1}";
    }
}
