package fr.diginamic.essais;

import fr.diginamic.operations.Operation;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operation divise = new Operation();
		Operation multiplie = new Operation();
		Operation additionne = new Operation();
		Operation soustrait = new Operation();
		
		System.out.println(divise.calcule(8,2,'/'));
		System.out.println(multiplie.calcule(5,2,'*'));
		System.out.println(additionne.calcule(9,4,'+'));
		System.out.println(soustrait.calcule(45,6,'-'));
		
	}

}
