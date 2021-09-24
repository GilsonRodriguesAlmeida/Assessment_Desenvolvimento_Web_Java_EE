<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastro Disco</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body style="background-color:#cedddd;">
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container">
		<h2>Cadastro de Disco de Freios</h2>
	  	<form action="/disco/incluir" method="post">
		    <div class="form-group">
		      	<label>Descrição:</label>
		      	<input type="text" class="form-control" value="Disco/Freio" placeholder="Digite a descrição do Produto" name="descricao">
		    </div>
		    
		    <div class="form-group">
		     	<label>Quantidade:</label>
		      	<input type="text" class="form-control" value="2" placeholder="Digite a Quantidade" name="quantidade">
		    </div>
		    
		    <div class="form-group">
		     	<label>Marca do Produto:</label>
		      	<input type="text" class="form-control" value="Dpaschoal" placeholder="Digite a marcado produto" name="marcaDoProduto">
		    </div>
		    
		    <div class="form-group">
		     	<label>Modelo do Veículo:</label>
		      	<input type="text" class="form-control" value="Pampa" placeholder="Digite a modelo do veículo" name="modeloVeiculo">
		    </div>
		    
		    <div class="form-group">
		     	<label>Marca do Veículo:</label>
		      	<input type="text" class="form-control" value="Ford" placeholder="Digite a marca do veículo" name="marca">
		    </div>
		    
		    <div class="form-group">
				<label>Tamanho do Produto:</label>
				<select class="form-control" name="tamanho">
					<option>22 mm</option>
					<option>24 mm</option>
					<option>26 mm</option>
				</select>
			</div>	
			
		    <button type="submit" class="btn btn-default">Cadastrar</button>
	  	</form>
	</div>
</body>
</html>