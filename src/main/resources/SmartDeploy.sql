--系统序号表
drop table t_sequence;
create table t_sequence(
	seqId varchar(50) not null primary key,
	seqName varchar(50),
	min int not null ,
	max int not null ,
	now int not null ,
	step int not null ,
	version int not null ,
	isloop char(1) 
);

--用户表
drop table t_user
create table t_user(
	userId varchar(50),
	userName varchar(50),
	userPasswd varchar(50),
	createTime varchar(50),
	userStatus varchar(50),
);
--菜单表
drop table t_menu;
create table t_menu(
	menuId varchar(20) primary key,
	menuName varchar(50),
	menuDesc varchar(100),
	parentNode varchar(20),
	menutype varchar(20),
	xuhao varchar(2),
	menulink varchar(200),
	menuclass varchar(50),
	status varchar(1)
);
--管理系统表
drop table t_system;
create table t_system
(
  id VARCHAR(20) not null primary key,
  name VARCHAR(200) not null,
  remark VARCHAR(400)
);
--数据中心定义表
drop table t_dataCenter;
create table t_dataCenter
(
  id VARCHAR(20) not null primary key,
  name VARCHAR(200) not null,
  remark VARCHAR(400),
  sysid VARCHAR(20)
);
--集群定义表
drop table t_cluster;
create table t_cluster
(
  id VARCHAR(20) not null primary key,
  name VARCHAR(200) not null,
  remark VARCHAR(400),
  sysid VARCHAR(20)
);
--运行环境定义表
drop table t_runEnv;
create table t_runEnv
(
  id VARCHAR(20) not null primary key,
  name VARCHAR(200) not null,
  remark VARCHAR(400),
  sysid VARCHAR(20)
);
--业务系统定义表
drop table t_bizSystem;
create table t_bizSystem
(
  id VARCHAR(20) not null primary key,
  name VARCHAR(200) not null,
  remark VARCHAR(400),
  sysid VARCHAR(20)
);
--服务器定义
drop table t_machine;
create table t_machine
(
  id VARCHAR(20) not null primary key,
  name VARCHAR(200) not null,
  remark VARCHAR(400),
  mos VARCHAR(400),
  mhost VARCHAR(400),
  mip VARCHAR(400),
  mpc VARCHAR(400),
  mlc VARCHAR(400),
  mmem VARCHAR(400),
  mdisk VARCHAR(400),
  mpasswd VARCHAR(400),
  mvirtual char(1),
  sysid VARCHAR(20)
);


