package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		
		Theatre theatre = new Theatre();
		
		//Méthode appelée afin d'obtenir les 500 personnes souhaitées. 
		System.out.println(theatre.inscriptionClient(52, 4.95));
		System.out.println(theatre.inscriptionClient(30, 4.95));
		System.out.println(theatre.inscriptionClient(12, 4.95));
		System.out.println(theatre.inscriptionClient(85, 4.95));
		System.out.println(theatre.inscriptionClient(23, 4.95));
		System.out.println(theatre.inscriptionClient(45, 4.95));
		System.out.println(theatre.inscriptionClient(8, 4.95));
		System.out.println(theatre.inscriptionClient(5, 4.95));
		System.out.println(theatre.inscriptionClient(10, 4.95));
		System.out.println(theatre.inscriptionClient(110, 4.95));
		System.out.println(theatre.inscriptionClient(55, 4.95));
		System.out.println(theatre.inscriptionClient(25, 4.95));
		System.out.println(theatre.inscriptionClient(40, 4.95));
		
		//Méthode appelée pour dépasser les 500 personnes maximum. 
		System.out.println("\n\r");
		System.out.println(theatre.inscriptionClient(1, 4.95));
		

	}

}
