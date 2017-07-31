package com.gtm.structure.metier;

//import java.util.Vector;
import java.util.Collection;;

/**
 * Classe Métier
 * @author malbranche
 * @version 1.0
 *
 */
public class Personne {

	protected String nom;
	protected String prenom;
	protected int age;
	
/*	
	protected Vector<Voiture> voitures = new Vector<>();
	
	public Vector<Voiture> getVoitures() {
		return voitures;
	}
	
	public void setVoitures(Vector<Voiture> voitures) {
		this.voitures = voitures;
	}
*/	
	
	
	
	protected Collection<Voiture> voitures;
	
	public Personne() {
		nbPersonnes++;
	}
	
	public Personne(String nom, String prenom, int age, Collection<Voiture> voitures) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	this.voitures = voitures;
	nbPersonnes++;
}

	protected static int nbPersonnes;
		
	public static int getNbPersonnes() {
		return nbPersonnes;
	}
	public static void setNbPersonnes(int nbPersonnes) {
		Personne.nbPersonnes = nbPersonnes;
	}
	public Collection<Voiture> getVoitures() {
		return voitures;
	}
	public void setVoitures(Collection<Voiture> voitures) {
		this.voitures = voitures;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
}
