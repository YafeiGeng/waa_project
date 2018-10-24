<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Payment</title>
</head>
<body>
<h1>Card information</h1>
	<section>
		<div class="jumbotron">  
			<div class="container">				
				<table >		
					<tr>
						<td><label for="cardName">Card name:</label></td>
						<td> <input type="text" name="cardName"/>
						</td>
					</tr>
					<tr>
						<td><label for="cardNumber">Card number:</label></td>
						<td> <input type="text" name="cardNumber"/>
						</td>
					</tr>							
				</table>
			</div>	
		</div>	
	</section>
	
</body>
</html>
