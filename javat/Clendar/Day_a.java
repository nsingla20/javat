package javat.Clendar;
import javat.Style.*;
import java.util.*;
public class Day_a {
	private static Scanner scan = new Scanner(System.in);
	private static final wait tour=javat.Run.ptour();
	public static void main(String[] args) {
		Thread.currentThread().setName("Day_a");
		tour.wai("TYPE DAY OF MONTH");
		int date=Integer.valueOf(Integer.valueOf(wait.scan()));
		tour.wai("TYPE MONTH");
		int month=Integer.valueOf(Integer.valueOf(wait.scan()))-1;
		tour.wai("TYPE YEAR");
		int year=Integer.valueOf(Integer.valueOf(wait.scan()));
		GregorianCalendar cal=new GregorianCalendar(year,month,date);
		
		tour.wai("SPECIFIED YEAR IS LEAP YEAR : "+cal.isLeapYear(cal.get(Calendar.YEAR)));
		tour.wai("ON "+date+" "+cal.getDisplayName(Calendar.MONTH,Calendar.LONG,Locale.getDefault())+","+year+" DAY IS/WAS/WILL : "+cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,Locale.getDefault()));

	}

}
