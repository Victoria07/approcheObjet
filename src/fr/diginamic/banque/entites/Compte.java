package fr.diginamic.banque.entites;

public class Compte {

	
	//Variable d'instance
	protected String numeroCompte;
	protected double soldeCompte;

	//Constructeur vide par défaut
	public Compte() {
		
	}
	
	//Constructeur avec Paramètres
	public Compte(String numeroCompte, double soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte; 
	}
	
	//Accesseur
	public String getNumeroCompte(){                      
	     return numeroCompte;
	}
	
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	
	public double getSoldeCompte() {
		return soldeCompte; 
	}
	
	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
	
	public String toString() {
		return String.format("Le numéro de compte est %s et le solde est %s€" , numeroCompte, soldeCompte);
	}
}
