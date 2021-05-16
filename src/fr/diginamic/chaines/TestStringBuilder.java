package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		
	
		long debut= System.currentTimeMillis();
		
		for(int i = 0; i<100000; i++){
			builder.append(i);
		}
		
		long fin= System.currentTimeMillis();
		
		
		System.out.println("Temps écouléen millisecondes :"+ (fin-debut));

		
		String essaie = " " ;
		
		debut= System.currentTimeMillis();
		
		for(int i = 0; i<100000; i++) {
			essaie += i; 
		}
		
		fin= System.currentTimeMillis();
		
		System.out.println("Temps écouléen millisecondes :"+ (fin-debut));
		
	}

}
