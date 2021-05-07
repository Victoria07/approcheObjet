package fr.diginamic.banque.entites;

public abstract class  Operation {

	//Variable de la classe
	protected String dateOperation; 
	protected double montant;
	protected Operation operation ;  
	//Constructeurs
	public Operation() {
		
	}
	
	public Operation(String dateOperation, double montant) {
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	
	//Methode ToString 
	
	@Override 
	public String toString() {
		return String.format("%s %s",dateOperation, montant);
	}
	
	
	public String getType() {
		return "" ; 
	}
	
	
	//Get et Set
	public String getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	} 
	
}
