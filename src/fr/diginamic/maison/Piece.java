package fr.diginamic.maison;

public abstract class Piece {

	//Attribut 
	
	public int superficie ;
	public int numeroEtage; 
	
	//Constructeur
	public Piece() {
		
	}
	
	public Piece(int superficie, int numeroEtage) {
		this.superficie = superficie; 
		this.numeroEtage = numeroEtage; 
	}
	
}
