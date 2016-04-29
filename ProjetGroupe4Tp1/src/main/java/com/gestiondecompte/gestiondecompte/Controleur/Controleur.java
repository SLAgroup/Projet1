package com.gestiondecompte.gestiondecompte.Controleur;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gestiondecompte.gestiondecompte.Metier.InterGestionMetier;
import com.gestiondecompte.gestiondecompte.entites.Client;
import com.gestiondecompte.gestiondecompte.entites.Compte;
import com.gestiondecompte.gestiondecompte.entites.Employe;
import com.gestiondecompte.gestiondecompte.entites.Groupe;

@Controller
public class Controleur {
	@Autowired
	private InterGestionMetier metier;

	@RequestMapping(value = "/")
	public String compt() {
		return "accueil";
	}

	@RequestMapping(value = "/accueil")
	public String Acceuil() {
		return "accueil";
	}

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

	// Actions Compte Sylvain

	@RequestMapping(value = "/vAjouterCompte")
	public String vAjouterCompte(Model model, Compte cpt, Long idClient , Long idEmploye) {
		cpt.setDateDeCreationCompte(new Date());
		metier.AjouterCompte(cpt, idClient, idEmploye);
		return "compte";
	}
	
	@RequestMapping(value = "/vConsulterCompteParID")
	public String vConsulterCompteParID(Model model, String idCompte) {
		Long idC = Long.getLong(idCompte);
		model.addAttribute("modelCompte", metier.ConsulterCompte(idC));
		return "compte";
	}
	
	@RequestMapping(value = "/vConsulterCompteParClient")
	public String vConsulterCompteParClient(Model model, @RequestParam(value="idClient")Long idClient) {
		model.addAttribute("modelCompteParClient", metier.ConsulterComptes_Client(idClient));
		return "compte";
	}

	// Actions Employé Aghiles

	@RequestMapping(value = "/ajouterEmploye")
	public String AjouterEmploye(Model model, String nom) {
		Employe e = new Employe(nom);
		metier.AjouterEmploye(e);
		model.addAttribute("employes", metier.ConsulterEmploye(e.getIdEmploye()));
		return "employe";
	}

	@RequestMapping(value = "/ajouterGoupe")
	public String AjouterGroupe(Model model, String nomgroupe) {
		
		Groupe g = new Groupe(nomgroupe);
		metier.AjouterGroupe(g);
		
		model.addAttribute("grouper", metier.ConsulterGroupe(g.getIdGroupe()));
		return "employe";
	}

	@RequestMapping(value = "/employeParGroupe")
	public String employeParGroupe(Model model, String idGroupe,
			String idEmploye) {

		Long idG = Long.getLong(idGroupe);
		Long idE = Long.getLong(idEmploye);
		metier.AjouterEmploye_Groupe(idG, idE);
		model.addAttribute("EmployeGroupe",
				metier.ConsulterEmployes_Groupe(idG));

		return "employe";

	}

	@RequestMapping(value = "/tousEmployes")
	public String tousEmployes(Model model) {
	
		model.addAttribute("tousEmp", metier.ConsulterTousEmployes());

		return "employe";

	}

	@RequestMapping(value = "/tousGroupes")
	public String tousGroupes(Model model) {

		
		model.addAttribute("tousGps", metier.ConsulterTousGroupes());

		return "employe";

	}

	@RequestMapping(value = "/CEmploye")
	public String cEmploye(Model model, String idEmploye) {

		Long idE = Long.getLong(idEmploye);
		model.addAttribute("CEmpl", metier.ConsulterEmploye(idE));

		return "employe";

	}

	@RequestMapping(value = "/CGroupe")
	public String cGroupe(Model model, String idGroupe) {

		Long idG = Long.getLong(idGroupe);
		model.addAttribute("tousGps", metier.ConsulterGroupe(idG));

		return "employe";

	}

	// Actions Client Lory

	@RequestMapping(value = "/AjouterClient")
	public String fonction1(Model model, String nomClient, String prenomClient,
			String dateDeNaissance, String adresseClient) throws ParseException {

		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/YYYY");
		Date d = sf.parse(dateDeNaissance);
		Client c = new Client(nomClient, prenomClient, d, adresseClient);
		metier.AjouteClient(c);
		metier.ConsulterClients();
		model.addAttribute("Client", metier.ConsulterClients());
		return "client";

	}

	@RequestMapping(value = "/ConsultertousClient")
	public String fonction2(Model model) {

		model.addAttribute("Client2", metier.ConsulterClients());

		return "client";

	}
	@RequestMapping(value = "/ConsulterListeClientMC")
	public String fonction3(Model model, String motCle) {

		model.addAttribute("Client2", metier.ConsulterClientsParMC(motCle));

		return "client";

	}

	@RequestMapping(value = "/SuppClient")
	public String fonction4(Model model, String idC) {

		Long idClie = Long.getLong(idC);
		for (Client c : metier.ConsulterClients()) {
			if (c.getIdClient() == idClie) {
				metier.SupprimerClient(c);
			}
		}

		model.addAttribute("Client3", metier.ConsulterClients());
		return "client";

	}

}
