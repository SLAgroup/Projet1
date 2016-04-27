package com.gestiondecompte.gestiondecompte.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestiondecompte.gestiondecompte.entites.Client;
import com.gestiondecompte.gestiondecompte.entites.Compte;
import com.gestiondecompte.gestiondecompte.entites.Employe;
import com.gestiondecompte.gestiondecompte.entites.Groupe;
import com.gestiondecompte.gestiondecompte.entites.Operation;

public class ImplDAO implements InterGestionDao{
    @PersistenceContext
	private EntityManager em;
    
	@Override
	public void ajouteClient(Client c) {
		// TODO Auto-generated method stub
		
		em.persist(c);
	}

	@Override
	public void ajouterEmploye(Employe e) {
		// TODO Auto-generated method stub
		em.persist(e);
	}

	@Override
	public void ajouterGroupe(Groupe g) {
		// TODO Auto-generated method stub
		em.persist(g);
	}

	@Override
	public void ajouterEmploye_Groupe(Long idGroup, Long idEmploye) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterCompte(Compte c) {
		// TODO Auto-generated method stub
		em.persist(c);
	}

	@Override
	public void ajouterOperation(Operation o) {
		// TODO Auto-generated method stub
		em.persist(o);
	}

	@Override
	public List<Compte> consulterCompte(Long idCompte) {
		// TODO Auto-generated method stub
		Query query=em.createQuery("from Compte c");
		return query.getResultList();
	}

	@Override
	public List<Compte> consulterComptes_Client(Long idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> consulterComptesCrees_Employe(Long idEmploye) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> consulterTousEmployes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Groupe> consulterTousGroupes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> consulterEmployes_Groupe(Long idGroup) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> consulterClientsParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void effectuerVersement(double mt, Long idCompte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void effectuerRetrait(double mt, Long idCompte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void effectuerVirementCompte_Compte(double mt, Long idCompte1,
			Long idCompte2) {
		// TODO Auto-generated method stub
		
	}

}
