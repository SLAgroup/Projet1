package com.gestiondecompte.gestiondecompte.entites;

/*
 AUTEUR: Rahli Aghiles
 NOM DU PROJET: ProjetGroupe4TP1
 DATE: 26/04/2016
 CLASSE: Operation
 VERSION: 1
 REF UML:2
 SPRINT:
 REF_USER STORIES:
 ASSOSSIATION: Compte(ManytoOne) / Employe (ManytoOne)
 */

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeOperation", discriminatorType = DiscriminatorType.STRING)
public class Operation {

	// ----------- ATTRIBUTS: -----------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOperation;
	private Date dateOperation;
	private double montant;

	// ----------- ASSOCIATION: -----------

	@ManyToOne(fetch = FetchType.LAZY)
	private Compte compte;

	@ManyToOne(fetch = FetchType.LAZY)
	private Employe ep;

	// ----------- GETTERS/SETTERS: -----------

	public Long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(Long idOperation) {
		idOperation = idOperation;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Employe getEp() {
		return ep;
	}

	public void setEp(Employe ep) {
		this.ep = ep;
	}

	// ----------- CONSTRUCTEURS: -----------



	public Operation(Date dateOperation, double montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

	public Operation() {
		super();
	}

}
