<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastro de Usuários</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body style="background-color:#cedddd;">
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container">
	
		<c:if test="${not empty mensagem}">
			<div class="alert alert-danger">
				<strong>Problema!</strong> ${mensagem}
			</div>
		</c:if>
	
	    <h2>Cadastro de Usuários</h2>
	    
	    	<form action="/cep" class="form-inline" method="post">
		    	<div class="form-group">
					<label>Cep:</label> 
					<input type="text" class="form-control" value="50830-210" placeholder="Digite o seu Cep" name="cep">
					<button type="submit" class="btn btn-primary">Buscar</button>
				</div>
			</form>
			
			<form action="/user" method="post">

			<div class="form-group">
				<label>Nome:</label> 
				<input type="text" class="form-control" value="Maria Garcia" placeholder="Digite o seu nome" name="nome">
			</div>

			<div class="form-group">
	     		<label>E-mail:</label>
	      		<input type="email" class="form-control" value="maria_garcia@email.com" placeholder="Digite o seu email" name="email">
	    	</div>
	    
	    	<div class="form-group">
	     		<label>Senha:</label>
	      		<input type="password" class="form-control" value="123" placeholder="Digite a sua senha" name="senha">
	    	</div>
			
			<c:import url="/WEB-INF/jsp/endereco.jsp"/>
	    
	    	<button type="submit" class="btn btn-default">Cadastrar</button>
	    </form>
	</div>
</body>
</html>