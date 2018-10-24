<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Movies</h1>
				<p>Add movies</p>
			</div>
			<div class="pull-right" style="padding-right: 50px">
				<li style="float: right"><a href="?language=mn_MN">Mongolia</a></li>
				<li style="float: right"><a href="?language=en_US">English</a></li>
			</div>

		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="newMovie" class="form-horizontal"
			enctype="multipart/form-data">
			<fieldset>
				<legend>Add new movie</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div" />
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="movieId"><spring:message
							code="addMovie.form.movieId.label" /></label>
					<div class="col-lg-10">
						<form:input id="movieId" path="movieId" type="text"
							class="form:input-large" />
						<form:errors path="movieId" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="movieName"><spring:message
							code="addMovie.form.movieName.label" /></label>
					<div class="col-lg-10">
						<form:input id="movieName" path="movieName" type="text"
							class="form:input-large" />
						<form:errors path="movieName" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="price"><spring:message
							code="addMovie.form.price.label" /></label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="price" path="price" type="text"
								class="form:input-large" />
							<form:errors path="price" cssClass="text-danger" />
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="description"><spring:message
							code="addMovie.form.description.label" /></label>
					<div class="col-lg-10">
						<form:textarea id="description" path="description" rows="2" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="genre"><spring:message
							code="addMovie.form.genre.label" /></label>
					<div class="col-lg-10">
						<form:input id="genre" path="genre" type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="director"><spring:message
							code="addMovie.form.director.label" /></label>
					<div class="col-lg-10">
						<form:input id="director" path="director" type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="runTime"><spring:message
							code="addMovie.form.runTime.label" /></label>
					<div class="col-lg-10">
						<form:input id="runTime" path="runTime" type="text"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="movieImage"><spring:message
							code="addMovie.form.movieImage.label" /></label>
					<div class="col-lg-10">
						<form:input id="movieImage" path="movieImage" type="file"
							class="form:input-large" />
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary"
							value="Add" />
					</div>
				</div>

			</fieldset>
		</form:form>
	</section>
</body>
</html>