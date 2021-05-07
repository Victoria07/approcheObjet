package entites;

public class Cercle {
	
	
	//Instance 
	protected double rayon ; 
	
	
	//Construceteur 
	
	public Cercle(double rayon) {
		this.rayon = rayon; 
	}

	//Methodes 
	

	public double perimetreCercle() {
		double perimetre = 2*rayon*Math.PI;
		return perimetre;
	}
	
	public double surfaceCercle() {
		double surface = Math.PI*rayon*rayon ;
		return surface;
	}
	
	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}

	//Get et Set 
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
}
