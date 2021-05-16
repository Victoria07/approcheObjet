package fr.diginamic.resencement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) throws IOException {

		// Creation de ArrayList
		ArrayList<Ville> villes = new ArrayList<Ville>();

		// Lecture du fichier de recensement
		Path fichier = Paths.get("C:\\Users\\Victoria\\Documents\\Diginamic\\Java\\Approche Objet\\recensement.csv");
		List<String> lines = Files.readAllLines(fichier, StandardCharsets.UTF_8);

		for (int i = 1; i < lines.size(); i++) {
			String[] morceaux = lines.get(i).split(";");
			String populationTotale = morceaux[9].trim().replaceAll(" ", "");
			int popTotale = Integer.parseInt(populationTotale);

			// Creation de nouvelleVille
			Ville nouvelleVille = new Ville(morceaux[0], morceaux[1], morceaux[2], morceaux[5], morceaux[6], popTotale);
			villes.add(nouvelleVille);

		}

		Scanner scannerChoix = new Scanner(System.in);
		System.out.println("Veuillez choisir 1 2 ou 3 (1 Ville, 2 département, 3 région) ");
		String choixChoix = scannerChoix.nextLine();
		System.out.println("Vous avez saisi : " + choixChoix);

		switch (choixChoix) {
		case "1":
			RecherchePopulationVille rechercherPopulationVille = new RecherchePopulationVille() ;
			rechercherPopulationVille.traiter(villes);
			break;

		case "2":
			RechercheDepartement rechercheDepartement = new RechercheDepartement();
			rechercheDepartement.traiter(villes);
			break;

		case "3":
			RechercheRegion rechercheRegion = new RechercheRegion();
			rechercheRegion.traiter(villes);
			break;

		default:

			System.out.println("Vous avez rentrez une valeur fausse");
			break;

		}

	}

}
