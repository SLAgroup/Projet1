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
<li role="presentation" ><a href="accueil">Accueil</a></li>
  <li role="presentation"><a href="compte">Compte</a></li>
  <li role="presentation"><a href="employe">Employ�</a></li>
  <li role="presentation" class="active"><a href="client">Client</a></li>
</ul>


<h1> CLIENTS </h1>

<!-- ***************Ajouter un client****************** -->
<form action="AjouterClient.do" method="post">



 

</form>


	
 <!-- ***************Consulter Liste Client par mot cl� ****************** -->
 

<form action="ConsulterListeClientMC.do" method="post">
<table class="table table-striped">

			<tr>
				<span class="badge"> Consulter Liste Client par mot cl�: </span>
			</tr>

			<br />

		<tr>
			<td> <input type="text" name="motCle"> </td>
			<td> <input type="submit" value="Rechercher client" ></td>
			
		</tr>
		
</table>


<table class="table table-striped">

	<c:forEach items="${Client2}" var="cd">
	


		<tr>
			<td class = td2>${cd.nomClient}</td>
			<td class = td3>${cd.prenomClient}</td>
			<td class = td4>${cd.dateDeNaissance}</td>
			<td class = td1>${cd.adresseClient}</td>
		</tr>
	
	</c:forEach>

</table>

</form> 

 <!-- ***************Supprimer Client ****************** -->
<form action="SuppClient.do" method="post">

<table class="table table-striped">
		
			<tr>
				<span class="badge"> Supprimer Client </span>
			</tr>

			<br />
		<tr>
			<td> <input type="text" name="Id"> </td>	
			<td> <input type="submit" value="Supprimer client" ></td>
					
		</tr>
</table>

<table class="table table-striped">
	<c:forEach items="${Client3}" var="C3">
		<tr>
			<td class = td2>${C3.nomClient}</td>
			<td class = td3>${C3.prenomClient}</td>
			<td class = td4>${C3.dateDeNaissance}</td>
			<td class = td1>${C3.adresseClient}</td>
		</tr>
	
	</c:forEach>

</table>

</form> 




</body>
</html>
