package com.gestiondecompte.gestiondecompte.entites;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeOperation", discriminatorType = DiscriminatorType.STRING)
public class Operation {
   private Long IdOperation ;
   private Date dateOperation;
   private double montant ;
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
public Operation(Date dateOperation, double montant) {
	super();
	this.dateOperation = dateOperation;
	this.montant = montant;
}
public Operation() {
	super();
}

@ManytoOne(fetch = FetchType.LAZY)
private List<Compte> listCompteOperation;

@ManytoOne(fetch = FetchType.LAZY)
private Employe ep;

}
