package com.gestiondecompte.gestiondecompte.Metier;

import java.util.List;

import com.gestiondecompte.gestiondecompte.entites.Client;
import com.gestiondecompte.gestiondecompte.entites.Compte;
import com.gestiondecompte.gestiondecompte.entites.Employe;
import com.gestiondecompte.gestiondecompte.entites.Groupe;
import com.gestiondecompte.gestiondecompte.entites.Operation;
import com.gestiondecompte.gestiondecompte.entites.Versement;

public interface InterGestionMetier {
	
	public void ajouteClient (Client c);
	public void ajouterEmploye (Employe e);
	public void ajouterGroupe (Groupe g);
	public void ajouterEmploye_Groupe (Long idGroup, Long idEmploye);
	public void ajouterCompte(Compte c,Long idClient,Long idEmploye);
	public void ajouterOperation(Operation o,Long idEmploye,Long idCompte);
	public Compte consulterCompte(Long idCompte);
	public List<Compte> consulterComptes_Client (Long idClient);
	public List<Compte> consulterComptesCrees_Employe(Long idEmploye);
	public List<Employe> consulterTousEmployes();
	public List<Groupe> consulterTousGroupes();
	public List<Employe> consulterEmployes_Groupe(Long idGroup);
	public List<Client> consulterClientsParMC(String mc);
	
	public void ModifierCompte(Compte c);
	
	public void effectuerVersement(double mt, Long idCompte,Long idEmploye);
	public void effectuerRetrait(double mt, Long idCompte , Long idEmploye);
	public void effectuerVirementCompte_Compte(double mt, Long idCompte1,Long idCompte2, Long idEmploye);
	
}
