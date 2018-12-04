var idCharCreation;
var idTableCreation;
function setIdCharCreation(idCreation)
{
	idCharCreation = idCreation
}

function setTable(idTable)
{
	idTableCreation = idTable;
}

function changeSkills(idRecebida, nomeRecebido)
{
	if (nomeRecebido == "Raça")
		{
		if(idRecebida =="anao")
				{
					document.getElementById("rPower1").innerHTML = "Vitalidade dos Anões";
								
					document.getElementById("rPower2").innerHTML = "Resistência a Veneno";

					document.getElementById("rPower3").innerHTML = "Proficiência em Armadura";
				}
		else if (idRecebida =="elfo")
				{
					document.getElementById("rPower1").innerHTML = "Graciosidade Élfica";
								
					document.getElementById("rPower2").innerHTML = "Conhecimento Arcano";

					document.getElementById("rPower3").innerHTML = "Treinamento com Arcos";
				}	
		else if (idRecebida =="halfling")
				{
					document.getElementById("rPower1").innerHTML = "Sorte dos Halflings";
								
					document.getElementById("rPower2").innerHTML = "Sorrateiro";

					document.getElementById("rPower3").innerHTML = "Lábia Invejável";
				}	
		else if (idRecebida =="humano")
				{
					document.getElementById("rPower1").innerHTML = "Versatilidade Humana";
								
					document.getElementById("rPower2").innerHTML = "Relembrar Conhecimento";

					document.getElementById("rPower3").innerHTML = "Proficiência de Combate";
				}
		else
				{
					document.getElementById("rPower1").innerHTML = "Resiliência dos Orcs";
								
					document.getElementById("rPower2").innerHTML = "Indomável";

					document.getElementById("rPower3").innerHTML = "Proficiência em Intimidação";
				}
		}

	if (nomeRecebido == "Classe")
		{
			if(idRecebida =="barbaro")
				{
					document.getElementById("cPower1").innerHTML = "Ímpeto Furioso";
								
					document.getElementById("cPower2").innerHTML = "Fúria Resiliente";

					document.getElementById("cPower3").innerHTML = "Totem da Fera";
				}
			else if(idRecebida =="bardo")
				{
					document.getElementById("cPower1").innerHTML = "Canção do Descanço";
								
					document.getElementById("cPower2").innerHTML = "Inspirar Coragem";

					document.getElementById("cPower3").innerHTML = "Zombaria Musical";
				}
			else if(idRecebida =="clerigo")
				{
					document.getElementById("cPower1").innerHTML = "Bênção dos Deuses";
								
					document.getElementById("cPower2").innerHTML = "Canalizar Energia";

					document.getElementById("cPower3").innerHTML = "Exorcizar Mortos-Vivos";
				}
			else if(idRecebida =="guerreiro")
				{
					document.getElementById("cPower1").innerHTML = "Escudo Reativo";
								
					document.getElementById("cPower2").innerHTML = "Pressione o Ataque";

					document.getElementById("cPower3").innerHTML = "Tiro Certeiro";
				}
			else
				{
					document.getElementById("cPower1").innerHTML = "Bola de Fogo";

					document.getElementById("cPower2").innerHTML = "Contra-Mágica";
								
					document.getElementById("cPower3").innerHTML = "Mísseis Mágicos";
				}
		}
}

function confirmChar()
{
	alert("Personagem cadastrado com sucesso.")
}

function deleteChar(id)
{
	var a = "_text";
	var check = id+a;
	if(confirm("Você deseja deletar este personagem?"))
	{
			document.getElementById(check).innerHTML = "Personagem:<br/>Nome: "+id+"<br/>"
			+"Raça: "+check+"<br/>Classe: classe<br/>Poder Racial: poderracial<br/>  Poder de Classe: poderdeclasse<br/>";
	}
}

function sairDeletarMesa(mesaID, actionString)
{
	var b = "_text"
	var checker = mesaID + b
	if (actionString == "deletar")
	{
		if (confirm("Você deseja deletar desta mesa?"))
		{
			document.getElementById(checker).innerHTML = "Personagem:<br/>Nome: "+mesaID+"<br/>"
				+"Raça: "+check+"<br/>Classe: classe<br/>Poder Racial: poderracial<br/>  Poder de Classe: poderdeclasse<br/>";
		}
	}

	if (actionString == "sair")
	{
		if (confirm("Você deseja sair desta mesa?"))
		{
			document.getElementById(checker).innerHTML = "Personagem:<br/>Nome: "+mesaID+"<br/>"
				+"Raça: "+check+"<br/>Classe: classe<br/>Poder Racial: poderracial<br/>  Poder de Classe: poderdeclasse<br/>";
		}
	}
}