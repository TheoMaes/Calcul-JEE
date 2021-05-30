<%@page import="fr.cda.TpCalculJSP.web.CalculPrixModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% CalculPrixModel model = (CalculPrixModel)request.getAttribute("model"); %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calcul Prix</title>
</head>
<body>
	<%= request.getAttribute("id") %><br><br>
	<form method="post" action="calculPrix">
	
		Prix :<br>
		<input type="numeric" name="prix" value=" <%= model.getPrix() %> "><br>
		<input type="numeric" name="tva" value=" <%= model.getTva() %> "><br>
		Résultat : <%= model.getResultat() %><br>
		<input type="submit">
	
	</form>
	<br><br>
	<a href="accueil">Retour</a>

</body>
</html>