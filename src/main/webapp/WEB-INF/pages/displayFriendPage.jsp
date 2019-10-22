<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form id="friendPage" modelAttribute="friend" action="addFriendPage" method="post">

<table align="left" cellpadding="20%" >
	<tr>
		<td>
			<form:label path="id">ID:</form:label>
		</td>
		<td>
			<form:input path="id" name="id" id="id"/>
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="firstName">First Name:</form:label>
		</td>
		<td>
			<form:input path="firstName" name="firstName" id="firstName"/>
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="lastName">Last Name:</form:label>
		</td>
		<td>
			<form:input path="lastName" name="lastName" id="lastName"/>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="Add Friend"/>
		</td>
	</tr>
</table>

</form:form>
</body>
</html>