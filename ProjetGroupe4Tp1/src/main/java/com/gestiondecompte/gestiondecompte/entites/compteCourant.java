package com.gestiondecompte.gestiondecompte.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * Auteur : Sylvain VROLAND
 * Date : 26/04/2016
 * class : compteCourant
 * Héritage : Compte
 * package : com.gestiondecompte.gestiondecompte.entities
 * Version : 01 ;
 * ref-uml : 1 ;
 * sprint : 1 ;
 * ref-userStories : 4 ;
 * association : / ;
 * */

@Entity
@DiscriminatorValue("CC")
public class compteCourant extends Compte {

	// Attibuts :
	private double decouvert = -400.00;

	// Associations :

	// Getters & Setters :
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	// Constructeurs :

	public compteCourant() {
		super();
	}

	public compteCourant(double decouvert) {
		super();
		this.decouvert = decouvert;
	}

}
