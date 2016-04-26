package com.gestiondecompte.gestiondecompte.entites;
/*Rahli Aghiles
ProjetGroupe4TP1
26/04/2016
CLASSE Groupe
VERSION 1
REF UML 
SPRINT
REF_USER STATIC
ASSOSSIATION*/
public class Groupe {
    private Long IdGroupe ;
    private String NomGroupe ;
	public Groupe() {
		super();
	}
	public Groupe(String nomGroupe) {
		super();
		NomGroupe = nomGroupe;
	}
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
}
