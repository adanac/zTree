/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 5.6.36 : Database - ztree
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ztree` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ztree`;

/*Table structure for table `t_library` */

DROP TABLE IF EXISTS `t_library`;

CREATE TABLE `t_library` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pid` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `is_delete` int(11) DEFAULT NULL,
  `create_user` varchar(255) DEFAULT NULL,
  `update_user` varchar(255) DEFAULT NULL,
  `level_id` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `t_tree` */

DROP TABLE IF EXISTS `t_tree`;

CREATE TABLE `t_tree` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `pid` int(11) DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Table structure for table `t_ztree_privilege` */

DROP TABLE IF EXISTS `t_ztree_privilege`;

CREATE TABLE `t_ztree_privilege` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `create_id` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `update_id` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `validity` tinyint(2) DEFAULT NULL,
  `code` varchar(11) COLLATE utf8mb4_bin DEFAULT NULL,
  `function_name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL,
  `parent_id` tinyint(2) DEFAULT NULL,
  `is_leaf_node` tinyint(2) DEFAULT NULL,
  `sub_system_id` int(11) DEFAULT NULL,
  `is_hidden` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
