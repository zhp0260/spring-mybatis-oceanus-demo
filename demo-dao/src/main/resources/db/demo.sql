/*
SQLyog 企业版 - MySQL GUI v7.14 
MySQL - 5.5.33 : Database - demo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`demo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `demo`;

/*Table structure for table `t_order` */

DROP TABLE IF EXISTS `t_order`;

CREATE TABLE `t_order` (
  `id` bigint(20) DEFAULT NULL,
  `tenant` varchar(60) DEFAULT NULL,
  `order_number` varchar(60) DEFAULT NULL,
  `goods_number` varchar(60) DEFAULT NULL,
  `manual_number` varchar(60) DEFAULT NULL,
  `serial_number` varchar(60) DEFAULT NULL,
  `place_loading` varchar(120) DEFAULT NULL,
  `send_company` varchar(120) DEFAULT NULL,
  `receive_company` varchar(120) DEFAULT NULL,
  `unload_place` varchar(120) DEFAULT NULL,
  `total_number` int(11) DEFAULT NULL,
  `order_create_time` datetime DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
