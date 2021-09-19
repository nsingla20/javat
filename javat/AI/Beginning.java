package javat.AI;
import javat.Style.*;
import java.util.*;
public class Beginning {
	private static final wait tour=javat.Run.ptour();
	private static String ask;
	
	private static String[] fd;
	public static void main(String args[]){
		
		Thread.currentThread().setName("AI");
		tour.wai("WELCOME, "+javat.Run.getName());
		tour.wai("Type Anything");
		ArrayList<String> res=new ArrayList<String>();
		String t="";
		for(;;){
			
			ask=wait.scan();
			if(ask.equalsIgnoreCase("exit"))break;
			ask+=" ";
			for(int x=0;x<ask.length();x++){if(ask.charAt(x)!=' ')t+=ask.charAt(x);else{res.add(t);t="";}}
			
			String[] fd = new String[res.size()];
			fd=res.toArray(fd);
			javat.AI.lang.Eng.main(fd);
			
			tour.wai("Type \'exit\' to terminate");
		}
	}
	
}