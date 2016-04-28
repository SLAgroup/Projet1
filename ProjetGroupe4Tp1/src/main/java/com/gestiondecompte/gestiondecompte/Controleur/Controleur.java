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
	public String vAjouterCompte(Model model, Compte cp, Long idClient , Long idEmploye) {

		metier.AjouterCompte(cp, idClient, idEmploye);		
//		model.addAttribute("cli", metier.ConsulterListeDeTousClients());
		return "compte";
	}
	
	@RequestMapping(value = "/vConsulterCompteParID")
	public String vConsulterCompteParID(Model model, Long idCompte) {
		model.addAttribute("modelCompte", metier.ConsulterCompte(idCompte));
		return "compte";
	}
	//Actions Employé Aghiles
	
	
	//Actions Client Lory
		

	@RequestMapping(value="/AjouterClient")
	public String fonction1(Model model, String nomClient, String prenomClient , String dateDeNaissance, String adresseClient) throws ParseException{
	
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/YYYY");
		Date d = sf.parse(dateDeNaissance);
		Client c = new Client(nomClient, prenomClient, d, adresseClient);
		metier.AjouteClient(c);
		model.addAttribute("Client", metier.ConsulterClients());
		return "client";
		
	}
	
	
	@RequestMapping(value="/ConsulterListeClientMC") 
	public String fonction2(Model model, String motCle){

		
		model.addAttribute("Client2", metier.ConsulterClientsParMC(motCle));
	
		return "client";
		
	}
	
	@RequestMapping(value="/SuppClient") 
	public String fonction3(Model model, String idC){

		Long idClie = Long.getLong(idC);
		for (Client c: metier.ConsulterClients()){
			if (c.getIdClient()== idClie){
				metier.SupprimerClient(c);
				}
		}
		
		model.addAttribute("Client3",metier.ConsulterClients());
		return "client";
		
	}
	
	

	
} 
 