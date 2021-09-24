<body style="background-color:#cedddd;">

	<div id="main">
		<div class="form-group">
			<label>Cep:</label> 
			<input type="text" class="form-control" value="${enderecoBusca.cep}" placeholder="Digite o seu Cep" name="cep">
		</div>
		
		<div class="form-group">
			<label>Logradouro:</label> 
			<input type="text" class="form-control" value="${enderecoBusca.logradouro}" placeholder="Digite o seu Logradouro" name="logradouro">
		</div>
		
		<div class="form-group">
			<label>Complemento:</label> 
			<input type="text" class="form-control" value="${enderecoBusca.complemento}" placeholder="Digite o Complemento" name="complemento">
		</div>
		
		<div class="form-group">
			<label>Bairro:</label> 
			<input type="text" class="form-control" value="${enderecoBusca.bairro}" placeholder="Digite o Bairro" name="bairro">
		</div>
		
		<div class="form-group">
			<label>Localidade:</label> 
			<input type="text" class="form-control" value="${enderecoBusca.localidade}" placeholder="Digite a Cidade" name="localidade">
		</div>
		
		<div class="form-group">
			<label>UF:</label> 
			<input type="text" class="form-control" value="${enderecoBusca.uf}" placeholder="Digite o Estado" name="uf">
		</div>
	</div>
</body>