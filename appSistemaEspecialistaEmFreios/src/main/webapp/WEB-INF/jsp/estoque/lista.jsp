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

		<form action="/estoque" method="get">
			<button type="submit" class="btn btn-link">Incluir</button>
		</form>
		<hr>
		
		<c:if test="${not empty lista}">
			<c:if test="${not empty msg}">
				<div class="alert alert-success">
					<strong>Sucesso</strong> ${msg}
				</div>
			</c:if>
			
			<h3>Quantidade existente no estoque: (${lista.size()})</h3>
			<hr>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Descrição</th>
						<th>Empresa</th>
						<th>Produtos</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				 	<c:forEach var="e" items="${lista}">
					 	<tr>
							<td>${e.id}</td>
							<td>${e.descricao}</td>
							<td>${e.empresas.nome}</td>
							<td>${e.produtos.size()}</td>
							<td><a href="/estoque/${e.id}/excluir">Excluir</a></td>
						</tr>
				 	</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty lista}">
			<h4>Não existem  estoque cadastrados!</h4>
		</c:if>
	</div>	
</body>
</html>