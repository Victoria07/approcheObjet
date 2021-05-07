package fr.diginamic.interfaces;

public class Cercle  implements  ObjetGeometrique {

	//Attribut  
	
	protected double rayon ; 
	
	//Constructeur 
	
	public Cercle (){
		
	}
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	//Implémentation des méthodes de Interface
	@Override
	public double perimetre() {
		double perimetreCercle = 2*rayon*Math.PI ;
		return perimetreCercle; 
	}
	
	@Override
	public double surface() {
		double surfaceCercle = Math.PI*rayon*rayon ;
		return surfaceCercle;
	}

	
	//Get et set
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
}
