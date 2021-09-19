package javat.Danger;

import javat.Style.*;
public class Intro   {
	private static String pass="9416590147";
	private static byte chance=2;
	private static final wait tour=javat.Run.ptour();;
	private static boolean access=true;
	
	
	public static void intro(String args[]) {
		Thread.currentThread().setName("Intro");
		out:{
		
		if(!access){
			tour.wai("ACCESS DENIED!");
			return;
		}
		if(chance==0){
			tour.wai("NO CHANCE LEFT");
			access=false;
			break out;
		}
		tour.wai("WARNING: YOU HAVE ENTERED DANGER ZONE. FOR SECURITY REASONS:");
		tour.wai("TYPE PASSWORD TO CONTINUE");
		if(!pass.equals(javat.Style.wait.scan())){
			tour.wai("INCORRECT! PASSWORD");
			tour.wai("CHANCES LEFT : "+String.valueOf(--chance));break out;
			
		}
		switch (javat.Intro.intro("ThreadDemo")) {
		case 1:
			javat.Danger.ThreadDemo.main(args);
			break;
		case -1:intro(args);

		}
		}intro(args);
	}
	
		
}
	
