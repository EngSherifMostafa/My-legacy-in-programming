-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 24, 2018 at 10:53 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `newstyleoffice`
--

-- --------------------------------------------------------

--
-- Table structure for table `billing`
--

CREATE TABLE `billing` (
  `ID` int(11) NOT NULL,
  `ClientName` varchar(50) COLLATE utf8_bin NOT NULL,
  `ClientPhone_1` varchar(11) COLLATE utf8_bin NOT NULL,
  `ClientPhone_2` varchar(11) COLLATE utf8_bin NOT NULL,
  `ClientAddress` varchar(100) COLLATE utf8_bin NOT NULL,
  `ClientEmail` varchar(100) COLLATE utf8_bin NOT NULL,
  `ClientCity` varchar(30) COLLATE utf8_bin NOT NULL,
  `MarketerName` varchar(30) COLLATE utf8_bin NOT NULL,
  `MarketerPhone_1` varchar(11) COLLATE utf8_bin NOT NULL,
  `MarketerPhone_2` varchar(11) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `ID` int(11) NOT NULL,
  `ClientName` varchar(50) COLLATE utf8_bin NOT NULL,
  `ClientPhone_1` varchar(11) COLLATE utf8_bin NOT NULL,
  `ClientPhone_2` varchar(11) COLLATE utf8_bin NOT NULL,
  `ClientAddress` varchar(100) COLLATE utf8_bin NOT NULL,
  `ClientEmail` varchar(100) COLLATE utf8_bin NOT NULL,
  `ClientCity` varchar(30) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `goods`
--

CREATE TABLE `goods` (
  `ID` int(11) NOT NULL,
  `GoodName` varchar(30) COLLATE utf8_bin NOT NULL,
  `GoodPrice` int(11) NOT NULL,
  `GoodQty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `marketer`
--

CREATE TABLE `marketer` (
  `ID` int(11) NOT NULL,
  `MarketerName` varchar(50) COLLATE utf8_bin NOT NULL,
  `MarketerPhone_1` varchar(11) COLLATE utf8_bin NOT NULL,
  `MarketerPhone_2` varchar(11) COLLATE utf8_bin NOT NULL,
  `MarketerAddress` varchar(100) COLLATE utf8_bin NOT NULL,
  `MarketerEmail` varchar(100) COLLATE utf8_bin NOT NULL,
  `MarketerCity` varchar(30) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `billing`
--
ALTER TABLE `billing`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`);

--
-- Indexes for table `goods`
--
ALTER TABLE `goods`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`);

--
-- Indexes for table `marketer`
--
ALTER TABLE `marketer`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `billing`
--
ALTER TABLE `billing`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `client`
--
ALTER TABLE `client`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `goods`
--
ALTER TABLE `goods`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `marketer`
--
ALTER TABLE `marketer`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
