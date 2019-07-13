<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
</head>
<body>
	<h3>Welcome, Enter The Employee Details</h3>
	<form:form method="POST" action="/deviceRegister"
		modelAttribute="device">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Owner:</td>
				<td><form:input path="owner" /></td>
			</tr>
			<%--      <tr>
                    <td><form:label path="contactNumber">
                      Contact Number</form:label></td>
                    <td><form:input path="contactNumber"/></td>
                </tr>
                <tr> --%>

			<tr>
				<td>Device Types:</td>
				<td><form:select path="deviceType">
						<form:option value="0" label="Select" />
						<c:forEach items="${deviceTypes}" var="deviceType">
							<form:option value="${deviceType.id }" label="${deviceType.name}" />
						</c:forEach>
					</form:select></td>
			</tr>
			<tr>
			<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>