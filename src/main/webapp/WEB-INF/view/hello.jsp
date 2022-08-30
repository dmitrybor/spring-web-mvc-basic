<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Spring web basic MVC demo</title>
</head>

<body>

	<h2>Spring web basic MVC demo</h2>
	<hr>
	Hello!

	<form:form action="getWelcomeMessage" modelAttribute="user">
		First Name: <form:input path="firstName" />
		<br>
		<br>
		Last Name: <form:input path="lastName" />
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>

</body>
</html>