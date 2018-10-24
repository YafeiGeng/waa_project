<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Buy ticket</title>
</head>
<body>
<h1>Ticket form</h1>
	<section>
		<div class="jumbotron"> 
 
				  <div class="container">
				  <form:form modelAttribute="ticket" action="/ticket" method="post">
					<table >		
						<tr>
							<td><label for="timeId">Time:</label></td>
							<td> <select id="times" name=times >
								    <c:forEach var="time" items="${times}" >
								       <option value="${time.time}" label="${time.timeId}">${time.time}</option>
								    </c:forEach>
								 </select>
							</td>
						</tr>
						<tr>
							<td><label for="number">How many tickets?:</label></td>
							<td> <input type="text" name="number"/>
							</td>
						</tr>
						<tr>
							<td><label for="price">Total price:</label></td>
							<td> <input type="text" name="price" disabled/>
							</td>
						</tr>			
					</table>					
					</form:form> 
				</div>	
		</div>	
	</section>
	
</body>
</html>
