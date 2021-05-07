package fr.diginamic.formes;

public class Cercle extends Forme {

	//Variable 
	protected double rayon ; 
	
	//Constructeur 
	
	public Cercle() {
		
	}
	
	 public Cercle(double rayon) {
		 this.rayon = rayon;
		 
	 }
	
	public double calculerPerimetre() {
		double perimetreCercle = 2 *rayon * Math.PI ;
		return perimetreCercle ;
	}
	
	public double calculerSurface() {
		double surfaceCercle = rayon*rayon*Math.PI ;
		return surfaceCercle ;
	}
}
