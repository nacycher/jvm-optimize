package com.sky.mapper;

import com.sky.entity.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PeopleMapper {

    /**
     * 插入人员信息
     */
    int insert(People people);

    /**
     * 批量插入人员信息
     */
    int insertBatch(List<People> peoples);

    /**
     * 根据ID删除人员信息
     */
    int deleteById(@Param("id") Long id);

    /**
     * 更新人员信息
     */
    int update(People people);

    /**
     * 根据ID查询人员信息
     */
    People selectById(@Param("id") Long id);

    /**
     * 查询所有人员信息
     */
    List<People> selectAll();

    /**
     * 根据条件查询人员信息
     */
    List<People> selectByCondition(People condition);
}