<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link href="../../resources/css/main.css" rel="stylesheet" type="text/css">
<script src="../../resources/js/test.js" type="text/javascript"></script>
	  
	Language : <a href="?language=en_US">English</a>|<a href="?language=zh_CN">Chinese</a>
	 
	<h3>
	welcome.springmvc : <spring:message code="welcome.springmvc" text="default text" />
	</h3>
	 
	<p> Current Locale : ${pageContext.response.locale}</p>
 
