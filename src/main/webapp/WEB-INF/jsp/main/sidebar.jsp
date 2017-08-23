<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- BEGIN SIDEBAR -->
<div class="page-sidebar navbar-collapse collapse">
	<!-- BEGIN SIDEBAR MENU -->
	<ul class="page-sidebar-menu">
		<li>
			<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
			<div class="sidebar-toggler hidden-phone"></div> <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
		</li>
		<c:set var="index" value="0" scope="request" />
		<!-- 自增序号，注意scope-->
		<c:set var="level" value="0" scope="request" />
		<!-- 记录树的层次，注意scope-->
		<c:set var="treeList" value="${menunode.childs}" scope="request" />
		<c:import url="../main/sidebardg.jsp" />
	</ul>
	<!-- END SIDEBAR MENU -->
</div>
<!-- END SIDEBAR -->