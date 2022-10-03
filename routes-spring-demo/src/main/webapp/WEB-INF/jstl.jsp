<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- For any Bootstrap that uses JS or jQuery-->


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 class="text-primary btn btn-warning btn-outline-danger">JSTL Demo</h1>
	<h2><c:out value="${jspName}"/></h2>
	<p>${jspAge}</p>
	<p>${jspIsHungry}</p>
	<p>${test}</p>
	<p>${dateFromJsp}</p>
	
	
	<h1>if-statement</h1>
	<c:if test="${jspIsHungry}">
		<p><c:out value="${jspName}"/> is hungy</p>
	</c:if>

    <h1>if-else statement</h1>
    
	<c:choose>
	
		<c:when test="${jspAge < 21}">
			<p><c:out value="${jspName }"/> is under 21 and can't by drinks</p>
		</c:when>
		
		<c:otherwise>
			<p><c:out value="${jspName }"/> is over 21 drink up</p>
		</c:otherwise>
		
	</c:choose>
	
	
    <h1>for each</h1>
    <c:forEach var="user" items="${jspUsers}">
    	<p><c:out value="${user}"/></p>
    </c:forEach>
    
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>