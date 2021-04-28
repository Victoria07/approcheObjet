package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Création de deux instances postales 
		
		AdressePostale a1 = new AdressePostale(3, "allée de la Roselière", 67540 , "Ostwald"); 
		AdressePostale a2 = new AdressePostale(1, "Square du Pré Fleuri", 67203, "Oberschaeffolsheim");

		Personne p1 = new Personne("Stark", "Tony", a1);
		Personne p2 = new Personne("Winnie", "L'ourson", a2); 
		
//		p1.nom = "Stark"; 
//		p1.prenom = "Tony";
//		p1.adresse = a1 ; 
//		
		
//		p2.nom = "Winnie" ;
//		p2.prenom = "L'ourson" ; 
//		p2.adresse = a2 ;
//		
		System.out.println(p1.nom);
		
		p1.afficher();
		p2.afficher();
		
		p1.modifierNom("Asterix");
		p2.modifierNom("Obelix");
		
		p1.modifierPrenom("Zozor");
		p2.modifierPrenom("Biloute");
		
		p1.modifierAdresse(new AdressePostale(5, "allée des patata", 67203 , "PotatoesLand"));
		
		String nom = p1.getNom();
		System.out.println(nom);
		
		
	}
}
