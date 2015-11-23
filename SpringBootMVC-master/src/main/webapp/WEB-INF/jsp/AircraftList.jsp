<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/css/main.css" />" rel="stylesheet">
<html lang="is">

    <head>
		<title>Aircraft List</title>
    </head>
    <body>

	<header>
    	<h1>Aircraft List</h1>
   	</header>

    <table>
        <thead>
            <tr style="font-weight: 600;">
                <td>Details</td>
                <td></td>
                <td>ID</td>
                <td>Tail number</td>
                <td>TSN</td>
                <td>APU</td>
                <td>Engine</td>
                <td>Location</td>
                <td>Status</td>
                <td>Malfunctions</td>
            </tr>            
        </thead>
        <tbody>
	  		<c:forEach var = "aircraft" items="${aircraft}">
	  			<tr>
	  				<td> <a href ="/home/aircraftList/${aircraft.getId()}">${"View aircraft"}</td>	
	  				<td>${aircraft.valueToString()}</td>
	  			</tr>
		  	</c:forEach>
        </tbody>
    </table>
  	</br>

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
