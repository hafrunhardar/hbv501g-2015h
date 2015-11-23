<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/css/main.css" />" rel="stylesheet">
<html lang="is">

    <head>
		<title>Employee</title>
    </head>
    <body>

	<header>
    	<h1>Employee</h1>
    </header>
      	
	<table>
	    <thead>
            <tr style="font-weight: 600;">
                <td></td>
                <td>ID</td>
                <td>Name</td>
                <td>Kt</td>
                <td>Username</td>
                <td>Phone</td>
                <td>Email</td>
                <td>Capability</td>
            </tr>
        </thead>
        <tbody>
	  		<c:forEach var = "employee" items="${employee}">
	  			<tr>
	  				<td>${employee.valueToString()}</td>
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
				<div class="button">
	    			<form action="../home" method="get">
	    				<input type="submit" value="Til baka">
					</form>
				</div>
            </tr>
        </tbody>
    </table>

    </body>

</html>
