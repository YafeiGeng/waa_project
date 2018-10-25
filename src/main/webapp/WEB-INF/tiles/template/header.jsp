<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="true"%>
<header>
	<ul>
		<div class="header">
			<ul class="nav nav-pills pull-right">


				<h4>
					<c:if test="${not empty sessionScope.currentUser}">
						<a style="margin-right: 20px; color: #FFFFFF"
							href="<spring:url value='/movies/add' />"> Add new movie </a>
					</c:if>

					<c:if test="${empty sessionScope.currentUser}">
						<a style="margin-right: 20px; color: #FFFFFF"
							href="<spring:url value='/login' />"> Login </a>
					</c:if>
					<c:if test="${not empty sessionScope.currentUser}">
						<a style="margin-right: 20px; color: #FFFFFF"
							href="<spring:url value='/logout' />"> Logout </a>

					</c:if>
					<div class="pull-right" style="padding-right: 50px">
						<li style="float: right"><a href="?language=mn_MN"
							style="color: white">/ Mongolian </a></li>
						<li style="float: right"><a href="?language=en_US"
							style="color: white">English</a></li>
					</div>
				</h4>
			</ul>
		</div>
	</ul>
</header>