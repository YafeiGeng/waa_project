<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Choose Seat</title>
<link rel="stylesheet" href="seatChoose.css" type="text/css"/>

    <script type="text/javascript" src="seatChoose.js"></script>

</head>
<body>
	<form action="/chooseSeatInfo" method="POST">
	
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
					Name: <label for="name"><form:input type="text" id="name" path="name"
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
				<div class="room">
					<label for="confirm"><input type="submit" id="confirm"
						value="Confirm" onclick="makeAjaxCall()"></label>
				</div>

			</div>

		</div>
	</form>
</body>

</html>