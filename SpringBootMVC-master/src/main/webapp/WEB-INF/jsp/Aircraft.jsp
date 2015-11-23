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
<<<<<<< HEAD

    <p>Here could be some information about an aircraft.</p>

  	${aircraft.getId()}
  	</br>
  	
  	<table>
  		${aircraft.valueToString()}
  	</table>
  	</br>
  	
=======
    
    <div class="table">
		<table>
			${aircraft.valueToString()}
		</table>
	</br>
	</div>
>>>>>>> 7287e622b07bf7a425ca5292c5a858c0e5ba2db1

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
