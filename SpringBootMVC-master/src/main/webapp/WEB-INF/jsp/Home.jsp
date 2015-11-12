<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="is">

	<head>
		<title>Home</title>
	</head>
	<body>

		<header>
			<h1>Home</h1>
		</header>

		<main>
			<div class="description">
				<p>Here could be some options for the users to choose from.</p>
			</div>
			<div class="table">
				<table border="1px gray">
					<thead>
						
					</thead>
					<tbody>
						<tr>
							<form action="home/vaktaskra">
								<input type="submit" value="Vaktaskrá">
							</form>
							<form action="home/namskeid">
								<input type="submit" value="Námskeið">
							</form>
						</tr>
					</tbody>
				</table>
			</div>
		</main>

	</body>

</html>
