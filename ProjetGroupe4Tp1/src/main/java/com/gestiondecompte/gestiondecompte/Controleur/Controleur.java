package com.gestiondecompte.gestiondecompte.Controleur;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestiondecompte.gestiondecompte.Metier.InterGestionMetier;
import com.gestiondecompte.gestiondecompte.entites.Client;
import com.gestiondecompte.gestiondecompte.entites.Compte;


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
	
	@RequestMapping(value = "/vAjouterCompte")
	public String vAjouterCompte(Model model, Double solde, Long idClient , Long idEmploye) {
	
		Compte cpt = new Compte(solde, new Date());
		metier.ajouterCompte(cpt, idClient, idEmploye);		
//		model.addAttribute("cli", metier.ConsulterListeDeTousClients());
		return "compte";
	}
	
	//Actions Employé Aghiles
	
	
	//Actions Client Lory
		

	@RequestMapping(value="/AjouterClient")
	public String coucouli(Model model, String NomClient, String PrenomClient , String dateDeNaissance, String adresseClient) throws ParseException{
	
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/YYYY");
		Date d = sf.parse(dateDeNaissance);
Client c = new Client(NomClient, PrenomClient, d, adresseClient);
metier.ajouteClient(c);
		model.addAttribute("client", c);
		return "client";
		
	}
	
	
	@RequestMapping(value="/ConsulterListeClientMC") 
	public String Voivoi(Model model, Client c){

		
		return "client";
		
	}
	
	/*@RequestMapping(value="/RepCoucou") //url qui termine par index 
	public String RepCou(Model model, ReparationCourant r,Long idVehicule){
	
		
		
		model.addAttribute("reparationCourant",metier.AjouterRepCourante_Vehicule(r, idVehicule));
		model.addAttribute("v.idVoiture");

		return "client";
		
	}*/
	
} 
 