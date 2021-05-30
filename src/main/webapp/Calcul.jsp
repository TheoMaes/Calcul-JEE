<%@page import="fr.cda.TpCalculJSP.web.CalculModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% CalculModel model = (CalculModel)request.getAttribute("model"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calcul</title>
</head>
<body>
	<%= request.getAttribute("id") %><br><br>
	<form method="post" action="calcul">
	
		<input type="number" name="nombre1" value=" <%= model.getNombre1() %> "><br>
		<input type="number" name="nombre2" value=" <%= model.getNombre2() %> "><br>
		<input type="submit"><br>
		<label>Resultat : <%= model.getResultat() %></label><br><br>
		<a href="accueil">Retour</a>
	
	</form>
	
</body>
</html>