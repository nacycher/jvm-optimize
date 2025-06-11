package com.sky.entity;

import lombok.Data;

@Data
public class People {
    private Long id;
    private String name;
    private Integer age;
    private String sex;
    private String address;
    private String phone;
    private String email;
    private String idCard;
    private String password;
    private String remark;
    private String createUser;
    private String updateUser;
    private String createTime;
    private String updateTime;
    private String isDeleted;
    private String version;
    private String status;
    private String sort;
    private String createDate;

    // 模拟插入数据时，设置的值
    public static People initPeople() {
        return new People(){{
            setName("张三");
            setAge(18);
            setSex("男");
            setAddress("北京市");
            setPhone("13800138000");
            setEmail("EMAIL");
            setIdCard("44010119900101001X");
            setPassword("123456");
            setRemark("备注");
            setCreateUser("admin");
            setUpdateUser("admin");
            setCreateTime("2020-01-01 00:00:00");
            setUpdateTime("2020-01-01 00:00:00");
            setIsDeleted("0");
            setVersion("1.0");
            setStatus("1");
            setSort("1");
            setCreateDate("2020-01-01");
        }};
    }
}
