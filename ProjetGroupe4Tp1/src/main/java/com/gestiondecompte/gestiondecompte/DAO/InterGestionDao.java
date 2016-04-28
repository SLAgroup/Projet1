package com.gestiondecompte.gestiondecompte.DAO;

import java.util.List;

import com.gestiondecompte.gestiondecompte.entites.Client;
import com.gestiondecompte.gestiondecompte.entites.Compte;
import com.gestiondecompte.gestiondecompte.entites.Employe;
import com.gestiondecompte.gestiondecompte.entites.Groupe;
import com.gestiondecompte.gestiondecompte.entites.Operation;
import com.gestiondecompte.gestiondecompte.entites.Versement;

public interface InterGestionDao {

	public void AjouteClient (Client c);
	public void AjouterEmploye (Employe e);
	public void AjouterGroupe (Groupe g);
	public void AjouterEmploye_Groupe (Long idGroup, Long idEmploye);
	public void AjouterCompte(Compte c,Long idClient,Long idEmploye);
	public void AjouterOperation(Operation o,Long idEmploye,Long idCompte);
	public Compte ConsulterCompte(Long idCompte);
	public List<Compte> ConsulterComptes_Client (Long idClient);
	public List<Compte> ConsulterComptesCrees_Employe(Long idEmploye);
	public List<Employe> ConsulterTousEmployes();
	public List<Groupe> ConsulterTousGroupes();
	public List<Employe> ConsulterEmployes_Groupe(Long idGroup);
	public List<Client> ConsulterClientsParMC(String mc);
	
	public void ModifierCompte(Compte c);
	public void SupprimerCompte(Compte c);
	
	public Employe ConsulterEmploye(Long idEmploye);
	public Groupe ConsulterGroupe(Long idGroupe);
	
	public List<Client> ConsulterClients();
	public void SupprimerClient(Client c);
	
	
}
