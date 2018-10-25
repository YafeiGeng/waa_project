<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Ottumwa 8</title>
</head>
<body>
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
<section><div class="jumbotron container-fluid header-full"
			style="background-color: rgb(29, 29, 29); background-image: -webkit-linear-gradient(left, rgb(29, 29, 29) 0%, rgb(183, 21, 64) 25%, rgb(26, 188, 156) 75%, rgb(29, 29, 29) 100%); box-shadow: black 10px 10px 50px;">
	<div class="container" style="color:white;">
				<h1>Ottumwa 8 online cinema</h1>
				<p>Recently added new Movies are here.</p>
			</div>

			<div class="container">
				<h3>
					<a href="<spring:url value='/movies' />" class="btn btn-default">
			<span class="glyphicon glyphicon-circle-arrow-left"></span> Go To Movies
					</a>
				</h3>
			</div>
			<div class="row" style="margin-top: 5px">

				<div class="col-md-6">
		<img  class="img-thumbnail" src="<c:url value="/resource/images/4.png"></c:url>"
						alt="image" style="width: 100%; height: 500px;" />
				</div>

				<div class="col-md-6">
		<img  class="img-thumbnail" src="<c:url value="/resource/images/5.png"></c:url>"
						alt="image" style="width: 100%; height: 500px;" />
				</div>
			</div>

		</div>
	</section>

</body>
</html>
