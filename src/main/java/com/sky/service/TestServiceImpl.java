package com.sky.service;

import com.sky.entity.People;
import com.sky.mapper.PeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl  implements ITestService{
    @Autowired
    private PeopleMapper mapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int add() {
        // 模拟业务，判断数据合法性，准备插入数据等逻辑
        new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        List<People> peoples = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            People people = People.initPeople();
            peoples.add(people);
        }
        return mapper.insertBatch(peoples);
    }

    /**
     * 插入优化方案：
     * 1. 批量插入
     * 2. 异步插入
     * 3. 手动控制事务，不适用大事物
     * 4. 多线程插入，ps.存在多线程事务回滚问题
     * 5. 避免出现大对象，如果是宽表，可以考虑分表
     * 6. 测试环境机器2核2g，不适用G1GC，测试SerialGC，
     * JVM堆内存分配为90%，在2G情况下，内存可能会交叉
     */
    @Override
    public int addByOptimize() {
        return 0;
    }
}
