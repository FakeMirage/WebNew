function deleteChar(id)
{
	var a = "_text";
	var check = id+a;
	if(confirm("Voce deseja deletar este personagem?"))
	{
			document.getElementById(check).innerHTML = "Personagem:<br/>Nome: "+id+"<br/>"
			+"Raça: "+check+"<br/>Classe: classe<br/>Poder Racial: poderracial<br/>  Poder de Classe: poderdeclasse<br/>";
	}
}