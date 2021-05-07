package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
	
		Path pathFile = Paths.get("C:/Users/Victoria/Documents/Diginamic/Java/Approche Objet/recensement.csv");
		List<String> lignes = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		
		for(int i=0; i<lignes.size();i++) {
			String ligne = lignes.get(i);
			//ligne.remove(0);
			String[] morceauLigne = ligne.split(";");
			int populationFaible = Integer.parseInt(morceauLigne[9]);
			String nouvelleChainePropre = morceauLigne[9].trim().replaceAll(" ", "");
			int population = Integer.parseInt(nouvelleChainePropre);
			if(populationFaible<25000) {
				System.out.println(population);
			}
			//System.out.println(lignes.get(i).split(";")); ligne.remove(0);
		}
		//découper lignes par lignes avec split 
		//Refaire une boucle pour chaque ligne récup on utilise la méthode split 
		//lignes.get(i).split(';');
		
		
	}

}
