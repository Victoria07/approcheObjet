package fr.diginamic.interfaces;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique[] objet = new ObjetGeometrique[2];
		objet[0] = new Cercle(5);
		objet[1] = new Rectangle(2,10);
		
	
		
		for(int i=0; i<objet.length; i++) {
			System.out.println(objet[i].perimetre() + " "+ objet[i].surface());
		}
		

	}

}
