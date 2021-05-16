package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) throws Exception {

		Maison maison = new Maison();
		maison.ajouterPiece(new Chambre(15, 0));
		maison.ajouterPiece(new Chambre(20, 1));
		maison.ajouterPiece(new Chambre(15, 1));
		maison.ajouterPiece(new Cuisine(15, 0));
		maison.ajouterPiece(new Salon(30, 0));
		maison.ajouterPiece(new SalleDeBain(10, 1));
		maison.ajouterPiece(new WC(3, 1));
		
		//Si on passe null en paramètre => on rajouter null à la liste, dans la fonction on appel la superficie d'une pièce nulle,
		//on appel une propriété d'un objet nul, c'est pas possible !
		
		//On lève une Exception si on tente de rajouter quelque chose de null à la liste ! utilisation d'un try catch.
		
//		try {
//			maison.ajouterPiece(null);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		System.out.println(" La maison a une superficie totale de : " + maison.surperficieTotale() + "m²");
		System.out.println("Le rez de chaussé à une superficie de : " + maison.superficieEtage(0) + "m²");
		System.out.println("Le 1er étage à une superficie de : " + maison.superficieEtage(1) + "m²");
		System.out.println("La superficie totale des chambres est de " + maison.superficieParType(Chambre.class)+"m²");
		System.out.println("Il y a :" + maison.nombrePiece(Chambre.class) + " chambres");
	}
	

}
