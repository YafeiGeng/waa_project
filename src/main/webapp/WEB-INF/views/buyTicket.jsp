<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<title>Buy ticket</title><style type="text/css">
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
				<h1>Ticket information</h1>
			</div>
		</div>
	</section>
	<section class="container">		
		<div class="row">
			<div class="movie-description col-md-9">				
				<span></span>
				<div class="movie-main-desc">
					<form:form modelAttribute="reservation" class="form-horizontal" id="ticketInfo"
					enctype="multipart/form-data">
					<fieldset style="width: 50%; display: inline; float: inline-start;">
						<form:errors path="*" cssClass="alert alert-danger" element="div" />
						<h3 style="color:blue;">Movie: ${movie.movieName}</h3>
						<div class="form-group">
							<label class="control-label col-lg-5" for="time"><spring:message
									code="ticket.time" text="Time" /></label>
							<div class="col-lg-5">
								<div class="input-group-prepend">
									<form:select path="time" class="form-control">
										<form:option value="-" label="--Select Time" />
										<form:options items="${times}" value="key" label="value" />
									</form:select>
									<form:errors path="time" cssClass="text-danger" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-lg-5" for="numberOfTickets">
							<spring:message
									code="ticket.number" /></label>
							<div class="col-lg-5">
								<div class="input-group-prepend">
									<form:input id="numberOfTickets" path="numberOfTickets"
										type="number" class="form-control" onchange="javascript:calculate()"/>
									<form:errors path="numberOfTickets" cssClass="text-danger" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-lg-5" for="price"><spring:message
									code="ticket.price" /></label>
							<div class="col-lg-5">
								<div class="input-group-prepend">
									<form:input id="price" path="price" type="text" class="form-control" disabled="true"/>
									<form:errors path="price" cssClass="text-danger" />
								</div>
							</div>
						</div>
					</fieldset>
					<div class="context"
						style="width: 50%; display: inline; float: inline-end; text-align: center;">

						<div class="screen">Central Screen</div>
						<hr style="border: blue solid 2px; width: 70%;"/>

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
						<h3 style="color:blue;">Customer information</h3>

						<div class="form-group">
							<label class="control-label col-lg-3" for="reserverName"><spring:message
									code="ticket.form.customer.name" /></label>
							<div class="col-lg-3">
								<div class="input-group-prepend">
									<form:input type="text" id="reserverName" path="reserverName"
										placeholder="Enter your name" class="form-control" />
									<form:errors path="reserverName" cssClass="text-danger" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-lg-3" for="email"><spring:message
									code="ticket.form.customer.email" /></label>
							<div class="col-lg-3">
								<div class="input-group-prepend">
									<form:input id="email" path="email" type="text"
										placeholder="xxxxx@gmail.com" class="form-control" />
									<form:errors path="email" cssClass="text-danger" />
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-lg-3" for="phone"><spring:message
									code="ticket.form.customer.phone" /></label>
							<div class="col-lg-3">
								<div class="input-group-prepend">
									<form:input id="phone" path="phone" type="text"
										placeholder="xxx-xxx-xxxx" class="form-control" />
									<form:errors path="phone" cssClass="text-danger" />
								</div>
							</div>
						</div>

						<div class="form-group">
							<div class="col-lg-offset-2 col-lg-10">
								<input type="button" value="Do reservation" onclick="reserve();">
							</div>
						</div>
					</fieldset>
				</form:form>
				</div>
			</div>
			<div class="col-md-3">
				<div id="formInput"></div> 
				<div id="errors"></div> 
			</div>
		</div>
		<br /> <br /> <br />
	</section>
	<script>
function calculate() {	
    var x = document.getElementById("numberOfTickets").value;    
    document.getElementById("price").value = "$" +  parseInt(x)*8 ;
}
function reserve() {	 
	
   	var contextRoot = "/" + window.location.pathname.split( '/' )[1];
 	var sendToSend = JSON.stringify(serializeObject($('#ticketInfo'))); 	
	$.ajax({
		url: contextRoot + '/success',
		type: 'POST',
 		data:sendToSend,
 		contentType: 'application/json',   
		success: function(ticket){
			$('#formInput').html("");
			$("#formInput").append( '<H3 align="center"> Ticket information <H3>');                
			$('#formInput').append("<H4 align='center'>Movie time:  " + ticket.time + "</h4>"  );
			$('#formInput').append("<H4 align='center'>Numbers of ticket: " + ticket.numberOfTickets  + "</h4>" );
			$('#formInput').append("<H4 align='center'>Email: " + ticket.price  + "</h4>");			
			$('#formInput').show();
			$('#errors').hide();
		},

		error: function(jqXHR,  textStatus,  exception ){	
 			$('#errors').html("");
 			$("#errors").append( '<H3 align="center"> Error(s)!! <H3>');     
		}	
	});	
}
function serializeObject (form)
{
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function() {
         	jsonObject[this.path] = this.value;
    });
    return jsonObject;

};

</script>
</body>
</html>
