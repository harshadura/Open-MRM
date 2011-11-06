-- phpMyAdmin SQL Dump
-- version 2.9.2
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: Nov 05, 2011 at 12:48 PM
-- Server version: 4.1.10
-- PHP Version: 5.2.1
-- 
-- Database: `openmrmdb`
-- 
CREATE DATABASE `openmrmdb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `openmrmdb`;

-- --------------------------------------------------------

-- 
-- Table structure for table `channeling`
-- 

CREATE TABLE `channeling` (
  `regId` varchar(50) NOT NULL default '',
  `enterBy` varchar(50) default NULL,
  `issuedate` datetime default NULL,
  `doctName` varchar(50) default NULL,
  `specialty` varchar(50) default NULL,
  `channelData` varchar(50) default NULL,
  `channelTime` varchar(50) default NULL,
  `patientName` varchar(50) default NULL,
  `tpno` varchar(50) default NULL,
  `guardian` varchar(50) default NULL,
  `address` varchar(50) default NULL,
  PRIMARY KEY  (`regId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `channeling`
-- 

INSERT INTO `channeling` (`regId`, `enterBy`, `issuedate`, `doctName`, `specialty`, `channelData`, `channelTime`, `patientName`, `tpno`, `guardian`, `address`) VALUES 
('CHAN-0', 'user', '2011-11-05 17:20:13', 'Nevil Perera', 'Kidney', 'Sat Nov 05 00:00:00 IST 2011', '13.00', 'Kushan Alwis', 'Saman Perera', '+94712217611', '45, Gamunu Mawatha, Colombo 10'),
('CHAN-1', 'user', '2011-11-05 17:16:56', 'Mohan Rajakaruna', 'Heart', 'Wed Nov 09 00:00:00 IST 2011', '14.00', 'Saman Perera', 'Gayan Fernando', '+94712213222', 'Colombo10'),
('CHAN-2', 'user', '2011-11-05 17:18:55', 'Mohan Rajakaruna', 'Heart', 'Sat Nov 05 00:00:00 IST 2011', '18.00', 'Kusal Perera', 'Amal Perera', '+94716384232', 'Colombo5');

-- --------------------------------------------------------

-- 
-- Table structure for table `doctors`
-- 

CREATE TABLE `doctors` (
  `doctorId` varchar(50) NOT NULL default '',
  `doctor` varchar(50) default NULL,
  `specialty` varchar(50) default NULL,
  `fees` varchar(50) default NULL,
  `tpno` varchar(50) default NULL,
  PRIMARY KEY  (`doctorId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `doctors`
-- 

INSERT INTO `doctors` (`doctorId`, `doctor`, `specialty`, `fees`, `tpno`) VALUES 
('DocID-0', 'Mohan Rajakaruna', 'Heart', '1500', '+94716643567'),
('DocID-1', 'Nevil Perera', 'Kidney', '1200', '+94712232657');

-- --------------------------------------------------------

-- 
-- Table structure for table `drugs`
-- 

CREATE TABLE `drugs` (
  `drugId` varchar(50) NOT NULL default '',
  `drug` varchar(50) default NULL,
  `unit` varchar(50) default NULL,
  `rate` varchar(50) default NULL,
  `lastChanged` varchar(50) default NULL,
  PRIMARY KEY  (`drugId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `drugs`
-- 

INSERT INTO `drugs` (`drugId`, `drug`, `unit`, `rate`, `lastChanged`) VALUES 
('DID-0', 'Paracetamol', '1', '2.50', '2011-11-05 | 16:53:35'),
('DID-1', 'Salbutamol', '1', '15', '2011-11-05 | 16:56:11'),
('DID-2', 'Piriton', '1', '3.50', '2011-11-05 | 16:56:52'),
('DID-3', 'Metphomin', '1', '8.60', '2011-11-05 | 16:56:52'),
('DID-4', 'Avomin', '1', '2.50', '2011-11-05 | 16:56:52');

-- --------------------------------------------------------

-- 
-- Table structure for table `login`
-- 

CREATE TABLE `login` (
  `strUser` varchar(20) NOT NULL default '',
  `strPass` varchar(20) default NULL,
  PRIMARY KEY  (`strUser`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `login`
-- 

INSERT INTO `login` (`strUser`, `strPass`) VALUES 
('root', 'sa'),
('user', 'sa');

-- --------------------------------------------------------

-- 
-- Table structure for table `opdreg`
-- 

CREATE TABLE `opdreg` (
  `regId` varchar(50) NOT NULL default '',
  `enterBy` varchar(50) default NULL,
  `issuedate` datetime default NULL,
  `patientName` varchar(50) default NULL,
  `guardian` varchar(50) default NULL,
  `address` varchar(50) default NULL,
  `tpno` varchar(50) default NULL,
  `doctName` varchar(50) default NULL,
  PRIMARY KEY  (`regId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `opdreg`
-- 

INSERT INTO `opdreg` (`regId`, `enterBy`, `issuedate`, `patientName`, `guardian`, `address`, `tpno`, `doctName`) VALUES 
('OPD-0', 'user', '2011-11-05 17:04:28', 'Amaya Fernando', 'Suraj Perera', '34, Samagi Mawatha, \nColombo 2', '+94712217611', 'Mohan Rajakaruna'),
('OPD-1', 'user', '2011-11-05 17:04:28', 'Kevin Fernando', 'Kevin Fernando', 'No 2, Colombo4', '+94773163748', 'Mohan Rajakaruna'),
('OPD-2', 'root', '2011-11-05 17:26:36', 'Saman Saranga', 'Gayan Silva', 'Colombo', '+94712217611', 'Mohan Rajakaruna'),
('OPD-3', 'root', '2011-11-05 17:26:36', 'Saman Saranga', 'Nuwan Gamage', 'Colombo', '+94712217611', 'Mohan Rajakaruna');

-- --------------------------------------------------------

-- 
-- Table structure for table `patients`
-- 

CREATE TABLE `patients` (
  `patientID` varchar(50) NOT NULL default '',
  `patient` varchar(50) default NULL,
  `notes` varchar(50) default NULL,
  `guardian` varchar(50) default NULL,
  `address` varchar(50) default NULL,
  `tpno` varchar(50) default NULL,
  PRIMARY KEY  (`patientID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `patients`
-- 

INSERT INTO `patients` (`patientID`, `patient`, `notes`, `guardian`, `address`, `tpno`) VALUES 
('PID-0', 'Saman Saranga', 'heart patient for 1 year', 'Nuwan Silva', '23, Araliya Maw, Colombo', '+94712217611');

-- --------------------------------------------------------

-- 
-- Table structure for table `pharmacytrans`
-- 

CREATE TABLE `pharmacytrans` (
  `orderNo` varchar(50) NOT NULL default '',
  `enterBy` varchar(50) default NULL,
  `issuedate` datetime default NULL,
  `custName` varchar(50) default NULL,
  `doctName` varchar(50) default NULL,
  `item` varchar(50) default NULL,
  `qty` varchar(50) default NULL,
  `rate` varchar(50) default NULL,
  `amount` varchar(50) default NULL,
  PRIMARY KEY  (`orderNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 
-- Dumping data for table `pharmacytrans`
-- 

INSERT INTO `pharmacytrans` (`orderNo`, `enterBy`, `issuedate`, `custName`, `doctName`, `item`, `qty`, `rate`, `amount`) VALUES 
('PHAO-0', 'user', '2011-11-05 16:57:36', 'Darshana Gamage', 'Mohan Rajakaruna', 'Piriton', '10', '3.50', '35.0');
