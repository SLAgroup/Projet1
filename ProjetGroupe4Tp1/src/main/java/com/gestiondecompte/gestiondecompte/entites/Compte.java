package com.gestiondecompte.gestiondecompte.entites;

/*
 * Auteur : Sylvain VROLAND
 * Date : 26/04/2016
 * class : Compte
 * package : com.gestiondecompte.gestiondecompte.entities
 * Version : 01 ;
 * ref-uml : 1 ;
 * sprint : 1 ;
 * ref-userStories : 4 ;
 * association : Client, List<Operation> ;
 * */

import java.io.Serializable;
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeCompte", discriminatorType = DiscriminatorType.STRING)
public class Compte implements Serializable {

	// Attibuts
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompte;
	private double solde = 0;
	@Temporal(TemporalType.DATE)
	private Date dateDeCreationCompte;


	// Getters & Setters
	public Long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateDeCreationCompte() {
		return dateDeCreationCompte;
	}

	public void setDateDeCreationCompte(Date dateDeCreationCompte) {
		this.dateDeCreationCompte = dateDeCreationCompte;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Operation> getListeOperation() {
		return listeOperation;
	}

	public void setListeOperation(List<Operation> listeOperation) {
		this.listeOperation = listeOperation;
	}

	// Constructeurs
	public Compte() {

	}

	public Compte(double solde, Date dateDeCreationCompte) {
		super();
		this.solde = solde;
		this.dateDeCreationCompte = dateDeCreationCompte;
	}

	// Associations
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idClient")
	private Client client;
	
	@OnetoMany(fetch = FetchType.LAZY)
	@JoinTable(name = "Assos_Compte_Operation", joinColumns = @JoinColumn(name = "idCompte"), inverseJoinColumns = @JoinColumn(name = "idOperation"))
	private List<Operation> listeOperation;
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Operation> getListeOperation() {
		return listeOperation;
	}

	public void setListeOperation(List<Operation> listeOperation) {
		this.listeOperation = listeOperation;
	}

	


}

