package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Création de deux instances postales 
		
		AdressePostale a1 = new AdressePostale(); 
		AdressePostale a2 = new AdressePostale();

		Personne p1 = new Personne();
		Personne p2 = new Personne(); 
		
		p1.nom = "Stark"; 
		p1.prenom = "Tony";
		p1.adresse = a1 ; 
		
		
		p2.nom = "Winnie" ;
		p2.prenom = "L'ourson" ; 
		p2.adresse = a2 ;
		
		System.out.println(p1);
	}

}
