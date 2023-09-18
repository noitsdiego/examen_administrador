-- MySQL dump 10.13  Distrib 8.1.0, for Win64 (x86_64)
--
-- Host: localhost    Database: examen_administrador
-- ------------------------------------------------------
-- Server version	8.1.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `examen_administrador`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `examen_administrador` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `examen_administrador`;

--
-- Table structure for table `answer`
--

DROP TABLE IF EXISTS `answer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `answer` (
  `nit_answer` varchar(255) NOT NULL,
  `answers` varbinary(255) DEFAULT NULL,
  `nit_student` varchar(255) DEFAULT NULL,
  `questions` varbinary(255) DEFAULT NULL,
  PRIMARY KEY (`nit_answer`),
  UNIQUE KEY `UK_qqlbcbxtvu3dllg0w4hvmpbca` (`nit_student`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `answer`
--

LOCK TABLES `answer` WRITE;
/*!40000 ALTER TABLE `answer` DISABLE KEYS */;
INSERT INTO `answer` VALUES ('0101970',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0Armeniat\01945t\01956t\0mexicot\0Colombiax','01970',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0sr\0java.lang.Integer‚†§\˜Åá8\0I\0valuexr\0java.lang.NumberÜ¨ïî\‡ã\0\0xp\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0\nx'),('011094973',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0Mexicot\0Jap√≥nt\0Asiat\0amazonast\0wwx','1094973',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0sr\0java.lang.Integer‚†§\˜Åá8\0I\0valuexr\0java.lang.NumberÜ¨ïî\‡ã\0\0xp\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0x'),('011094973279',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0Mexicot\0Jap√≥nt\0Asiat\0amazonast\0Colombiax','1094973279',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0sr\0java.lang.Integer‚†§\˜Åá8\0I\0valuexr\0java.lang.NumberÜ¨ïî\‡ã\0\0xp\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0	sq\0~\0\0\0\0\nx');
/*!40000 ALTER TABLE `answer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assignment`
--

DROP TABLE IF EXISTS `assignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assignment` (
  `nit_assignment` bigint NOT NULL AUTO_INCREMENT,
  `bogota_time` varchar(255) DEFAULT NULL,
  `local_time` varchar(255) DEFAULT NULL,
  `nit_student` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nit_assignment`),
  UNIQUE KEY `UK_rin14yh950f7ixi6ugvhhhjcd` (`nit_student`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assignment`
--

LOCK TABLES `assignment` WRITE;
/*!40000 ALTER TABLE `assignment` DISABLE KEYS */;
INSERT INTO `assignment` VALUES (1,'11:26:13 - viernes 22 de septiembre de 2023','11:26:13 - viernes 22 de septiembre de 2023','1094973279'),(2,'09:33:37 - s√°bado 25 de noviembre de 2023','09:33:37 - s√°bado 25 de noviembre de 2023','1094973'),(4,'08:31:07 - mi√©rcoles 27 de diciembre de 2023','08:31:07 - mi√©rcoles 27 de diciembre de 2023','01970');
/*!40000 ALTER TABLE `assignment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam`
--

DROP TABLE IF EXISTS `exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exam` (
  `nit_exam` bigint NOT NULL AUTO_INCREMENT,
  `execute` int DEFAULT NULL,
  `nit_assignment` int DEFAULT NULL,
  `nit_student` varchar(255) DEFAULT NULL,
  `questions` varbinary(255) DEFAULT NULL,
  PRIMARY KEY (`nit_exam`),
  UNIQUE KEY `UK_hc76cgfvam21na2pcbw91rjct` (`nit_student`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam`
--

LOCK TABLES `exam` WRITE;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
INSERT INTO `exam` VALUES (1,0,1,'1094973279',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0sr\0java.lang.Integer‚†§\˜Åá8\0I\0valuexr\0java.lang.NumberÜ¨ïî\‡ã\0\0xp\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0	sq\0~\0\0\0\0\nx'),(2,0,2,'1094973',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0sr\0java.lang.Integer‚†§\˜Åá8\0I\0valuexr\0java.lang.NumberÜ¨ïî\‡ã\0\0xp\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0x'),(3,0,4,'01970',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0sr\0java.lang.Integer‚†§\˜Åá8\0I\0valuexr\0java.lang.NumberÜ¨ïî\‡ã\0\0xp\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0sq\0~\0\0\0\0\nx');
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `grade`
--

DROP TABLE IF EXISTS `grade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grade` (
  `nit_grade` varchar(255) NOT NULL,
  `answer` varbinary(255) DEFAULT NULL,
  `nit_student` varchar(255) DEFAULT NULL,
  `total` int DEFAULT NULL,
  PRIMARY KEY (`nit_grade`),
  UNIQUE KEY `UK_4jxykcq8a94sj56fnwi7xtu5d` (`nit_student`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `grade`
--

LOCK TABLES `grade` WRITE;
/*!40000 ALTER TABLE `grade` DISABLE KEYS */;
INSERT INTO `grade` VALUES ('00101970',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0Armeniat\01945t\01956t\0mexicot\0Colombiax','01970',75),('0011094973',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0Mexicot\0Jap√≥nt\0Asiat\0amazonast\0wwx','1094973',25),('0011094973279',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0Mexicot\0Jap√≥nt\0Asiat\0amazonast\0Colombiax','1094973279',100);
/*!40000 ALTER TABLE `grade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question`
--

DROP TABLE IF EXISTS `question`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question` (
  `nit_question` bigint NOT NULL AUTO_INCREMENT,
  `header` varchar(255) DEFAULT NULL,
  `option_valid` varchar(255) DEFAULT NULL,
  `options` varbinary(255) DEFAULT NULL,
  PRIMARY KEY (`nit_question`),
  UNIQUE KEY `UK_c2hyixwe97x5y36odtk2d8j45` (`header`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'¬øCu√°ndo acab√≥ la II Guerra Mundial?','1945',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\01810t\01945t\02001t\01940x'),(2,'¬øCual es la capital del departamento de Quindio?','Armenia',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0	Cartagenat\0Bogotat\0Medellint\0Armeniax'),(3,'¬øEn qu√© pa√≠s se us√≥ la primera bomba at√≥mica?','Jap√≥n',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0Union Sovieticat\0Jap√≥nt\0Alemaniat\0Cubax'),(4,'¬øEn qu√© a√±o lleg√≥ Crist√≥bal Col√≥n a Am√©rica?','1492',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\01492t\01810t\01430t\01300x'),(5,'¬øEn qu√© pa√≠s naci√≥ Adolf Hitler?','Austria',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0Alemaniat\0URRSSt\0Austriat\0Poloniax'),(6,'¬øEn qu√© a√±o se coron√≥ a Isabel II?','1953',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\01951t\01956t\01953t\01962x'),(7,'¬øEn qu√© pa√≠s se origin√≥ la civilizaci√≥n azteca?','Mexico',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0	Guatemalat\0Mexicot\0Panamat\0Colombiax'),(8,'¬øCu√°l es el continente m√°s extenso del planeta?','Asia',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0Asiat\0Africat\0Europat\0Americax'),(9,'¬øCu√°l es el r√≠o m√°s largo del planeta?','Amazonas',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0Amazonast\0Nilot\0	Magdalenat\0Bravox'),(10,'¬øDe qu√© pa√≠s es originario el caf√©?','Etiopia',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0Colombiat\0Brasilt\0USAt\0Etiop√≠ax'),(11,'¬øA qu√© pa√≠s pertenece Groenlandia?','Dinamarca',_binary '¨\Ì\0sr\0java.util.ArrayListxÅ\“ô\«aù\0I\0sizexp\0\0\0w\0\0\0t\0	Dinamarcat\0Rusiat\0USAt\0Etiop√≠ax');
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `nit_student` varchar(255) NOT NULL,
  `zone_time` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `nit_exam` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`nit_student`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('01970','America/Bogota','2','Armenia','Gia','3'),('1094973','America/Bogota','24','Medellin','Diego Riveros','2'),('1094973279','America/Bogota','24','Medellin','Diego Riveros','1');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-18  2:26:18
