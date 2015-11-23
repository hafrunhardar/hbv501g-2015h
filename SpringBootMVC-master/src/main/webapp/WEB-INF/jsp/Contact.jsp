<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/css/main.css" />" rel="stylesheet">
<html lang="is">

    <head>
		<title>Contact</title>
    </head>
    <body>

	<header>
    	<h1>Contact</h1>
    </header>
    
    <table>
        <thead>
            <tr style="font-weight: 600;">
                <td>ID</td>
                <td>Name</td>
                <td>Location</td>
                <td>Address</td>
                <td>Email</td>
                <td>Phone number</td>
            </tr>
        </thead>
        <tbody>
	  		<c:forEach var = "contact" items="${contact}">
	  			<tr>
	  				${contact.valueToString()}
	  			</tr>
		  	</c:forEach>
        </tbody>
    </table>
  	</br>
  	

    <table border="1px gray">
        <thead>
            
        </thead>
        <tbody>
            <tr>
				<div class="button" id="back">
	    			<form action="../home" method="get">
	    				<input type="submit" value="Til baka">
					</form>
				</div>
            </tr>
        </tbody>
    </table>

    </body>

</html>
