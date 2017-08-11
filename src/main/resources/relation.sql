/*
SQLyog Ultimate v10.51 
MySQL - 5.7.17-log : Database - tohome
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tohome` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

USE `tohome`;

/*Table structure for table `t_relation` */

DROP TABLE IF EXISTS `t_relation`;

CREATE TABLE `t_relation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `tohome_field` varchar(64) DEFAULT NULL COMMENT '阿福到家系统表字段',
  `hy_field` varchar(64) DEFAULT NULL COMMENT '鸿雁系统表字段',
  `output_table_name` varchar(64) DEFAULT NULL COMMENT '导出阿福到家对应表名称',
  `input_table_name` varchar(64) DEFAULT NULL COMMENT '导入鸿雁对应表名称',
  `comment` varchar(128) DEFAULT NULL COMMENT '鸿雁表对应字段描述信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

/*Data for the table `t_relation` */

LOCK TABLES `t_relation` WRITE;

insert  into `t_relation`(`id`,`tohome_field`,`hy_field`,`output_table_name`,`input_table_name`,`comment`) values (1,'pid','id','th_item','retail_goods',NULL),(2,'itemCode','goods_code','th_item','retail_goods',NULL),(3,'title','goods_name','th_item','retail_goods',NULL),(4,'company','company_code','th_item','retail_goods',NULL),(5,'spuId','spu_code','th_product','retail_goods',NULL),(6,'upc','upc_code','th_item','retail_goods',NULL),(7,'0','is_serial_code','th_item','retail_goods',NULL),(8,'unitsId','units_id','th_item','retail_goods',NULL),(9,'unitsName','units_name','th_units','retail_goods',NULL),(10,'type','goods_type','th_item','retail_goods',NULL),(11,'','pack_spec_num','th_item','retail_goods',NULL),(12,'','pack_spec_units','th_item','retail_goods',NULL),(13,'','unit_goods_code','th_item','retail_goods',NULL),(14,'2','status','th_item','retail_goods',NULL),(15,'1','sale_status','th_item','retail_goods',NULL),(16,'','cost_price','th_item','retail_goods',NULL),(17,'marketPrice','guide_price','th_item','retail_goods',NULL),(18,'price','sale_price','th_item','retail_goods',NULL),(19,'brandId','brand_id','th_item','retail_goods',NULL),(20,'brandName','brand_name','th_brand','retail_goods',NULL),(21,'0','standard_type','th_item','retail_goods',NULL),(22,'realWeight','weight','th_item','retail_goods',NULL),(23,'','goods_introduce','th_item','retail_goods',NULL),(24,'cate1','category_id1','th_item','retail_goods',NULL),(25,'cate2','category_id2','th_item','retail_goods',NULL),(26,'cate3','category_id3','th_item','retail_goods',NULL),(27,'','tag_ids','th_item','retail_goods',NULL),(28,'','custom_attrs','th_item','retail_goods',NULL),(29,'shelfLife','shelf_life','th_item','retail_goods',NULL),(30,'mainUri','icon_path','th_item','retail_goods',NULL),(31,'1','priority','th_item','retail_goods',NULL),(32,'0','delete_flag','th_item','retail_goods',NULL),(33,'createTime','create_time','th_item','retail_goods',NULL),(34,'updateTime','modify_time','th_item','retail_goods',NULL),(35,'','operator_id','th_item','retail_goods',NULL),(36,'operator','operator_name','th_item','retail_goods',NULL);

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
