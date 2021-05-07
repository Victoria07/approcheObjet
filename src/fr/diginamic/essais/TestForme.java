package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cercle cercle = new Cercle(3);
		Rectangle rectangle = new Rectangle(5d,8d);
		Carre carre = new Carre(4);
		
		//Methode d'instance :
		AffichageForme affForme = new AffichageForme();
		
		affForme.affiche(cercle);
		affForme.affiche(rectangle);
		affForme.affiche(carre);
		
		
		//Methode static :
		AffichageForme.afficher(cercle);
		
		
	}

}
