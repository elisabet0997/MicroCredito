-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: microcredito
-- ------------------------------------------------------
-- Server version	5.7.15-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `id_menu` int(11) NOT NULL AUTO_INCREMENT,
  `id_padre` int(11) DEFAULT NULL,
  `menu` varchar(100) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `url` varchar(200) NOT NULL,
  `estatus` varchar(1) NOT NULL,
  PRIMARY KEY (`id_menu`),
  UNIQUE KEY `UQ_menu_id_menu` (`id_menu`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (8,123456,'menu1','Este menu es el que va a utilizar un usuario comun','No hay url','A'),(9,123456,'menu1','Este menu es el que va a utilizar un usuario comun','No hay url','A'),(10,123456,'menu1','Este menu es el que va a utilizar un usuario comun','No hay url','A');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfil`
--

DROP TABLE IF EXISTS `perfil`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `perfil` (
  `id_perfil` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `estatus` varchar(1) NOT NULL,
  PRIMARY KEY (`id_perfil`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfil`
--

LOCK TABLES `perfil` WRITE;
/*!40000 ALTER TABLE `perfil` DISABLE KEYS */;
INSERT INTO `perfil` VALUES (0,'perfil1','Este es el perfil de un usuario comun','A'),(134267,'perfil1','Este es el perfil de un usuario comun','A');
/*!40000 ALTER TABLE `perfil` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfilmenu`
--

DROP TABLE IF EXISTS `perfilmenu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `perfilmenu` (
  `id_perfil` int(11) NOT NULL,
  `id_menu` int(100) NOT NULL,
  `orden` int(100) NOT NULL,
  `estatus` varchar(1) NOT NULL,
  KEY `id_perfil` (`id_perfil`),
  KEY `id_menu` (`id_menu`),
  CONSTRAINT `FK_perfil_menu_menu` FOREIGN KEY (`id_menu`) REFERENCES `menu` (`id_menu`),
  CONSTRAINT `FK_perfil_menu_perfil` FOREIGN KEY (`id_perfil`) REFERENCES `perfil` (`id_perfil`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfilmenu`
--

LOCK TABLES `perfilmenu` WRITE;
/*!40000 ALTER TABLE `perfilmenu` DISABLE KEYS */;
INSERT INTO `perfilmenu` VALUES (134267,8,1,'A'),(134267,9,1,'A'),(134267,10,1,'A');
/*!40000 ALTER TABLE `perfilmenu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personas` (
  `persona` varchar(12) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `apellido_pat` varchar(80) NOT NULL,
  `apellido_mat` varchar(80) NOT NULL,
  `sexo` varchar(1) NOT NULL,
  `rfc` varchar(15) DEFAULT NULL,
  `curp` varchar(20) DEFAULT NULL,
  `fecha_nacimiento` date NOT NULL,
  `fecha_alta` datetime NOT NULL,
  `fecha_ult_mod` datetime NOT NULL,
  `estatus` varchar(1) NOT NULL,
  PRIMARY KEY (`persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` VALUES ('persona','Elisabet','Vasquez','Martinez','F','ER4567','VAME970109DFSRL06','1997-01-09','2016-10-05 16:01:48','2016-10-05 16:01:48','A');
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `usuario` varchar(20) NOT NULL,
  `id_perfil` int(11) NOT NULL,
  `persona` varchar(12) NOT NULL,
  `contrasenia` varchar(100) NOT NULL,
  `cambio_contrasenia` varchar(1) NOT NULL,
  `fecha_alta` datetime NOT NULL,
  `fecha_ult_mod` datetime NOT NULL,
  `estatus` varchar(1) NOT NULL,
  PRIMARY KEY (`usuario`),
  KEY `id_perfil` (`id_perfil`),
  KEY `persona` (`persona`),
  CONSTRAINT `FK_usuarios_perfil` FOREIGN KEY (`id_perfil`) REFERENCES `perfil` (`id_perfil`),
  CONSTRAINT `FK_usuarios_personas` FOREIGN KEY (`persona`) REFERENCES `personas` (`persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('elisabet0997',134267,'persona','123456','N','2016-10-05 16:01:58','2016-10-05 16:01:58','A');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-07 10:01:56
