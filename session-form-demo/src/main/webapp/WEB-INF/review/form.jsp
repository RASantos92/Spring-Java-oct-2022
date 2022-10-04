<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>review form</h1>
		${error}
	<form action="/review/form" method="post">
		<input type="hidden" name="reviewer" value="Bobby Brown"/>
        <div>
            <label> Movie </label>
            <input type="text" name="movie"/>
        </div>
        <div>
            <label> Comment </label>
            <textarea name="comment"></textarea>
        </div>
        <div>
            <label> Rating </label>
            <input type="number" min="5" max="25" name="rating"/>
        </div>
            <button type="submit">review movie</button>
    </form>
</body>
</html>