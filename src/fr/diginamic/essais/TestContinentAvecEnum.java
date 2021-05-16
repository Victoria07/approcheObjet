package fr.diginamic.essais;

import java.util.ArrayList;

import fr.diginamic.listes.Continent;
import fr.diginamic.listes.Ville;
//import fr.diginamic.testenumeration.Saison;

public class TestContinentAvecEnum {

	public static void main(String[] args) {

		ArrayList<Ville> villes = new ArrayList<>();

		villes.add(new Ville("Tarbes", 40_600, Continent.Afrique));
		villes.add(new Ville("Nice", 343_000, Continent.Amérique));
		villes.add(new Ville("Carcassonne", 47800, Continent.Europe));
		villes.add(new Ville("Narbonne", 53400, Continent.Asie));
		villes.add(new Ville("Lyon", 484_000, Continent.Oceanie));
		villes.add(new Ville("Foix", 9700, Continent.Amérique));
		villes.add(new Ville("Pau", 77200, Continent.Europe));
		villes.add(new Ville("Marseille", 850700, Continent.Asie));

		// for (int i = 0 ; i < villes.size(); i++)
		for (Ville ville : villes)

			System.out.println(ville);

	}

}
