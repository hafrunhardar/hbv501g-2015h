<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/css/main.css" />" rel="stylesheet">
<html lang="is">

    <head>
		<title>Training</title>
    </head>
    <body>

	<header>
	    <h1>Training</h1>
    </header>
    
    <table>
        <thead>
            <tr style="font-weight: 600;">
                <td>ID</td>
                <td>Username</td>
                <td>Date Stamp</td>
                <td>Location</td>
                <td>Next Due</td>
                <td>Teacher</td>
                <td>Kt</td>
            </tr>
        </thead>
        <tbody>
	  		<c:forEach var = "training" items="${training}">
	  			<tr>
	  				<td>${training.valueToString()}</td>
	  			</tr>
		  	</c:forEach>
        </tbody>
    </table>

    <table>
        <thead>
            
        </thead>
        <tbody>
            <tr>
    			<form action="../home" method="get">
    				<input type="submit" value="Til baka">
				</form>
            </tr>
        </tbody>
    </table>

    </body>

</html>
