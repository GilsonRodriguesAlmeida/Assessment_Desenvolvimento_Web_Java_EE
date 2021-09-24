<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>Cadastro de Fluido</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	
</head>
<body style="background-color:#cedddd;">
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container">
		<h2>Cadastro de Fluido de Freios</h2>
	  	<form action="/fluido/incluir" method="post">
		    <div class="form-group">
		      	<label>Descrição:</label>
		      	<input type="text" class="form-control" value="Fluido/Freio" placeholder="Digite a descrição do Produto" name="descricao">
		    </div>
		    
		    <div class="form-group">
		     	<label>Quantidade:</label>
		      	<input type="text" class="form-control" value="2" placeholder="Digite a Quantidade" name="quantidade">
		    </div>
		    
		    <div class="form-group">
		     	<label>Marca do Produto:</label>
		      	<input type="text" class="form-control" value="Formula-1" placeholder="Digite a marcado produto" name="marcaDoProduto">
		    </div>
		    
		    <div class="form-group">
		     	<label>Peso:</label>
		      	<input type="text" class="form-control" value="0,3"placeholder="Digite a modelo do veículo" name="peso">
		    </div>
		    
		    <div class="form-group">
		     	<label>Numero do Fluido:</label>
		      	<input type="text" class="form-control" value="3" placeholder="Digite a marca do veículo" name="fluidoNumero">
		    </div>
		    
		    <div class="form-group">
				<label>Tamanho do Produto:</label>
				<select class="form-control" name="tamanho">
					<option>250 ml</option>
					<option>500 ml</option>
					<option>1000 ml</option>
				</select>
			</div>	
			
		    <button type="submit" class="btn btn-default">Cadastrar</button>
	  	</form>
	</div>
</body>
</html>