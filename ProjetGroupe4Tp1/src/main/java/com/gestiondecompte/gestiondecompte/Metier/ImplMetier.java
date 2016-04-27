package com.gestiondecompte.gestiondecompte.Metier;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.gestiondecompte.gestiondecompte.DAO.InterGestionDao;
import com.gestiondecompte.gestiondecompte.entites.Client;
import com.gestiondecompte.gestiondecompte.entites.Compte;
import com.gestiondecompte.gestiondecompte.entites.Employe;
import com.gestiondecompte.gestiondecompte.entites.Groupe;
import com.gestiondecompte.gestiondecompte.entites.Operation;
import com.gestiondecompte.gestiondecompte.entites.Retrait;
import com.gestiondecompte.gestiondecompte.entites.Versement;

@Transactional
public class ImplMetier implements InterGestionMetier {
private final Logger Log= Logger.getLogger("Debut du test ");

	private InterGestionDao dao;
	
	public void setDao(InterGestionDao dao) {
		this.dao = dao;
		Log.info("dao metier injecté");
	}



	@Override
	public void ajouteClient(Client c) {
		// TODO Auto-generated method stub
		
		dao.ajouteClient(c);
	}

	@Override
	public void ajouterEmploye(Employe e) {
		// TODO Auto-generated method stub
		dao.ajouterEmploye(e);
	}

	@Override
	public void ajouterGroupe(Groupe g) {
		// TODO Auto-generated method stub
		dao.ajouterGroupe(g);
	}

	@Override
	public void ajouterEmploye_Groupe(Long idGroup, Long idEmploye) {
		// TODO Auto-generated method stub
		dao.ajouterEmploye_Groupe(idGroup, idEmploye);
	}

	@Override
	public void ajouterCompte(Compte c, Long idClient, Long idEmploye) {
		// TODO Auto-generated method stub
		dao.ajouterCompte(c, idClient, idEmploye);
	}

	@Override
	public void ajouterOperation(Operation o, Long idEmploye, Long idCompte) {
		// TODO Auto-generated method stub
		dao.ajouterOperation(o, idEmploye, idCompte);
	}

	@Override
	public Compte consulterCompte(Long idCompte) {
		// TODO Auto-generated method stub
		return dao.consulterCompte(idCompte);
		
	}

	@Override
	public List<Compte> consulterComptes_Client(Long idClient) {
		// TODO Auto-generated method stub
		return dao.consulterComptes_Client(idClient);
	}

	@Override
	public List<Compte> consulterComptesCrees_Employe(Long idEmploye) {
		// TODO Auto-generated method stub
		return dao.consulterComptesCrees_Employe(idEmploye);
	}

	@Override
	public List<Employe> consulterTousEmployes() {
		// TODO Auto-generated method stub
		return dao.consulterTousEmployes();
	}

	@Override
	public List<Groupe> consulterTousGroupes() {
		// TODO Auto-generated method stub
		return dao.consulterTousGroupes();
	}

	@Override
	public List<Employe> consulterEmployes_Groupe(Long idGroup) {
		// TODO Auto-generated method stub
		return dao.consulterEmployes_Groupe(idGroup);
	}

	@Override
	public List<Client> consulterClientsParMC(String mc) {
		// TODO Auto-generated method stub
		return dao.consulterClientsParMC(mc);
	}

	@Override
	public void ModifierCompte(Compte c) {
		// TODO Auto-generated method stub
		dao.ModifierCompte(c);
	}
	
	@Override
	public void effectuerVersement(double mt, Long idCompte, Long idEmploye) {
		// TODO Auto-generated method stub
		
		Operation v = new Versement();
		v.setMontant(mt);
		Compte c =dao.consulterCompte(idCompte);
		c.setSolde(c.getSolde()+mt);
		dao.ModifierCompte(c);
		dao.ajouterOperation(v, idEmploye, idCompte);
		
	}

	@Override
	public void effectuerRetrait(double mt, Long idCompte, Long idEmploye) {
		// TODO Auto-generated method stub
		
		Operation r = new Retrait();
		r.setMontant(mt);
		Compte c =dao.consulterCompte(idCompte);
		c.setSolde(c.getSolde()-mt);
		dao.ModifierCompte(c);
		dao.ajouterOperation(r, idEmploye, idCompte);
	}

	@Override
	public void effectuerVirementCompte_Compte(double mt, Long idCompte1,
			Long idCompte2, Long idEmploye) {
		// TODO Auto-generated method stub
	
		effectuerRetrait(mt, idCompte1, idEmploye);
		effectuerVersement(mt, idCompte2, idEmploye);

		
	}
	
	public Employe consulterEmploye(Long idEmploye){
		return dao.consulterEmploye(idEmploye);
	}
	public Groupe consulterGroupe(Long idGroupe){
		return dao.consulterGroupe(idGroupe);
	}
		
	


}
