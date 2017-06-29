package com.vvxc.autocontrol.dao;

import com.vvxc.autocontrol.model.Admin;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

@Repository
public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    Admin selectByUsernameAndPassword(String username,String password);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);
}