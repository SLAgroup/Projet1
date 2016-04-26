package com.gestiondecompte.gestiondecompte.entites;

/*
 * Auteur : Sylvain VROLAND
 * Date : 26/04/2016
 * class : Client
 * package : com.Client.Client.entities
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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeCompte", discriminatorType = DiscriminatorType.STRING)
public class Compte implements Serializable {

	// Attibuts
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	private String nomClient;
	private String prenomClient;
	@Temporal(TemporalType.DATE)
	private Date dateDeNaissance;
	private String adresseClient;

	// Associations
	private List<Compte> listeCompte;

	// Getters & Setters
	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	public List<Compte> getListeCompte() {
		return listeCompte;
	}

	public void setListeCompte(List<Compte> listeCompte) {
		this.listeCompte = listeCompte;
	}

	// Constructeurs
	public Compte() {

	}

	public Compte(String nomClient, String prenomClient, Date dateDeNaissance,
			String adresseClient) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.dateDeNaissance = dateDeNaissance;
		this.adresseClient = adresseClient;
	}

}
