package fr.diginamic.listes;


public class Ville {

	protected String ville ;
	protected int nombreHabitants ;
	
	//constructeur 
	
	public Ville() {
		
	}
	
	public Ville(String ville, int nombreHabitants) {
		this.ville = ville; 
		this.nombreHabitants = nombreHabitants;
		
	}
	
	//Methode 
	
	public String toString() {
		return String.format("%s %d",ville, nombreHabitants);
	}

	//Get et Set
	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getNombreHabitants() {
		return nombreHabitants;
	}

	public void setNombreHabitants(int nombreHabitants) {
		this.nombreHabitants = nombreHabitants;
	}

}
