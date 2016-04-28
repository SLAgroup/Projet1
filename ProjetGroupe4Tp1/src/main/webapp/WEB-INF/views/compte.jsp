<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<ul class="nav nav-pills">
		<li role="presentation" class="active"><a href="compte">Compte</a></li>
		<li role="presentation"><a href="employe">Employé</a></li>
		<li role="presentation"><a href="client">Client</a></li>
	</ul>

	<h1>Gestions des comptes</h1>


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





	<!-- Afficher un compte à partir d'un ID -->

	<form action="vConsulterCompteParID">

		<table class="table table-striped">

			<tr>
				<span class="badge"> Nouveau Compte </span>
			</tr>

			<br />

			<tr>
				<td>ID du Compte :</td>
				<td><input name="idCompte" type="text" /></td>
				<td><input type="submit" value="Afficher le compte"></td>
			</tr>

		</table>
		
		<br />

	</form>



	<table class="table table-striped">

		<tr>
			<span class="badge"> Afficher un compte à partir d'un ID </span>
		</tr>

		<br />


		<tr>
			<td>ID du Compte :</td>
			<td>${modelCompte.idCompte}</td>
		</tr>

		<tr>
			<td>Identité du client :</td>
			<td>${modelCompte.client.idClient}</td>
			<td>${modelCompte.client.nomClient}</td>
			<td>${modelCompte.client.prenomClient}</td>

		</tr>

		<tr>
			<td>Identité de l'employé :</td>
			<td>${modelCompte.employe.idEmploye}</td>
			<td>${modelCompte.employe.nom}</td>
		<tr>
			<td>Solde :</td>
			<td>${modelCompte.solde}</td>
		</tr>

		<tr>
			<td>Opérations :</td>
			<td>${modelCompte.listeOperation}</td>
		</tr>

	</table>



	<br />
</body>
</html>