package fr.diginamic.interfaces;

public class Rectangle implements ObjetGeometrique {
	
	//Variable
	protected double longeur ; 
	protected double largeur ; 
	
	//Constructeur 
	
	public Rectangle() {
	
	}
	
	public Rectangle(double longeur, double largeur) {
		this.longeur = longeur; 
		this.largeur = largeur; 
	}

	@Override
	public double perimetre() {
		double perimetreRectangle = 2* longeur + 2 * largeur ; 
		return perimetreRectangle;
	}

	@Override
	public double surface() {
		double surfaceRectangle = longeur * largeur;
		return surfaceRectangle;
	}

	
	//Get et Set
	public double getLongeur() {
		return longeur;
	}

	public void setLongeur(double longeur) {
		this.longeur = longeur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}
