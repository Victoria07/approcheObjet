package fr.diginamic.dates;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	public static void main(String[] args) {
		
		Date dateJour = new Date(110, 5, 18, 12, 25, 30);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss" , Locale.FRANCE);
		
		String chaine2 = "12/07/2020 14:25:32" ;
		//Date date2 = simpleDateFormat.parse(chaine2);
		
		
		System.out.println(dateJour);
		String dateFormattee = simpleDateFormat.format(dateJour);
		System.out.println(dateFormattee);
		
		Date dateOjd = new Date();
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss" , Locale.FRANCE);
		System.out.println(simpleDateFormat2.format(dateOjd));

	}

}
