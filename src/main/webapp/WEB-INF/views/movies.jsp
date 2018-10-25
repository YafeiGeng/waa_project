<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Movies</title>
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
	<section>
		<div class="jumbotron container-fluid header-full"
			style="background-color: rgb(29, 29, 29); background-image: -webkit-linear-gradient(left, rgb(29, 29, 29) 0%, rgb(183, 21, 64) 25%, rgb(26, 188, 156) 75%, rgb(29, 29, 29) 100%); box-shadow: black 10px 10px 50px;">
			<div class="container" style="color: white;">
				<h1>Movies</h1>
				
			</div>
		</div>
	</section>

	<section class="container">
		<!-- <div class="row text-right">
			<a href=" <spring:url value="/movies/add" /> "
				class="btn btn-primary"> <span
				class="glyphicon-info-sign glyphicon" /></span> Add
			</a>
		</div> -->
		<br />
		<div class="row">
			<c:forEach items="${movies}" var="movie">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="movies">
						<ul class="list-movies clearfix">
							<li><img class="img-thumbnail border border-primary" 
								src="<c:url value="/resource/images/${movie.movieId}.png"></c:url>"
								alt="image" style="width: 100%" />

								<div class="desc">
									<h3>
										<a
											href=" <spring:url value="/movies/movie?id=${movie.movieId}" /> ">
											${movie.movieName} </a>
									</h3>
									<p>${movie.runTime}minutes</p>
									<p>${movie.genre}</p>
								</div></li>

						</ul>

					</div>

				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>
