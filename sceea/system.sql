/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : system

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2021-06-28 10:41:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for administration_account
-- ----------------------------
DROP TABLE IF EXISTS `administration_account`;
CREATE TABLE `administration_account` (
  `admin_account_id` int NOT NULL AUTO_INCREMENT,
  `admin_account` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `admin_passwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`admin_account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of administration_account
-- ----------------------------

-- ----------------------------
-- Table structure for affiliation_account
-- ----------------------------
DROP TABLE IF EXISTS `affiliation_account`;
CREATE TABLE `affiliation_account` (
  `affiliation_id` int NOT NULL AUTO_INCREMENT,
  `affiliation_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `affiliation_passwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `corporate_body_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `corporate_body_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `authentication_status` int NOT NULL,
  PRIMARY KEY (`affiliation_id`),
  KEY `affiliation_name` (`affiliation_name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of affiliation_account
-- ----------------------------
INSERT INTO `affiliation_account` VALUES ('1', '天府创业公司', '64545615', 'lpx', '15615411', '1');

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `city_id` int NOT NULL AUTO_INCREMENT,
  `city_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`city_id`),
  KEY `city_name` (`city_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('2', '南充');
INSERT INTO `city` VALUES ('1', '成都');

-- ----------------------------
-- Table structure for code
-- ----------------------------
DROP TABLE IF EXISTS `code`;
CREATE TABLE `code` (
  `code_id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`code_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of code
-- ----------------------------
INSERT INTO `code` VALUES ('1', '123456');
INSERT INTO `code` VALUES ('2', 'ssss.dynazenon');

-- ----------------------------
-- Table structure for college
-- ----------------------------
DROP TABLE IF EXISTS `college`;
CREATE TABLE `college` (
  `college_id` int NOT NULL AUTO_INCREMENT,
  `college_name` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`college_id`),
  KEY `college_name` (`college_name`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of college
-- ----------------------------
INSERT INTO `college` VALUES ('1', '四川大学');
INSERT INTO `college` VALUES ('2', '电子科技大学');

-- ----------------------------
-- Table structure for college_major
-- ----------------------------
DROP TABLE IF EXISTS `college_major`;
CREATE TABLE `college_major` (
  `major_id` int NOT NULL AUTO_INCREMENT,
  `major_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `college_id` int NOT NULL,
  PRIMARY KEY (`major_id`),
  KEY `fk1_college_major` (`college_id`),
  KEY `major_name` (`major_name`),
  CONSTRAINT `fk1_college_major` FOREIGN KEY (`college_id`) REFERENCES `college` (`college_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of college_major
-- ----------------------------
INSERT INTO `college_major` VALUES ('1', '经济学', '1');
INSERT INTO `college_major` VALUES ('2', '电气工程', '2');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `course_id` int NOT NULL AUTO_INCREMENT,
  `course_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '资本论');
INSERT INTO `course` VALUES ('2', '西方经济学');
INSERT INTO `course` VALUES ('3', 'PLC');
INSERT INTO `course` VALUES ('4', '集成电路');

-- ----------------------------
-- Table structure for course_major
-- ----------------------------
DROP TABLE IF EXISTS `course_major`;
CREATE TABLE `course_major` (
  `course_major_id` int NOT NULL,
  `course_id` int NOT NULL,
  `major_id` int NOT NULL,
  PRIMARY KEY (`course_major_id`),
  KEY `fk1_course_major` (`major_id`),
  KEY `fk2_course_major` (`course_id`),
  CONSTRAINT `fk1_course_major` FOREIGN KEY (`major_id`) REFERENCES `college_major` (`major_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk2_course_major` FOREIGN KEY (`course_id`) REFERENCES `course` (`course_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of course_major
-- ----------------------------
INSERT INTO `course_major` VALUES ('1', '1', '1');
INSERT INTO `course_major` VALUES ('2', '2', '1');
INSERT INTO `course_major` VALUES ('3', '3', '2');
INSERT INTO `course_major` VALUES ('4', '4', '2');

-- ----------------------------
-- Table structure for district
-- ----------------------------
DROP TABLE IF EXISTS `district`;
CREATE TABLE `district` (
  `district_id` int NOT NULL AUTO_INCREMENT,
  `district_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `city_id` int NOT NULL,
  PRIMARY KEY (`district_id`),
  KEY `fk1_district` (`city_id`),
  KEY `district_name` (`district_name`),
  CONSTRAINT `fk1_district` FOREIGN KEY (`city_id`) REFERENCES `city` (`city_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of district
-- ----------------------------
INSERT INTO `district` VALUES ('1', '成华区', '1');
INSERT INTO `district` VALUES ('2', '双流区', '1');
INSERT INTO `district` VALUES ('3', '嘉陵区', '2');
INSERT INTO `district` VALUES ('4', '顺庆区', '2');

-- ----------------------------
-- Table structure for document
-- ----------------------------
DROP TABLE IF EXISTS `document`;
CREATE TABLE `document` (
  `doc_id` int NOT NULL AUTO_INCREMENT,
  `doc_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `doc_type` int NOT NULL,
  PRIMARY KEY (`doc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of document
-- ----------------------------
INSERT INTO `document` VALUES ('1', '实训论文', 'D:\\Code\\sceea\\src\\main\\resources\\document\\考试文档_机试_实训论文.txt', '1');

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `exam_id` int NOT NULL AUTO_INCREMENT,
  `exam_date` date NOT NULL,
  `exam_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `exam_type` int NOT NULL,
  `exam_rgst_sdate` date NOT NULL,
  `exam_rgst_edate` date NOT NULL,
  `exam_nums` int NOT NULL,
  PRIMARY KEY (`exam_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of exam
-- ----------------------------
INSERT INTO `exam` VALUES ('1', '2021-06-21', '资本论', '1', '2021-03-31', '2021-05-31', '5');
INSERT INTO `exam` VALUES ('2', '2021-06-13', '集成电路', '2', '2021-03-31', '2021-05-31', '5');

-- ----------------------------
-- Table structure for examinee_account
-- ----------------------------
DROP TABLE IF EXISTS `examinee_account`;
CREATE TABLE `examinee_account` (
  `examinee_id` int NOT NULL AUTO_INCREMENT,
  `examinee_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `examinee_mb_num` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `examinee_passwd` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`examinee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of examinee_account
-- ----------------------------
INSERT INTO `examinee_account` VALUES ('1', 'xxy', '544003', '123456');
INSERT INTO `examinee_account` VALUES ('2', 'ly', '501336', '888888');

-- ----------------------------
-- Table structure for exam_assignment
-- ----------------------------
DROP TABLE IF EXISTS `exam_assignment`;
CREATE TABLE `exam_assignment` (
  `assignment_id` int NOT NULL AUTO_INCREMENT,
  `examroom_id` int NOT NULL,
  `kaoci_id` int NOT NULL,
  `exam_seq` int NOT NULL,
  PRIMARY KEY (`assignment_id`),
  KEY `fk1_exam_assignment` (`examroom_id`),
  KEY `kaoci_id` (`kaoci_id`),
  CONSTRAINT `exam_assignment_ibfk_1` FOREIGN KEY (`kaoci_id`) REFERENCES `kaoci` (`kaoci_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk1_exam_assignment` FOREIGN KEY (`examroom_id`) REFERENCES `exam_room` (`examroom_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of exam_assignment
-- ----------------------------
INSERT INTO `exam_assignment` VALUES ('1', '1', '1', '2');
INSERT INTO `exam_assignment` VALUES ('2', '2', '2', '2');

-- ----------------------------
-- Table structure for exam_info
-- ----------------------------
DROP TABLE IF EXISTS `exam_info`;
CREATE TABLE `exam_info` (
  `exam_info_id` int NOT NULL AUTO_INCREMENT,
  `seat` int NOT NULL,
  `examinee_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `examroom_id` int NOT NULL,
  `kaoci_id` int NOT NULL,
  PRIMARY KEY (`exam_info_id`),
  KEY `fk1_exam_info` (`examinee_id`),
  KEY `fk2_exam_info` (`examroom_id`),
  KEY `fk3_exam_info` (`kaoci_id`),
  CONSTRAINT `fk1_exam_info` FOREIGN KEY (`examinee_id`) REFERENCES `registration_info` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk2_exam_info` FOREIGN KEY (`examroom_id`) REFERENCES `exam_room` (`examroom_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk3_exam_info` FOREIGN KEY (`kaoci_id`) REFERENCES `kaoci` (`kaoci_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of exam_info
-- ----------------------------
INSERT INTO `exam_info` VALUES ('1', '55', '51646515416', '1', '1');

-- ----------------------------
-- Table structure for exam_location
-- ----------------------------
DROP TABLE IF EXISTS `exam_location`;
CREATE TABLE `exam_location` (
  `location_code` int NOT NULL AUTO_INCREMENT,
  `location_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `district_id` int NOT NULL,
  PRIMARY KEY (`location_code`),
  KEY `fk1_exam_location` (`district_id`),
  CONSTRAINT `fk1_exam_location` FOREIGN KEY (`district_id`) REFERENCES `district` (`district_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of exam_location
-- ----------------------------
INSERT INTO `exam_location` VALUES ('1', '四川大学望江校区', '1');
INSERT INTO `exam_location` VALUES ('2', '四川大学江安校区', '2');

-- ----------------------------
-- Table structure for exam_registration_info
-- ----------------------------
DROP TABLE IF EXISTS `exam_registration_info`;
CREATE TABLE `exam_registration_info` (
  `exam_rgst_id` int NOT NULL AUTO_INCREMENT,
  `id` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `kaoci_id` int NOT NULL,
  `rgstr_time` date NOT NULL,
  `payment_status` int NOT NULL,
  PRIMARY KEY (`exam_rgst_id`),
  KEY `fk1_exam_rgst_info` (`id`),
  KEY `fk2_exam_rgst_info` (`kaoci_id`),
  CONSTRAINT `fk1_exam_rgst_info` FOREIGN KEY (`id`) REFERENCES `registration_info` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk2_exam_rgst_info` FOREIGN KEY (`kaoci_id`) REFERENCES `kaoci` (`kaoci_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of exam_registration_info
-- ----------------------------
INSERT INTO `exam_registration_info` VALUES ('1', '51646515416', '1', '2021-05-12', '1');

-- ----------------------------
-- Table structure for exam_room
-- ----------------------------
DROP TABLE IF EXISTS `exam_room`;
CREATE TABLE `exam_room` (
  `examroom_id` int NOT NULL AUTO_INCREMENT,
  `examroom_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `location_code` int NOT NULL,
  `classroom_type` int NOT NULL,
  `capability` int NOT NULL,
  PRIMARY KEY (`examroom_id`),
  KEY `fk1_examroom` (`location_code`),
  CONSTRAINT `fk1_examroom` FOREIGN KEY (`location_code`) REFERENCES `exam_location` (`location_code`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of exam_room
-- ----------------------------
INSERT INTO `exam_room` VALUES ('1', 'A501', '1', '1', '30');
INSERT INTO `exam_room` VALUES ('2', 'C304', '2', '1', '50');

-- ----------------------------
-- Table structure for illegal_case
-- ----------------------------
DROP TABLE IF EXISTS `illegal_case`;
CREATE TABLE `illegal_case` (
  `case_id` int NOT NULL AUTO_INCREMENT,
  `case_description` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `illegal_id` int NOT NULL,
  `punishment_id` int NOT NULL,
  `assignment_id` int NOT NULL,
  `info_id` int NOT NULL,
  PRIMARY KEY (`case_id`),
  KEY `fk1_illegal_case` (`illegal_id`),
  KEY `fk2_illegal_case` (`punishment_id`),
  KEY `fk3_illegal_case` (`assignment_id`),
  KEY `fk4_illegal_case` (`info_id`),
  CONSTRAINT `fk1_illegal_case` FOREIGN KEY (`illegal_id`) REFERENCES `illegal_code` (`illegal_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk2_illegal_case` FOREIGN KEY (`punishment_id`) REFERENCES `punishment_code` (`punishment_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk3_illegal_case` FOREIGN KEY (`assignment_id`) REFERENCES `exam_assignment` (`assignment_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk4_illegal_case` FOREIGN KEY (`info_id`) REFERENCES `registration_info` (`info_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of illegal_case
-- ----------------------------
INSERT INTO `illegal_case` VALUES ('1', '沙雕', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for illegal_code
-- ----------------------------
DROP TABLE IF EXISTS `illegal_code`;
CREATE TABLE `illegal_code` (
  `illegal_id` int NOT NULL AUTO_INCREMENT,
  `illegal_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `illeg_code` int NOT NULL,
  KEY `illegal_id` (`illegal_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of illegal_code
-- ----------------------------
INSERT INTO `illegal_code` VALUES ('1', 'string', '0');

-- ----------------------------
-- Table structure for kaoci
-- ----------------------------
DROP TABLE IF EXISTS `kaoci`;
CREATE TABLE `kaoci` (
  `kaoci_id` int NOT NULL AUTO_INCREMENT,
  `exam_id` int NOT NULL,
  `exam_time` int NOT NULL,
  `course` int NOT NULL,
  `exam_duration` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `exam_assigment_time` date NOT NULL,
  `exam_equipment` int NOT NULL,
  `record_print` date NOT NULL,
  `file_size` int NOT NULL,
  `mark_project` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`kaoci_id`),
  KEY `fk1_kaoci` (`exam_id`),
  CONSTRAINT `fk1_kaoci` FOREIGN KEY (`exam_id`) REFERENCES `exam` (`exam_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of kaoci
-- ----------------------------
INSERT INTO `kaoci` VALUES ('1', '1', '1900', '1', '2小时', '2021-06-21', '1', '2021-06-21', '1', '1');
INSERT INTO `kaoci` VALUES ('2', '2', '700', '4', '2小时', '2021-06-13', '1', '2021-06-13', '2', '2');

-- ----------------------------
-- Table structure for mark_institutions
-- ----------------------------
DROP TABLE IF EXISTS `mark_institutions`;
CREATE TABLE `mark_institutions` (
  `mark_institutions_id` int NOT NULL AUTO_INCREMENT,
  `college_id` int NOT NULL,
  `kaoci_id` int NOT NULL,
  PRIMARY KEY (`mark_institutions_id`),
  KEY `fk1_mark_institution` (`college_id`),
  KEY `kaoci_id` (`kaoci_id`),
  CONSTRAINT `fk1_mark_institution` FOREIGN KEY (`college_id`) REFERENCES `college` (`college_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `mark_institutions_ibfk_1` FOREIGN KEY (`kaoci_id`) REFERENCES `kaoci` (`kaoci_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of mark_institutions
-- ----------------------------
INSERT INTO `mark_institutions` VALUES ('1', '2', '2');

-- ----------------------------
-- Table structure for punishment_code
-- ----------------------------
DROP TABLE IF EXISTS `punishment_code`;
CREATE TABLE `punishment_code` (
  `punishment_id` int NOT NULL AUTO_INCREMENT,
  `punishment_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `punish_code` int NOT NULL,
  KEY `punishment_id` (`punishment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of punishment_code
-- ----------------------------
INSERT INTO `punishment_code` VALUES ('1', '违规带手机', '101');

-- ----------------------------
-- Table structure for registration_info
-- ----------------------------
DROP TABLE IF EXISTS `registration_info`;
CREATE TABLE `registration_info` (
  `info_id` int NOT NULL AUTO_INCREMENT,
  `examinee_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `sex` int NOT NULL,
  `people` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `id` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `domicile` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `political_status` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `registrated_college` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `registrated_major` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `contact` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `city` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `district` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `affiliation` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`info_id`),
  KEY `fk1_rgst_info` (`registrated_college`),
  KEY `fk2_rgst_info` (`registrated_major`),
  KEY `fk3_rgst_info` (`city`),
  KEY `fk4_rgst_info` (`district`),
  KEY `affiliation` (`affiliation`),
  KEY `id` (`id`),
  CONSTRAINT `fk1_rgst_info` FOREIGN KEY (`registrated_college`) REFERENCES `college` (`college_name`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk2_rgst_info` FOREIGN KEY (`registrated_major`) REFERENCES `college_major` (`major_name`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk3_rgst_info` FOREIGN KEY (`city`) REFERENCES `city` (`city_name`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk4_rgst_info` FOREIGN KEY (`district`) REFERENCES `district` (`district_name`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `registration_info_ibfk_1` FOREIGN KEY (`affiliation`) REFERENCES `affiliation_account` (`affiliation_name`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of registration_info
-- ----------------------------
INSERT INTO `registration_info` VALUES ('1', 'xxy', '1', '汉', '51646515416', '南充', '无党派', '四川大学', '经济学', '16159498', '南充', '嘉陵区', '天府创业公司');

-- ----------------------------
-- Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report` (
  `report_id` int NOT NULL AUTO_INCREMENT,
  `staff` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `inspection_num` int NOT NULL,
  `case_record` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `book` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `assigment_id` int NOT NULL,
  PRIMARY KEY (`report_id`),
  KEY `fk1_report` (`assigment_id`),
  CONSTRAINT `fk1_report` FOREIGN KEY (`assigment_id`) REFERENCES `exam_assignment` (`assignment_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of report
-- ----------------------------
INSERT INTO `report` VALUES ('1', 'ah', '2', '1', '1', '1');

-- ----------------------------
-- Table structure for white_list
-- ----------------------------
DROP TABLE IF EXISTS `white_list`;
CREATE TABLE `white_list` (
  `white_list_id` int NOT NULL AUTO_INCREMENT,
  `exam_id` int NOT NULL,
  `affiliation_id` int NOT NULL,
  PRIMARY KEY (`white_list_id`),
  KEY `fk1_white_list` (`exam_id`),
  KEY `fk2_white_list` (`affiliation_id`),
  CONSTRAINT `fk1_white_list` FOREIGN KEY (`exam_id`) REFERENCES `exam` (`exam_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk2_white_list` FOREIGN KEY (`affiliation_id`) REFERENCES `affiliation_account` (`affiliation_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of white_list
-- ----------------------------
INSERT INTO `white_list` VALUES ('1', '1', '1');
INSERT INTO `white_list` VALUES ('2', '2', '1');
