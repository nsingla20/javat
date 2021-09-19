package javat;


import javat.Style.*;
import java.io.*;
import java.util.*;
public class Run {
	//check1
	private static String ask = "";
	private static wait tour = new wait();
	public static final long initial=(new Date()).getTime();
	public static final long ini_mem=Runtime.getRuntime().freeMemory();
	public static final String name=wait.scan("TYPE YOUR NAME :");
	private static final String pass=javat.Style.Get.getPassword();
	private static javat.Accounts.AcManager ac;
	private static boolean log=false;
	public static Process music;
	public static final String musicPlayer=System.getenv("ProgramFiles")+"/VideoLAN/VLC";
	public static final String musicFile="D:/music/best.xspf";
	public static void main(String args[]) {
		(Runtime.getRuntime()).addShutdownHook(new terminate("tinda@123"));
		Thread.currentThread().setName("Run");
		//tour.wai("Registering");
		//Naman.explore(new File("../javat"),new File("../javat/step.java"));
		try{(new File("../users/users.txt")).createNewFile();}catch(Exception e){}
		File_h.users_act("-------------------------------"+(new java.util.Date()).toString()+"-------------------------------");
		
		
		File_h.users_write(name,1);
		File_h.users_write((new java.util.Date()).toString(),1,0);
		tour.change();
		try{
			
		switch(javat.Intro.intro("sign up","log in")){
			case 1:javat.Accounts.AcManager.sign_up(name,pass);tour.wai("Sign up successful");
			case 2:ac=javat.Accounts.AcManager.log_in(name,pass);tour.wai("Log in successful");log=true;break;
			case -1:tour.wai("OK I will not bother you again");break;
		}}catch(Exception e){tour.wai(e.getMessage());}
		boolean first = true;
		
		
		
			
		
		
		try{
		for (;;) {
			
			
			try{
			switch(javat.Style.Ques.YN("Would you like to launch startup music (yes or no)")){
				case 0:if(!(music==null))if(music.isAlive())music.destroy();break;
				case 1:if(music==null||!music.isAlive())music=(Runtime.getRuntime()).exec(musicPlayer+"/vlc.exe"+" file:///"+musicFile+" --qt-start-minimized -L ");
			}
			}catch(Exception e){tour.wai("ERROR! while playing music"+e.toString());}

			Intro.aintro(args);
			Thread.currentThread().setName("Run");
			
			switch(javat.Style.Ques.YN("Would you like to launch program again (yes or no)")){
				case 0:
				try{if(log){tour.wai("Logging out");ac.log_out();}}catch(Exception e){tour.wai("ERROR in Logging out!");tour.wai(e.getMessage());}
				File_h.users_write(" Time spent : "+String.valueOf((double)(System.currentTimeMillis()-initial)/1000)+" seconds ***END***",1,0);
				tour.wai("Time spent : "+String.valueOf((double)(System.currentTimeMillis()-initial)/1000)+" seconds");
				javat.Style.wait.stop("tinda@123");
				music.destroy();
				System.exit(0);
				default:
			}
			
			tour.change();
			
			/*if (first)
				for (int x = 0; x < args.length; x++)
					args[x] = "";
			first = false;*/
		}}catch(Exception e){}

	}
	

	



	public static wait ptour() {
		return new wait(tour);
	}
	
	
	
	public static String getName(){return name;}
	static {
		
		File f=(new File("../users/user_activity"));
		f.mkdirs();
		f=(new File("../Data/Run"));
		f.mkdirs();
		f=new File("../Data/Accounts");
		f.mkdirs();
		
		
	}
	

}