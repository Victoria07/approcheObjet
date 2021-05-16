package fr.diginamic.listes;

public enum Continent {

	Afrique(1), Asie(2), Oceanie(3), Europe(4), Amérique(5);
	
	private int continent;
	
	//constructeur 
	private Continent(int continent){
		this.continent = continent; 
	}

	
	//Get 
	public int getContinent() {
		return continent;
	}

}
