package fr.diginamic.utils;

import entites.Cercle;

public class CercleFactory {

	
	//Methode static 
	public static Cercle cercle(double cercleRayon) {
		Cercle cercle =  new Cercle(cercleRayon);
		return cercle; 
	}
	
	
}
