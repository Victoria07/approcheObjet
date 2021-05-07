package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {
	
	static ArrayList<Integer> liste = new ArrayList<Integer>(); 

	public static void main(String[] args) {
		
		ajouterListe();
		//ArrayListeSize();
		System.out.println(liste);
				
	}
	
	public static void ajouterListe() {
		for(int i=0; i<=100; i++)
		liste.add(i);
	}
	
	
}
