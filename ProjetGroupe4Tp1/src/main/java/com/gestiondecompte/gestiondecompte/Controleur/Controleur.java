
package com.gestiondecompte.gestiondecompte.Controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestiondecompte.gestiondecompte.Metier.ImplMetier;
import com.gestiondecompte.gestiondecompte.Metier.InterGestionMetier;

@Controller
public class Controleur {
	@Autowired
	private InterGestionMetier metier;

	@RequestMapping(value = "/index")
	public String index() {
		return "banqueaghiles";
	}
} 
 