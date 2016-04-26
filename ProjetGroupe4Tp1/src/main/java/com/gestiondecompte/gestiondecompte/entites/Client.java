package com.gestiondecompte.gestiondecompte.entites;
/*Rahli Aghiles
ProjetGroupe4TP1
26/04/2016
CLASSE CLIENT
VERSION 1
REF UML
SPRINT
REF_USER STATIC
ASSOSSIATION*/

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Client implements Serializable{
    private Long IdClient ;
    private String NomClient ;
    private String PrenomClient ;
    private Date dateDeNaissance ;
    private String adresseClient ;
	public Long getIdClient() {
		return IdClient;
	}
	public void setIdClient(Long idClient) {
		IdClient = idClient;
	}
	public String getNomClient() {
		return NomClient;
	}
	public void setNomClient(String nomClient) {
		NomClient = nomClient;
	}
	public String getPrenomClient() {
		return PrenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		PrenomClient = prenomClient;
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
	public Client(String nomClient, String prenomClient, Date dateDeNaissance,
			String adresseClient) {
		super();
		NomClient = nomClient;
		PrenomClient = prenomClient;
		this.dateDeNaissance = dateDeNaissance;
		this.adresseClient = adresseClient;
	}
	public Client() {
		super();
	}

	@OnetoMany
	private List<Compte> listCompteClient;
	
}
