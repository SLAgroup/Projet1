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
			<li role="presentation" class="active"><a href="client"
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
		<h1>CLIENT(S)</h1>
		<p class="lead">
			<i>Dans cette espace vous aurez l'occasion de créer, modifier,
				consulter ou supprimer le(s) client(s) qui vous impactent... </i>
		</p>
		<div class="row">
			<div class="col-sm-3" id="myScrollspy">
				<ul class="nav nav-tabs nav-stacked" data-offset-top="120"
					data-spy="affix">
					<li class="active"><a href="#section1">NOUVEAU CLIENT</a></li>
					<li class="active"><a href="#section2">CONSULTER UN CLIENT</a></li>
					<li class="active"><a href="#section3">MODIFIER/SUPPRIMER
							UN CLIENT</a></li>

				</ul>
			</div>
			<div class="col-sm-9">
				<div id="section1">
					<h2>NOUVEAU CLIENT</h2>

					<!-- inserer fonction ajouter client -->

					<div class="bs-example">
						<form class="form-horizontal" action="AjouterClient.do" method="post">

							<div class="form-group">
								<label class="control-label col-xs-3" for="firstName">Nom:</label>
								<div class="col-xs-9">
									<input type="text" class="form-control" id="firstName "
										placeholder="First Name" name="nomClient">
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-xs-3" for="lastName">Prenom:</label>
								<div class="col-xs-9">
									<input type="text" class="form-control" id="lastName"
										placeholder="Last Name" name="prenomClient">
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-xs-3" for="DateofBirth">Date
									de naissance:</label>
								<div class="col-xs-9">
									<input type="text" class="form-control" id="DateofBirth"
										placeholder="DateofBirth" name="dateDeNaissance">
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-xs-3" for="postalAddress">Address:</label>
								<div class="col-xs-9">
									<textarea rows="3" class="form-control" id="postalAddress"
										placeholder="Postal Address" name="adresseClient"></textarea>
								</div>
							</div>

</form>

<form class="form-horizontal" action="ConsultertousClient.do"
							method="post">
							<div class="form-group">
								<div class="col-xs-offset-3 col-xs-9">
									<input type="submit" class="btn btn-primary"
										value="ajouter nouveau client"> <input type="reset"
										class="btn btn-default" value="Reset">
								</div></div>
					
</form>
</div>
				
				<hr>
				<div id="section2">
					<h2>CONSULTER UN CLIENT</h2>

					<!-- inserer fonction tableau client -->

					<!--  Ligne de tableau avec alternance: gris blanc gris-->


					<div class="bs-example">
						<table class="table table-striped">

							<c:forEach items="${Client}" var="cf">
								<tr>
									<td class=td2>${cf.nomClient}</td>
									<td class=td3>${cf.prenomClient}</td>
									<td class=td4>${cf.dateDeNaissance}</td>
									<td class=td1>${cf.adresseClient}</td>
								</tr>

							</c:forEach>

						</table>
					</div>

				</div>
					</form>
				<hr>
				<div id="section3">
					<h2>MODIFIER/SUPPRIMER UN CLIENT</h2>
				
					<!-- inserer fonction Suppression/modification -->

				</div>

			</div>
		</div>
	</div>



	<!-- bouton sauvegarde et supprimer customiser
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Example of Setting Title for Bootstrap 3 Tooltips</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
    $("#myTooltips a").tooltip({
        title : 'It works in absence of title attribute.'
    });
});
</script>
<style type="text/css">
	.bs-example{
    	margin: 100px 50px;
    }
    .bs-example a{
        margin: 25px;
        font-size: 24px;
    }
</style>
</head>
<body>
<div class="bs-example">
    <div id="myTooltips">
        <a href="#" data-toggle="tooltip" title="Edit Document"><span class="glyphicon glyphicon-edit"></span></a>
        <a href="#" data-toggle="tooltip" title="Save Document"><span class="glyphicon glyphicon-floppy-disk"></span></a>
        <a href="#" data-toggle="tooltip" title="Download Document"><span class="glyphicon glyphicon-download-alt"></span></a>
        <a href="#" data-toggle="tooltip" title="Print Document"><span class="glyphicon glyphicon-print"></span></a>
        <a href="#" data-toggle="tooltip" title="Delete Document"><span class="glyphicon glyphicon-trash"></span></a>
        <a href="#" data-toggle="tooltip" title="Settings"><span class="glyphicon glyphicon-cog"></span></a>
    </div>
    <br>
	<p><strong>Note:</strong> Remove the title attribute form any link and place the mouse pointer over it to see the result.</p>    
</div>
</body>
</html>  -->













</body>
</html>
