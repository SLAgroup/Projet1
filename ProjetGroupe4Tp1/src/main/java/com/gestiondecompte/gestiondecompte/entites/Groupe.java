package com.gestiondecompte.gestiondecompte.entites;
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
    
    @ManytoMany (mappedBy="listGroup")
    private List<Employe> lisEmpGroupe;
    
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
    
	//getters setters listEmGroup?

	// ----------- CONSTRUCTEURS: ----------- 
        
	public Groupe() {
		super();
	}
	public Groupe(String nomGroupe) {
		super();
		NomGroupe = nomGroupe;
	}

}
