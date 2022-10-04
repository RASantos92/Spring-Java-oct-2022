<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Show all donations</h1>

<table>
	<thead> 
        <tr> 
            <th> Donation </th>
            <th> Quantity </th>
            <th> Donor </th>
        </tr>
    </thead>
    <tbody>
     <c:forEach var="donation" items="${allDonations}">
     	<tr>
     		<td><a href="/donation/show/${donation.id}"><c:out value="${donation.donationName}"/></a></td>
     		<td><c:out value="${donation.quantity}"/></td>
     		<td><c:out value="${donation.donor}"/></td>
     	</tr>
     </c:forEach>
     </tbody>
    </table>
</body>
</html>