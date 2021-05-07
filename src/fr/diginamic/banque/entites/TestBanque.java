package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte client = new Compte("258575212",2500);
		Compte client2 = new CompteTaux("258575218",1895,2.5);
		
		Compte[] arrayCompte = {client,client2};
		
		for(int i = 0; i < arrayCompte.length; i++) {
			System.out.println(arrayCompte[i].toString());
		}
		
	}

}
