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

	<c:set var="btnHabitado" value="" />
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container">
		<h2>Cadastro de Estoque</h2>
	  	<form action="/estoque/incluir" method="post">
	  		
	  		<div class="form-group">
				<c:if test="${not empty empresas}">
					<label>Empresa:</label>
					<select class="form-control" name="empresas.id">
						<c:forEach var="emp" items="${empresas}">
							<option value="${emp.id}">${emp.nome}</option>
						</c:forEach>
					</select>
				</c:if>
				<c:if test="${empty empresas}">
					<c:set var="btnHabitado" value="disabled" />
					<label>Não existem Clientes cadastrados!</label>
				</c:if>
			</div>	
			
		    <div class="form-group">
		      	<label>Descrição:</label>
		      	<input type="text" class="form-control" value="Separar/Pedido" placeholder="Digite a dscrição" name="descricao">
		    </div>
			
			<div class="form-group">
				<c:if test="${not empty produtos}">
					<label>Produtos:</label>
					<c:forEach var="p" items="${produtos}">
						<div class="form-check">
							<label class="form-check-label">
							<input name="produtosId" type="checkbox" checked="checked" value="${p.id}"> ${p.descricao}</label>
						</div>
					</c:forEach>
				</c:if>
				<c:if test="${empty produtos}">
					<c:set var="btnHabitado" value="disabled" />
					<label>Não existem Produtos cadastrados!</label>
				</c:if>
			</div>
			
			<button type="submit" ${btnHabitado} class="btn btn-default">Cadastrar</button>
	  </form>
	</div>
</body>
</html>