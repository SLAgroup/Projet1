package com.gestiondecompte.gestiondecompte.Controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestiondecompte.gestiondecompte.Metier.ImplMetier;

@Controller
public class Controleur {
	@Autowired
	private ImplMetier metier;

	@RequestMapping(value = "/index")
	public String index() {
		return "banqueaghiles";
	}
} 
 