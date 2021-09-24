<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>Cadastro de Empresas</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body style="background-color:#cedddd;">
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container">
		<h2>Cadastro de Empresas</h2>
	  	<form action="/empresa/incluir" method="post">
	  	
		    <div class="form-group">
		      	<label>Nome:</label>
		      	<input type="text" value="Oficina Tião" class="form-control" placeholder="Digite o nome da empresa" name="nome">
		    </div>

		    <div class="form-group">
		     	<label>E-mail:</label>
		      	<input type="email" value="oficinatiao@email.com"class="form-control" placeholder="Digite o email" name="email">
		    </div>

			<div class="form-group">
				<label>Telefone:</label> <input type="text" value="3030-3131" class="form-control"
					placeholder="Digite o telefone" name="telefone">
			</div>

			<div class="form-group">
				<label>Cnpj:</label> <input type="text" value="02.196.624/0001-51" class="form-control"
					placeholder="Digite o cnpj" name="cnpj">
			</div>

			<button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>
</body>
</html>