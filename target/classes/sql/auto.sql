/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.13 : Database - autocontrol
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`autocontrol` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `autocontrol`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

insert  into `admin`(`id`,`username`,`password`) values (2,'admin','96e79218965eb72c92a549dd5a330112');

/*Table structure for table `file` */

DROP TABLE IF EXISTS `file`;

CREATE TABLE `file` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `path` varchar(100) DEFAULT NULL,
  `file_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `file` */

/*Table structure for table `guestbook` */

DROP TABLE IF EXISTS `guestbook`;

CREATE TABLE `guestbook` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT '游客',
  `content` text,
  `time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8;

/*Data for the table `guestbook` */

insert  into `guestbook`(`id`,`username`,`content`,`time`) values (11,'游客','啊实打实的','2017-06-25 11:11:36'),(12,'游客','啊实打实的','2017-06-25 11:12:17'),(13,'游客','','2017-06-25 21:23:31'),(30,'啊','阿萨德','2017-06-25 22:03:36'),(31,'游客','','2017-06-25 22:03:50'),(32,'风格','阿萨德','2017-06-25 22:05:20'),(33,'送达','电饭锅','2017-06-25 22:10:07'),(34,'游客','','2017-06-26 00:30:22'),(35,'游客','','2017-06-26 00:30:22'),(36,'游客','','2017-06-26 00:33:51'),(37,'游客','','2017-06-26 00:33:51'),(38,'游客','大声点','2017-06-26 00:35:54'),(39,'游客','大声点','2017-06-26 00:35:54'),(40,'游客','电饭锅','2017-06-26 00:36:25'),(41,'测试','测试测试','2017-06-26 00:39:17'),(42,'小明','丁丁丁','2017-06-26 00:41:23'),(43,'小明','丁丁丁','2017-06-26 00:41:32'),(44,'小明','我们通过$(\"#form1\").serialize()将表单元素的数据转化为字符串，然后通过$.ajax()执行异步请求资源。\r\n方案：jQuery.ajax() + .aspx请求\r\n此方案优势：\r\n1)         我们不会感觉页面的“闪一闪”效果\r\n2)         我们不会因为服务器耗时响应而导致出现“百页”的糟糕用户体验。\r\n此方案劣势：\r\n1)         此方案中我还是使用了aspx页面去响应请求，只是在后台通过action参数去做相应处理，尽管是异步操作但却完完整整的跑了一遍ASP.NET页面生命周期（这也是在Response.Write()输出完自己的东西后必须调','2017-06-26 00:43:15'),(45,'小明','jQuery.form插件轻松实现表单提交\r\n         现在我们使用jQuery的表单插件Jquery.form.js（官网）来实现异步表单提交。\r\n1)         该插件需要Jquery最低版本为v1.5\r\n2)         该插件提供了ajaxSubmit和ajaxForm两种表单提交方式，但不要对同一个表单同时使用两种方式。\r\n现在我将通过“jQuery+jQuery.form插件+ashx(一般处理文件)”来实现一个高效的异步表单提交','2017-06-26 00:43:38'),(46,'式神','防守打法功夫功夫的','2017-06-26 00:46:08'),(47,'式神','防守打法功夫功夫的','2017-06-26 00:46:33'),(48,'游客','fgrfjhgj 复合肥贵航股份','2017-06-26 00:47:00'),(49,'游客','的风格和风格和+ .aspx请求 此方案优势： 1) 我们不会感觉页面的“闪一闪”效果 2) 我们不会因为服务器耗时响应而导致出现“百页”的糟糕用户体验。 此方案劣势： 1) 此方案中我还是使用了aspx页面去响应','2017-06-26 00:47:45'),(50,'游客','方案优势： 1) 我们不会感觉页面的“闪一闪”效果 2) 我们不会因为服务器耗时响应而导致','2017-06-26 00:48:43'),(52,'人人通','啊实打实的','2017-06-26 12:57:37'),(53,'游客','打算放电饭锅东方故事','2017-06-26 19:59:19'),(54,'游客','打算放电饭锅东方故事','2017-06-26 19:59:48'),(55,'游客','阿斯顿发的说法','2017-06-26 20:00:00'),(56,'游客','阿斯顿发的说法','2017-06-26 20:01:30'),(57,'水电费','水电费','2017-06-26 20:01:37'),(58,'游客','阿萨德','2017-06-26 20:02:13'),(59,'啊','撒大声地','2017-06-26 20:03:33'),(60,'游客','的冯绍峰','2017-06-26 20:04:34'),(61,'游客','','2017-06-26 20:04:53'),(62,'游客','fsd','2017-06-26 20:12:36'),(63,'游客','sad','2017-06-26 20:13:30'),(64,'游客','地方','2017-06-26 20:17:32'),(65,'游客','送达','2017-06-26 20:21:42'),(66,'游客','','2017-06-26 20:40:43'),(68,'游客','','2017-06-26 20:59:50'),(69,'放','阿萨德','2017-06-29 19:14:05');

/*Table structure for table `homework` */

DROP TABLE IF EXISTS `homework`;

CREATE TABLE `homework` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `start_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `end_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `content` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

/*Data for the table `homework` */

insert  into `homework`(`id`,`start_time`,`end_time`,`content`) values (1,'2016-06-10 00:00:00','2016-07-10 00:00:00','完成课后练习题'),(2,'2016-06-10 00:00:00','2016-06-10 00:00:00','完成课后练习题和实验'),(3,'2017-04-20 00:00:00','2017-05-20 00:00:00','啊实打实大师的'),(4,'2017-05-20 00:00:00','2017-06-01 00:00:00','上网搜索有关自动控制原理的应用资料'),(5,'2017-06-01 00:00:00','2017-06-10 00:00:00','预习第七章'),(6,'2017-06-10 00:00:00','2017-07-10 00:00:00','1,完成课后练习第一题\r\n2.完成课后练习第二题'),(7,'2017-07-10 00:00:00','2017-07-20 00:00:00','看书'),(8,'2017-04-20 00:00:00','2017-08-10 00:00:00','看书'),(9,'2017-04-10 00:00:00','2017-08-20 00:00:00','看书'),(10,'2017-04-10 00:00:00','2017-08-20 00:00:00','看书'),(11,'2017-04-10 00:00:00','2017-08-20 00:00:00','看书'),(12,'2017-04-10 00:00:00','2017-08-20 00:00:00','做题，看书'),(14,'2017-05-10 00:00:00','2017-08-20 00:00:00','看书'),(33,'2017-06-07 00:00:00','2017-06-18 00:00:00','阿大声道'),(34,'2017-06-09 00:00:00','2017-06-09 00:00:00','阿萨德'),(36,'2017-06-09 00:00:00','2017-06-09 00:00:00','胜多负少'),(37,'2017-06-01 00:00:00','2017-06-30 00:00:00','写作业看书');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
