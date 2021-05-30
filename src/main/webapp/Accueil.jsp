<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>

	<p> <%= request.getAttribute("id") %> </p>

	<a href="calcul">Calcul</a> <br>
	<a href="calculPrix">Calcul Prix</a><br><br>
	<a href="loginMDP">Déconnexion</a>
</body>
</html>