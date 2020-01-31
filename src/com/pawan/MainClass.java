package com.pawan;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class MainClass {

	public static void main(String[] args) {
		LocalDate start=LocalDate.now();
		

		LocalDate end=LocalDate.now().plusDays(60);
		WeekFields weekFields = WeekFields.of(Locale.getDefault()); 
		
		while(start.isBefore(end)) {
			System.out.println(start.toString() +"\tWeek Day Name ::"+start.get(weekFields.weekOfWeekBasedYear())+"\t\tWeek Day Value ::"+start.getDayOfWeek()+" : "+start.getDayOfWeek().getValue()+ "\t\tMV ::"+start.getMonth()+"\t\t Month Day ::"+start.getMonth().getValue());
			
			start=start.plusDays(1);
		}
		
	}

}
