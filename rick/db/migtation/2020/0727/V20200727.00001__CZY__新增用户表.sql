CREATE TABLE `r_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `username` varchar(32) DEFAULT NULL COMMENT '用户号',
  `password` varchar(128) DEFAULT NULL COMMENT '用户密码',
  `nick_name` varchar(32) DEFAULT NULL COMMENT '用户昵称',
	`type` varchar(2) DEFAULT NULL COMMENT '用户类型',
  `avatar` varchar(128) DEFAULT NULL COMMENT '用户头像',
	`lastLoginTime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最后一次登陆时间',
	`disable` bit(1) DEFAULT NULL COMMENT '是否禁用',
  `deleted` bit(1) DEFAULT b'0' COMMENT '是否删除',
  `create_by` bigint(20) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` bigint(20) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `proxy_by` bigint(20) DEFAULT NULL COMMENT '代理人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=84 DEFAULT CHARSET=utf8mb4 COMMENT='用户表';