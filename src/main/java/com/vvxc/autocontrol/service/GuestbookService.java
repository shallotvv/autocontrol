package com.vvxc.autocontrol.service;

import com.vvxc.autocontrol.dao.GuestbookMapper;
import com.vvxc.autocontrol.model.Guestbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by vvxc on 2017/6/25.
 */
@Service
@Transactional
public class GuestbookService {
    @Autowired
    private GuestbookMapper guestbookMapper;

    public List<Guestbook> listPage(int start,int pageSzie){
        return guestbookMapper.listPage(start,pageSzie);
    }

    public void add(Guestbook guestbook){
        guestbookMapper.insert(guestbook);
    }

}
