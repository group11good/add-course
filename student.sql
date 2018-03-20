/*
Navicat MySQL Data Transfer

Source Server         : loca
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : teams

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-11-20 23:19:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `studentNo` varchar(20) NOT NULL,
  `passWord` varchar(20) NOT NULL,
  `studentName` varchar(30) NOT NULL,
  `sex` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '1111', '1111', '张三', '男');
INSERT INTO `student` VALUES ('2', '2222', '2222', '王五', '男');
INSERT INTO `student` VALUES ('3', '3333', '3333', '李娜', '女');
INSERT INTO `student` VALUES ('4', '4444', '4444', 'Jack', '男');
INSERT INTO `student` VALUES ('6', '6666', '6666', '账户', '女');
INSERT INTO `student` VALUES ('9', '7777', '7777', '萨德', '女');
