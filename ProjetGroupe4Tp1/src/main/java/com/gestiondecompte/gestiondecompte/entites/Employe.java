package com.gestiondecompte.gestiondecompte.entites;

/*
 AUTEUR: Rahli Aghiles
 NOM DU PROJET: ProjetGroupe4TP1
 DATE: 26/04/2016
 CLASSE: Employe
 VERSION: 1
 REF UML:2
 SPRINT:
 REF_USER STORIES:
 ASSOSSIATION: Operation(OnetoMany) / Groupe (ManytoMany)
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Employe implements Serializable {

	// ----------- ATTRIBUTS: -----------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdEmploye;
	private String Nom;

	// ----------- ASSOCIATION: -----------

	@OneToMany
	private List<Operation> listOpEmploye;

	@ManyToMany(fetch = FetchType.LAZY)
	@javax.persistence.JoinTable(name = "Groupe_Employe")
	private List<Groupe> listGroup = new ArrayList<Groupe>();
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Compte> listCompte;
	// ----------- GETTERS/SETTERS: -----------

	public Long getIdEmploye() {
		return IdEmploye;
	}

	public void setIdEmploye(Long idEmploye) {
		IdEmploye = idEmploye;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public List<Operation> getListOpEmploye() {
		return listOpEmploye;
	}

	public void setListOpEmploye(List<Operation> listOpEmploye) {
		this.listOpEmploye = listOpEmploye;
	}

	public List<Groupe> getListGroup() {
		return listGroup;
	}

	public void setListGroup(List<Groupe> listGroup) {
		this.listGroup = listGroup;
	}

	public List<Compte> getListCompte() {
		return listCompte;
	}

	public void setListCompte(List<Compte> listCompte) {
		this.listCompte = listCompte;
	}
	
	// ----------- CONSTRUCTEURS: -----------



	public Employe() {
		super();
	}

	public Employe(String nom) {
		super();
		Nom = nom;
	}
}
