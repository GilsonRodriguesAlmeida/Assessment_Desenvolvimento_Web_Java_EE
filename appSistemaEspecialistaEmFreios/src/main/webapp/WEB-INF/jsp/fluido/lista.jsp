<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Lista de Fluido</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body style="background-color:#cedddd;" >
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/> 
	
	<div class="container">

		<form action="/fluido" method="get">
			<button type="submit" class="btn btn-link">Incluir</button>
		</form>
		<hr>
		
		<c:if test="${not empty fluido}">
			<c:if test="${not empty msg}">
				<div class="alert alert-success">
					<strong>Sucesso</strong> ${msg}
				</div>
			</c:if>
			
			<h3>Quantidade de fluidos cadastrados: (${fluido.size()})</h3>
			<hr>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Descrição</th>
						<th>Quantidade</th>
						<th>Marca do Produto</th>
						<th>Peso</th>
						<th>Numero do Fluido</th>
						<th>Tamanho do Fluido</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
				 	<c:forEach var="f" items="${fluido}">
					 	<tr>
							<td>${f.id}</td>
							<td>${f.descricao}</td>
							<td>${f.quantidade}</td>
							<td>${f.marcaDoProduto}</td>
							<td>${f.peso} Kg</td>
							<td>${f.fluidoNumero}</td>
							<td>${f.tamanho}</td>
							<td><a href="/fluido/${f.id}/excluir">Excluir</a></td>
						</tr>
				 	</c:forEach>
				</tbody>
			</table>
		</c:if>
		<c:if test="${empty fluido}">
			<h4>Não existem fluidos cadastrados!</h4>
		</c:if>
	</div>

</body>
</html>