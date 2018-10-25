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
					<fieldset style="width: 50%; display: inline; float: inline-start;">
						<form:errors path="*" cssClass="alert alert-danger" element="div" />
						<h3>Movie: ${movie.movieName}</h3>
						<div class="form-group">
							<label class="control-label col-lg-5" for="time"><spring:message
									code="ticket.time" text="Time" /></label>
							<div class="col-lg-5">
								<div class="form:input-prepend">
									<form:select path="time">s
										<form:option value="-" label="--Select Time" />
										<form:options items="${times}" value="key" label="value" />
									</form:select>
									<form:errors path="time" cssClass="text-danger" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-lg-5" for="numberOfTickets"><spring:message
									code="ticket.number" /></label>
							<div class="col-lg-5">
								<div class="form:input-prepend">
									<form:input id="numberOfTickets" path="numberOfTickets"
										type="number" class="form:input-small" />
									<form:errors path="numberOfTickets" cssClass="text-danger" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-lg-5" for="price"><spring:message
									code="ticket.price" /></label>
							<div class="col-lg-5">
								<div class="form:input-prepend">
									<form:input id="price" path="price" type="text"
										class="form:input-large" />
									<form:errors path="price" cssClass="text-danger" />
								</div>
							</div>
						</div>
					</fieldset>
					<div class="context"
						style="width: 50%; display: inline; float: inline-end; text-align: center;">

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
					<fieldset style="clear: left">
						<h3>Customer information</h3>

						<div class="form-group">
							<label class="control-label col-lg-2" for="reserverName"><spring:message
									code="ticket.form.customer.name" /></label>
							<div class="col-lg-10">
								<div class="form:input-prepend">
									<form:input type="text" id="reserverName" path="reserverName"
										placeholder="Enter your name" class="form:input-large" />
									<form:errors path="reserverName" cssClass="text-danger" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-lg-2" for="email"><spring:message
									code="ticket.form.customer.email" /></label>
							<div class="col-lg-10">
								<div class="form:input-prepend">
									<form:input id="email" path="email" type="text"
										placeholder="xxxxx@gmail.com" class="form:input-large" />
									<form:errors path="email" cssClass="text-danger" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-lg-2" for="phone"><spring:message
									code="ticket.form.customer.phone" /></label>
							<div class="col-lg-10">
								<div class="form:input-prepend">
									<form:input id="phone" path="phone" type="text"
										placeholder="xxx-xxx-xxxx" class="form:input-large" />
									<form:errors path="phone" cssClass="text-danger" />
								</div>
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
