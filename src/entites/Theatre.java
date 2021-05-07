package entites;


public class Theatre {

	protected String nom = "Le Théâtre des amoureux ";
	protected int nombrePersonneMax = 500;
	protected int totalClientInscrit ;
	protected double recetteTotale ;

	
	
	
	public String inscriptionClient(int nombreClient, double prixPlace) {
		if(nombreClient + totalClientInscrit <= nombrePersonneMax) {
			
			 totalClientInscrit = totalClientInscrit + nombreClient;
			 recetteTotale = prixPlace * totalClientInscrit;
			 
			 return String.format("%s\n\r Le nombre de spectateur pour la représentation de ce soir est de : %s.\n\r La recette de l'établissement est de : %.2f €",nom, totalClientInscrit, recetteTotale);
			 
			 //return nom+"\n\r" + " Le nombre de spectateur pour la représentation de ce soir est de : " + totalClientInscrit+".\n\r"+
			 //" La recette de l'établissement est de : " + String.format("", recetteTotale) + "€" ;
		}
		
		//return " Nous sommes désolées, le théêtre est complet. \n\r"+ "La capacité totale du théâtre est atteinte. Soit " + nombrePersonneMax +"personnes maximum.\n\r" 
		//+ "La recette de l'établissement lorsque la représentation est complète est de: " + String.format("%.2f", recetteTotale)+"€";
		
		return String.format("Nous sommes désolées, le théêtre est complet. \n\r La capacité totale du théâtre est atteinte. Soit %d personnes maximum.\n\r La recette de l'établissement lorsque la représentation est complète est de: %.2f €",nombrePersonneMax, recetteTotale);
		
	}
}
