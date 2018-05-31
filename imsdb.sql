/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : imsdb

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-05-23 19:30:41
*/
CREATE DATABASE IF NOT EXISTS imsdb CHARACTER SET UTF8;
USE imsdb;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `board`
-- ----------------------------
DROP TABLE IF EXISTS `board`;
CREATE TABLE `board` (
  `board_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '板块id',
  `board_name` varchar(150) NOT NULL DEFAULT '' COMMENT '板块名称',
  `board_desc` varchar(300) NOT NULL DEFAULT '' COMMENT '板块描述',
  `board_post_num` int(10) NOT NULL DEFAULT '0' COMMENT '板块发布数量',
  PRIMARY KEY (`board_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of board
-- ----------------------------

-- ----------------------------
-- Table structure for `cart`
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `cart_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '购物车id',
  `product_id` int(10) NOT NULL COMMENT '产品id',
  `product_count` int(10) DEFAULT NULL COMMENT '数量',
  `product_price` int(10) DEFAULT NULL COMMENT '单价',
  `product_category` varchar(50) DEFAULT NULL COMMENT '产品归类',
  `product_color` varchar(50) DEFAULT NULL COMMENT '产品颜色',
  `product_size` varchar(50) DEFAULT NULL COMMENT '产品尺码',
  `product_material` varchar(50) DEFAULT NULL COMMENT '产品材质',
  `product_collar` varchar(50) DEFAULT NULL COMMENT '产品衣领',
  `product_pocket` varchar(50) DEFAULT NULL COMMENT '产品衣兜',
  PRIMARY KEY (`cart_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cart
-- ----------------------------


-- ----------------------------
-- Table structure for `factory`
-- ----------------------------
DROP TABLE IF EXISTS `factory`;
CREATE TABLE `factory` (
  `factory_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '工厂id',
  `factory_name` varchar(50) DEFAULT NULL COMMENT '工厂名称',
  `factory_contacts` varchar(100) DEFAULT NULL COMMENT '工厂联系人',
  `factory_phone` varchar(11) DEFAULT NULL COMMENT '工厂联系人手机',
  `factory_telephone` varchar(12) DEFAULT NULL COMMENT '工厂联系人座机',
  `factory_address` varchar(512) DEFAULT NULL COMMENT '工厂地址',
  `factory_scale` varchar(2) DEFAULT NULL COMMENT '工厂规模',
  `factory_remarks` varchar(512) DEFAULT NULL COMMENT '工厂注释',
  `factory_create` timestamp NULL DEFAULT NULL COMMENT '记录创建时间',
  `factory_modify` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '记录更新时间',
  `factory_status` varchar(1) DEFAULT NULL COMMENT '工厂是否启用',
  PRIMARY KEY (`factory_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of factory
-- ----------------------------
INSERT INTO `factory` VALUES ('1', '工厂', '令', '13426492912', '01012345678', '静安中心', '30', '无需备注修改', null, '2018-05-29 10:34:24', '1');
INSERT INTO `factory` VALUES ('2', '工厂2', '令', '13426492912', '01012345678', '静安中心', '30', '无需备注修改', null, '2018-05-29 10:35:23', '0');
INSERT INTO `factory` VALUES ('3', '棉服长一号', '棉服长二号队长', 'xx', null, null, null, null, null, null, '1');
INSERT INTO `factory` VALUES ('4', '棉服长二号', '棉服长二号队长', 'xx', null, null, null, null, null, null, '1');
INSERT INTO `factory` VALUES ('5', '棉服长三号', '棉服长二号队长', 'xx', null, null, null, null, null, null, '1');
INSERT INTO `factory` VALUES ('6', '棉服长四号', '棉服长二号队长', 'xx', null, null, null, null, null, null, '1');
INSERT INTO `factory` VALUES ('7', '棉服长五号', '棉服长二号队长', 'xx', null, null, null, null, null, null, '1');

-- ----------------------------
-- Table structure for `login_log`
-- ----------------------------
DROP TABLE IF EXISTS `login_log`;
CREATE TABLE `login_log` (
  `login_log_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '日志ID',
  `user_name` varchar(30) NOT NULL COMMENT '用户名',
  `login_ip` varchar(30) NOT NULL DEFAULT '' COMMENT '登录IP',
  `login_datetime` datetime NOT NULL COMMENT '登录时间',
  PRIMARY KEY (`login_log_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login_log
-- ----------------------------
INSERT INTO `login_log` VALUES ('1', 'admin', '0:0:0:0:0:0:0:1', '2018-05-22 11:01:46');

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `order_no` int(10) DEFAULT NULL COMMENT '订单编号',
  `order_cust_name` varchar(50) DEFAULT NULL COMMENT '下单客户名称',
  `order_cust_phone` varchar(50) DEFAULT NULL COMMENT '下单客户联系电话',
  `order_cust_send` varchar(100) DEFAULT NULL COMMENT '订单发送地址',
  `order_sum_money` varchar(10) DEFAULT NULL COMMENT '订单总金额',
  `order_deposit` varchar(10) DEFAULT NULL COMMENT '订单预付定金',
  `order_create` timestamp NULL DEFAULT NULL COMMENT '订单创建时间',
  `order_modify` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '订单修改时间',
  `order_remarks` varchar(1024) DEFAULT NULL COMMENT '订单备注',
  `order_status` varchar(1) DEFAULT NULL COMMENT '订单状态',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for `orderdetails`
-- ----------------------------
DROP TABLE IF EXISTS `orderdetails`;
CREATE TABLE `orderdetails` (
  `orderdetails_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '订单明细id',
  `order_id` int(10) NOT NULL COMMENT '订单id',
  `orderdetails_product_id` int(10) NOT NULL COMMENT '订单产品id',
  `orderdetails_product_num` int(10) DEFAULT NULL COMMENT '订单产品对应数量',
  `orderdetails_product_price` int(10) DEFAULT NULL COMMENT '订单产品对应单价',
  `orderdetails_product_material` varchar(10) DEFAULT NULL COMMENT '订单材质',
  `orderdetails_product_color` varchar(10) DEFAULT NULL COMMENT '订单颜色',
  `orderdetails_product_size` varchar(10) DEFAULT NULL COMMENT '订单产品尺码',
  `orderdetails_product_collar` varchar(10) DEFAULT NULL COMMENT '订单产品衣领',
  `orderdetails_create` timestamp NULL DEFAULT NULL COMMENT '订单明细创建时间',
  `orderdetails_modify` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '订单明细修改时间',
  `orderdetails_remarks` varchar(1024) DEFAULT NULL COMMENT '订单明细备注',
  `orderdetails_status` varchar(1) DEFAULT NULL COMMENT '订单明细状态',
  PRIMARY KEY (`orderdetails_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderdetails
-- ----------------------------


-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '产品id',
  `product_no` int(10) NOT NULL COMMENT '产品编号',
  `product_name` varchar(50) DEFAULT NULL COMMENT '产品名称',
  `product_img` mediumblob COMMENT '产品图片',
  `product_category` varchar(50) DEFAULT NULL COMMENT '产品归类',
  `product_color` varchar(50) DEFAULT NULL COMMENT '产品颜色',
  `product_size` varchar(50) DEFAULT NULL COMMENT '产品尺码',
  `product_material` varchar(50) DEFAULT NULL COMMENT '产品材质',
  `product_collar` varchar(50) DEFAULT NULL COMMENT '产品衣领',
  `product_pocket` varchar(50) DEFAULT NULL COMMENT '产品衣兜',
  `product_create` timestamp NULL DEFAULT NULL COMMENT '产品创建时间',
  `product_modify` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '产品修改时间',
  `product_remarks` varchar(1024) DEFAULT NULL COMMENT '产品备注',
  `product_status` varchar(10) DEFAULT NULL COMMENT '产品状态',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------

-- ----------------------------
-- Table structure for `props`
-- ----------------------------
DROP TABLE IF EXISTS `props`;
CREATE TABLE `props` (
  `props_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '属性id',
  `props_name` varchar(50) DEFAULT NULL COMMENT '属性名称',
  `props_desc` varchar(50) DEFAULT NULL COMMENT '属性描述',
  `props_remarks` varchar(1024) DEFAULT NULL COMMENT '属性备注',
  `props_create` timestamp NULL DEFAULT NULL COMMENT '属性创建时间',
  `props_modify` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '属性修改时间',
  `props_status` varchar(1) DEFAULT NULL COMMENT '属性状态',
  PRIMARY KEY (`props_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of props
-- ----------------------------
INSERT INTO `props` VALUES ('1', '分类', '服装分类', '服装分类', null, '2018-05-30 17:10:29', '1');
INSERT INTO `props` VALUES ('2', '颜色', '服装颜色', '主要颜色', null, '2018-05-30 10:18:59', '1');
INSERT INTO `props` VALUES ('3', '身长', '尺码', '按当地尺寸', null, '2018-05-30 10:19:23', '1');
INSERT INTO `props` VALUES ('4', '材质', '服装布料', '服装布料', null, '2018-05-30 10:31:13', '1');
INSERT INTO `props` VALUES ('5', '衣领类型', '衣领类型', '衣领类型', null, '2018-05-30 10:31:10', '1');
INSERT INTO `props` VALUES ('6', '衣兜数量', '衣兜数量', '衣兜数量', null, '2018-05-30 10:31:07', '1');

-- ----------------------------
-- Table structure for `props_details`
-- ----------------------------
DROP TABLE IF EXISTS `props_details`;
CREATE TABLE `props_details` (
  `props_details_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '属性明细id',
  `props_id` int(10) NOT NULL COMMENT '属性id',
  `props_details_name` varchar(50) DEFAULT NULL COMMENT '属性明细名称',
  `props_details_desc` varchar(50) DEFAULT NULL COMMENT '属性明细描述',
  `props_details_remarks` varchar(1024) DEFAULT NULL COMMENT '属性明细备注',
  `props_details_create` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '属性明细创建时间',
  `props_details_modify` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '属性明细修改时间',
  `props_details_status` varchar(1) DEFAULT NULL COMMENT '属性明细状态',
  PRIMARY KEY (`props_details_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of props_details
-- ----------------------------
INSERT INTO `props_details` VALUES ('6', '1', '冬装', '女棉服', null, null, null, '1');
INSERT INTO `props_details` VALUES ('7', '2', '红色', '红色', null, null, null, '1');
INSERT INTO `props_details` VALUES ('8', '3', 'M', 'M', null, null, null, '1');
INSERT INTO `props_details` VALUES ('9', '4', '涤纶', '涤纶', null, null, null, '1');
INSERT INTO `props_details` VALUES ('10', '5', '毛领', '银狐', null, null, null, '1');
INSERT INTO `props_details` VALUES ('11', '6', '4', '内外各两个', null, null, null, '1');
INSERT INTO `props_details` VALUES ('12', '1', '夏装', '薄款', null, null, null, '1');
INSERT INTO `props_details` VALUES ('13', '3', 'L', 'L', 'L', null, null, '1');
INSERT INTO `props_details` VALUES ('14', '3', 'XL', 'XL', 'XL', null, null, '1');
INSERT INTO `props_details` VALUES ('15', '3', 'XXL', 'XXL', 'XXL', null, null, '1');
INSERT INTO `props_details` VALUES ('16', '3', 'XXXL', 'XXXL', 'XXXL', null, null, '1');
INSERT INTO `props_details` VALUES ('17', '1', '秋装', '秋装', '秋装', null, null, '1');
INSERT INTO `props_details` VALUES ('18', '2', '绿色', '绿色', '绿色', null, null, '1');

-- ----------------------------
-- Table structure for `reply`
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply` (
  `reply_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '回复ID',
  `reply_post_id` int(10) NOT NULL COMMENT '所回复帖子的ID',
  `reply_user_name` varchar(30) NOT NULL COMMENT '回帖者姓名',
  `reply_content` text NOT NULL COMMENT '回复内容',
  `reply_good_count` int(10) NOT NULL DEFAULT '0' COMMENT '点赞',
  `reply_bad_count` int(10) NOT NULL DEFAULT '0' COMMENT '踩数',
  `reply_create_time` datetime NOT NULL COMMENT '回复时间',
  PRIMARY KEY (`reply_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reply
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(30) NOT NULL COMMENT '用户名',
  `password` varchar(30) NOT NULL DEFAULT '' COMMENT '密码',
  `user_email` varchar(30) NOT NULL COMMENT '用户邮箱',
  `user_sex` varchar(30) NOT NULL COMMENT '用户性别',
  `user_phone` int(11) DEFAULT NULL COMMENT '电话号码',
  `create_time` datetime NOT NULL COMMENT '用户创建时间',
  `user_type` int(2) NOT NULL DEFAULT '1' COMMENT '用户类型 0:管理员 1:普通用户',
  `user_state` int(2) NOT NULL DEFAULT '0' COMMENT '用户状态 0:正常 1:冻结',
  `credit` int(10) NOT NULL DEFAULT '100' COMMENT '用户积分',
  `last_login_time` datetime DEFAULT NULL COMMENT '用户最后登入时间',
  `last_ip` varchar(20) DEFAULT NULL COMMENT '用户最后登入ip',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_name` (`user_name`) USING BTREE,
  UNIQUE KEY `user_email` (`user_email`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123456', 'yue530tom@163.com', '男', '1', '2018-05-22 19:01:28', '1', '0', '105', '2018-05-22 11:01:46', '0:0:0:0:0:0:0:1');
