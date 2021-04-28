package entites2;

import entites.AdressePostale;

public class Personne {

	public String nom ;
	public String prenom ; 
	public AdressePostale adresse ; 
	
	public Personne(String nom, String prenom) {
		this.nom = nom; 
		this.prenom = prenom;

	}
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom; 
		this.prenom = prenom;
		this.adresse = adresse; 
	}
	
	public void afficher() {
		
		// convertire en majuscule: toUpperCase();
		 System.out.println(nom.toUpperCase() + " "+ prenom + " " + adresse.toString());
	}
	
	public void modifierNom(String nom) {
		this.nom = nom ;
		afficher();
	}
	
	public void modifierPrenom(String prenom) {
		this.prenom = prenom; 
		afficher();
	}
	
	public void modifierAdresse(AdressePostale adresse) {
		this.adresse = adresse ;
		afficher();
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public AdressePostale getAdresse() {
		return adresse;
	}
	
	
	
}
