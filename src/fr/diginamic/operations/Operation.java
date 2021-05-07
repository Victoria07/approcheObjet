package fr.diginamic.operations;

public class Operation {
	
	//Variable 
	
	protected double positif ;
//	protected double a ; 
//	protected double b;
//	protected char operateur;
	
	//Constructeur 
	
//	public Operation() {
//		
//	}
//	
//	public Operation(double a, double b, char operateur) {
//		this.a = a; 
//		this.b = b; 
//		this.operateur = operateur; 
//		
//	}

	//Methode 
	public double calcule(double a, double b, char operateur) {
		
		if(operateur == '+' ) {
			positif = a + b;
		}
		if(operateur == '-') {
			positif = a - b ;}
		
		
		if(operateur == '/') {
			positif = a / b;
		}
		
		if(operateur == '*') {
			positif = a / b;
		}
		return positif ;
	}

	
	@Override
	public String toString() {
		return String.format("%s", positif);
	}

	//Get et Set
	public double getPositif() {
		return positif;
	}

	public void setPositif(double positif) {
		this.positif = positif;
	}
}
