package fr.diginamic.operations;

public class TestMoyenne {

	public static void main(String[] args) {
		
		//Instance d'un objet de la classe CalculMoyenne
		CalculMoyenne moyenne = new CalculMoyenne();
		
		//Ajout des élements dans la liste
		moyenne.AjoutElementListe();
		
		//Affichage de la moyenne de la liste
		System.out.println(moyenne.calculMoyenne());
	}

}
