<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">	
<title>Movie</title>
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
	<section>
		<div class="jumbotron container-fluid header-full"
			style="background-color: rgb(29, 29, 29); background-image: -webkit-linear-gradient(left, rgb(29, 29, 29) 0%, rgb(183, 21, 64) 25%, rgb(26, 188, 156) 75%, rgb(29, 29, 29) 100%); box-shadow: black 10px 10px 50px;">
			<div class="container" style="color: white;text-align: center;">
				<h1>Movie detail</h1>
			</div>
		</div>
	</section>
	<section class="container" style="text-align: center;">
		<div class="row">
			<img
				src="<c:url value="/resource/images/${movie.movieId}.png"></c:url>"
				alt="image" style="width: 850px; height: 350px" />
		</div>
		<br />
		<div class="row">
			<div class="movie-description col-md-6">
				<h1 style="color:blue;">${movie.movieName}</h1>
				<span></span>
				<div class="movie-main-desc">
					<table>
						<tbody>
							<tr>
								<td class="control-label col-lg-3"><strong><spring:message
											code="addMovie.form.genre.label" /></strong></td>
								<td class="text-uppercase">${movie.genre}</td>
							</tr>
							<tr>
								<td class="control-label col-lg-3"><strong><spring:message
											code="addMovie.form.director.label" /></strong></td>
								<td class="text-uppercase">${movie.director}</td>
							</tr>
							<tr>
								<td class="control-label col-lg-3"><strong><spring:message
											code="addMovie.form.runTime.label" /></strong></td>
								<td class="text-uppercase">${movie.runTime}minutes</td>
							</tr>
							<tr>
								<td class="control-label col-lg-3"><strong><spring:message
											code="addMovie.form.description.label" /></strong></td>
								<td class="text-uppercase">${movie.description}</td>
							</tr>
							<tr>
								<td class="control-label col-lg-3"><strong><spring:message
											code="addMovie.form.price.label" /></strong></td>
								<td class="text-uppercase"> ${movie.price}USD</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="col-md-6">
				<span> <a
					href=" <spring:url value="/movie/ticket?movieid=${movie.movieId}" /> "
					class="btn btn-info"> <span
						class="glyphicon glyphicon-film" /></span> Take a ticket
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
