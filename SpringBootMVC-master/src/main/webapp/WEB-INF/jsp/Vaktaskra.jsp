<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="is">

    <head>
		<title>Vaktaskrá</title>
    </head>
    <body>

    <h1>Vaktaskrá</h1>
    <p>Here could be some information about the mechanics work schedules.</p>

    <table border="1px gray">
        <thead>
            <tr style="font-weight: 600;">
                <td>Name</td>
                <td>Job</td>
                <td>email</td>
                <td>Description</td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>${name}</td>
                <td>${job}</td>
                <td>${email}</td>
                <td>${description}</td>
            </tr>
        </tbody>
    </table>

    <table border="1px gray">
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
