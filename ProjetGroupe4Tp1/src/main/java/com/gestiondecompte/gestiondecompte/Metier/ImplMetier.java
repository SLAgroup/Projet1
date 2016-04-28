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
	public void AjouteClient(Client c) {
		// TODO Auto-generated method stub
		
		dao.AjouteClient(c);
	}

	@Override
	public void AjouterEmploye(Employe e) {
		// TODO Auto-generated method stub
		dao.AjouterEmploye(e);
	}

	@Override
	public void AjouterGroupe(Groupe g) {
		// TODO Auto-generated method stub
		dao.AjouterGroupe(g);
	}

	@Override
	public void AjouterEmploye_Groupe(Long idGroup, Long idEmploye) {
		// TODO Auto-generated method stub
		dao.AjouterEmploye_Groupe(idGroup, idEmploye);
	}

	@Override
	public void AjouterCompte(Compte c, Long idClient, Long idEmploye) {
		// TODO Auto-generated method stub
		dao.AjouterCompte(c, idClient, idEmploye);
	}

	@Override
	public void AjouterOperation(Operation o, Long idEmploye, Long idCompte) {
		// TODO Auto-generated method stub
		dao.AjouterOperation(o, idEmploye, idCompte);
	}

	@Override
	public Compte ConsulterCompte(Long idCompte) {
		// TODO Auto-generated method stub
		return dao.ConsulterCompte(idCompte);
		
	}

	@Override
	public List<Compte> ConsulterComptes_Client(Long idClient) {
		// TODO Auto-generated method stub
		return dao.ConsulterComptes_Client(idClient);
	}

	@Override
	public List<Compte> ConsulterComptesCrees_Employe(Long idEmploye) {
		// TODO Auto-generated method stub
		return dao.ConsulterComptesCrees_Employe(idEmploye);
	}

	@Override
	public List<Employe> ConsulterTousEmployes() {
		// TODO Auto-generated method stub
		return dao.ConsulterTousEmployes();
	}

	@Override
	public List<Groupe> ConsulterTousGroupes() {
		// TODO Auto-generated method stub
		return dao.ConsulterTousGroupes();
	}

	@Override
	public List<Employe> ConsulterEmployes_Groupe(Long idGroup) {
		// TODO Auto-generated method stub
		return dao.ConsulterEmployes_Groupe(idGroup);
	}

	@Override
	public List<Client> ConsulterClientsParMC(String mc) {
		// TODO Auto-generated method stub
		return dao.ConsulterClientsParMC(mc);
	}

	@Override
	public void ModifierCompte(Compte c) {
		// TODO Auto-generated method stub
		dao.ModifierCompte(c);
	}
	
	@Override
	public void EffectuerVersement(double mt, Long idCompte, Long idEmploye) {
		// TODO Auto-generated method stub
		
		Operation v = new Versement();
		v.setMontant(mt);
		Compte c =dao.ConsulterCompte(idCompte);
		c.setSolde(c.getSolde()+mt);
		dao.ModifierCompte(c);
		dao.AjouterOperation(v, idEmploye, idCompte);
		
	}

	@Override
	public void EffectuerRetrait(double mt, Long idCompte, Long idEmploye) {
		// TODO Auto-generated method stub
		
		Operation r = new Retrait();
		r.setMontant(mt);
		Compte c =dao.ConsulterCompte(idCompte);
		c.setSolde(c.getSolde()-mt);
		dao.ModifierCompte(c);
		dao.AjouterOperation(r, idEmploye, idCompte);
	}

	@Override
	public void EffectuerVirementCompte_Compte(double mt, Long idCompte1,
			Long idCompte2, Long idEmploye) {
		// TODO Auto-generated method stub
	
		EffectuerRetrait(mt, idCompte1, idEmploye);
		EffectuerVersement(mt, idCompte2, idEmploye);

		
	}
	
	public Employe ConsulterEmploye(Long idEmploye){
		return dao.ConsulterEmploye(idEmploye);
	}
	public Groupe ConsulterGroupe(Long idGroupe){
		return dao.ConsulterGroupe(idGroupe);
	}
		
	@Override
	public void SupprimerCompte(Compte c) {
		// TODO Auto-generated method stub
		dao.SupprimerCompte(c);
		
	}



	@Override
	public List<Client> ConsulterClients() {
		// TODO Auto-generated method stub
		return dao.ConsulterClients();
	}



	@Override
	public void SupprimerClient(Client c) {
		// TODO Auto-generated method stub
		dao.SupprimerClient(c);;
	}






}
