package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		for(Saison saison : Saison.values()){
			System.out.println(saison.toString());
		}

		Saison ete = Saison.valueOf("ETE");
		
		Saison hiver = Saison.getSaison("Hiver");
		System.out.println(hiver + " " + ete);
	}

}
