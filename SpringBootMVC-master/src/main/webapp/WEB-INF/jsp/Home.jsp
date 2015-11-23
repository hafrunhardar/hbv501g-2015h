<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/css/main.css" />" rel="stylesheet">
<html lang="is">

	<head>
		<title>Home</title>
	</head>
	<body>

		<header>
			<h1>Home</h1>
		</header>

		<main>
			<div class="table">
				<table border="1px gray">
					<thead>
						
					</thead>
					<tbody>
						<tr>
							<div class="button" id="mainlist">
								<form action="home/aircraftList">
									<input type="submit" value="Aircraft List">
								</form>
							</div>
							<div class="button" id="mainlist">
								<form action="home/employee">
									<input type="submit" value="Employee">
								</form>
							</div>
							<div class="button" id="mainlist"> 
								<form action="home/workSchedule">
									<input type="submit" value="Work Schedule">
								</form>
							</div>
							<div class="button" id="mainlist">
								<form action="home/training">
									<input type="submit" value="Training">
								</form>
							</div>
							<div class="button" id="mainlist">
								<form action="home/contact">
									<input type="submit" value="Contact">
								</form>						
							</div>
						</tr>
					</tbody>
				</table>
			</div>
		</main>

	</body>

</html>
