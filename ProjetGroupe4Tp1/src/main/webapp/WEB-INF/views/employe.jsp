<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Gestion de comptes</title>

<!-- Paramètres d'affichage -->
<style type="text/css">
h1 {
	margin: 30px 0;
	padding: 0 200px 15px 0;
	border-bottom: 1px solid #E5E5E5;
}

.bs-example {
	margin: 20px;
}

.list-group {
	width: 200px;
}

body {
	position: relative; /* required */
}

ul.nav-tabs {
	width: 140px;
	margin-top: 20px;
	border-radius: 4px;
	background: #fff;
	z-index: 999;
	border: 1px solid #ddd;
	box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);
}

ul.nav-tabs li {
	margin: 0;
	border-top: 1px solid #ddd;
}

ul.nav-tabs li:first-child {
	border-top: none;
}

ul.nav-tabs li a {
	margin: 0;
	padding: 8px 16px;
	border-radius: 0;
}

ul.nav-tabs li.active a,ul.nav-tabs li.active a:hover {
	color: #fff;
	background: #0088cc;
	border: 1px solid #0088cc;
}

ul.nav-tabs li:first-child a {
	border-radius: 4px 4px 0 0;
}

ul.nav-tabs li:last-child a {
	border-radius: 0 0 4px 4px;
}

ul.nav-tabs.affix {
	top: 0px; /* set the top position of pinned element */
}

@media screen and (min-width: 992px) and (max-width: 1199px) {
	ul.nav-tabs {
		width: 180px; /* set nav width on medium devices */
	}
}

@media screen and (min-width: 1200px) {
	ul.nav-tabs {
		width: 220px; /* set nav width on large devices */
	}
}
</style>

</head>
<body data-spy="scroll" data-target="#myScrollspy">

	<!-- Barre de tache super sympa -->
	<div class="bs-example">
		<ul class="nav nav-pills">
			<li role="presentation"><a href="accueil">Accueil</a></li>

			<li role="presentation" class="dropdown"><a href="compte"
				data-toggle="dropdown" class="dropdown-toggle">Compte<b
					class="caret"></b></a>

				<ul class="dropdown-menu">
					<li><a href="compte">Ajouter un compte</a></li>
					<li><a href="compte">Consulter un compte</a></li>
					<li><a href="compte">Consulter tous les comptes d'un
							client</a></li>
					<li><a href="compte">Consulter tous les comptes crées par
							un employé</a></li>
					<li><a href="compte">Modifier un compte</a></li>
					<li><a href="compte">Supprimer un compte</a></li>
					<li><a href="compte">Ajouter une opération</a></li>
					<li><a href="compte">Effectuer un versement</a></li>
					<li><a href="compte">Effectuer un retrait</a></li>
					<li><a href="compte">Effectuer un virement</a></li>
				</ul></li>

			<li role="presentation" class="active"><a href="employe"
				data-toggle="dropdown" class="dropdown-toggle">Employé <b
					class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="employe">Ajouter un employé</a></li>
					<li><a href="employe">Consulter un employé</a></li>
					<li><a href="employe">Consulter tous les employés</a></li>
					<li><a href="employe">Consulter tous les employés d'un
							groupe</a></li>
					<li><a href="employe">Ajouter un employé à un groupe</a></li>
					<li><a href="employe">Ajouter un groupe</a></li>
					<li><a href="employe">Consulter un groupe</a></li>
					<li><a href="employe">Consulter tous les groupes</a></li>
				</ul></li>
			<li role="presentation" class="dropdown"><a href="client"
				data-toggle="dropdown" class="dropdown-toggle">Client<b
					class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="client">Ajouter un client</a></li>
					<li><a href="client">Consulter un client</a></li>
					<li><a href="client">Modifier/Supprimer un client</a></li>


				</ul></li>
		</ul>
	</div>

	<!-- menu sur le cote avec lien sur la partie concernée:-->

	<div class="container">
		<h1>EMPLOYE(S)</h1>
		<p class="lead">
			<i>Dans cette espace vous aurez l'occasion de créer, modifier,
				consulter ou supprimer le(s) employé(s) qui vous impactent... </i>
		</p>
		<div class="row">
			<div class="col-sm-3" id="myScrollspy">
				<ul class="nav nav-tabs nav-stacked" data-offset-top="120"
					data-spy="affix">
					<li class="active"><a href="#section1">NOUVEL EMPLOYE</a></li>
					<li class="active"><a href="#section2">CONSULTER
							EMPLOYE(S)</a></li>
					<li class="active"><a href="#section3">MODIFIER /SUPPRIMER
							EMPLOYE(S)</a></li>
					<li class="active"><a href="#section4">NOUVEAU GROUPE</a></li>
					<li class="active"><a href="#section5">CONSULTER GROUPE(S)</a></li>
					<li class="active"><a href="#section6">MODIFIER /SUPPRIMER
							GROUPE(S)</a></li>

				</ul>
			</div>
			<div class="col-sm-9">
				<div id="section1">
					<h2>NOUVEL EMPLOYE</h2>

					<!-- inserer fonction ajouter client -->

					<div class="bs-example">
						<form class="form-horizontal" action="ajouterEmploye.do"
							method="post">

							<div class="form-group">
								<label class="control-label col-xs-3" for="firstName">Nom:</label>
								<div class="col-xs-9">
									<input type="text" class="form-control" id="firstName "
										placeholder="First Name" name="nom">
								</div>
							</div>

							<div class="form-group">
								<div class="col-xs-offset-3 col-xs-9">
									<input type="submit" class="btn btn-primary"
										value="ajouter nouveau client"> <input type="reset"
										class="btn btn-default" value="Reset">
								</div>
							</div>






							<div>
								<table>

									<tr>
										<td>${employes.nom}</td>
									</tr>

								</table>
							</div>


						</form>
					</div>
					<hr>
					<div id="section2">
						<h2>CONSULTER EMPLOYE(S)</h2>

							<form class="form-horizontal" action="tousEmployes.do">
								
									<table class="table table-bordered">
										
										<thead>
											<tr>
												<th>Id</th>
												<th>Nom</th>

											</tr>
										</thead>
										
										
										<tbody>
												<tr>
													<td>${tousEmp.idGroupe}</td>
													<td>${tousEmp.nomGroupe}</td>
												</tr>
											</tbody>
											
								
									</table>
							
							</form>

					</div>

					<hr>
					<div id="section3">
						<h2>MODIFIER /SUPPRIMER EMPLOYE(S)</h2>

						<!-- inserer fonction Suppression/modification -->



						<hr>
						<div id="section4">
							<h2>NOUVEAU GROUPE</h2>

							
							<form class="form-horizontal" action="ajouterGoupe.do"
								method="post">

								<div class="form-group">
									<label class="control-label col-xs-3" for="firstName">Nom
										du groupe:</label>
									<div class="col-xs-9">
										<input type="text" class="form-control" id="firstName "
											placeholder="First Name" name="nomgroupe">
									</div>
								</div>
								<div class="form-group">
									<div class="col-xs-offset-3 col-xs-9">
										<input type="submit" class="btn btn-primary" value="ajouter nouveau groupe">
										<input type="reset" class="btn btn-default" value="Reset">
									</div>
								</div>
									<div>
									<table>
										

											<tr>
												<td>${grouper.nomGroupe}</td>
											</tr>
										
									</table>
								</div>

							</form>

						</div>

						<hr>
						<div id="section5">
							<h2>CONSULTER GROUPE(S)</h2>

							<!-- inserer fonction Suppression/modification -->
							<form class="form-horizontal" action="tousGroupes.do">
								
									<table class="table table-bordered">
										
										<thead>
											<tr>
												<th>Id</th>
												<th>Nom</th>

											</tr>
										</thead>
										
										
										<tbody>
												<tr>
													<td>${tousGps.idGroupe}</td>
													<td>${tousGps.nomGroupe}</td>
												</tr>
											</tbody>
											
								
									</table>
							
							</form>

						</div>
						<hr>
						<div id="section6">
							<h2>MODIFIER /SUPPRIMER GROUPE(S)</h2>

							<!-- inserer fonction Suppression/modification -->

						</div>

					</div>
				</div>
			</div>
		</div>
</body>
</html>

