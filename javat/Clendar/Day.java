package javat.Clendar;

import javat.Style.*;


public class Day   {
	
	private static boolean mon = false;
	private static boolean told = false;
	private static wait tour;
	private static boolean year = false;

	public static void main(String values[]) {
		Thread.currentThread().setName("Day");
		tour = javat.Run.ptour();
		tour.wai("WELCOME! I WILL TELL YOU THE DAY");

		if (values.length > 0 && values[0].equals(""))
			values[0] = "n";

		//tour.wai("LAUNCHING PROGRAM");

		//tour.wai("STARTING SERVICE");

		//tour.wai("CONNECTING TO SERVER");

		//tour.wai("ASKING FOR PERMISSION");

		//tour.wai("PERMISSION GIVEN");

		//tour.wai("----PROGRAM STARTED!----");

		day(values);
		System.out.println("");
		tour.wai("THANKS FOR ASKING HAVE A GOOD DAY :)  ");
	}
	

	private static void day(String arg[]) {
		tour = javat.Run.ptour();

		String[] value = { "n", "n", "n", "" };

		calc: {
			byte dd = 0;
			byte mm = 0;
			long yyyy = 0;

			for (byte x = 0; x < arg.length; x++) {
				if (x > 3)
					break;
				value[x] = arg[x];
			}
			if (arg.length != 4) {
				break calc;
			}

			tour.wai(arg[3]);

			if (value[0].equals("n"))
				tour.wai("type date");
			{
				String ask = "";

				try {

					ask = value[0].equals("n") ? javat.Style.wait.scan() : value[0];

					dd = Byte.valueOf(ask);
					value[0] = ask;

				} catch (Exception e) {

					switch (ask) {
					case "exit": {
						return;
					}
					}
					tour.wai("what are u typing! type number from 1 to 31 ");
					value[0] = "n";
					break calc;

				}
			}

			if (value[1].equals("n"))
				tour.wai("type month in number");

			try {
				mm = !value[1].equals("n") ? Byte.valueOf(value[1]) : Byte.valueOf(javat.Style.wait.scan());
				value[1] = String.valueOf(mm);
			} catch (Exception e) {
				tour.wai("type months in number like 1 for JAN, 2 for FEB,3 for MARCH, and so on ");
				value[1] = "n";
				break calc;
			}
			if (value[2].equals("n"))
				tour.wai("type year");

			try {
				yyyy = !value[2].equals("n") ? Long.valueOf(value[2]) : Long.valueOf(javat.Style.wait.scan());
				value[2] = String.valueOf(yyyy);
			} catch (Exception e) {
				tour.wai("type year in numbers ");
				value[2] = "n";
				break calc;
			}
			if(value[0].equals("20")&&value[1].equals("7"))tour.wai("BIRTH DAY OF AUTHOR.");
			byte res;
			byte m = 0;
			boolean leap;

			// if anyone negative or zero
			if (!mon)
				tour.wai("CHECKING IF MONTHS ARE IN RANGE");

			if ((mm <= 0 || mm > 12) && !mon) {
				value[1] = "n";
				value[3] = "months are out of range";
				break calc;
			} else
				mon = true;
			if (!year)
				tour.wai("CHECKING IF YEARS ARE IN RANGE");

			if (yyyy <= 0 && !year) {
				value[2] = "n";
				value[3] = "years are out of range";
				break calc;
			} else
				year = true;

			// leap true or false
			if (yyyy % 4 == 0) {
				if (yyyy % 100 == 0) {
					if (yyyy % 400 == 0) {
						leap = true;
					} else {
						leap = false;
					}
				} else {
					leap = true;
				}
			} else {
				leap = false;
			}
			if (!told) {
				tour.wai("YEAR IS" + (leap ? " " : " NOT ") + "A LEAP YEAR");
				told = true;
			}
			// check if days are in range
			tour.wai("CHECKING IF DAYS ARE IN RANGE");

			if (dd <= 0) {
				value[0] = "n";
				value[3] = "days are out of range";
				break calc;
			}
			byte[] dm = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			if (!leap) {
				if (dd > dm[mm]) {
					value[0] = "n";
					value[3] = "days are out of range";
					break calc;
				}
			} else {
				switch (mm) {
				case 2:
					if (dd > 29) {
						value[0] = "n";
						value[3] = "days are out of range";
						break calc;
					}
				default:
					if (dd > dm[mm]) {
						value[0] = "n";
						value[3] = "days are out of range";
						break calc;
					}
				}
			}

			// calculate odd days in months
			byte[] mn = { 0, 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
			if (leap && mm > 2)
				m = (byte) (mn[mm] + 1);
			if (!leap || mm < 3)
				m = mn[mm];

			// calculate
			res = (byte) (((byte) (((yyyy - 1) >> 2) % 7)
					- ((byte) (((yyyy - 1) / 100) % 7) - (byte) (((yyyy - 1) / 400) % 7)) + yyyy - 1 + m + dd + 7) % 7);

			String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
			String[] months = { "0", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST",
					"SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" };

			tour.wai("CALCULATING");

			tour.wai("----------------------------------------------------------------");
			tour.wai("  	ON " + dd + " " + months[mm] + "," + yyyy + " DAY WAS/IS/WILL : " + days[res]);
			tour.wai("----------------------------------------------------------------");
			for (int x = 0; x < value.length; x++)
				value[x] = "n";

			tour.wai("GOING TO START AGAIN! TO TERMINATE TYPE exit", 1);
			value[3] = "";
			mon = false;
			told = false;
			year = false;
		}
		day(value);
	}
	public static void trip(){} 
	
}
