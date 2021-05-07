package fr.diginamic.maison;
import java.util.ArrayList;

public class Maison {

	//Attribut
	
	ArrayList<Piece> maison = new ArrayList<Piece>();
	
	
	
	//Mathode ajouter Pice 
	public void ajouterPiece(Piece piece) {
		
		//Creation des pieces 
		Chambre chambreParentale = new Chambre(20,1);
		Cuisine cuisine = new Cuisine(15,0);
		Salon salon = new Salon(30,0);
		SalleDeBain salleDeBain = new SalleDeBain(10,1);
		WC wc = new WC(3,0);
		
		//Ajout des pièces dans la maison
		maison.add(chambreParentale);
		maison.add(cuisine);
		maison.add(salon);
		maison.add(salleDeBain);
		maison.add(wc);
		
	}
	
	//Superficie totale de la maison 
	
	public int surperficieTotale() {
		int superficie = 0 ;
		
		for(int i = 0; i<maison.size(); i++) {
			 superficie +=  maison.get(i).superficie;
		}
		
		return superficie;
		
	}
	
}
