<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>Lista Pastilhas</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body style="background-color:#cedddd;">
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/> 
	
	<div class="container">

		<form action="/pastilha" method="get">
			<button type="submit" class="btn btn-link">Incluir</button>
		</form>
		<hr>
		
		<c:if test="${not empty pastilha}">
			<c:if test="${not empty msg}">
				<div class="alert alert-success">
					<strong>Sucesso</strong> ${msg}
				</div>
			</c:if>
			
			<h3>Quantidade de pastilhas cadastrados: (${pastilha.size()})</h3>
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
						<th>Material</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				 	<c:forEach var="p" items="${pastilha}">
					 	<tr>
							<td>${p.id}</td>
							<td>${p.descricao}</td>
							<td>${p.quantidade}</td>
							<td>${p.marcaDoProduto}</td>
							<td>${p.modeloVeiculo}</td>
							<td>${p.marcaVeiculo}</td>
							<td>${p.material}</td>
							<td><a href="/pastilha/${p.id}/excluir">Excluir</a></td>
						</tr>
				 	</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty pastilha}">
			<h4>Não existem pastilhas cadastrados!</h4>
		</c:if>
	</div>

</body>
</html>