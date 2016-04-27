package com.gestiondecompte.gestiondecompte.Test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestiondecompte.gestiondecompte.Metier.InterGestionMetier;
import com.gestiondecompte.gestiondecompte.entites.Client;
import com.gestiondecompte.gestiondecompte.entites.Employe;
import com.gestiondecompte.gestiondecompte.entites.Groupe;

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
		metier.ajouteClient(c1);
		assertNotNull(c1.getIdClient());

	}

	@Test
	public void testAjouterEmploye() {
		Employe e = new Employe("Aghiles");
		metier.ajouterEmploye(e);
		assertNotNull(e.getIdEmploye());
	}

	@Test
	public void testAjouterGroupe() {
		Groupe g = new Groupe("Groupe 4");
		metier.ajouterGroupe(g);
		assertNotNull(g.getIdGroupe());
	}

	@Test
	public void testAjouterEmploye_Groupe() {
		fail("Not yet implemented");
	}

	@Test
	public void testAjouterCompte() {
		fail("Not yet implemented");
	}

	@Test
	public void testAjouterOperation() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsulterCompte() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsulterComptes_Client() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsulterComptesCrees_Employe() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsulterTousEmployes() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsulterTousGroupes() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsulterEmployes_Groupe() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsulterClientsParMC() {
		fail("Not yet implemented");
	}

	@Test
	public void testModifierCompte() {
		fail("Not yet implemented");
	}

	@Test
	public void testEffectuerVersement() {
		fail("Not yet implemented");
	}

	@Test
	public void testEffectuerRetrait() {
		fail("Not yet implemented");
	}

	@Test
	public void testEffectuerVirementCompte_Compte() {
		fail("Not yet implemented");
	}

}
