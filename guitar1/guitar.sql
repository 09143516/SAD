/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50539
Source Host           : localhost:3306
Source Database       : guitar

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2017-05-10 13:42:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `guitar`
-- ----------------------------
DROP TABLE IF EXISTS `guitar`;
CREATE TABLE `guitar` (
  `serialNumber` int(255) NOT NULL AUTO_INCREMENT,
  `price` double(20,1) NOT NULL,
  `builder` varchar(10) DEFAULT NULL,
  `model` varchar(10) DEFAULT NULL,
  `type` varchar(10) NOT NULL,
  `backWood` varchar(20) DEFAULT NULL,
  `topWood` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`serialNumber`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of guitar
-- ----------------------------
INSERT INTO `guitar` VALUES ('1', '500.0', 'liyi', 'model1', '1', '材质1', '材质2');
INSERT INTO `guitar` VALUES ('2', '500.0', 'liyi', 'model2', '1', '材质10', '材质10');
