/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50622
 Source Host           : localhost:3306
 Source Schema         : mybatis-plus-demo

 Target Server Type    : MySQL
 Target Server Version : 50622
 File Encoding         : 65001

 Date: 07/09/2022 21:34:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_command_center
-- ----------------------------
DROP TABLE IF EXISTS `t_command_center`;
CREATE TABLE `t_command_center`  (
  `id` int(11) NOT NULL COMMENT '主键',
  `user_type_code` int(11) NULL DEFAULT NULL COMMENT '用户类型code',
  `type_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型名称',
  `data` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT 'json数据',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_command_center
-- ----------------------------
INSERT INTO `t_command_center` VALUES (1, 1, '1', '{\r\n  \"tradeOverview\": {\r\n    \"totalTradeAmount\": 6.7,\r\n    \"monthTradeMoney\": 156.39\r\n  },\r\n  \"tradeAmountProportion\": [\r\n    {\r\n      \"timeHorizon\": \"本月\",\r\n      \"productTrade\": \"48.6%\",\r\n      \"slaughterTrade\": \"13.67%\",\r\n      \"liveAnimalTrade\": \"53.01%\",\r\n      \"otherTrade\": \"4.29%\"\r\n    },\r\n    {\r\n      \"timeHorizon\": \"本年度\",\r\n      \"productTrade\": \"48.6%\",\r\n      \"slaughterTrade\": \"13.67%\",\r\n      \"liveAnimalTrade\": \"53.01%\",\r\n      \"otherTrade\": \"4.29%\"\r\n    },\r\n    {\r\n      \"timeHorizon\": \"全部\",\r\n      \"productTrade\": \"48.6%\",\r\n      \"slaughterTrade\": \"13.67%\",\r\n      \"liveAnimalTrade\": \"53.01%\",\r\n      \"otherTrade\": \"4.29%\"\r\n    }\r\n  ],\r\n  \"tradeTrend\": [\r\n    {\r\n      \"productTrade\": \"商品服务交易\",\r\n      \"2022-04\": 500,\r\n      \"2022-05\": 2000,\r\n      \"2022-06\": 4000,\r\n      \"2022-07\": 1500,\r\n      \"2022-08\": 900,\r\n      \"2022-09\": 2300\r\n    },\r\n    {\r\n      \"liveAnimalTrade\": \"活畜交易\",\r\n      \"2022-04\": 500,\r\n      \"2022-05\": 2000,\r\n      \"2022-06\": 4000,\r\n      \"2022-07\": 1500,\r\n      \"2022-08\": 900,\r\n      \"2022-09\": 2300\r\n    },\r\n    {\r\n      \"slaughterTrade\": \"屠宰交易\",\r\n      \"2022-04\": 500,\r\n      \"2022-05\": 2000,\r\n      \"2022-06\": 4000,\r\n      \"2022-07\": 1500,\r\n      \"2022-08\": 900,\r\n      \"2022-09\": 2300\r\n    }\r\n  ],\r\n  \"illnessOverview\": {\r\n    \"illAnimalQuantity\": 1024,\r\n    \"notIllAnimalQuantity\": 14502,\r\n    \"yingMianDensity\": \"80.23%\"\r\n  },\r\n  \"yearLiveAnimalDistribution\": {\r\n    \"2022-01\": 200,\r\n    \"2022-03\": 350,\r\n    \"2022-05\": 1800,\r\n    \"2022-08\": 850,\r\n    \"2022-10\": 1300,\r\n    \"2022-12\": 450\r\n  },\r\n  \"quantityDistribution\": {\r\n    \"cowSupermarket\": 2,\r\n    \"cooperativeBank\": 60,\r\n    \"slaughterProcessEnterprise\": 5,\r\n    \"insuranceCompany\": 5,\r\n    \"areaPartner\": 5,\r\n    \"serviceFarmer\": 25580,\r\n    \"productionDataProvider\": 5,\r\n    \"farmTechnologyCrew\": 530\r\n  },\r\n  \"liveAnimalDistribution\": {\r\n    \"aLaShanMeng\": 540,\r\n    \"baYanNaoErShi\": 540,\r\n    \"wuHaiShi\": 0,\r\n    \"eErDuoSiShi\": 150,\r\n    \"baoTouShi\": 0,\r\n    \"huHeHaoTeShi\": 0,\r\n    \"wuLanChaBuShi\": 540,\r\n    \"xiLinGuoLeMeng\": 540,\r\n    \"chiFeng\": 150,\r\n    \"huLunBeiErShi\": 540,\r\n    \"xingAnMeng\": 0,\r\n    \"tongLiaoShi\": 0\r\n  },\r\n  \"financialServiceOverview\": [\r\n    {\r\n      \"state\": \"进行中\",\r\n      \"superviseCount\": 145,\r\n      \"superviseAmount\": 5.24\r\n    },\r\n    {\r\n      \"state\": \"全部\",\r\n      \"superviseCount\": 145,\r\n      \"superviseAmount\": 5.24\r\n    }\r\n  ],\r\n  \"superviseAmountDistribution\": {\r\n    \"liveRegulation\": 25,\r\n    \"warehouseBillRegulation\": 21,\r\n    \"fundFlowRegulation\": 122,\r\n    \"noneWarehouseBillRegulation\": 12\r\n  },\r\n  \"regulationGrowthTrend\": {\r\n    \"22-04\": 250,\r\n    \"22-05\": 270,\r\n    \"22-06\": 1800,\r\n    \"22-07\": 575,\r\n    \"22-08\": 1250,\r\n    \"22-09\": 400\r\n  },\r\n  \"breakOverview\": {\r\n    \"currentLiveAnimal\": 14502,\r\n    \"currentBreedingStockCow\": 1450\r\n  },\r\n  \"yearLiveAnimalBreedNorm\": {\r\n    \"joinBreedProp\": \"80.23%\",\r\n    \"pregnancyProp\": \"80.23%\",\r\n    \"abortion\": \"80.23%\",\r\n    \"breedProp\": \"80.23%\",\r\n    \"survivingRate\": \"80.23%\",\r\n    \"avgChildSpace\": \"80.23%\"\r\n  }\r\n}\r\n');

SET FOREIGN_KEY_CHECKS = 1;
