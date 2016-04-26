package com.gestiondecompte.gestiondecompte.entites;

/*
 * Auteur : Sylvain VROLAND
 * Date : 26/04/2016
 * class : compteEpargne
 * Héritage : Compte
 * package : com.gestiondecompte.gestiondecompte.entities
 * Version : 01 ;
 * ref-uml : 1 ;
 * sprint : 1 ;
 * ref-userStories : 4 ;
 * association : List<Compte> ;
 * */

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class compteEpargne extends Compte {

	// Attibuts :
	private double tauxInteret;

	// Associations :

	// Getter & Setters :
	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	// Constructeurs :

	public compteEpargne() {
		super();
	}

	public compteEpargne(double tauxInteret) {
		super();
		this.tauxInteret = tauxInteret;
	}

}
