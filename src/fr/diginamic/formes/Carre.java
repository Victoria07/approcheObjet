package fr.diginamic.formes;

public class Carre extends Rectangle{

	public double cote ; 
	
	//Constructeur 
	
	public Carre() {
		
	}
	
	public Carre(double cote) {
		this.cote = cote ;
	}
	
	public double calculerPerimetre() {
		double perimetreCarre = cote * cote;
		return perimetreCarre ;
	}
	
	public double calculerSurface() {
		double surfaceCarre = cote * 4;
		return surfaceCarre;
	}
	
}
