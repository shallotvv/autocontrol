package com.vvxc.autocontrol.service;

import com.vvxc.autocontrol.dao.AdminMapper;
import com.vvxc.autocontrol.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by vvxc on 2017/6/27.
 */
@Service
@Transactional
public class AdminService {
    @Autowired
    private AdminMapper mapper;

    public Admin login(String username,String pw){
        return  mapper.selectByUsernameAndPassword(username,pw);
    }
}
