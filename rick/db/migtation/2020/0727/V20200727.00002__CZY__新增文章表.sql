CREATE TABLE `r_article` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `title` varchar(32) DEFAULT NULL COMMENT '文章标题',
  `description` varchar(32) DEFAULT NULL COMMENT '文章描述',
  `content` longtext DEFAULT NULL COMMENT '文章内容',
  `type` varchar(2) DEFAULT NULL COMMENT '文章类型',
  `readed_num` bigint(20) DEFAULT NULL COMMENT '阅读人数',
	`like_num` bigint(20) DEFAULT NULL COMMENT '点赞人数',
  `deleted` bit(1) DEFAULT b'0' COMMENT '是否删除',
  `create_by` bigint(20) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_by` bigint(20) DEFAULT NULL COMMENT '修改人',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `proxy_by` bigint(20) DEFAULT NULL COMMENT '代理人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=84 DEFAULT CHARSET=utf8mb4 COMMENT='文章';