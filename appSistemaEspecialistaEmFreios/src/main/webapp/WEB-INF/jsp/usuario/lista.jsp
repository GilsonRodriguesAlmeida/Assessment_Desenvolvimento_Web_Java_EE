<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>Lista de Usuários</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body style="background-color:#cedddd;">

	<c:import url="/WEB-INF/jsp/menu.jsp"/> 
	
	<div class="container">
		<c:if test="${not empty lista}">
			<c:if test="${not empty msg}">
				<div class="alert alert-danger">
					<strong>Problema</strong> ${msg}
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
						<th>Empresas</th>
						<th>Produtos</th>
						
						<c:if test="${user.admin}">
							<th></th>
						</c:if>
					</tr>
				</thead>
				<tbody>
				 	<c:forEach var="u" items="${lista}">
					 	<tr>
							<td>${u.id}</td>
							<td>${u.nome}</td>
							<td>${u.email}</td>
							<td>${u.empresas.size()}</td>
							<td>${u.produtos.size()}</td>
							
							<c:if test="${user.admin}">
								<td>
									<c:choose>
										<c:when test="${user.id != u.id}">
											<a href="/usuario/${u.id}/excluir">Excluir</a>
										</c:when>
									</c:choose>

								</td>
							</c:if>
						</tr>
				 	</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty lista}">
			<h4>Não existem usuários cadastrados!</h4>
		</c:if>
	</div>

</body>
</html>