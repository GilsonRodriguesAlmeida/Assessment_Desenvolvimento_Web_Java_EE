<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastro Pastilhas</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body style="background-color:#cedddd;">
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container">
		<h2>Cadastro de Pastilhas de Freios</h2>
	  	<form action="/pastilha/incluir" method="post">
		    <div class="form-group">
		      	<label>Descrição:</label>
		      	<input type="text" class="form-control" value="Pastilha/Freio" placeholder="Digite a descrição do Produto" name="descricao">
		    </div>
		    
		    <div class="form-group">
		     	<label>Quantidade:</label>
		      	<input type="text" class="form-control" value="2" placeholder="Digite a Quantidade" name="quantidade">
		    </div>
		    
		    <div class="form-group">
		     	<label>Marca do Produto:</label>
		      	<input type="text" class="form-control" value="Bosh" placeholder="Digite a marcado produto" name="marcaDoProduto">
		    </div>
		    
		    <div class="form-group">
		     	<label>Modelo do Veículo:</label>
		      	<input type="text" class="form-control" value="Pampa" placeholder="Digite a modelo do veículo" name="modeloVeiculo">
		    </div>
		    
		    <div class="form-group">
		     	<label>Marca do Veículo:</label>
		      	<input type="text" class="form-control" value="Ford" placeholder="Digite a marca do veículo" name="marcaVeiculo">
		    </div>
		    
		    <div class="form-group">
				<label>Material:</label>
				<select class="form-control" name="material">
					<option>Pastilha orgânica</option>
					<option>Pastilha semimetálica</option>
					<option>Pastilha cerâmica</option>
					<option>Pastilha metálica</option>
				</select>
			</div>	
			
		    <button type="submit" class="btn btn-default">Cadastrar</button>
	  	</form>
	</div>
</body>
</html>