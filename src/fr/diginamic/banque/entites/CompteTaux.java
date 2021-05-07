package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

	//Attributs de la classe spécifique à la classe fille
	
	double tauxRemuneration ;
	
	//Constructeurs vide et constructeur avec paramètres
	public CompteTaux() {
		
	}
	
	public CompteTaux(String numeroCompte, double soldeCompte, double tauxRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	//Méthode ToString + toString de la classe mère
	
	public String toString() {
		super.toString();
		return String.format("Mon numéro de compte est %s, avec un solde actuel de %s€ et un taux de rémunureation de %s %%", numeroCompte, soldeCompte, tauxRemuneration) ;
	}

	//Getter et Setter de la classe fille 
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	
}

