package fr.diginamic.banque.entites;

public class Credit extends Operation {

	//Variables 
	
	protected String credit = "CREDIT";
	
	//Constructeurs
	public Credit() {
		
	}
	
	public Credit(String dateOperation, double montant) {
		super(dateOperation, montant);
		
	}
	
	//Methode 
	
	public String getType() {
		return credit ;
	}

	//Get et Set
	public String getCredit() {
		return credit;
	}

	public void setCredit(String debit) {
		this.credit = debit;
	}
	
	
	
}
