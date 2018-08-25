<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<head>

</head>

<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		Last name: <form:input path="lastName" />
		<button type="submit">SUBMIT</button>
	</form:form>

</body>