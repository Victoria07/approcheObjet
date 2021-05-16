package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS(1), ETE(2), AUTOMNE(3), HIVER(4);
	
	//Variable 
	private int saison;
	
	
	//Constructeur 
	private Saison(int saison) {
		this.saison = saison;
	}

	//Methode 
	
	public static Saison getSaison(String libelle) {
		return Saison.valueOf(libelle.toUpperCase());
	}
	
	//Get 
	public int getSaison() {
		return saison;
	}

	
	
}
