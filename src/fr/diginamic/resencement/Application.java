package fr.diginamic.resencement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.Region;

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

			// Tranformer chaque ligne en instance de la classe Ville

			Ville nouvelleVille = new Ville(morceaux[0], morceaux[1], morceaux[2], morceaux[5], morceaux[6], popTotale);
			villes.add(nouvelleVille);
			// System.out.println(nouvelleVille);
		}

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

		// Département

		Scanner scannerDepartement = new Scanner(System.in);
		System.out.println("Veuillez choisir un département : ");
		String choixDepartement = scannerDepartement.nextLine();
		System.out.println("Vous avez saisi : " + choixDepartement);
		int totalDepartement = 0;
		for (int i = 0; i < villes.size(); i++) {

			if (choixDepartement.equalsIgnoreCase(villes.get(i).getCodeDept())) {
				totalDepartement = totalDepartement + villes.get(i).getPopulationTotale();
			}
		}

		System.out.println(totalDepartement);

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
