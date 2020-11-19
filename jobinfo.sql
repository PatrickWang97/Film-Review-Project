/*
 Navicat Premium Data Transfer

 Source Server         : master.lab.hwadee.com
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : 192.168.182.11:3306
 Source Schema         : jobinfo

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 30/08/2019 20:54:56
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for SkillAnalysis
-- ----------------------------
DROP TABLE IF EXISTS `SkillAnalysis`;
CREATE TABLE `SkillAnalysis`  (
  `name` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL,
  `count` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of SkillAnalysis
-- ----------------------------
INSERT INTO `SkillAnalysis` VALUES ('html', 3000);
INSERT INTO `SkillAnalysis` VALUES ('软件测试', 2000);
INSERT INTO `SkillAnalysis` VALUES ('设计模式', 2000);
INSERT INTO `SkillAnalysis` VALUES ('操作系统', 2000);
INSERT INTO `SkillAnalysis` VALUES ('c/c++', 2000);
INSERT INTO `SkillAnalysis` VALUES ('ajax', 2000);
INSERT INTO `SkillAnalysis` VALUES ('ios', 2000);
INSERT INTO `SkillAnalysis` VALUES ('hbase', 2000);
INSERT INTO `SkillAnalysis` VALUES ('struts', 2000);
INSERT INTO `SkillAnalysis` VALUES ('软件建模', 2000);
INSERT INTO `SkillAnalysis` VALUES ('css', 2000);
INSERT INTO `SkillAnalysis` VALUES ('软件项目管理', 2000);
INSERT INTO `SkillAnalysis` VALUES ('redis', 2000);
INSERT INTO `SkillAnalysis` VALUES ('软件工程', 2000);
INSERT INTO `SkillAnalysis` VALUES ('软件质量保证', 2000);
INSERT INTO `SkillAnalysis` VALUES ('web2py', 2000);
INSERT INTO `SkillAnalysis` VALUES ('spring mvc', 2000);
INSERT INTO `SkillAnalysis` VALUES ('javascript', 2000);
INSERT INTO `SkillAnalysis` VALUES ('python', 2000);
INSERT INTO `SkillAnalysis` VALUES ('android', 2000);
INSERT INTO `SkillAnalysis` VALUES ('html5', 1000);
INSERT INTO `SkillAnalysis` VALUES ('vb.net', 1000);
INSERT INTO `SkillAnalysis` VALUES ('scala', 1000);
INSERT INTO `SkillAnalysis` VALUES ('beautiful soup', 1000);
INSERT INTO `SkillAnalysis` VALUES ('spark', 1000);
INSERT INTO `SkillAnalysis` VALUES ('laszlo', 1000);
INSERT INTO `SkillAnalysis` VALUES ('嵌入式', 1000);
INSERT INTO `SkillAnalysis` VALUES ('thymeleaf', 1000);
INSERT INTO `SkillAnalysis` VALUES ('torque 2d', 1000);
INSERT INTO `SkillAnalysis` VALUES ('db2', 1000);
INSERT INTO `SkillAnalysis` VALUES ('chainer', 1000);
INSERT INTO `SkillAnalysis` VALUES ('mapreduce', 1000);
INSERT INTO `SkillAnalysis` VALUES ('nervana neo', 1000);
INSERT INTO `SkillAnalysis` VALUES ('cocos2d', 1000);
INSERT INTO `SkillAnalysis` VALUES ('nosql', 1000);
INSERT INTO `SkillAnalysis` VALUES ('mongodb', 1000);
INSERT INTO `SkillAnalysis` VALUES ('servlet', 1000);
INSERT INTO `SkillAnalysis` VALUES ('linux', 1000);
INSERT INTO `SkillAnalysis` VALUES ('spark graphx', 1000);
INSERT INTO `SkillAnalysis` VALUES ('微机原理', 1000);
INSERT INTO `SkillAnalysis` VALUES ('Web服务器', 1000);
INSERT INTO `SkillAnalysis` VALUES ('pulsar', 1000);
INSERT INTO `SkillAnalysis` VALUES ('grab', 1000);
INSERT INTO `SkillAnalysis` VALUES ('tomcat', 1000);
INSERT INTO `SkillAnalysis` VALUES ('git', 1000);
INSERT INTO `SkillAnalysis` VALUES ('flare', 1000);
INSERT INTO `SkillAnalysis` VALUES ('less', 1000);
INSERT INTO `SkillAnalysis` VALUES ('matplotlib', 1000);
INSERT INTO `SkillAnalysis` VALUES ('hypertable', 1000);
INSERT INTO `SkillAnalysis` VALUES ('javase', 1000);
INSERT INTO `SkillAnalysis` VALUES ('zerorpc', 1000);
INSERT INTO `SkillAnalysis` VALUES ('iis', 1000);
INSERT INTO `SkillAnalysis` VALUES ('groovy', 1000);
INSERT INTO `SkillAnalysis` VALUES ('windows phone', 1000);
INSERT INTO `SkillAnalysis` VALUES ('selenium', 1000);
INSERT INTO `SkillAnalysis` VALUES ('c++', 1000);
INSERT INTO `SkillAnalysis` VALUES ('diesel', 1000);
INSERT INTO `SkillAnalysis` VALUES ('uml', 1000);
INSERT INTO `SkillAnalysis` VALUES ('tapestry', 1000);
INSERT INTO `SkillAnalysis` VALUES ('visio', 1000);
INSERT INTO `SkillAnalysis` VALUES ('couchbase ', 1000);
INSERT INTO `SkillAnalysis` VALUES ('spring boot', 1000);
INSERT INTO `SkillAnalysis` VALUES ('Jbuilder', 1000);
INSERT INTO `SkillAnalysis` VALUES ('webstorm', 1000);
INSERT INTO `SkillAnalysis` VALUES ('构建框架', 1000);
INSERT INTO `SkillAnalysis` VALUES ('ant', 1000);
INSERT INTO `SkillAnalysis` VALUES ('testng', 1000);
INSERT INTO `SkillAnalysis` VALUES ('komodo edit', 1000);
INSERT INTO `SkillAnalysis` VALUES ('vc++', 1000);
INSERT INTO `SkillAnalysis` VALUES ('pl/sql', 1000);
INSERT INTO `SkillAnalysis` VALUES ('sliverlight', 1000);
INSERT INTO `SkillAnalysis` VALUES ('deeplearning4j', 1000);
INSERT INTO `SkillAnalysis` VALUES ('gulp', 1000);
INSERT INTO `SkillAnalysis` VALUES ('pandas', 1000);
INSERT INTO `SkillAnalysis` VALUES ('hadoop', 1000);
INSERT INTO `SkillAnalysis` VALUES ('docker', 1000);
INSERT INTO `SkillAnalysis` VALUES ('java技术', 1000);
INSERT INTO `SkillAnalysis` VALUES ('甘特图', 1000);
INSERT INTO `SkillAnalysis` VALUES ('软件工程技术', 1000);
INSERT INTO `SkillAnalysis` VALUES ('dreamweaver', 1000);
INSERT INTO `SkillAnalysis` VALUES ('cntk', 1000);
INSERT INTO `SkillAnalysis` VALUES ('scikit-learn', 1000);
INSERT INTO `SkillAnalysis` VALUES ('robot', 1000);
INSERT INTO `SkillAnalysis` VALUES ('hdfs', 1000);
INSERT INTO `SkillAnalysis` VALUES ('数据结构', 1000);
INSERT INTO `SkillAnalysis` VALUES ('javaweb', 1000);
INSERT INTO `SkillAnalysis` VALUES ('版本管理', 1000);
INSERT INTO `SkillAnalysis` VALUES ('vmware', 1000);
INSERT INTO `SkillAnalysis` VALUES ('com+', 1000);
INSERT INTO `SkillAnalysis` VALUES ('activex', 1000);
INSERT INTO `SkillAnalysis` VALUES ('.net', 1000);
INSERT INTO `SkillAnalysis` VALUES ('webpy', 1000);
INSERT INTO `SkillAnalysis` VALUES ('pyscripter', 1000);
INSERT INTO `SkillAnalysis` VALUES ('junit', 1000);
INSERT INTO `SkillAnalysis` VALUES ('monkey', 1000);
INSERT INTO `SkillAnalysis` VALUES ('mfc', 1000);
INSERT INTO `SkillAnalysis` VALUES ('mybatis', 1000);
INSERT INTO `SkillAnalysis` VALUES ('前端技术', 1000);
INSERT INTO `SkillAnalysis` VALUES ('roma', 1000);
INSERT INTO `SkillAnalysis` VALUES ('winform', 1000);
INSERT INTO `SkillAnalysis` VALUES ('pytorch', 1000);
INSERT INTO `SkillAnalysis` VALUES ('cucumber', 1000);
INSERT INTO `SkillAnalysis` VALUES ('sqlserver', 1000);
INSERT INTO `SkillAnalysis` VALUES ('EJB', 1000);
INSERT INTO `SkillAnalysis` VALUES ('基础知识', 1000);
INSERT INTO `SkillAnalysis` VALUES ('apache', 1000);
INSERT INTO `SkillAnalysis` VALUES ('spark streaming', 1000);
INSERT INTO `SkillAnalysis` VALUES ('svn', 1000);
INSERT INTO `SkillAnalysis` VALUES ('bottle', 1000);
INSERT INTO `SkillAnalysis` VALUES ('ado.net', 1000);
INSERT INTO `SkillAnalysis` VALUES ('sparrow', 1000);
INSERT INTO `SkillAnalysis` VALUES ('mvc', 1000);
INSERT INTO `SkillAnalysis` VALUES ('scipy', 1000);
INSERT INTO `SkillAnalysis` VALUES ('爬虫技术', 1000);
INSERT INTO `SkillAnalysis` VALUES ('kafka', 1000);
INSERT INTO `SkillAnalysis` VALUES ('cola', 1000);
INSERT INTO `SkillAnalysis` VALUES ('ioinc', 1000);
INSERT INTO `SkillAnalysis` VALUES ('web框架', 1000);
INSERT INTO `SkillAnalysis` VALUES ('c语言', 1000);
INSERT INTO `SkillAnalysis` VALUES ('axure', 1000);
INSERT INTO `SkillAnalysis` VALUES ('hive', 1000);
INSERT INTO `SkillAnalysis` VALUES ('crawley', 1000);
INSERT INTO `SkillAnalysis` VALUES ('emacs', 1000);
INSERT INTO `SkillAnalysis` VALUES ('C#', 1000);
INSERT INTO `SkillAnalysis` VALUES ('sublime text', 1000);
INSERT INTO `SkillAnalysis` VALUES ('flask', 1000);
INSERT INTO `SkillAnalysis` VALUES ('soapUI', 1000);
INSERT INTO `SkillAnalysis` VALUES ('corona', 1000);
INSERT INTO `SkillAnalysis` VALUES ('django', 1000);
INSERT INTO `SkillAnalysis` VALUES ('bootstrap', 1000);
INSERT INTO `SkillAnalysis` VALUES ('oracle', 1000);
INSERT INTO `SkillAnalysis` VALUES ('sitemesh', 1000);
INSERT INTO `SkillAnalysis` VALUES ('hibernate', 1000);
INSERT INTO `SkillAnalysis` VALUES ('kartograph', 1000);
INSERT INTO `SkillAnalysis` VALUES ('tokyo tyrant', 1000);
INSERT INTO `SkillAnalysis` VALUES ('jfinal', 1000);
INSERT INTO `SkillAnalysis` VALUES ('appcan', 1000);
INSERT INTO `SkillAnalysis` VALUES ('spark sql', 1000);
INSERT INTO `SkillAnalysis` VALUES ('wing', 1000);
INSERT INTO `SkillAnalysis` VALUES ('windows', 1000);
INSERT INTO `SkillAnalysis` VALUES ('框架', 1000);
INSERT INTO `SkillAnalysis` VALUES ('lighttpd', 1000);
INSERT INTO `SkillAnalysis` VALUES ('spring', 1000);
INSERT INTO `SkillAnalysis` VALUES ('sql', 1000);
INSERT INTO `SkillAnalysis` VALUES ('unix', 1000);
INSERT INTO `SkillAnalysis` VALUES ('人工智能', 1000);
INSERT INTO `SkillAnalysis` VALUES ('手机游戏', 1000);
INSERT INTO `SkillAnalysis` VALUES ('dbunit', 1000);
INSERT INTO `SkillAnalysis` VALUES ('xcode', 1000);
INSERT INTO `SkillAnalysis` VALUES ('大数据技术', 1000);
INSERT INTO `SkillAnalysis` VALUES ('算法分析', 1000);
INSERT INTO `SkillAnalysis` VALUES ('theano', 1000);
INSERT INTO `SkillAnalysis` VALUES ('unity3D', 1000);
INSERT INTO `SkillAnalysis` VALUES ('vue', 1000);
INSERT INTO `SkillAnalysis` VALUES ('wpf', 1000);
INSERT INTO `SkillAnalysis` VALUES ('phonegap', 1000);
INSERT INTO `SkillAnalysis` VALUES ('rational rose', 1000);
INSERT INTO `SkillAnalysis` VALUES ('newspaper', 1000);
INSERT INTO `SkillAnalysis` VALUES ('云计算', 1000);
INSERT INTO `SkillAnalysis` VALUES ('IDE', 1000);
INSERT INTO `SkillAnalysis` VALUES ('informix', 1000);
INSERT INTO `SkillAnalysis` VALUES ('rest assured', 1000);
INSERT INTO `SkillAnalysis` VALUES ('windows server', 1000);
INSERT INTO `SkillAnalysis` VALUES ('linq', 1000);
INSERT INTO `SkillAnalysis` VALUES ('flex', 1000);
INSERT INTO `SkillAnalysis` VALUES ('jsp', 1000);
INSERT INTO `SkillAnalysis` VALUES ('falcon', 1000);
INSERT INTO `SkillAnalysis` VALUES ('pyspider', 1000);
INSERT INTO `SkillAnalysis` VALUES ('cubes', 1000);
INSERT INTO `SkillAnalysis` VALUES ('postgresql', 1000);
INSERT INTO `SkillAnalysis` VALUES ('tensorflow', 1000);
INSERT INTO `SkillAnalysis` VALUES ('计算机网络', 1000);
INSERT INTO `SkillAnalysis` VALUES ('计算机原理', 1000);
INSERT INTO `SkillAnalysis` VALUES ('r语言', 1000);
INSERT INTO `SkillAnalysis` VALUES ('vss', 1000);
INSERT INTO `SkillAnalysis` VALUES ('gradle', 1000);
INSERT INTO `SkillAnalysis` VALUES ('angular', 1000);
INSERT INTO `SkillAnalysis` VALUES ('urllib', 1000);
INSERT INTO `SkillAnalysis` VALUES ('jquery', 1000);
INSERT INTO `SkillAnalysis` VALUES ('python技术', 1000);
INSERT INTO `SkillAnalysis` VALUES ('数据库', 1000);
INSERT INTO `SkillAnalysis` VALUES ('buildbot', 1000);
INSERT INTO `SkillAnalysis` VALUES ('microsoft tfs', 1000);
INSERT INTO `SkillAnalysis` VALUES ('memcache', 1000);
INSERT INTO `SkillAnalysis` VALUES ('node.js', 1000);
INSERT INTO `SkillAnalysis` VALUES ('eclipse', 1000);
INSERT INTO `SkillAnalysis` VALUES ('pycharm', 1000);
INSERT INTO `SkillAnalysis` VALUES ('powerdesign', 1000);
INSERT INTO `SkillAnalysis` VALUES ('freemarker', 1000);
INSERT INTO `SkillAnalysis` VALUES ('maven', 1000);
INSERT INTO `SkillAnalysis` VALUES ('数据库工具', 1000);
INSERT INTO `SkillAnalysis` VALUES ('sdk', 1000);
INSERT INTO `SkillAnalysis` VALUES ('数据分析框架', 1000);
INSERT INTO `SkillAnalysis` VALUES ('移动应用开发', 1000);
INSERT INTO `SkillAnalysis` VALUES ('win32', 1000);
INSERT INTO `SkillAnalysis` VALUES ('mockito', 1000);
INSERT INTO `SkillAnalysis` VALUES ('caffe', 1000);
INSERT INTO `SkillAnalysis` VALUES ('spock', 1000);
INSERT INTO `SkillAnalysis` VALUES ('gcc', 1000);
INSERT INTO `SkillAnalysis` VALUES ('titanium', 1000);
INSERT INTO `SkillAnalysis` VALUES ('vim', 1000);
INSERT INTO `SkillAnalysis` VALUES ('数据库管理', 1000);
INSERT INTO `SkillAnalysis` VALUES ('npm', 1000);
INSERT INTO `SkillAnalysis` VALUES ('idea', 1000);
INSERT INTO `SkillAnalysis` VALUES ('dpark', 1000);
INSERT INTO `SkillAnalysis` VALUES ('mysql', 1000);
INSERT INTO `SkillAnalysis` VALUES ('asp.net', 1000);
INSERT INTO `SkillAnalysis` VALUES ('numpy', 1000);
INSERT INTO `SkillAnalysis` VALUES ('access', 1000);
INSERT INTO `SkillAnalysis` VALUES ('bower', 1000);
INSERT INTO `SkillAnalysis` VALUES ('spark mllib', 1000);
INSERT INTO `SkillAnalysis` VALUES ('portia', 1000);
INSERT INTO `SkillAnalysis` VALUES ('jedis', 1000);
INSERT INTO `SkillAnalysis` VALUES ('websphere', 1000);
INSERT INTO `SkillAnalysis` VALUES ('jdbc', 1000);
INSERT INTO `SkillAnalysis` VALUES ('scrapy', 1000);
INSERT INTO `SkillAnalysis` VALUES ('velocity', 1000);
INSERT INTO `SkillAnalysis` VALUES ('jmeter', 1000);

-- ----------------------------
-- Table structure for jobtrend
-- ----------------------------
DROP TABLE IF EXISTS `jobtrend`;
CREATE TABLE `jobtrend`  (
  `jobtime` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL,
  `count` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jobtrend
-- ----------------------------
INSERT INTO `jobtrend` VALUES ('2019.3.4', 750);
INSERT INTO `jobtrend` VALUES ('2019.3.7', 601);
INSERT INTO `jobtrend` VALUES ('2019.3.6', 510);
INSERT INTO `jobtrend` VALUES ('2019.3.2', 450);
INSERT INTO `jobtrend` VALUES ('2019.3.1', 302);
INSERT INTO `jobtrend` VALUES ('2019.3.5', 240);
INSERT INTO `jobtrend` VALUES ('2019.3.3', 150);

-- ----------------------------
-- Table structure for salary
-- ----------------------------
DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary`  (
  `salary` text CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL,
  `count` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of salary
-- ----------------------------
INSERT INTO `salary` VALUES ('>6000', 1249);
INSERT INTO `salary` VALUES ('3000-4000', 575);
INSERT INTO `salary` VALUES ('4000-5000', 561);
INSERT INTO `salary` VALUES ('5000-6000', 339);
INSERT INTO `salary` VALUES ('<3000', 279);

SET FOREIGN_KEY_CHECKS = 1;
