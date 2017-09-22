# SmartAssistant
功能列表
配置中心
-视图配置
-环境配置
--管理系统配置
--数据中心配置
--集群配置
--运行环境配置
--业务系统配置
--主机配置
--应用用户配置
--数据库信息配置
--数据库用户配置
--应用组配置
--应用环境配置
-运维信息配置
--运维流程管理  --发布步骤（多机器，跨节点）
--运维操作管理  --脚本配置
-权限配置
--用户管理
--用户组管理
--角色管理
--权限管理
-系统设置
拓扑结构
--服务器节点
运维中心
--服务器运维
--数据库运维
--应用运维
统计中心
--运维统计
--操作统计
--审计中心
报表
--运维统计报表
--操作统计报表
--用户审计报表

--服务器配置
-基本信息页
--服务器ID -mid
--服务器OS -mos
--服务器主机名 -mhost
--服务器IP -mip primary key
--服务器CPU物理C -mpc
--服务器CPU逻辑C -mlc
--服务器内存(MB) -mmem
--服务器磁盘(GB) -mdisk
--服务器root密码 (H) -mpasswd
--服务器用途 -mdesc
-详细信息
--服务器型号 -machine.type
--服务器SN号 -machine.SN
--服务器详细信息 -machine.details

--应用用户配置
-基本信息页
--应用用户ID -uid
--应用用户名 -uname
--应用用户所属组 -ugroup
--应用用户所属服务器 -umachine
--应用用户SHELL -ushell
--应用用户主目录 -uroot
--应用用户主目录权限 -upriv
--应用用户用途 -uuse
-详细信息页
--应用用户申请人 -uapplyuser
--应用用户申请人所属部门 -uapplydepart
--应用用户申请人联系方式 -uapplycontact
--应用用户申请时间 -uapplytime
--应用用户创建时间 -uapplycrtime
--应用用户创建者 -ucreater
--应用用户预关闭时间 -uforecotime
--应用用户关闭时间 -ucotime
--应用用户关闭者 -ucolser
--应用用户关联数据库用户 -urelationdbuser

--数据库配置
-基本信息
--数据库实例名
--数据库SID
--数据库实例所属服务器
--数据库系统版本
--数据库监听端口号
--数据库表空间
-详细信息
--数据库连接数
--数据库内存大小
--数据库SGA
--数据库PGA
--数据库目录
--数据库归档
--数据库闪回
--数据库审计
--数据库tns连接串

--数据库用户配置
-基本信息页
--数据库用户名
--数据库用户密码
--数据库用户所属数据库实例
--数据库用户权限
--数据库用户默认表空间
--数据库用户用途
-详细信息页

总体结构:
南京研发中心
-开发环境
--柜面系统
---关联服务器
---关联应用用户
---关联数据库用户
--核心系统
-测试环境


--管理系统配置 [研发中心|xx项目地]  t_system
--管理系统ID
--管理系统名称
--管理系统描述

--数据中心配置 [dc1|dc2] t_datacent
--数据中心ID
--数据中心名称
--数据中心描述

--集群配置 [cluster1|cluster2] t_cluster
--集群ID
--集群名称
--集群描述

--环境配置   [开发环境|测试环境] t_eunEnv
--环境ID
--环境名称
--环境描述

--子系统配置  [核心系统|柜面系统|...] t_subsys
--子系统ID
--子系统名称
--子系统描述

