package com.itheima.service;

import com.itheima.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServoceACCImpl implements ServoceACC {
    @Autowired
    private Dao dao;
    public void popo(String sname, String iname, double money) {
       dao.into(sname,money);
       dao.out(iname,money);

    }
}
