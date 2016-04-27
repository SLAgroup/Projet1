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

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeOperation", discriminatorType = DiscriminatorType.STRING)
public class Operation {
	
	// ----------- ATTRIBUTS: -----------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long IdOperation ;
   private Date dateOperation;
   private double montant ;
   
	// ----------- ASSOCIATION: ----------- 
   
   @ManytoOne(fetch = FetchType.LAZY)
   private Compte compte;

   @ManytoOne(fetch = FetchType.LAZY)
   private Employe ep;
   
	// ----------- GETTERS/SETTERS: -----------
   
   public Long getIdOperation() {
		return IdOperation;
	}
	public void setIdOperation(Long idOperation) {
		IdOperation = idOperation;
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
	//getters setters Compte? Employe?

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
