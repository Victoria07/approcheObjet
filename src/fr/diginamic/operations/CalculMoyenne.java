package fr.diginamic.operations;
import java.util.ArrayList;
public class CalculMoyenne {
	
	

	//Attributs d'instances 
	ArrayList<Double> moyenne = new ArrayList<Double>();
	
	
	
	//Constructeur vide
	public CalculMoyenne() {
		
	}
	
	//Methode 
	
	public void AjoutElementListe() {
		moyenne.add(5.2);
		moyenne.add(852.25);
		moyenne.add(45.203);
		moyenne.add(78d);
		moyenne.add(12d);
		moyenne.add(456d);
		
	}
	
	public double calculMoyenne() {
		double somme = 0 ;
		for(int i=0; i<moyenne.size();i++) {
			 somme = somme + moyenne.get(i);
		}
		
		double sommes = somme / moyenne.size();
		return sommes;
	}

	//get et set
	public ArrayList<Double> getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(ArrayList<Double> moyenne) {
		this.moyenne = moyenne;
	}
			


}
