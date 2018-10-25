<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
<style type="text/css">
@import
url(
"<c:url value="
/
resource
/css/movie.css"/>");
</style>
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
				<h1>Movie detail</h1>
			</div>
	</section>
	<section class="container">
		<div class="row">
			<img
				src="<c:url value="/resource/images/${movie.movieId}.png"></c:url>"
				alt="image" style="width: 100%; height: 75%" />
		</div>
		<br />
		<div class="row">
			<div class="movie-description col-md-6">
				<h1>Smallfoot</h1>
				<span></span>
				<div class="movie-main-desc">
					<table>
						<tbody>
							<tr>
								<td><strong><spring:message
											code="addMovie.form.genre.label" /></strong></td>
								<td>${movie.genre}</td>
							</tr>
							<tr>
								<td><strong><spring:message
											code="addMovie.form.director.label" /></strong></td>
								<td>${movie.director}</td>
							</tr>
							<tr>
								<td><strong><spring:message
											code="addMovie.form.runTime.label" /></strong></td>
								<td>${movie.runTime}minutes</td>
							</tr>
							<tr>
								<td><strong><spring:message
											code="addMovie.form.description.label" /></strong></td>
								<td>${movie.description}</td>
							</tr>
							<tr>
								<td><strong><spring:message
											code="addMovie.form.price.label" /></strong></td>
								<td>${movie.price}USD</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="col-md-6">
				<span> <a
					href=" <spring:url value="/movie/ticket?movieid=${movie.movieId}" /> "
					class="btn btn-primary"> <span
						class="glyphicon-info-sign glyphicon" /></span> Take a ticket
				</a>
				</span>
				<div class="times">
					<br /> <br /> <strong>Times: </strong> <span>11:00</span> <span>13:00</span>
					<span>15:00</span>
				</div>
			</div>
		</div>
		<br /> <br /> <br />
	</section>
</body>
</html>
