package com.itheima.dao;

public interface Dao {

    //转入
    public  void into(String inname,double money);

    //转出
    public  void out(String outname,double money);
}
