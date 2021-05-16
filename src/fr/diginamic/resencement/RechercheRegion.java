package fr.diginamic.resencement;

import java.util.ArrayList;
import java.util.Scanner;

public class RechercheRegion {

	public void traiter(ArrayList<Ville> villes) {
		Scanner scannerRegion = new Scanner(System.in);
		System.out.println("Veuillez choisir une Région : ");
		String choixRegion = scannerRegion.nextLine();
		System.out.println("Vous avez saisi : " + choixRegion);
		int totalRegion = 0;
		for (int i = 0; i < villes.size(); i++) {

			if (choixRegion.equalsIgnoreCase(villes.get(i).getNomRegion())) {
				totalRegion = totalRegion + villes.get(i).getPopulationTotale();
			}
		}

		System.out.println(totalRegion);
	}
}
