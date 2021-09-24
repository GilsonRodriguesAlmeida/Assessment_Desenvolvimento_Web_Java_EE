<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Sistema Freios</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<body style="background-color:#cedddd;"/>
	
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container">
		<ul class="list-group">
			<c:forEach var="mapa" items="${contagem}">
				<li class="list-group-item">${mapa.key} <span class="badge">${mapa.value}</span></li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>