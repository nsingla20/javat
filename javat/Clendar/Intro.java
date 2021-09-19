package javat.Clendar;

public class Intro   {

	public static void intro(String args[]) {
		Thread.currentThread().setName("Intro");
		switch (javat.Intro.intro("Day","Day advance")) {
		case 1:
			javat.Clendar.Day.main(args);
			break;
		case 2:
			javat.Clendar.Day_a.main(args);
			break;
		case -1:intro(args);

		}
	}
	
	
}