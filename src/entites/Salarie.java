package entites;

public class Salarie {
	
	//Instance de la classe
	protected String nom ;
	protected String prenom ; 
	protected double salaire ;
	
	//Constructeurs 
	public Salarie() {}
	
	public Salarie(String nom, String prenom, double salaire) {
		setNom(nom);
		setPrenom(prenom);
		setSalaire(salaire);
	}

	//Methode toString
	
	public String toString() {
		return String.format("%s %s %s", nom, prenom, salaire);
	}
	
	//Get et Set 
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

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
}
