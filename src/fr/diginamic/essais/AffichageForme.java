package fr.diginamic.essais;

import fr.diginamic.formes.Forme;


public class AffichageForme {

	//Methode statique :
	public static void afficher(Forme forme) {
		
		System.out.println(forme.calculerPerimetre());
		System.out.println(forme.calculerSurface());
	}
	
	//Methode d'instance
	public void affiche(Forme forme) {
		
		System.out.println(forme.calculerPerimetre());
		System.out.println(forme.calculerSurface());
	}
}
