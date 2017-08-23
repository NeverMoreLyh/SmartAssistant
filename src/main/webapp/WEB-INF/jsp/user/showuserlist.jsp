<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 
Template Name: Metronic - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.0
Version: 1.5.2
Author: KeenThemes
Website: http://www.keenthemes.com/
Purchase: http://themeforest.net/item/metronic-responsive-admin-dashboard-template/4021469?ref=keenthemes
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
   <meta charset="utf-8" />
   <title>长亮科技 发布平台</title>
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta content="width=device-width, initial-scale=1.0" name="viewport" />
   <meta content="" name="description" />
   <meta content="" name="author" />
   <meta name="MobileOptimized" content="320">
   <!-- BEGIN GLOBAL MANDATORY STYLES -->          
   <link href="../assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
   <link href="../assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
   <link href="../assets/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css"/>
   <!-- END GLOBAL MANDATORY STYLES -->
   <!-- BEGIN PAGE LEVEL STYLES -->
   <link rel="stylesheet" type="text/css" href="../assets/plugins/select2/select2_metro.css" />
   <link rel="stylesheet" href="../assets/plugins/data-tables/DT_bootstrap.css" />
   <!-- END PAGE LEVEL STYLES -->
   <!-- BEGIN THEME STYLES --> 
   <link href="../assets/css/style-metronic.css" rel="stylesheet" type="text/css"/>
   <link href="../assets/css/style.css" rel="stylesheet" type="text/css"/>
   <link href="../assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
   <link href="../assets/css/plugins.css" rel="stylesheet" type="text/css"/>
   <link href="../assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
   <link href="../assets/css/custom.css" rel="stylesheet" type="text/css"/>
   <!-- END THEME STYLES -->
   <link rel="shortcut icon" href="favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">
   <!-- BEGIN HEADER -->   
      <jsp:include page="../main/header.jsp" />
   <!-- END HEADER -->
   <div class="clearfix"></div>
   <!-- BEGIN CONTAINER -->
   <div class="page-container">
      <!-- BEGIN SIDEBAR -->
       	  <jsp:include page="../main/sidebar.jsp" />
      <!-- END SIDEBAR -->
      <!-- BEGIN PAGE -->
      <div class="page-content">
         <!-- BEGIN PAGE HEADER-->
         <div class="row">
            <div class="col-md-12">
               <ul class="page-breadcrumb breadcrumb">
                  <li>
                     <i class="icon-home"></i>
                     <a href="index.html">首页</a> 
                     <i class="icon-angle-right"></i>
                  </li>
                  <li>
                     <a href="#">权限管理</a>
                     <i class="icon-angle-right"></i>
                  </li>
                  <li><a href="#">用户管理</a></li>
               </ul>
            </div>
         </div>
         
         <div class="row form-group">
         	
           <div class="col-md-1">
            	<a href="user_wizard.html" class="btn btn-sm green"><i class="icon-plus m-icon-white"></i>创建用户</a>
           </div>
           
           <div class="col-md-1 pull-right">
            	<button class="btn btn-sm blue btn-block"><i class="icon-search m-icon-white"></i>查询</button>
           </div>
           
           <div class="col-md-2 pull-right">
             <div class="input-icon right">
                <i class="icon-info-sign tooltips" data-original-title="请输入用户ID或者用户名" data-container="body"></i>
                <input type="text" id="namecon" class="form-control input-sm"></input>
             </div>
           </div>
           
           <div class="col-md-2 pull-right">
           	<select  class="form-control input-sm">
                <option>全部</option>
                <option>未锁定</option>
                <option>已锁定</option>
             </select>
           </div>
           
        </div>
         
         <div class="row">
            <div class="col-md-12">
               <div class="portlet box blue">
                  <div class="portlet-title">
                     <div class="caption"><i class="icon-user"></i>用户信息列表</div>
                     <div class="tools">
                        <a href="javascript:;" class="reload"></a>
                     </div>
                  </div>
                  <div class="portlet-body">
                     <table class="table table-striped table-bordered table-hover" id="sample_editable_1">
                        <thead>
                           <tr>
                              <th>用户名</th>
                              <th>ID</th>
                              <th>角色</th>
                              <th>锁定状态</th>
                              <th>创建时间</th>
                               <th>操作</th>
                           </tr>
                        </thead>
                        <tbody>
                           <tr >
                              <td>sunline</td>
                              <td>0001</td>
                              <td><a href="#">user</a></td>
                              <td>未锁定</td>
                               <td>2016-03-25 16:33:24</td>
                              <td>
                              	<a href="#" class="btn btn-sm purple"><i class="icon-lock"></i>&nbsp;锁定</a>
				                <li class="btn-group">
				                     <button type="button" class="btn btn-sm blue dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true">
				                     <span>更多</span> <i class="icon-angle-down"></i>
				                     </button>
				                     <ul class="dropdown-menu pull-right" role="menu">
				                        <li><a href="#"><i class="icon-edit"></i>修改</a></li>
				                        <li><a href="#"><i class="icon-trash"></i>删除</a></li>
				                        <li><a href="#"><i class="icon-repeat"></i>重置密码</a></li>
				                     </ul>
				                 </li>
                              </td>
                           </tr>
                           <tr >
                              <td>admin</td>
                              <td>0002</td>
                              <td><a href="#">manager</a>;<a href="">user</a></td>
                              <td>未锁定</td>
                               <td>2016-03-25 16:33:24</td>
                              <td>
                              	<a href="#" class="btn btn-sm purple"><i class="icon-lock"></i>&nbsp;锁定</a>
				                <li class="btn-group">
				                     <button type="button" class="btn btn-sm blue dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true">
				                     <span>更多</span> <i class="icon-angle-down"></i>
				                     </button>
				                     <ul class="dropdown-menu pull-right" role="menu">
				                        <li><a href="#"><i class="icon-edit"></i>修改</a></li>
				                        <li><a href="#"><i class="icon-trash"></i>删除</a></li>
				                        <li><a href="#"><i class="icon-repeat"></i>重置密码</a></li>
				                     </ul>
				                 </li>
                              </td>
                           </tr>
                           <tr >
                              <td>reader</td>
                              <td>0003</td>
                              <td><a href="#">user</a></td>
                              <td>未锁定</td>
                               <td>2016-03-25 16:33:24</td>
                              <td>
                              	<a href="#" class="btn btn-sm purple"><i class="icon-lock"></i>&nbsp;锁定</a>
				                <li class="btn-group">
				                     <button type="button" class="btn btn-sm blue dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true">
				                     <span>更多</span> <i class="icon-angle-down"></i>
				                     </button>
				                     <ul class="dropdown-menu pull-right" role="menu">
				                        <li><a href="#"><i class="icon-edit"></i>修改</a></li>
				                        <li><a href="#"><i class="icon-trash"></i>删除</a></li>
				                        <li><a href="#"><i class="icon-repeat"></i>重置密码</a></li>
				                     </ul>
				                 </li>
                              </td>
                           </tr>
                           <tr >
                              <td>testliu</td>
                              <td>0004</td>
                              <td><a href="#">user</a></td>
                              <td>未锁定</td>
                              <td>2016-03-25 16:33:24</td>
                              <td>
                              	<a href="#" class="btn btn-sm purple"><i class="icon-lock"></i>&nbsp;锁定</a>
				                <li class="btn-group">
				                     <button type="button" class="btn btn-sm blue dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true">
				                     <span>更多</span> <i class="icon-angle-down"></i>
				                     </button>
				                     <ul class="dropdown-menu pull-right" role="menu">
				                        <li><a href="#"><i class="icon-edit"></i>修改</a></li>
				                        <li><a href="#"><i class="icon-trash"></i>删除</a></li>
				                        <li><a href="#"><i class="icon-repeat"></i>重置密码</a></li>
				                     </ul>
				                 </li>
                              </td>
                           </tr>
                        </tbody>
                     </table>
                  </div>
               </div>
            </div>
         </div>
      </div>
   </div>
   <!-- END CONTAINER -->
   <!-- BEGIN FOOTER -->
   <div class="footer">
      <div class="footer-inner">
         
      </div>
      <div class="footer-tools">
         <span class="go-top">
         <i class="icon-angle-up"></i>
         </span>
      </div>
   </div>
   <!-- END FOOTER -->
   <!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
   <!-- BEGIN CORE PLUGINS -->   
   <!--[if lt IE 9]>
   <script src="../assets/plugins/respond.min.js"></script>
   <script src="../assets/plugins/excanvas.min.js"></script> 
   <![endif]-->   
   <script src="../assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>
   <script src="../assets/plugins/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>    
   <script src="../assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
   <script src="../assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" type="text/javascript" ></script>
   <script src="../assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
   <script src="../assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>  
   <script src="../assets/plugins/jquery.cookie.min.js" type="text/javascript"></script>
   <script src="../assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript" ></script>
   <!-- END CORE PLUGINS -->
   <!-- BEGIN PAGE LEVEL PLUGINS -->
   <script type="text/javascript" src="../assets/plugins/select2/select2.min.js"></script>
   <script type="text/javascript" src="../assets/plugins/data-tables/jquery.dataTables.min.js"></script>
   <script type="text/javascript" src="../assets/plugins/data-tables/DT_bootstrap.js"></script>
   <!-- END PAGE LEVEL PLUGINS -->
   <!-- BEGIN PAGE LEVEL SCRIPTS -->
   <script src="../assets/scripts/app.js"></script>
   <script src="../assets/scripts/table-advanced.js"></script>     
   <script>
      jQuery(document).ready(function() {       
         App.init();
         TableAdvanced.init();
      });
   </script>
</body>
<!-- END BODY -->
</html>