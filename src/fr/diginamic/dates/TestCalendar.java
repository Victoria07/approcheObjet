package fr.diginamic.dates;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(110, 5, 18, 12, 25, 30);
		Date dateOjd = calendar.getTime();

	}

}
