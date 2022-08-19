<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Cadastro</title>
		<link rel="stylesheet" href="./css/style.css">
	</head>
	<body>
		<nav id="menu">
			<ul>
				<li><a href="index.jsp">Home</a></li>
				<li><a href="cadastro.jsp">Cadastro</a></li>
			</ul>		
		</nav>
		<main>
		<!--  
			<div align="center">
				<table class = "tb_round">
					<thead>
						<tr>
							<th class="th_dash"><b>#ID</b></th>
							<th class="th_dash"><b>Nome</b></th>
							<th class="th_dash"><b>Data de Nascimento</b></th>
						</tr>
					</thead>
					<tbody>
					
						<tr>
							<td class="td_groove">1</td>
							<td class="td_groove">Ricardo Eduardo Aragão</td>
							<td class="td_groove txt-center">04/08/1946</td>
						</tr>
						
						<tr>
							<td class="td_groove">2</td>
							<td class="td_groove">Ian Augusto Gabriel Melo</td>
							<td class="td_groove txt-center">22/03/1969</td>
						</tr>
						
						<tr>
							<td class="td_groove">3</td>
							<td class="td_groove">Samuel Thomas Vieira</td>
							<td class="td_groove txt-center">17/03/1982</td>
						</tr>
						
						<tr>
							<td class="td_groove">4</td>
							<td class="td_groove">Luciana Vitória Isabela Aparício</td>
							<td class="td_groove txt-center">03/08/1945</td>
						</tr>
					</tbody>
				</table>
			</div>
		-->
			<br/>
			<br/>
			
		
			<div class="container" align = "center">
				<p class="title">Cadastro de Pessoas</p>
				<form action="pessoa" method="post">
					<table>
						<tr>
							<td>
								<input type="number" class="input_id" min="0" step="1" id="txtId" name="txtId" placeholder="#ID" required="required">
							</td>
						</tr>
						<tr>
							<td>
								<input type="text" class="input_name" id="txtNome" name="txtNome" placeholder="Nome" required="required">
							</td>
						</tr>
						<tr>
							<td>
								<input type="date" class="input_date" id="dtDataNasc" name="dtDataNasc" placeholder="Data de Nascimento" required="required">
							</td>
						</tr>
						<tr>
							<td>
								<input type="submit" id="btnSubmit" name="btnSubmit" value="Enviar">
							</td>
						</tr>
					</table>
				</form>
			</div>
		</main>
	</body>
</html>