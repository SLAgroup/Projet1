package com.gestiondecompte.gestiondecompte.Test;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestiondecompte.gestiondecompte.Metier.InterGestionMetier;
import com.gestiondecompte.gestiondecompte.entites.Client;
import com.gestiondecompte.gestiondecompte.entites.Compte;
import com.gestiondecompte.gestiondecompte.entites.Employe;
import com.gestiondecompte.gestiondecompte.entites.Groupe;
import com.gestiondecompte.gestiondecompte.entites.Operation;

public class test2 {

	private static ClassPathXmlApplicationContext context;
	private static InterGestionMetier metier;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		metier = (InterGestionMetier)context.getBean("Metier");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	context.close();}

	@Test
	public void testAjouteClient() {
		
		Client c1 = new Client("Sylvain", "ex1", new Date(),"quelque part à orleans");
		metier.AjouteClient(c1);
		assertNotNull(c1.getIdClient());

	}

	
	@Test
	public void testAjouterEmploye() {
		Employe e = new Employe("Aghiles");
		metier.AjouterEmploye(e);
		assertNotNull(e.getIdEmploye());
	}

	
	@Test
	public void testAjouterGroupe() {
		
		Groupe g = new Groupe("Groupe 4");
		metier.AjouterGroupe(g);
		assertNotNull(g.getIdGroupe());
	}

	@Test
	public void testAjouterEmploye_Groupe() {
		
		metier.AjouterEmploye_Groupe(1L, 1L);
		Employe emp = metier.ConsulterEmploye(1L);
		Groupe group = metier.ConsulterGroupe(1L);	
		assertNotNull(emp.getListGroup());
	
	}

	@Test
	public void testAjouterCompte() {
		Compte c = new Compte(100, new Date());
		metier.AjouterCompte(c, 1L, 1L);
		assertNotNull(c.getIdCompte());
	}

	@Test
	public void testAjouterOperation() {
		Operation o = new Operation(new Date(), 200);
		metier.AjouterOperation(o, 1L, 1L);
		assertNotNull(o.getIdOperation());
	}

	@Test
	public void testConsulterCompte() {
	
	assertNotNull(metier.ConsulterCompte(1L));
	}

	@Test
	public void testConsulterComptes_Client() {
		
		assertNotNull(metier.ConsulterComptes_Client(1L));
	
	}

	@Test
	public void testConsulterComptesCrees_Employe() {
		assertNotNull(metier.ConsulterComptesCrees_Employe(1L));
	}

	@Test
	public void testConsulterTousEmployes() {
		assertNotNull(metier.ConsulterTousEmployes());
	}

	@Test
	public void testConsulterTousGroupes() {
		assertNotNull(metier.ConsulterTousGroupes());
	}

	@Test
	public void testConsulterEmployes_Groupe() {
		assertNotNull(metier.ConsulterEmployes_Groupe(1L));
	}

	@Test
	public void testConsulterClientsParMC() {
		assertNotNull(metier.ConsulterClientsParMC("y"));
	}

	@Test
	public void testModifierCompte() {
		Compte c2 = metier.ConsulterCompte(1L);
		c2.setSolde(200);
		metier.ModifierCompte(c2);
		assertNotNull(c2.getSolde()==200);
	}

	@Test
	public void testEffectuerVersement() {
		Compte c2 = metier.ConsulterCompte(1L);
		metier.EffectuerVersement(300, 1L, 1L);
		assertNotNull(c2.getSolde()==500);
	}

	@Test
	public void testEffectuerRetrait() {
		Compte c2 = metier.ConsulterCompte(1L);
		metier.EffectuerRetrait(400, 1L, 1L);
		assertNotNull(c2.getSolde()==100);
	}

	@Test
	public void testEffectuerVirementCompte_Compte() {
		Compte c1 = new Compte(600, new Date());
		Compte c2 = new Compte(200, new Date());
		metier.AjouterCompte(c1, 1L, 1L);
		metier.AjouterCompte(c2, 1L, 1L);
		metier.EffectuerVirementCompte_Compte(300, c1.getIdCompte(), c2.getIdCompte(), 1L);
		assertNotNull(c1.getSolde()==300);
		assertNotNull(c2.getSolde()==500);
		
	}
	
	
	

}
