package com.gtm.structure.presentation;

import com.gtm.structure.metier.Personne;
import com.gtm.structure.metier.Voiture;
import com.gtm.structure.service.PersonneService;

/**
 * Classe Présentation
 * @author malbranche
 * @version 1.0
 *
 */
public class Lanceur {
	
	public static void main(String[] args) {
		
		Personne personne = new Personne();
		personne.setNom("Dupont");
		personne.setPrenom("Martine");
		personne.setAge(65);
		
		PersonneService pService = new PersonneService();
		pService.ajouterPersonne(personne);
		Personne personneLue = pService.lirePersonne(personne);
		
		personneLue.setAge(55);
		
		pService.modifierPersonne(personneLue);
		pService.supprimerPersonne(personne);
		
		Voiture v = new Voiture();
		v.setCouleur("bleue");
		v.setMarque("Citroen");
		pService.addVoiture(personneLue, v);
		
		System.out.println("Nombre de personnes: " + Personne.getNbPersonnes());
	}

}
