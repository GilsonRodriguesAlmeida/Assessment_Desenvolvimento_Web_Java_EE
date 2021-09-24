<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>Lista Disco</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body style="background-color:#cedddd;">
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/> 
	
	<div class="container">

		<form action="/disco" method="get">
			<button type="submit" class="btn btn-link">Incluir</button>
		</form>
		<hr>
		
		<c:if test="${not empty disco}">
			<c:if test="${not empty msg}">
				<div class="alert alert-success">
					<strong>Sucesso</strong> ${msg}
				</div>
			</c:if>
			
			<h3>Quantidade de discos cadastrados: (${disco.size()})</h3>
			<hr>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Descrição</th>
						<th>Quantidade</th>
						<th>Marca do Produto</th>
						<th>Modelo do Veiculo</th>
						<th>Marca do Veiculo</th>
						<th>Tamanho</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				 	<c:forEach var="d" items="${disco}">
					 	<tr>
							<td>${d.id}</td>
							<td>${d.descricao}</td>
							<td>${d.quantidade}</td>
							<td>${d.marcaDoProduto}</td>
							<td>${d.modeloVeiculo}</td>
							<td>${d.marca}</td>
							<td>${d.tamanho}</td>
							<td><a href="/pastilha/${d.id}/excluir">Excluir</a></td>
						</tr>
				 	</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty disco}">
			<h4>Não existem discos cadastrados!</h4>
		</c:if>
	</div>

</body>
</html>