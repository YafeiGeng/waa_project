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
		<div class="jumbotron"
			style="background-image: url(https://wallpapercave.com/wp/zWgAVWZ.jpg); height: 250px;">
			<div class="container">
				<h1>Movie list</h1>
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
							<li><img
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
