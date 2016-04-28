<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
  <li role="presentation"><a href="compte">Compte</a></li>
  <li role="presentation"><a href="employe">Employé</a></li>
  <li role="presentation" class="active"><a href="client">Client</a></li>
</ul>


<h1> CLIENTS </h1>

<!-- ***************Ajouter un client****************** -->
<form action="AjouterClient.do" method="post">
<table class = tclient>

		<tr>
			<th> NomClient </th>
			<th> PrenomClient</th>
			<th> dateDeNaissance </th>
			<th> adresseClient </th>
		</tr>
		
		<tr>
			<td> <input type="text" name="NomClient"> </td>
			<td> <input type="text" name="PrenomClient" ></td>
			<td> <input type="text" name="dateDeNaissance" ></td></code>
			<td> <input type="text" name="adresseClient" ></td>
			<td> <input type="submit" value="Ajouter nouveau client" ></td>			
		</tr>		
</table>
 
<table class = tclient2>

	<c:forEach items="${client}" var="cf">
		<tr>
			<td class = td2>${cf.NomClient}</td>
			<td class = td3>${cf.PrenomClient}</td>
			<td class = td4>${cf.dateDeNaissance}</td>
			<td class = td1>${cf.adresseClient}</td>
		</tr>
	
	</c:forEach>

</table>
</form>

 <!-- ***************Consulter Liste Client par mot clé ****************** -->

<form action="ConsulterListeClientMC.do" method="post">
<table class = tMC>

		<tr>
			<th> NomClient </th>
			<th> PrenomClient</th>
			<th> dateDeNaissance </th>
			<th> adresseClient </th>
			<th> motCle</th>
		</tr>
		
		<tr>
			<td> <input type="submit" value="Rechercher client" ></td>
			<td> <input type="text" name="motCle"> </td>			
		</tr>

		
</table>


<table class = tMC2>

	<c:forEach items="${Client2}" var="C">
		<tr>
			<td class = td2>${cf.NomClient}</td>
			<td class = td3>${cf.PrenomClient}</td>
			<td class = td4>${cf.dateDeNaissance}</td>
			<td class = td1>${cf.adresseClient}</td>
		</tr>
	
	</c:forEach>

</table>

</form> 
<%--<!-- ***************Ajouter une Réparation Courante à un véhicule ****************** -->

<form action="RepCoucou.do" method="post">
<table class = tReparationCourante>

		<tr>
			<th> dateReparation </th>
			<th> idVehicule </th>
		</tr>
		
		<tr>
			<td> <input type="text" name="dateReparation"> </td>
			<td> <input type="text" name="idVehicule"> </td>
			<td> <input type="submit" value="Ajouter nouvelle Reparation" ></td>
		</tr>
		
</table>


<table class = tReparationCourante2>

	<c:forEach items="${reparationCourant}" var="rc">
		<tr>
			<td class = td2>${rc.dateReparation}</td>
			
				<c:forEach items="${Vehicule}" var="v">	
				<select name="Vehicule" id="">
					<td><option value = ${v}> ${v} </option></td>
				</select>
				</c:forEach>
		</tr>
	
	</c:forEach>
	

</table>

</form>  --%>

</body>
</html>
