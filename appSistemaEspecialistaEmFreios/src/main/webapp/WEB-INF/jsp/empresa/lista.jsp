<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Lista de Empresas</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body style="background-color:#cedddd;">
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/> 
	
	<div class="container">

		<form action="/empresa" method="get">
			<button type="submit" class="btn btn-link">Incluir</button>
		</form>
		<hr>
		
		<c:if test="${not empty lista}">
			<c:if test="${not empty msg}">
				<div class="alert alert-success">
					<strong>Sucesso</strong> ${msg}
				</div>
			</c:if>
			
			<h3>Quantidade de usuários existentes: (${lista.size()})</h3>
			<hr>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome</th>
						<th>E-mail</th>
						<th>Telefone</th>
						<th>Cnpj</th>
						<th>Usuário</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				 	<c:forEach var="e" items="${lista}">
					 	<tr>
							<td>${e.id}</td>
							<td>${e.nome}</td>
							<td>${e.email}</td>
							<td>${e.telefone}</td>
							<td>${e.cnpj}</td>
							<td>${e.usuario.nome}</td>
							<td><a href="/empresa/${e.id}/excluir">Excluir</a></td>
						</tr>
				 	</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty lista}">
			<h4>Não existem empresas cadastradas!</h4>
		</c:if>
	</div>	
</body>
</html>