package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collection;

public class TestVille {

	public static void main(String[] args) {
		
		ArrayList<Ville> villes = new ArrayList<>() ;
		
		
			villes.add(new Ville("Tarbes",40_600, Continent.Afrique));
			villes.add(new Ville("Nice",343_000, Continent.Amérique));
			villes.add(new Ville("Carcassonne", 47800, Continent.Europe));
			villes.add(new Ville("Narbonne", 53400, Continent.Asie));
			villes.add(new Ville("Lyon",484_000, Continent.Oceanie));
			villes.add(new Ville("Foix", 9700, Continent.Amérique));
			villes.add(new Ville("Pau",77200, Continent.Europe));
			villes.add(new Ville("Marseille", 850700, Continent.Asie));
			
			//Collection.sort(villes);
		System.out.println(villes.toString());

	}

}
