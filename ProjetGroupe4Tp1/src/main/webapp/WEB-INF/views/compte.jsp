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

			<li role="presentation" class="active"><a href="compte"
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

			<li role="presentation" class="dropdown"><a href="employe"
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
			<li role="presentation" class="dropdown" ><a href="client"
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
		<h1>COMPTE(S)</h1>
		<p class="lead">
			<i>Dans cette espace vous aurez l'occasion de créer, modifier,
				consulter ou supprimer le(s) compte(s) qui vous impactent... </i>
		</p>
		<div class="row">
			<div class="col-sm-3" id="myScrollspy">
				<ul class="nav nav-tabs nav-stacked" data-offset-top="120"
					data-spy="affix">
					<li class="active"><a href="#section1">NOUVEAU COMPTE</a></li>
					<li class="active"><a href="#section2">CONSULTER COMPTE(S)</a></li>
					<li class="active"><a href="#section3">MODIFIER/SUPPRIMER
							UN COMPTE</a></li>
					<li class="active"><a href="#section4">OPERATION(S)</a></li>
					<li class="active"><a href="#section5">CONSULTER
							OPERATION(S)</a></li>
				</ul>
			</div>
			<div class="col-sm-9">
				<div id="section1">
					<h2>NOUVEAU COMPTE</h2>

					<!-- Ajouter un compte -->
					
				<form action="vAjouterCompte" method="post">
				<table class="table table-striped">

					<tr>
						<span class="badge"> Nouveau Compte </span>
					</tr>

					<br />

					<tr>
						<td>ID du client :</td>
						<td><input name="idClient" type="text" /></td>
					</tr>

					<tr>
						<td>ID de l'employé :</td>
						<td><input name="idEmploye" type="text" /></td>
					</tr>

					<tr>
						<td>Solde à la création :</td>
						<td><input name="solde" type="text" /></td>
					</tr>

					<tr>
						<td></td>
						<td><input type="submit" value="Enregistrer"></td>
					</tr>

				</table>
			</form>

			<br />


					<hr>
					<div id="section2">
						<h2>CONSULTER COMPTE(S)</h2>

		<!-- Afficher un compte à partir d'un ID -->

			<form action="vConsulterCompteParID">

				<table class="table table-striped">

					<tr>
						<span class="badge"> Compte à Afficher par ID </span>
					</tr>

					<br />

					<tr>
						<td>ID du Compte :</td>
						<td><input name="idCompte" type="text" /></td>
						<td><input type="submit" value="Afficher le compte"></td>
					</tr>

				</table>

				<br />
						
						<table>
								<tr>
									<td>${modelCompte.solde}</td>
									<td>${modelCompte.dateDeCreationCompte}</td>
								</tr>
									

						</table>
						</form>
						<br> <br>
						
					</div>


<!-- Afficher un compte à partir d'un ID de Client -->

			<form action="vConsulterCompteParClient">
				<table class="table table-striped">

					<tr>
						<span class="badge"> Compte à Afficher par ID de CLient </span>
					</tr>

					<br />

					<tr>
						<td>ID du Client :</td>
						<td><input name="idClient" type="number" /></td>
						<td><input type="submit" value="Afficher le compte"></td>
					</tr>

				</table>

				<br />
			</form>
			<br />


			<table class="table table-striped">
				<tr>
					<td>ID du Compte :</td>
					<td>Solde :</td>
					<td>Liste des Opérations:</td>
					<td>ID du client :</td>
					<td>ID de l'employé :</td>
					<td>Date de création du Compte :</td>

				</tr>
				<c:forEach items="${modelCompteParClient}" var="p">
					<tr>
						<td>${p.idCompte}</td>
						<td>${p.solde}</td>
						<td>${p.listeOperation}</td>
						<td>${p.client.idClient}</td>
						<td>${p.employe.idEmploye}</td>
						<td>${p.dateDeCreationCompte}</td>
					</tr>
				</c:forEach>
			</table>


			<br />

						<hr>
						<div id="section3">
							<h2>MODIFIER/SUPPRIMER UN COMPTE</h2>

							<!-- inserer fonction Suppression/modification -->

						</div>
						<hr>
						<div id="section4">
							<h2>OPERATION(S)</h2>

							<!-- inserer fonction Suppression/modification -->
							
							
							

						</div>
						<hr>
						<div id="section5">
							<h2>CONSULTER OPERATION(S)</h2>

							<!-- inserer fonction Suppression/modification -->

						</div>

					</div>
				</div>
			</div>



			<!-- Ajouter un compte -->
 --%>













</body>
</html>