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
   <!-- BEGIN PAGE LEVEL PLUGIN STYLES --> 
   <link href="../assets/plugins/gritter/css/jquery.gritter.css" rel="stylesheet" type="text/css"/>
   <!-- END PAGE LEVEL PLUGIN STYLES -->
   <link rel="stylesheet" type="text/css" href="../assets/plugins/fuelux/css/tree-metronic.css" />
   <link rel="stylesheet" type="text/css" href="../assets/plugins/bootstrap-treeview/bootstrap-treeview.min.css">
   <!-- BEGIN THEME STYLES --> 
   <link href="../assets/css/style-metronic.css" rel="stylesheet" type="text/css"/>
   <link href="../assets/css/style.css" rel="stylesheet" type="text/css"/>
   <link href="../assets/css/style-responsive.css" rel="stylesheet" type="text/css"/>
   <link href="../assets/css/plugins.css" rel="stylesheet" type="text/css"/>
   <link href="../assets/css/pages/tasks.css" rel="stylesheet" type="text/css"/>
   <link href="../assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color"/>
   <link href="../assets/css/custom.css" rel="stylesheet" type="text/css"/>
   <!-- END THEME STYLES -->
   <link rel="shortcut icon" href="favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">
   <!-- BEGIN HEADER -->   
   <jsp:include page="header.jsp" />
   <!-- END HEADER -->
   <div class="clearfix"></div>
   <!-- BEGIN CONTAINER -->
   <div class="page-container">
      <!-- BEGIN PAGE -->
      <!-- BEGIN SIDEBAR -->      
 	  <jsp:include page="sidebar.jsp" />
      <!-- END SIDEBAR -->
      <div class="page-content">
         <div class="row">
            <div class="col-md-12">
               <ul class="page-breadcrumb breadcrumb">
               	<li class="btn-group">
                     <button type="button" class="btn blue dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="1000" data-close-others="true">
                     <span>操作</span> <i class="icon-angle-down"></i>
                     </button>
                     <ul class="dropdown-menu pull-right" role="menu">
                        <li><a href="form_layouts.html"><i class="icon-plus"></i>添加操作项</a></li>
                      	<li class="divider"></li>
                      	<li><a href="#"><i class="icon-trash"></i>删除操作项</a></li>
                      	<li class="divider"></li>
                      	<li><a href="#"><i class="icon-play-circle"></i>批量执行</a></li>
                     </ul>
                 </li>
                <li>
                  <i class="icon-home"></i>
                  <a href="index.html">首页</a> 
                </li>
               </ul>
            </div>
         </div>
        
         <div class="row">
			<div class="col-md-3">
			<div class="portlet blue box">
              <div class="portlet-title">
                 <div class="caption"><i class="icon-cogs"></i>视图</div>
                 <div class="tools">
                 	<a href="javascript:;" class="config"></a>
                    <a href="javascript:;" class="reload"></a>
                 </div>
              </div>
              <div class="portlet-body">
                 <div id="tree_view" class="tree tree-no-line tree-unselectable">
                    <div class = "tree-folder" style="display:none;">
                       <div class="tree-folder-header">
                          <i class="icon-folder-close"></i>
                          <div class="tree-folder-name"></div>
                       </div>
                       <div class="tree-folder-content"></div>
                       <div class="tree-loader" style="display:none"></div>
                    </div>
                    <div class="tree-item" style="display:none;">
                       <i class="tree-dot"></i>
                       <div class="tree-item-name"></div>
                    </div>
                 </div>
              </div>
           </div>
			</div>

			<div class="col-md-9">
	        	<div class="portlet box blue">
	                 <div class="portlet-title">
		                     <div class="caption"><i class="icon-picture"></i>发布操作项</div>
 							 <!--<div class="actions">
		                        
                     		</div>-->
	                     </div>
		             <div class="portlet-body">
		                     <div class="table-responsive">
		                        <table id="task_table" class="table table-condensed table-hover table-striped">
		                        <thead>
		                           <tr>
		                           	  <th style="width1:8px;"><input type="checkbox" class="group-checkable" data-set="#sample_2 .checkboxes" /></th>
		                              <th>操作内容</th>
		                              <th>上次执行开始时间</th>
		                              <th >上次执行结束时间</th>
		                              <th>状态</th>
		                              <th>日志</th>
		                              <th>操作</th>
		                              <th>历史</th>
		                           </tr>
		                        </thead>
		                        <tbody>
		                           <tr>
		                           	  <td><input type="checkbox" class="checkboxes" value="1" /></td>
		                              <td><a href="pages/page_timeline.html"><i class="icon-pushpin"></i>&nbsp;版本升级</a></td>
		                              <td>2016-03-23 12:33:34</td>
		                              <td >2016-03-23 12:35:21</td>
		                              <td><span class="label label-sm label-success">成功</span></td>
		                              <td>
		                              	<a href="pages/layout_blank_page.html" class="btn btn-sm default"><i class="icon-paper-clip"></i>&nbsp;</a>
		                              </td>
		                              <td>           	
		                              	<a href="pages/form_wizard.html" class="btn btn-sm purple"><i class="icon-play-circle"></i>&nbsp;执行</a>
		                              </td>
		                              <td>           	
		                              	<a href="pages/extra_pricing_table.html" class="btn btn-sm yellow"><i class="icon-share"></i>&nbsp;历史</a>
		                              </td>
		                           </tr>
		                           <tr>
		                           	  <td><input type="checkbox" class="checkboxes" value="1" /></td>
		                              <td><a href="pages/page_timeline.html">停止应用</a></td>
		                              <td>2016-03-23 12:33:34</td>
		                              <td >2016-03-23 12:35:21</td>
		                              <td><span class="label label-sm label-success">成功</span></td>
		                              <td>
		                              	<a href="pages/layout_blank_page.html" class="btn btn-sm default"><i class="icon-paper-clip"></i>&nbsp;</a>
		                              </td>
		                              <td>           	
		                              	<a href="pages/form_wizard.html" class="btn btn-sm purple"><i class="icon-play-circle"></i>&nbsp;执行</a>
		                              </td>
		                              <td>           	
		                              	<a href="pages/extra_pricing_table.html" class="btn btn-sm yellow"><i class="icon-share"></i>&nbsp;历史</a>
		                              </td>
		                           </tr>
		                           <tr>
		                           	  <td><input type="checkbox" class="checkboxes" value="1" /></td>
		                              <td><a href="pages/page_timeline.html"><i class="icon-pushpin"></i>&nbsp;版本回退</a></td>
		                              <td>2016-03-23 12:33:34</td>
		                              <td >2016-03-23 12:35:21</td>
		                              <td><span class="label label-sm label-danger">失败</span></td>
		                              <td>
		                              	<a href="pages/layout_blank_page.html" class="btn btn-sm default"><i class="icon-paper-clip"></i>&nbsp;</a>
		                              </td>
		                              <td>           	
		                              	<a href="pages/form_wizard.html" class="btn btn-sm purple"><i class="icon-play-circle"></i>&nbsp;执行</a>
		                              </td>
		                              <td>           	
		                              	<a href="pages/extra_pricing_table.html" class="btn btn-sm yellow"><i class="icon-share"></i>&nbsp;历史</a>
		                              </td>
		                           </tr>
		                           <tr>
		                           	  <td><input type="checkbox" class="checkboxes" value="1" /></td>
		                              <td><a href="pages/page_timeline.html">启动应用</a></td>
		                              <td>2016-03-23 12:33:34</td>
		                              <td >2016-03-23 12:35:21</td>
		                              <td><span class="label label-sm label-success">成功</span></td>
		                              <td>
		                              	<a href="pages/layout_blank_page.html" class="btn btn-sm default"><i class="icon-paper-clip"></i>&nbsp;</a>
		                              </td>
		                              <td>           	
		                              	<a href="pages/form_wizard.html" class="btn btn-sm purple"><i class="icon-play-circle"></i>&nbsp;执行</a>
		                              </td>
		                              <td>           	
		                              	<a href="pages/extra_pricing_table.html" class="btn btn-sm yellow"><i class="icon-share"></i>&nbsp;历史</a>
		                              </td>
		                           </tr>
		                           <tr>
		                           	  <td><input type="checkbox" class="checkboxes" value="1" /></td>
		                              <td><a href="page_timeline.html"><i class="icon-pushpin"></i>&nbsp;构建物料包</a></td>
		                              <td>2016-03-23 12:33:34</td>
		                              <td >2016-03-23 12:35:21</td>
		                              <td><span class="label label-sm label-success">成功</span></td>
		                              <td>
		                              	<a href="pages/layout_blank_page.html" class="btn btn-sm default"><i class="icon-paper-clip"></i>&nbsp;</a>
		                              </td>
		                              <td>           	
		                              	<a href="pages/form_wizard.html" class="btn btn-sm purple"><i class="icon-play-circle"></i>&nbsp;执行</a>
		                              </td>
		                              <td>           	
		                              	<a href="pages/extra_pricing_table.html" class="btn btn-sm yellow"><i class="icon-share"></i>&nbsp;历史</a>
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
	
<!-- END PAGE -->
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
   <!-- IMPORTANT! Load jquery-ui-1.10.3.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
   <script src="../assets/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js" type="text/javascript"></script>
   <script src="../assets/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
   <script src="../assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" type="text/javascript" ></script>
   <script src="../assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
   <script src="../assets/plugins/jquery.blockui.min.js" type="text/javascript"></script>  
   <script src="../assets/plugins/jquery.cookie.min.js" type="text/javascript"></script>
   <script src="../assets/plugins/uniform/jquery.uniform.min.js" type="text/javascript" ></script>
   <!-- END CORE PLUGINS -->
   <!-- BEGIN PAGE LEVEL PLUGINS -->
   <script src="../assets/plugins/jqvmap/jqvmap/jquery.vmap.js" type="text/javascript"></script>   
   <script src="../assets/plugins/jqvmap/jqvmap/maps/jquery.vmap.russia.js" type="text/javascript"></script>
   <script src="../assets/plugins/jqvmap/jqvmap/maps/jquery.vmap.world.js" type="text/javascript"></script>
   <script src="../assets/plugins/jqvmap/jqvmap/maps/jquery.vmap.europe.js" type="text/javascript"></script>
   <script src="../assets/plugins/jqvmap/jqvmap/maps/jquery.vmap.germany.js" type="text/javascript"></script>
   <script src="../assets/plugins/jqvmap/jqvmap/maps/jquery.vmap.usa.js" type="text/javascript"></script>
   <script src="../assets/plugins/jqvmap/jqvmap/data/jquery.vmap.sampledata.js" type="text/javascript"></script>  
   <script src="../assets/plugins/flot/jquery.flot.js" type="text/javascript"></script>
   <script src="../assets/plugins/flot/jquery.flot.resize.js" type="text/javascript"></script>
   <script src="../assets/plugins/jquery.pulsate.min.js" type="text/javascript"></script>
   <script src="../assets/plugins/bootstrap-daterangepicker/moment.min.js" type="text/javascript"></script>
   <script src="../assets/plugins/bootstrap-daterangepicker/daterangepicker.js" type="text/javascript"></script>     
   <script src="../assets/plugins/gritter/js/jquery.gritter.js" type="text/javascript"></script>
   <!-- IMPORTANT! fullcalendar depends on jquery-ui-1.10.3.custom.min.js for drag & drop support -->
   <script src="../assets/plugins/fullcalendar/fullcalendar/fullcalendar.min.js" type="text/javascript"></script>
   <script src="../assets/plugins/jquery-easy-pie-chart/jquery.easy-pie-chart.js" type="text/javascript"></script>
   <script src="../assets/plugins/jquery.sparkline.min.js" type="text/javascript"></script>  
   <!-- END PAGE LEVEL PLUGINS -->
   <!-- BEGIN PAGE LEVEL SCRIPTS -->
   
   <script src="../assets/plugins/bootstrap-treeview/bootstrap-treeview.min.js" type="text/javascript"></script>  
   <script src="../assets/plugins/data-tables/jquery.dataTables.min.js" type="text/javascript"></script>
   <script src="../assets/plugins/fuelux/js/tree.min.js" type="text/javascript"></script>  
   <!-- END PAGE LEVEL SCRIPTS -->     
   <script src="../assets/scripts/ui-tree.js" type="text/javascript"></script>    
   
   <script src="../assets/scripts/app.js" type="text/javascript"></script>
   <script src="../assets/scripts/index.js" type="text/javascript"></script>
   <script src="../assets/scripts/tasks.js" type="text/javascript"></script>        
   <!-- END PAGE LEVEL SCRIPTS -->  
   <script>
      jQuery(document).ready(function() {    
         App.init(); // initlayout and core plugins
         Index.init();
         Index.initDashboardDaterange();
         Index.initIntro();
         Tasks.initDashboardWidget();
         UITree.init();
      });
      
       var defaultData = [
          {
            text: '联机core',
            href: '#parent1',
            tags: ['4'],
            nodes: [
              {
                text: 'dev环境',
                href: '#child1',
                tags: ['2'],
              },
              {
                text: 'beat环境',
                href: '#child2',
                tags: ['0']
              }
            ]
          },
          {
            text: 'apm-web监控分析平台',
            href: '#parent2',
            tags: ['0']
          },
          {
            text: 'dmb',
            href: '#parent3',
             tags: ['0']
          },
          {
            text: 'IDE开发工具',
            href: '#parent4',
            tags: ['0']
          },
          {
            text: '公用视图',
            href: '#parent4',
            tags: ['0']
          }
        ];
      
      $('#tree_view').treeview({
          color: "#428bca",
          expandIcon: 'icon-chevron-right',
          collapseIcon: 'icon-chevron-down',
          nodeIcon: 'icon-shopping-cart',
          data: defaultData
      });
        
      
   </script>
   <!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>