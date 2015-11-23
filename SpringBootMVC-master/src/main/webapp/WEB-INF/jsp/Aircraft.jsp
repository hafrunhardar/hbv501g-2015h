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
    
	<table>
	    <thead>
            <tr style="font-weight: 600;">
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
  			<tr>
  				${aircraft.valueToString()}
  			</tr>
        </tbody>
	</table>
	</br>

    <table>
        <thead>
            <tr style="font-weight: 600;">
                <td>Dataloader</td>
                <td>ETOPS</td>
                <td>WiFi</td>
                <td>IFE</td>
                <td>Lightning system</td>
                <td>Type of CPE</td>
                <td>LCDMod</td>
                <td>Software Type</td>
                <td>ACARS</td>
            </tr>
        </thead>
        <tbody>
  			<tr>
  				${aircraftConfig.valueToString()}
  			</tr>
        </tbody>
   	</table>
	</br>
	
    <table>
        <tbody>
            <tr>
				<div class="button" id="back">
	    			<form action="../aircraftList" method="get">
	    				<input type="submit" value="Til baka">
					</form>
				</div>
            </tr>
        </tbody>
    </table>
  	
    </body>
</html>
