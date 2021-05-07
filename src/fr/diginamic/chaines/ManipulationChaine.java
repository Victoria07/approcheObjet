package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine = "Durand;Marcel;2 523.5;";
		
		//Premier caractère de la chaine 
		char premierCaractere = chaine.charAt(0);
		
		// Taille de la chaine de caractère 
		int taille = chaine.length();
		
		//Index du premier ";" de la chaine 
		int premierElement = chaine.indexOf(';');
		
		//Methode subString 
		String sousChaine = chaine.substring(4, 13);
		String sousChaine2 = chaine.substring(8);
		
		//Extraction du nom de famille 
		String nomFamille = chaine.substring(0, chaine.indexOf(";"));
		
		//Mise en Majuscule du nom de famille 
		String nomFamilleMajuscule = nomFamille.toUpperCase();
		
		//Mise en Minuscule 
		String nomFamilleMinuscule = nomFamille.toLowerCase();
		
		//Methode pour séparer par un caractère ; la chaine de caractère
		for(String separateur : chaine.split(";")) 
			System.out.println(separateur); 
			
		String[] informations = chaine.split(";");
		//Objet crée de la classe Salarie
		Salarie salarie = new Salarie(informations[0], informations[1], Double.parseDouble(informations[2].replace(" ", "")));
		
		
		System.out.println("premierCaractere: " + premierCaractere );
		System.out.println(taille);
		System.out.println(premierElement);
		System.out.println(sousChaine + "\n\r" + sousChaine2);
		System.out.println(nomFamille);
		System.out.println(nomFamilleMajuscule);
		System.out.println(nomFamilleMinuscule);
		System.out.println(salarie);
		
		
		
	}

}
