package maps;

import java.util.HashMap;
import java.util.Iterator;

import fr.diginamic.listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		
		HashMap<String, Ville> mapVille = new HashMap<String, Ville>();
		
		mapVille.put("Tarbes", new Ville("Tarbes",40_600));
		mapVille.put("Nice", new Ville("Nice",343_000));
		mapVille.put("Carcassonne", new Ville("Carcassonne",47_800));
		mapVille.put("Narbonne", new Ville("Narbonne",53_400));
		
		Ville tampon = null;
		Iterator<Ville> petiteVille = mapVille.values().iterator();
		while(petiteVille.hasNext()) {
			Ville mapValeur = petiteVille.next();
			if(tampon == null || mapValeur.getNombreHabitants() < tampon.getNombreHabitants()) {
				tampon = mapValeur;
			}
		}
		mapVille.remove(tampon.getVille());
		
		System.out.println(mapVille.toString());
		
		

	}

}
