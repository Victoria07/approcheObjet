package entites;

public class AdressePostale {

	public int numeroRue ; 
	public String adresse ; 
	public int codePostal ; 
	public String ville ;
	
	public AdressePostale(int numeroRue,String adresse, int codePostal, String ville) {
		this.numeroRue = numeroRue;
		this.adresse = adresse; 
		this.codePostal = codePostal; 
		this.ville = ville; 
	}
	
	public String toString() {
		return String.format("%s %s %d %s", numeroRue, adresse, codePostal, ville);
	}
}
