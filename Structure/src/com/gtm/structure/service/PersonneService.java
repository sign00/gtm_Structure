package com.gtm.structure.service;

import com.gtm.structure.dao.PersonneJDBC;
import com.gtm.structure.metier.Personne;
import com.gtm.structure.metier.Voiture;

/**
 * Classe Service
 * @author malbranche
 * @version 1.0
 *
 */
public class PersonneService {

	private PersonneJDBC pJDBC = new PersonneJDBC();

	public PersonneJDBC getpJDBC() {
		return pJDBC;
	}

	public void setpJDBC(PersonneJDBC pJDBC) {
		this.pJDBC = pJDBC;
	}
	
	public void ajouterPersonne(Personne p) {
		
		pJDBC.ajouterPersonne(p);
	}	
	
	public void modifierPersonne(Personne p) {
		
		pJDBC.modifierPersonne(p);
	}	
	
	public void supprimerPersonne(Personne p) {
		
		pJDBC.supprimerPersonne(p);
	}	

	public Personne lirePersonne(Personne p) {
		
		return pJDBC.lirePersonne(p);
	}	
	
	public void addVoiture(Personne p, Voiture v) {
		
	//	pJDBC.lirePersonne(p).getVoitures().add(v);
	}	
}
