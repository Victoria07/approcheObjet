package fr.diginamic.banque.entites;

public class Compte {

	
	//Variable d'instance
	private int numeroCompte;
	private int soldeCompte;

	//Constructeur vide par défaut
	public Compte() {
		
	}
	
	//Constructeur avec Paramètres
	public Compte(int numeroCompte, int soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte; 
	}
	
	//Accesseur
	public int getNumeroCompte(){                      
	     return numeroCompte;
	}
	
	public int setNumeroCompte() {
		return numeroCompte;
	}
	
	public int getSoldeCompte() {
		return soldeCompte; 
	}
	
	public int setSoldeCompte() {
		return soldeCompte;
	}
	
	public String toString() {
		return String.format("%d %d", numeroCompte, soldeCompte);
	}
}
