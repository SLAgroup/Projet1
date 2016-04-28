package com.gestiondecompte.gestiondecompte.entites;

/*
 AUTEUR: Rahli Aghiles
 NOM DU PROJET: ProjetGroupe4TP1
 DATE: 26/04/2016
 CLASSE: Client
 VERSION: 1
 REF UML:1
 SPRINT:
 REF_USER STORIES:
 ASSOSSIATION: Compte (OnetoMany)
 */

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Client implements Serializable {

	// ----------- ATTRIBUTS: -----------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	private String nomClient;
	private String prenomClient;
	@Temporal(TemporalType.DATE)
	private Date dateDeNaissance;
	private String adresseClient;

	// ----------- ASSOCIATION: -----------

	@OneToMany(mappedBy ="client")
	private List<Compte> listCompteClient;

	// ----------- GETTERS/SETTERS: -----------

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

	public List<Compte> getListCompteClient() {
		return listCompteClient;
	}

	public void setListCompteClient(List<Compte> listCompteClient) {
		this.listCompteClient = listCompteClient;
	}

	// ----------- CONSTRUCTEURS: -----------

	public Client(String nomClient, String prenomClient, Date dateDeNaissance,
			String adresseClient) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.dateDeNaissance = dateDeNaissance;
		this.adresseClient = adresseClient;
	}

	public Client() {
		super();
	}

}
