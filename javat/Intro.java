package javat;
import javat.Style.*;
public class Intro {
	private static int ask;
	private static wait tour= javat.Run.ptour();;
	public static int intro(String... args) {
		Thread.currentThread().setName("Intro");
		tour.wai("WHERE YOU LIKE TO GO ?");
		for (int x = 0;x < args.length;x++) {
			tour.wai(String.valueOf((x + 1) + ")" + args[x]));
		}
		try{
			ask = Integer.valueOf(javat.Style.wait.scan());
		}
		catch (Exception e){
			tour.wai("PLEASE SPECIFY NUMBERS LIKE:");
			for (int x = 0; x < args.length;x++) {
			tour.wai(String.valueOf((x + 1) + " FOR " + args[x]));
			}
			intro(args);
		}
		if (ask > args.length || ask < 1) {
			tour.wai("NO SUCH PLACE EXIST PRESENTLY!");
			return 0;
		}
		tour.wai("OPTION SELECTED : " + args[ask - 1]);
		javat.File_h.users_write(" > "+args[ask-1],0);
		return ask;
	}
	public static void aintro(String args[]){
		switch(intro("AI","Calendar","Danger","Notation","Password","About the program","Maths")){
			case 1:javat.AI.Intro.intro(args);break;
			case 2:javat.Clendar.Intro.intro(args);break;
			case 3:javat.Danger.Intro.intro(args);break;
			case 4:javat.Notation.Intro.intro(args);break;
			case 5:javat.Password.Intro.intro(args);break;
			case 6:javat.About.Intro.intro(args);break;
			case 7:javat.Maths.Intro.intro(args);break;
			case -1:aintro(args);
			
		}
	} 
}

