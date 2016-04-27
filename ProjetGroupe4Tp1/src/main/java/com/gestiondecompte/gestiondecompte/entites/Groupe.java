package com.gestiondecompte.gestiondecompte.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/*
AUTEUR: Rahli Aghiles
NOM DU PROJET: ProjetGroupe4TP1
DATE: 26/04/2016
CLASSE: Groupe
VERSION: 1
REF UML:2
SPRINT:
REF_USER STORIES:
ASSOSSIATION: Employe(ManytoMany)
*/

@Entity
public class Groupe {
	
	// ----------- ATTRIBUTS: -----------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdGroupe ;
    private String NomGroupe ;

	// ----------- ASSOCIATION: ----------- 
    
    @ManyToMany (mappedBy="listGroup")
    private List<Employe> lisEmpGroupe= new ArrayList<Employe>();
    
	// ----------- GETTERS/SETTERS: -----------
    
	public Long getIdGroupe() {
		return IdGroupe;
	}
	public void setIdGroupe(Long idGroupe) {
		IdGroupe = idGroupe;
	}
	public String getNomGroupe() {
		return NomGroupe;
	}
	public void setNomGroupe(String nomGroupe) {
		NomGroupe = nomGroupe;
	}
    
	public List<Employe> getLisEmpGroupe() {
		return lisEmpGroupe;
	}
	public void setLisEmpGroupe(List<Employe> lisEmpGroupe) {
		this.lisEmpGroupe = lisEmpGroupe;
	}

	// ----------- CONSTRUCTEURS: ----------- 
        

	public Groupe() {
		super();
	}
	public Groupe(String nomGroupe) {
		super();
		NomGroupe = nomGroupe;
	}

}
