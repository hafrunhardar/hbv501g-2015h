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
    
<<<<<<< HEAD
    <p>Here could be some information about the mechanics.</p>
  	
  	<table>
  		<c:forEach var = "employee" items="${employee}">
  			<tr>
  				<td>${employee.valueToString()}</td>
  			</tr>
  			</br>
  	</c:forEach>
  	
  	</table>
  	</br>
  	
    <table border="1px gray">
=======
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
>>>>>>> 7f031b6e6a226fd0cfd0499902e1aa337463ad09
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
