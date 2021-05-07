package maps;

import java.util.HashMap;
import java.util.Iterator;



public class FusionMap {

	public static void main(String[] args) {
		
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		//Creation map3
		HashMap<Integer,String> map3 = new HashMap<Integer,String>();
		
		Iterator<Integer> clef = map1.keySet().iterator();
		while(clef.hasNext()) {
			Integer mapClef = clef.next();
			map3.put(mapClef, map1.get(mapClef));	
		}
		
		 clef = map2.keySet().iterator();
		while(clef.hasNext()) {
			Integer mapClef = clef.next();
			map3.put(mapClef, map2.get(mapClef));	
		}
		
		System.out.println(map3);
	}

}
