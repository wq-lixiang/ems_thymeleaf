
create database ems_thymeleaf

CREATE TABLE t_user(
	id VARCHAR(40) PRIMARY KEY,
	username VARCHAR(40),
	realname VARCHAR(40),
	PASSWORD VARCHAR(40),
	sex VARCHAR(8)
);

CREATE TABLE t_emp(
	id VARCHAR(40) PRIMARY KEY,
	NAME VARCHAR(60),
	slary DOUBLE(7,2),
	age INT(3),
	bir DATE
);