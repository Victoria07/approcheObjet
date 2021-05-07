package maps;

import java.util.HashMap;
import java.util.Iterator;

public class MapVille {

	public static void main(String[] args) {
		
		//Création de l'objet map et ajout des éléments 
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		
		//Ajout des élements dans la map via la fonction ajouterMap
		ajouterMap(mapVilles);
		
		//Affichage de la map
		System.out.println(mapVilles);
		System.out.println(mapVilles.size());
		
		//Afficher les clefs de la map 
		Iterator<Integer> clef = mapVilles.keySet().iterator();
		while(clef.hasNext()) {
			Integer mapClef = clef.next();
			System.out.println(mapClef);
		}
		
		
		//Afficher les valeurs de la map 
		Iterator<String> valeur = mapVilles.values().iterator();
		while(valeur.hasNext()) {
			String map = valeur.next();
			System.out.println(map);
		}
		
	}
	
	//Création de la fonction permettant l'ajout d'élements dans la map
	public static void ajouterMap(HashMap<Integer, String> mapVilles) {
		mapVilles.put(69,"Lyon");
		mapVilles.put(59,"Lilles");
		mapVilles.put(33, "Bordeaux");
		
	}

}
