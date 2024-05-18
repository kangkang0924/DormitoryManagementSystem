package com.example.springboot.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot.entity.Repair;
import com.example.springboot.entity.Score;


public interface ScoreService extends IService<Score> {

    //显示订单数量
    public int showOrderNum();

    //新增订单
    int addNewOrder(Score score);

    //查询
    Page find(Integer pageNum, Integer pageSize, String search);

    //查询
    Page individualFind(Integer pageNum, Integer pageSize, String search, String name);

    //更新订单信息
    int updateNewOrder(Score score);

    //删除订单
    int deleteOrder(Integer id);
}

