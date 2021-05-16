package fr.diginamic.listes;

import tri.Comparable;

public class Ville implements Comparable<Ville> {

	protected String ville ;
	protected int nombreHabitants ;
	
	//Attribut d'instance Continent 
	
	Continent continent ; 
	
	//constructeur 
	
	public Ville() {
		
	}
	
	public Ville(String ville, int nombreHabitants, Continent continent) {
		this.ville = ville; 
		this.nombreHabitants = nombreHabitants;
		this.continent = continent; 
		
	}
	
	//Methode 
	
	@Override
	private String nom;
	public int compareTo(Ville ville2) {
		int result = this.nom.compareTo(ville2.getVille());
		return result;
	}
	
//	public int compareTo(Ville autre) {
//		if(this.nombreHabitants > autre.getNombreHabitants()) {
//			return 1;
//		}
//		if(this.nombreHabitants < autre.getNombreHabitants()) {
//			return -1;
//		}
//		return 0;
//	}
	
	public String toString() {
		return String.format("%s %d %s",ville, nombreHabitants, continent);
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
