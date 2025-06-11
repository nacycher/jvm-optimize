drop table if exists `people`;
CREATE TABLE `people` (
                          `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                          `name` varchar(50) DEFAULT NULL COMMENT '姓名',
                          `age` int(11) DEFAULT NULL COMMENT '年龄',
                          `sex` varchar(10) DEFAULT NULL COMMENT '性别',
                          `address` varchar(200) DEFAULT NULL COMMENT '地址',
                          `phone` varchar(20) DEFAULT NULL COMMENT '电话',
                          `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
                          `id_card` varchar(20) DEFAULT NULL COMMENT '身份证号',
                          `password` varchar(100) DEFAULT NULL COMMENT '密码',
                          `remark` varchar(500) DEFAULT NULL COMMENT '备注',
                          `create_user` varchar(50) DEFAULT NULL COMMENT '创建人',
                          `update_user` varchar(50) DEFAULT NULL COMMENT '更新人',
                          `create_time` varchar(30) DEFAULT NULL COMMENT '创建时间',
                          `update_time` varchar(30) DEFAULT NULL COMMENT '更新时间',
                          `is_deleted` varchar(1) DEFAULT '0' COMMENT '是否删除(0-未删除,1-已删除)',
                          `version` varchar(20) DEFAULT '1.0' COMMENT '版本号',
                          `status` varchar(20) DEFAULT '1' COMMENT '状态',
                          `sort` varchar(10) DEFAULT '1' COMMENT '排序',
                          `create_date` varchar(30) DEFAULT NULL COMMENT '创建日期',
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='人员信息表';