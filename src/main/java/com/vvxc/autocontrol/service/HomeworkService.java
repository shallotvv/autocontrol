package com.vvxc.autocontrol.service;

import com.vvxc.autocontrol.dao.HomeworkMapper;
import com.vvxc.autocontrol.model.Homework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by vvxc on 2017/6/24.
 */
@Service
@Transactional
public class HomeworkService {
    @Autowired
    private HomeworkMapper mapper;

    public List<Homework> listHomework(int first,int pageSize){
        return mapper.listPage(first,pageSize);

    }

    public List<Homework> listAll() {
        return mapper.listAll();
    }

    public void deleteByIds(int[] ids) {
        for (int i=0;i<ids.length;i++)
            mapper.deleteByPrimaryKey(ids[i]);
    }

    public void add(Homework homework) {
        mapper.insert(homework);
    }
}
