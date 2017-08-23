<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:forEach var="cur" items="${treeList}" varStatus="vs">
	<c:set var="active" value="${cur.attributes['active']}" scope="request" />
	<c:set var="selected" value="${cur.attributes['selected']}" scope="request" />
	<c:choose>
		<c:when test="${index == 0 }">
			<li class="start ${active}">
		</c:when>
		<c:otherwise>
			<li class="${active}">
		</c:otherwise>
	</c:choose>
	<c:set var="index" value="${index + 1}" scope="request" />
	<a href="${pageContext.request.contextPath }/${cur.attributes['link']}?menuid=${cur.id}"> 
	<i class="${cur.attributes['class']}"></i> 
	<span class="title">${cur.name }</span>
		<c:choose>
		<c:when test="${fn:length(cur.childs) > 0}">
			<span class="arrow ${selected}"></span>
		</c:when>
		<c:otherwise>
			<span class="${selected} "></span>
		</c:otherwise>
	</c:choose>
	
	</a>
	<c:if test="${fn:length(cur.childs) > 0}">
		<ul class="sub-menu">
			<c:set var="level" value="${level + 1}" scope="request" />
			<c:set var="treeList" value="${cur.childs}" scope="request" />
			<c:import url="../main/sidebardg.jsp" />
		</ul>
	</c:if>
	</li>
</c:forEach>
<c:set var="level" value="${level - 1}" scope="request" />
<!-- 退出时，level-1 -->
