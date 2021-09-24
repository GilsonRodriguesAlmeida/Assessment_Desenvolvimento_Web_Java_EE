<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Lista Disco</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body style="background-color: #cedddd;">

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container">


		<c:if test="${not empty msg}">
			<div class="alert alert-success">
				<strong>Sucesso</strong> ${msg}
			</div>
		</c:if>
		<c:if test="${not empty produtos}">
			<h3>Quantidade de produtos cadastrados: (${produtos.size()})</h3>
			<hr>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Descrição</th>
						<th>Quantidade</th>
						<th>Marca do Produto</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="p" items="${produtos}">
						<tr>
							<td>${p.id}</td>
							<td>${p.descricao}</td>
							<td>${p.quantidade}</td>
							<td>${p.marcaDoProduto}</td>
							<td><a href="/produto/${p.id}/excluir">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty produtos}">
			<h4>Não existem produtos cadastrados!</h4>
		</c:if>
	</div>

</body>
</html>