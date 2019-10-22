<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form id="friendlist" action="addFriendPage" method="get" modelAttribute="friendList">

<h1>List Of Friends</h1>
<table>
		
	   <tr>
	   		<th>First Name</th>
	   		<th>Last Name</th>
	   </tr>
	<c:if test="${not empty friendList}">
		<c:forEach var="listValue" items="${friendList}">
			<tr>
		   		<td>${listValue.firstName}</td>
		   		<td>${listValue.lastName}</td>
		   </tr>
				
		</c:forEach>
	</c:if>
		
</table>

</form:form>
</body>
</html>