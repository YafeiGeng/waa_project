<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Choose Seat</title>
<!-- <link rel="stylesheet" href="seatChoose.css" type="text/css"/> -->
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
   <!--  <script type="text/javascript" src="seatChoose.js"></script> -->

</head>
<body>
	<form:form modelAttribute="reservation" class="form-horizontal" medthod="post"
			enctype="multipart/form-data">
	
		<div class="context">
		
			<div class="screen">Central Screen</div>
			
			<div class="row">
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" />
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" />
			</div>
			<div class="row">
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" />
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" />
			</div>
			<div class="row">
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" />
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" />
			</div>
			<div class="row">
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" />
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" /> 
				<input type="checkbox" class="seat" />
			</div>

			<div class="confirm-info">

				<div class="room">
					Name: <label for="reserverName"><form:input type="text" id="reserverName" path="reserverName"
						placeholder="Enter your name"/></label>
				</div>
				<div class="room">
					Email: <label for="email"><form:input type="text" id="email" path="email"
						placeholder="xxxxx@gmail.com"/></label>
				</div>
				<div class="room">
					Phone: <label for="phone"><form:input type="text" id="phone" path="phone"
						placeholder="xxx-xxx-xxxx"/></label>
				</div>
			</div>
			<div class="col-md-6">
			<span> <a href=" <spring:url value="/movie/ticket/dopayment" /> "
				class="btn btn-primary"> <span
					class="glyphicon-info-sign glyphicon" /></span> Do payment
			</a>
			</span>
		</div>
		</div>
		
	</form:form>
</body>

</html>