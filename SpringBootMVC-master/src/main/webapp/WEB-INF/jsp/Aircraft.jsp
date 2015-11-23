<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/css/main.css" />" rel="stylesheet">
<html lang="is">

    <head>
		<title>Aircraft</title>
    </head>
    <body>

	<header>
    	<h1>Aircraft</h1>
    </header>
    
    <div class="table">
		<table>
			${aircraft.valueToString()}
		</table>
	</br>
	</div>

    <div class="table">
	    <table border="1px gray">
			${aircraftConfig.valueToString()}
		</table>
	</br>
	</div>
	
    <table border="1px gray">
        <thead>
            
        </thead>
        <tbody>
            <tr>
    			<form action="../aircraftList" method="get">
    				<input type="submit" value="Til baka">
				</form>
            </tr>
        </tbody>
    </table>

    </body>

</html>
