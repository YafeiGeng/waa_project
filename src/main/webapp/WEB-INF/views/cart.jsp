<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">

<title>Buy ticket</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Buy Form</h1>
				<p>Input ticket information here</p>
			</div>
		</div>
	</section>

	<section class="container" id ="cartApp">
	<form:form modelAttribute="ticket" action="post" id="ticket">				
		<table id="cart_table">		
			<tr>
				<td><label for="time">
				<spring:message code="buyTicket.ticket.time"/></label></td>
				<td>				
					<form:input id="time" path="time" type="text" class="form:input-large"/>
					<form:errors path="time" cssClass="text-danger"/>
				</td>
			</tr>
			<tr>
				<td><label for="number">
				<spring:message code="buyTicket.ticket.number"/></label></td>
				<td>				
					<form:input id="number" path="number" type="number" class="form:input-large"/>
					<form:errors path="time" cssClass="text-danger"/>
				</td>
			</tr>
			<tr>
				<td><label for="price">
				<spring:message code="buyTicket.ticket.price"/></label></td>
				<td>				
					<form:input id="price" path="price" type="text" class="form:input-large"/>
					<form:errors path="price" cssClass="text-danger"/>
				</td>
			</tr>		
		</table>
			
			<a href="<spring:url value="/seat" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> Confirm
			</a>
			</form:form>
		
	</section>
</body>
</html>
