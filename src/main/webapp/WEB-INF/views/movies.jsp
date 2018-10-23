<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Movies</title>
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
		<div class="jumbotron">
			<div class="container">
				<h1>Movies</h1>
				<p>Movie list</p>
			</div>
		</div>
	</section>

	<section class="container">
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
