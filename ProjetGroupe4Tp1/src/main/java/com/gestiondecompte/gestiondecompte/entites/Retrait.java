package com.gestiondecompte.gestiondecompte.entites;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 AUTEUR: Rahli Aghiles
 NOM DU PROJET: ProjetGroupe4TP1
 DATE: 26/04/2016
 CLASSE: Retrait
 VERSION: 1
 REF UML:2
 SPRINT:
 REF_USER STORIES:
 ASSOSSIATION: -
 */

@Entity
@DiscriminatorValue("Retrait")
public class Retrait extends Operation {

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retrait(Date dateOperation, double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}



}