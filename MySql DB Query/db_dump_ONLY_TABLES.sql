-- --------------------------------------------------------
-- -----  OpenMRM DB DUMP  --------------------------
-- --------------------------------------------------------

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `openmrmdb`
--
CREATE DATABASE `openmrmdb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `openmrmdb`;

-- --------------------------------------------------------

CREATE TABLE PharmacyTrans
(
orderNo varchar(50),
enterBy varchar(50),
issuedate datetime,
custName varchar(50),
doctName varchar(50), 
item varchar(50),
qty varchar(50),  
rate varchar(50), 
amount varchar(50),
PRIMARY KEY (orderNo)
);

CREATE TABLE Channeling
(
regId varchar(50),
enterBy varchar(50),
issuedate datetime,
doctName varchar(50), 
specialty varchar(50), 
channelData varchar(50), 
channelTime varchar(50), 
patientName varchar(50),
tpno varchar(50),
guardian varchar(50),
address varchar(50),
PRIMARY KEY (regId)
);

CREATE TABLE OPDReg
(
regId varchar(50),
enterBy varchar(50),
issuedate datetime,
patientName varchar(50),
guardian varchar(50),
address varchar(50),
tpno varchar(50),
doctName varchar(50), 
PRIMARY KEY (regId)
);

CREATE TABLE Drugs
(
drugId varchar(50),
drug varchar(50),
unit varchar(50),  
rate varchar(50), 
lastChanged varchar(50),
PRIMARY KEY (drugId)
);

CREATE TABLE Doctors
(
doctorId varchar(50),
doctor varchar(50),
specialty varchar(50),  
fees varchar(50), 
tpno varchar(50),
PRIMARY KEY (doctorId)
);

CREATE TABLE Patients
(
patientID varchar(50),
patient varchar(50),
notes varchar(50),
guardian varchar(50), 
address varchar(50),  
tpno varchar(50),
PRIMARY KEY (patientID)
);

create table Login
(
strUser varchar(20) primary key,
strPass varchar(20)
);

insert into Login values ('user', 'sa');



