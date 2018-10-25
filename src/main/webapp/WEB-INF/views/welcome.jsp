<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<div class="header">
		<ul class="nav nav-pills pull-right">
			<h4>
				<a style="margin-right: 20px; color: #FFFFFF"
					href="<spring:url value='/login' />"> Login </a>
			</h4>

			<c:if test="${not empty sessionScope.currentUser}">
				<a style="margin-right: 20px; color: #FFFFFF"
					href="<spring:url value='/logout' />"> Logout </a>
			</c:if>
		</ul>
	</div>
	<section>
		<div class="jumbotron"
			style="background-image: url(https://wallpapercave.com/wp/zWgAVWZ.jpg); height: 250px;">
			<div class="container">
				<h1>Ottumwa 8 online cinema</h1>
				<p>Recently added new Movies are here.</p>
			</div>

			<div class="container">
				<h3>
					<a href="<spring:url value='/movies' />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> Go To Movies
					</a>
				</h3>
			</div>
			<div class="row" style="margin-top: 5px">

				<div class="col-md-6">
					<img src="<c:url value="/resource/images/4.png"></c:url>"
						alt="image" style="width: 100%; height: 500px;" />
				</div>

				<div class="col-md-6">
					<img src="<c:url value="/resource/images/5.png"></c:url>"
						alt="image" style="width: 100%; height: 500px;" />
				</div>
			</div>

		</div>
	</section>

</body>
</html>
