
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

import com.myapp.EXO1.JoinTable;

@Entity
public class Employe implements Serializable {
	
	// ----------- ATTRIBUTS: -----------
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdEmploye ;
	private String Nom ;
	
	// ----------- ASSOCIATION: ----------- 
	
	@OnetoMany
	private List<Operation> listOpEmploye;
	
	@ManytoMany(fetch = FetchType.LAZY)
	@JoinTable(name="Groupe_Employe")
	private List<Groupe> listGroup;
	
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
	
	//getters setters lisOpEmploye? listGroup?

	// ----------- CONSTRUCTEURS: ----------- 
	
	public Employe() {
		super();
	}
	public Employe(String nom) {
		super();
		Nom = nom;
	}
}
