package com.gestiondecompte.gestiondecompte.entites;
/*Rahli Aghiles
ProjetGroupe4TP1
26/04/2016
CLASSE Employe
VERSION 1
REF UML
SPRINT
REF_USER STATIC
ASSOSSIATION*/
import java.io.Serializable;

public class Employe implements Serializable {
	private Long IdEmploye ;
	private String Nom ;
	public Employe() {
		super();
	}
	public Employe(String nom) {
		super();
		Nom = nom;
	}
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

}
