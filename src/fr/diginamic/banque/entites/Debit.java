package fr.diginamic.banque.entites;

public class Debit extends Operation {

	//Variables 
	
	protected String debit = "DEBIT" ;
	
	//Constructeurs
	public Debit() {
		
	}
	
	public Debit(String dateOperation, double montant) {
		super(dateOperation, montant);
		
	}
	
	//Methode 
	
	public String getType() {
		return debit ;
	}

	//Get et Set
	public String getDebit() {
		return debit;
	}

	public void setDebit(String debit) {
		this.debit = debit;
	}
	
}
