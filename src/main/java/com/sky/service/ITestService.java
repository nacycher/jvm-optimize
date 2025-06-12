package com.sky.service;

import com.sky.entity.People;

import java.util.List;

public interface ITestService {
    /**
     * 插入人员信息
     */
    public int add();

    /**
     * 优化-插入人员信息
     */
    public int addByOptimize();
}
