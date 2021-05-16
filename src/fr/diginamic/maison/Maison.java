package fr.diginamic.maison;
import java.util.ArrayList;

public class Maison {

	//Attribut
	
	ArrayList<Piece> maison = new ArrayList<Piece>();
		
	
	//Mathode ajouter Piece 
	public void ajouterPiece(Piece piece) throws Exception{
		
		//Ajout des pièces dans la maison
		if(piece == null) 
		  throw new Exception("Vous ne pouvez pas ajouter un élément null à la liste !");
		
		if(piece.superficie < 0)
			throw new Exception("Vous ne pouvez pas mettre une superficie inférieur à 0 !");
		
		if(piece.numeroEtage < 0)
			throw new Exception("Vous ne pouvez pas mettre un étage inférieur à 0 !");
		
		maison.add(piece);	
	}
		
		
	//Superficie totale de la maison 
	
	public int surperficieTotale() {
		int superficie = 0 ;
		
		for(int i = 0; i<maison.size(); i++) {
			 superficie +=  maison.get(i).superficie;
		}
		
		return superficie;
		
	}
	
	//Superficie d'un étage de la maison 
	public int superficieEtage(int numeroEtage) {
		int superficieEtage = 0;
		for(int i = 0; i<maison.size(); i++) {
			if(numeroEtage == maison.get(i).numeroEtage) {
				superficieEtage += maison.get(i).superficie;
			}
		}
		
		return superficieEtage;
	}
	
	//Superficie pour un type donné 
	public int superficieParType(Class type) {
		
		int superficieType = 0;
		for(int i =0; i < maison.size(); i++) {
			if(maison.get(i).getClass().equals(type))
				superficieType += maison.get(i).superficie;
		}
		
		
		return superficieType ;
	}
	
	//Nombre de pièces pour un type donné
	public int nombrePiece(Class Type) {
		int nombrePieceIdentique = 0; 
		for(int i =0; i < maison.size(); i++) {
			if(maison.get(i).getClass().equals(Type))
				nombrePieceIdentique ++;
		}
		
		
		return nombrePieceIdentique; 
	}
	
}
