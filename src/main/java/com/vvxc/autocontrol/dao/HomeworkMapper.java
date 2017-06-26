package com.vvxc.autocontrol.dao;

import com.vvxc.autocontrol.model.Homework;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeworkMapper {
    List<Homework> listPage(int first,int pageSize);
    int deleteByPrimaryKey(Integer id);

    int insert(Homework record);

    int insertSelective(Homework record);

    Homework selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Homework record);

    int updateByPrimaryKeyWithBLOBs(Homework record);

    int updateByPrimaryKey(Homework record);
}