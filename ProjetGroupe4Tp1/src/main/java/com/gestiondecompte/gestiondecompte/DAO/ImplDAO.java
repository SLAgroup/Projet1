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
import com.gestiondecompte.gestiondecompte.entites.Versement;

public class ImplDAO implements InterGestionDao {

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
		Groupe g = em.find(Groupe.class, idGroup);
		Employe e = em.find(Employe.class, idEmploye);
		g.getLisEmpGroupe().add(e);
		e.getListGroup().add(g);
	}

	@Override
	public void ajouterCompte(Compte c, Long idClient, Long idEmploye) {
		// TODO Auto-generated method stub
		Client cli = em.find(Client.class, idClient);
		Employe e = em.find(Employe.class, idEmploye);
		c.setEmploye(e);
		c.setClient(cli);
		em.persist(c);

	}

	@Override
	public void ajouterOperation(Operation o, Long idEmploye, Long idCompte) {
		// TODO Auto-generated method stub

		Compte c = em.find(Compte.class, idCompte);
		Employe e = em.find(Employe.class, idEmploye);
		o.setCompte(c);
		o.setEp(e);
		em.persist(o);
	}

	@Override
	public Compte consulterCompte(Long idCompte) {
		// TODO Auto-generated method stub
		Compte c = em.find(Compte.class, idCompte);
		return c;
	}

	@Override
	public List<Compte> consulterComptes_Client(Long idClient) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Client");
		return query.getResultList();
	}

	@Override
	public List<Compte> consulterComptesCrees_Employe(Long idEmploye) {
		// TODO Auto-generated method stub

		Query query = (Query) em.createQuery("Select c.idCompte from Compte c where c.employe = :x");
		Employe emp = em.find(Employe.class, idEmploye);
		query.setParameter("x", emp);
		return query.getResultList();
	}

	@Override
	public List<Employe> consulterTousEmployes() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Employe");
		return query.getResultList();
	}

	@Override
	public List<Groupe> consulterTousGroupes() {
		// TODO Auto-generated method stub
		Query query = (Query) em.createQuery("from Groupe");
		return query.getResultList();
	}

	@Override
	public List<Employe> consulterEmployes_Groupe(Long idGroup) {

		Query query = (Query) em
				.createQuery("Select g.lisEmpGroupe from Groupe g where g.IdGroupe = :x");
		query.setParameter("x", idGroup);
		return query.getResultList();

	}

	@Override
	public List<Client> consulterClientsParMC(String mc) {
		// TODO Auto-generated method stub
		Query query = (Query) em
				.createQuery("Select c from Client c where c.NomClient = :x");
		query.setParameter("x", "%" + mc + "%");
		return query.getResultList();
	}

	@Override
	public void ModifierCompte(Compte c) {
		// TODO Auto-generated method stub
		em.merge(c);
	}

	@Override
	public Employe consulterEmploye(Long idEmploye) {
		// TODO Auto-generated method stub
		Employe e = em.find(Employe.class, idEmploye);
		return e;
	}

	@Override
	public Groupe consulterGroupe(Long idGroupe) {
		// TODO Auto-generated method stub
		Groupe g = em.find(Groupe.class, idGroupe);
		return g;
	}

}
