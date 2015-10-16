<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/css/main.css" />" rel="stylesheet">
<html lang="is">

    <head>
        <title>Project Title</title>
    </head>
    <body>
		  <form action="home" method="get">
			  Notendanafn: <input type="text"><br>
			  Lykilorð: <input type="text"><br>
			  <input type="submit" value="Submit">
			</form>
    </body>
    <footer>Class HBV501G, University of Iceland, Fall 2015</footer>
</html>
