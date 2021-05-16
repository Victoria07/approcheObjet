package fr.diginamic.resencement;

import java.util.ArrayList;
import java.util.Scanner;

public class RecherchePopulationVille {

	public void traiter(ArrayList<Ville> villes) {

		// Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez choisir une ville :  ");
		String choix = scanner.nextLine();
		System.out.println("Vous avez saisi : " + choix);

		for (int i = 0; i < villes.size(); i++) {
			if (choix.equalsIgnoreCase(villes.get(i).getNomCommune())) {
				System.out.println(villes.get(i).getPopulationTotale());
			}
		}
	}
}
