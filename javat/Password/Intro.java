package javat.Password;

public class Intro   {
	private static javat.Style.wait tour;
	public static void intro(String args[]) {
		tour=javat.Run.ptour();Thread.currentThread().setName("Intro");
		
		switch (javat.Intro.intro("Possible", "Possible_e")) {
		case 1:
			//if(1>0){tour.wai("UNDER CONSTRUCTION");return;}
			javat.Password.Possible.main(args);
			return;
		case 2:
			//if(1>0){tour.wai("UNDER CONSTRUCTION");return;}
			javat.Password.Possible_e.main(args);
			return;
		case -1:
			intro(args);
			return;
		}
	}
	
}