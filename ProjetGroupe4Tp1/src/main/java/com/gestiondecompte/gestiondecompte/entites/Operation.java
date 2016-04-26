package com.gestiondecompte.gestiondecompte.entites;

import java.util.Date;

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
}
