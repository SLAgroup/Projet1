package com.gestiondecompte.gestiondecompte.Controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestiondecompte.gestiondecompte.Metier.InterGestionMetier;

@Controller
public class Controleur {
	@Autowired
	private InterGestionMetier metier;

	@RequestMapping(value = "/compte")
	public String compte() {
		return "compte";
	}
	
	@RequestMapping(value = "/employe")
	public String employe() {
		return "employe";
	}
	
	@RequestMapping(value = "/client")
	public String client() {
		return "client";
	}
	
	//Actions Compte Sylvain
	
	
	
	//Actions Employé Aghiles
	
	
	//Actions Client Lory
	
	
} 
 