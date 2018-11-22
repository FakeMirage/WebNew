package br.com.cadastro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cadastro.dao.PersonagemDAO;
import br.com.cadastro.model.Personagem;

public class PersonagemController {
	@Autowired
    PersonagemDAO daoPersonagem;
	
	@RequestMapping("listaPersonagens")
    public String lista(Model modelPersonagem) throws ClassNotFoundException {
		modelPersonagem.addAttribute("personagens", daoPersonagem.lista());
        return "personagem/lista";
    }
	
	@RequestMapping("novoPersonagem")
	public String form() {
		return "personagem/formulario";
	}
	
	@RequestMapping("adicionaPersonagem")
	public String adiciona(@Valid Personagem personagem, BindingResult result) throws ClassNotFoundException {
		if(result.hasFieldErrors("nome") || result.hasFieldErrors("raca") || result.hasFieldErrors("classe") || result.hasFieldErrors("habilidade") || result.hasFieldErrors("foto")) {
			 return "personagem/formulario";
	     }
		daoPersonagem.adiciona(personagem);
		return "redirect:listaPersonagens";
	}
	
	@RequestMapping("mostraPersonagem")
    public String mostra(String nome, Model modelPersonagem) throws ClassNotFoundException {
		modelPersonagem.addAttribute("personagens", daoPersonagem.buscaPorNome(nome));
        return "personagem/mostra";
    }
	
	@RequestMapping("alteraPersonagem")
	public String altera(@Valid Personagem personagem, BindingResult result) throws ClassNotFoundException {
		if(result.hasFieldErrors("nome") || result.hasFieldErrors("raca") || result.hasFieldErrors("classe") || result.hasFieldErrors("habilidade") || result.hasFieldErrors("foto")) {
			 return "personagem/mostra";
	     }
		daoPersonagem.altera(personagem);
        return "redirect:listaPersonagens";
    }
	
	@RequestMapping("removePersonagem")
    public String remove(Personagem personagem) throws ClassNotFoundException {
		daoPersonagem.remove(personagem);
        return "redirect:listaPersonagens";
    }
}
