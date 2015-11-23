<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/css/main.css" />" rel="stylesheet">
<html lang="is">

    <head>
		<title>Work Schedule</title>
    </head>
    <body>

	<header>
    	<h1>Work Schedule</h1>
   	</header>
   	
    <p>Here could be a list of work schedules.</p>

  	<c:forEach var = "workSchedule" items="${workSchedule}">
  		<tr>
  			<td><a href ="/home/workSchedule/${workSchedule.getId()}">${workSchedule.getId()}</td>
  			</br>
  		</tr>
  	</c:forEach>
  		

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
