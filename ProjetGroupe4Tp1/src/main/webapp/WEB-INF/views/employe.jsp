

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	<form action="chercher.do" methode="get">
		Mot clé : <input type="text" name="motcle" value="${mc}"> <input
			type="submit" value="ok">
	</form>
	<form action="employeParGroupe.do" methode="get">
		Employe: <select name="IdGroupe">
			<c:forEach items="${Groupe}" var="g">
				<option value="${g.Id}">
					<c:if test="${g.id==IdGroupe}"> selected="selected"</c:if> >
					${c.Id}
				</option>
			</c:forEach>
		</select> <input type="submit" value="ok">
	</form>
	<table border="1" width="90%">
		<tr>
			<th>Nom</th>
			<th>ID</th>
			<th>Groupe</th>
		</tr>
		<c:forEach items="${Employe}" var="e">
			<tr>
				<td>${e.Nom}</td>
				<td>${e.ID}</td>
				<td>${e.Groupe}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>