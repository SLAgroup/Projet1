<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta charset="UTF-8"> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Gestion de Comptes</title>

<style type="text/css">
    body{
    	padding-top: 70px;
    }
</style>

</head>


<body>

<div class="container">
	<div class="jumbotron">
		<h1>Gestion de comptes</h1>
		<p>Bienvenue dans votre application. Vous trouverez ici le necessaire pour gerer les inscriptions des employ�s, la cr�ation des groupes mais �galement g�rer les comptes de v�tre clientelle... </p>
	</div>
	
	<div class="row">
	
		<div class="col-xs-4">
			<h2>Compte</h2>
			<p>La section Compte contient la cr�ation, modification et la suppression d'un compte. Vous aurez �galement la possibilit� d'y cr�er des op�rations.</p>
			<p><a href="compte" target="_blank" class="btn btn-success">Commencer &raquo;</a></p>
		</div>
		<div class="col-xs-4">
			<h2>Employ�</h2>
			<p>La section Employ� prend en compte la cr�ation, modification et la suppression d'un employ�. Vous aurez �galement la possibilit� de cr�er un groupe ou/et de vous y inscrire.</p>
			<p><a href="employe" target="_blank" class="btn btn-success">Commencer &raquo;</a></p>
		</div>

		<div class="col-xs-4">
			<h2>Client</h2>
			<p>La section Client prend en compte la cr�ation, modification et la suppression d'un Client.</p>
			<p><a href="client" target="_blank" class="btn btn-success">Commencer &raquo;</a></p>
		</div>
	</div>
	<hr>
	<div class="row">
		<div class="col-xs-12">
			<footer>
				<p>&copy; Copyright 2016 Inti Groupe4 production</p>
			</footer>
		</div>
	</div>
</div>
                              		
                           	
</body>
</html>
