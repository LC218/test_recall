package com.itheima.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements Dao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void into(String inname, double money) {
        jdbcTemplate.update("update account set money=money+? where sname=?",money,inname);
    }

    public void out(String outname, double money) {
        jdbcTemplate.update("update account set money=money-? where sname=?",money,outname);
    }
}
