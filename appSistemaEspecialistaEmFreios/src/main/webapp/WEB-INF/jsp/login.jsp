<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>Login</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href ="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body style="background-color:#cedddd;">

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div id="main" class="container">
	
		<c:if test="${not empty mensagem}">
			<div class="alert alert-danger">
			  <strong>Problema!</strong> ${mensagem}
			</div>
		</c:if>
	
	  <h2>Autenticação</h2>
	  <form action="/login" method="post">

	    <div class="form-group">
	      <label>E-mail:</label>
	      <input value="gilson@gmail.com" type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
	    </div>

	    <div class="form-group">
	      <label>Senha:</label>
	      <input value="123" type="password" class="form-control" placeholder="Entre com a sua senha" name="senha">
	    </div>

	    <button type="submit" class="btn btn-default">Entrar</button>
	  </form>
	</div>	  
</body>
</html>