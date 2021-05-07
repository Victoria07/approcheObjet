package entites;

import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		
		//Instance de la classe Cercle
		
		Cercle cercle =  new Cercle(8);
		Cercle resultat = CercleFactory.cercle(5) ; 
		
		System.out.println("Le périmètre de mon cercle est :" + " " + cercle.perimetreCercle());
		System.out.println("La surface de mon cercle est :" +" "+ cercle.surfaceCercle());
		System.out.println(resultat);
		
	}

}
