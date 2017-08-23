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
   
   <link rel="stylesheet" type="text/css" href="../assets/plugins/jquery-multi-select/css/multi-select.css" />
   <link rel="stylesheet" type="text/css" href="../assets/plugins/bootstrap-switch/static/stylesheets/bootstrap-switch-metro.css"/>
   
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
         <!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->               
      
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
                  <li><a href="#">角色管理</a></li>
               </ul>
               <!-- END PAGE TITLE & BREADCRUMB-->
            </div>
         </div>
         <!-- END PAGE HEADER-->
         
        <div class="row form-group">
         	<div class="col-md-1">
         		<a href="#myModal" role="button" class="btn btn-sm green" data-toggle="modal"><i class="icon-plus"></i>创建角色</a>
         	</div>
         	
         	<div class="col-md-1 pull-right">
            	<button class="btn btn-sm blue btn-block"><i class="icon-search m-icon-white"></i>查询</button>
            </div>
         	
         	<div class="col-md-2 pull-right">
             <div class="input-icon right">
                <i class="icon-info-sign tooltips" data-original-title="请输入角色名称或角色ID" data-container="body"></i>
                <input type="text" id="namecon" class="form-control input-sm"></input>
             </div>
            </div>
            
        </div>
         <div class="row">
         	 <div class="col-md-12">
                  <div class="portlet-body form">
                     <div id="myModal" class="modal fade" role="dialog" aria-hidden="true">
                        <div class="modal-dialog">
                           <div class="modal-content">
                              <div class="modal-header">
                                 <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                                 <h4 class="modal-title">创建角色</h4>
                              </div>
                              <div class="modal-body form">
                                 <form action="#" class="form-horizontal form-row-seperated">
                                    <div class="form-body form-bordered form-control-static">
                                      	<div class="form-group">
			                              <label class="control-label col-md-3">角色名称<span class="required">*</span></label>
			                              <div class="col-md-9">
			                                 <input type="text" class="form-control" maxlength="25" name="defaultconfig" id="maxlength_defaultconfig">
			                              </div>
                           				</div>
                                       <div class="form-group">
                                          <label class="control-label col-md-3">操作权限<span class="required">*</span></label>
                                          <div class="col-md-9">
                                             <div class="col-md-9">
				                                 <select multiple="multiple" class="multi-select" id="my_multi_select2" name="my_multi_select2[]">
				                                    <optgroup label="NFC EAST">
				                                       <option>Dallas Cowboys</option>
				                                       <option>New York Giants</option>
				                                       <option>Philadelphia Eagles</option>
				                                       <option>Washington Redskins</option>
				                                    </optgroup>
				                                    <optgroup label="NFC NORTH">
				                                       <option>add</option>
				                                       <option>delete</option>
				                                       <option>edit</option>
				                                       <option>view</option>
				                                    </optgroup>
				                                    <optgroup label="NFC SOUTH">
				                                       <option>Atlanta Falcons</option>
				                                       <option>Carolina Panthers</option>
				                                       <option>New Orleans Saints</option>
				                                       <option>Tampa Bay Buccaneers</option>
				                                    </optgroup>
				                                    <optgroup label="NFC WEST">
				                                       <option>Arizona Cardinals</option>
				                                       <option>St. Louis Rams</option>
				                                       <option>San Francisco 49ers</option>
				                                       <option>Seattle Seahawks</option>
				                                    </optgroup>
				                                 </select>
				                              </div>
                                          </div>
                                       </div>

                                    <div class="form-group">
		                              <label class="control-label col-md-3">描述</label>
		                              <div class="col-md-9">
		                                 <textarea id="maxlength_textarea" class="form-control" maxlength="225" rows="2" placeholder="请输入角色描述"></textarea>
		                              </div>
                          		    </div>
                                    </div>
                                 </form>
                              </div>
                              <div class="modal-footer">
                                 <button type="button" class="btn btn-sm btn-danger" data-dismiss="modal"><i class="icon-remove"></i>取消</button>
                                 <button type="button" class="btn btn-sm btn-success"><i class="icon-ok"></i>保存</button>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
            </div>
         </div>
         
       
         <!-- BEGIN PAGE CONTENT-->
         <div class="row">
            <div class="col-md-12">
               <div class="portlet box blue">
                  <div class="portlet-title">
                     <div class="caption"><i class="icon-shopping-cart"></i>角色列表</div>
                     <div class="tools">
                        <a href="javascript:;" class="reload"></a>
                        <a href="javascript:;" class="remove"></a>
                     </div>
                  </div>
                  <div class="portlet-body">
                     <table class="table table-striped table-bordered table-hover" id="sample_editable_1_new">
                        <thead>
                           <tr>
                              <th>角色名称</th>
                              <th>角色ID</th>
                              <th>角色描述</th>
                              <th>查看权限列表</th>
                              <th>操作</th>
                           </tr>
                        </thead>
                        <tbody>
                           <tr >
                              <td>manager</td>
                              <td>6</td>
                              <td>管理员角色,有所有的操作权限</td>
                              <td>
                              	<li class="btn-group">
				                     <button type="button" class="btn btn-sm blue dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true">
				                     <span>查看</span> <i class="icon-angle-down"></i>
				                     </button>
				                     <ul class="dropdown-menu pull-right" role="menu">
				                        <li><a href="#"><i class="icon-key"></i>权限列表</a></li>
				                        <li><a href="#"><i class="icon-user green"></i>用户</a></li>
				                     </ul>
				                 </li>
                              </td>
                              <td>
                              	<a href="#" class="btn btn-sm disabled purple"><i class="icon-edit"></i>&nbsp;修改</a>
								<a href="#" class="btn btn-sm btn-danger"><i class="icon-trash"></i>&nbsp;删除</a>
                              </td>
                           </tr>
                           <tr >
                              <td>user</td>
                              <td>5</td>
                              <td>用户角色,有执行发布任务,查看历史操作记录的使用权限,但无配置权限</td>
                              <td>
                              	<li class="btn-group">
				                     <button type="button" class="btn btn-sm blue dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true">
				                     <span>查看</span> <i class="icon-angle-down"></i>
				                     </button>
				                     <ul class="dropdown-menu pull-right" role="menu">
				                        <li><a href="#"><i class="icon-key"></i>权限列表</a></li>
				                        <li><a href="#"><i class="icon-user green"></i>用户</a></li>
				                     </ul>
				                 </li>
                              </td>
                              <td>
                              	<a href="#" class="btn btn-sm purple"><i class="icon-edit"></i>&nbsp;修改</a>
								<a href="#" class="btn btn-sm btn-danger"><i class="icon-trash"></i>&nbsp;删除</a>
                              </td>
                           </tr>
                        </tbody>
                     </table>
                  </div>
               </div>
            </div>
         </div>
         <!-- END PAGE CONTENT-->
      </div>
      <!-- END PAGE -->
   </div>
   <!-- END CONTAINER -->
   <!-- BEGIN FOOTER -->
   <div class="footer">
      <div class="footer-inner">
         2013 &copy; Metronic by keenthemes.
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
   <script type="text/javascript" src="../assets/plugins/fuelux/js/spinner.min.js"></script>
   <script type="text/javascript" src="../assets/plugins/bootstrap-timepicker/js/bootstrap-timepicker.js"></script>
   <script type="text/javascript" src="../assets/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js"></script>
   <script type="text/javascript" src="../assets/plugins/jquery-inputmask/jquery.inputmask.bundle.min.js"></script>   
   <script type="text/javascript" src="../assets/plugins/jquery.input-ip-address-control-1.0.min.js"></script>
   <script type="text/javascript" src="../assets/plugins/jquery-multi-select/js/jquery.multi-select.js"></script>
   <script type="text/javascript" src="../assets/plugins/jquery-multi-select/js/jquery.quicksearch.js"></script>   

   <script type="text/javascript" src="../assets/plugins/select2/select2.min.js"></script>
   <script type="text/javascript" src="../assets/plugins/data-tables/jquery.dataTables.min.js"></script>
   <script type="text/javascript" src="../assets/plugins/data-tables/DT_bootstrap.js"></script>
   <script src="../assets/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js" type="text/javascript" ></script>

   <!-- END PAGE LEVEL PLUGINS -->
   <!-- BEGIN PAGE LEVEL SCRIPTS -->
   <script src="../assets/scripts/app.js"></script>
   <script src="../assets/scripts/table-advanced.js"></script>
   <script src="../assets/scripts/form-components.js"></script>     

   <script>
      jQuery(document).ready(function() {       
         App.init();
         TableAdvanced.init();
         FormComponents.init();
      });
   </script>
</body>
<!-- END BODY -->
</html>