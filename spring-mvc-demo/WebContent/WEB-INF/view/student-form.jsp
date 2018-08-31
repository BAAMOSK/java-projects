<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<head>

</head>

<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName" />
		Last name: <form:input path="lastName" />
		Country:
			<form:select path="country" >
				<form:options items="${student.countryOptions}" />
			</form:select>
		<button type="submit">SUBMIT</button>
	</form:form>

</body>