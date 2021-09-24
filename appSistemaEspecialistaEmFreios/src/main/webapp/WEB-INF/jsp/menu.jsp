<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<nav class="navbar navbar-inverse sticky-top">
			<div class="container-fluid">
  			<div class="navbar-header">
  				 <a class="navbar-brand" href="/dados">SystemBreak &reg</a>
  			</div>
  			<ul class="nav navbar-nav">
			<li class="nav-item"><a class="nav-link active" aria-current="page" href="/">Home</a></li>
			<c:if test="${not empty user}">
				<li class="nav-item"><a class="nav-link" href="/empresa/lista">Clientes</a></li>
				<li class="nav-item"><a class="nav-link" href="/usuario/lista">Usuários</a></li>
				<li class="nav-item"><a class="nav-link" href="/disco/lista">Disco</a></li>
				<li class="nav-item"><a class="nav-link" href="/fluido/lista">Fluido</a></li>
				<li class="nav-item"><a class="nav-link" href="/pastilha/lista">Pastilha</a></li>
				<li class="nav-item"><a class="nav-link" href="/produto/lista">Produtos</a></li>
				<li class="nav-item"><a class="nav-link" href="/estoque/lista">Faturado</a></li>
			</c:if>
		</ul >
		<ul class="nav navbar-nav navbar-right">
			<c:if test="${empty user }">
				<li class="nav-item"><a href="/user"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li class="nav-item"><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</c:if>
			<c:if test="${not empty user }">
				<li class="nav-item"><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout, <strong>${user.nome}</strong></a></li>
			</c:if>
		</ul>		
	</div>
</nav>
