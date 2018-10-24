<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Buy ticket</title>
</head>
<body>
	<h1>Ticket information</h1>
	<section>
		<div class="jumbotron">

			<div class="container">

				<form:form modelAttribute="reservation" class="form-horizontal"
					enctype="multipart/form-data">
					<fieldset>
						<form:errors path="*" cssClass="alert alert-danger" element="div" />
						<h3>Movie: ${movie.movieName}</h3>
						<div class="form-group">
							<label class="control-label col-lg-2" for="time"><spring:message
									code="addMovie.form.time.label" text="Time" /></label>
							<div class="col-lg-10">
								<div class="form:input-prepend">
									<form:input id="time" path="time" type="text"
										class="form:input-large" />
									<form:errors path="time" cssClass="text-danger" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-lg-2" for="numberOfTickets"><spring:message
									code="addMovie.form.price.label" /></label>
							<div class="col-lg-10">
								<div class="form:input-prepend">
									<form:input id="numberOfTickets" path="numberOfTickets"
										type="number" class="form:input-large" />
									<form:errors path="numberOfTickets" cssClass="text-danger" />
								</div>
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

						<div class="context">

							<div class="screen">Central Screen</div>

							<div class="row">
								<input type="checkbox" class="seat" /> <input type="checkbox"
									class="seat" /> <input type="checkbox" class="seat" /> <input
									type="checkbox" class="seat" /> <input type="checkbox"
									class="seat" /> <input type="checkbox" class="seat" /> <input
									type="checkbox" class="seat" /> <input type="checkbox"
									class="seat" /> <input type="checkbox" class="seat" />
							</div>
							<div class="row">
								<input type="checkbox" class="seat" /> <input type="checkbox"
									class="seat" /> <input type="checkbox" class="seat" /> <input
									type="checkbox" class="seat" /> <input type="checkbox"
									class="seat" /> <input type="checkbox" class="seat" /> <input
									type="checkbox" class="seat" /> <input type="checkbox"
									class="seat" /> <input type="checkbox" class="seat" />
							</div>
							<div class="row">
								<input type="checkbox" class="seat" /> <input type="checkbox"
									class="seat" /> <input type="checkbox" class="seat" /> <input
									type="checkbox" class="seat" /> <input type="checkbox"
									class="seat" /> <input type="checkbox" class="seat" /> <input
									type="checkbox" class="seat" /> <input type="checkbox"
									class="seat" /> <input type="checkbox" class="seat" />
							</div>
							<div class="row">
								<input type="checkbox" class="seat" /> <input type="checkbox"
									class="seat" /> <input type="checkbox" class="seat" /> <input
									type="checkbox" class="seat" /> <input type="checkbox"
									class="seat" /> <input type="checkbox" class="seat" /> <input
									type="checkbox" class="seat" /> <input type="checkbox"
									class="seat" /> <input type="checkbox" class="seat" />
							</div>
						</div>
						<div class="confirm-info">
							<h3>Customer information</h3>
							<div class="room">
								Name: <label for="reserverName"><form:input type="text"
										id="reserverName" path="reserverName"
										placeholder="Enter your name" /></label>
							</div>
							<div class="room">
								Email: <label for="email"><form:input type="text"
										id="email" path="email" placeholder="xxxxx@gmail.com" /></label>
							</div>
							<div class="room">
								Phone: <label for="phone"><form:input type="text"
										id="phone" path="phone" placeholder="xxx-xxx-xxxx" /></label>
							</div>
						</div>

						<div class="form-group">
							<div class="col-lg-offset-2 col-lg-10">
								<input type="submit" id="btnConfirm" class="btn btn-primary"
									value="Confirm" />
							</div>
						</div>

					</fieldset>


				</form:form>
			</div>
		</div>
	</section>

</body>
</html>
