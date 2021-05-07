package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {
		
		Map<Integer,String> mapSalaire = new HashMap<Integer,String>();
		
		mapSalaire.put(1750,"Paul");
		mapSalaire.put(1825,"Hicham");
		mapSalaire.put(2250,"Yu");
		mapSalaire.put(2015,"Ingrid");
		mapSalaire.put(2418,"Chantal");
		
		System.out.println(mapSalaire.size());
		
		
		
		
	}

}
