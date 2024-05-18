package com.example.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.entity.Repair;
import com.example.springboot.entity.Score;
import com.example.springboot.mapper.RepairMapper;
import com.example.springboot.mapper.ScoreMapper;
import com.example.springboot.service.RepairService;
import com.example.springboot.service.ScoreService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;


@Service
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements ScoreService {

    /**
     * 注入DAO层对象
     */
    @Resource
    private ScoreMapper scoreMapper;

    /**
     * 添加订单
     */
    @Override
    public int addNewOrder(Score score) {
        int insert = scoreMapper.insert(score);
        return insert;
    }

    /**
     * 查找订单
     */
    @Override
    public Page find(Integer pageNum, Integer pageSize, String search) {
        Page page = new Page<>(pageNum, pageSize);
        QueryWrapper<Score> qw = new QueryWrapper<>();
        qw.like("title", search);
        Page orderPage = scoreMapper.selectPage(page, qw);
        return orderPage;
    }

    @Override
    public Page individualFind(Integer pageNum, Integer pageSize, String search, String name) {
        Page page = new Page<>(pageNum, pageSize);
        QueryWrapper<Score> qw = new QueryWrapper<>();
        qw.like("title", search);
        qw.eq("scoreer", name);
        Page orderPage = scoreMapper.selectPage(page, qw);
        return orderPage;
    }

    /**
     * 更新订单
     */
    @Override
    public int updateNewOrder(Score score) {
        int i = scoreMapper.updateById(score);
        Assert.notNull(i, "保修单为空");
        return i;
    }

    /**
     * 删除订单
     */
    @Override
    public int deleteOrder(Integer id) {
        int i = scoreMapper.deleteById(id);
        Assert.notNull(i, "保修单为空");
        return i;
    }

    /**
     * 首页顶部：报修统计
     */
    @Override
    public int showOrderNum() {
        QueryWrapper<Score> qw = new QueryWrapper<>();
        int orderCount = Math.toIntExact(scoreMapper.selectCount(qw));
        return orderCount;
    }
}

