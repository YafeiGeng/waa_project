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
	<div class="header">
		<ul class="nav nav-pills pull-right">
			<h4>
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
				<h1>Add movie</h1>
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
							code="addMovie.form.movieTime.label" />
					</div>
				</div>

				<input type="submit" id="btnAdd" class="btn btn-primary" value="Add" />

			</fieldset>
		</form:form>
	</section>
</body>
</html>