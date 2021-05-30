<%@page import="fr.cda.TpCalculJSP.web.VerifMDPModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	
	<% VerifMDPModel model = (VerifMDPModel)request.getAttribute("model"); %>  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form method="post" action="loginMDP">
		
		Login : <br>
		<input type="text" name="login" value="<%= model.getLogin() %>"> <br>
		Mot de passe : <br>
		<input type="password" name="mdp" value="<%= model.getMdp() %>"> <br>
		<input type="submit">
		
	</form>

</body>
</html>