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
				<form:option value="Brazil" label="Brazil"/>
				<form:option value="France" label="France"/>
				<form:option value="Germany" label="Germany"/>
				<form:option value="India" label="India"/>
			</form:select>
		<button type="submit">SUBMIT</button>
	</form:form>

</body>