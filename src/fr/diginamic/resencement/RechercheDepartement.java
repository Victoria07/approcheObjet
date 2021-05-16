package fr.diginamic.resencement;

import java.util.ArrayList;
import java.util.Scanner;

public class RechercheDepartement {

	public void traiter(ArrayList<Ville> villes) {
	// Département
	Scanner scannerDepartement = new Scanner(System.in);System.out.println("Veuillez choisir un département : ");
	String choixDepartement = scannerDepartement.nextLine();System.out.println("Vous avez saisi : "+choixDepartement);
	int totalDepartement = 0;for(
	int i = 0;i<villes.size();i++)
	{

		if (choixDepartement.equalsIgnoreCase(villes.get(i).getCodeDept())) {
			totalDepartement = totalDepartement + villes.get(i).getPopulationTotale();
		}
	}

	System.out.println(totalDepartement);
	}
}
