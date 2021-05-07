package fr.diginamic.formes;

public class Rectangle extends Forme {

	public double longeur ; 
	public double largeur ;

	//Constructeur 
	
	public Rectangle(double longeur, double largeur) {
		this.longeur = longeur; 
		this.largeur = largeur;
	}
	
	public Rectangle() {
		
	}
	
	public double calculerPerimetre() {
		double perimetreRectangle = longeur * largeur ;
		return perimetreRectangle ;
	}
	
	public double calculerSurface() {
		double surfaceRectangle = longeur * 2 + largeur * 2 ;
		return surfaceRectangle;
	}
}
