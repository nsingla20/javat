package javat.Style;

import java.util.Scanner;

public class wait   implements Runnable {
	private long w;
	private static Scanner scan = new Scanner(System.in);
	private static boolean in=false,present=false,sc=false,is_typing=false,in_run=false;
	private static java.io.PrintStream Sys=new java.io.PrintStream(System.out,false);
	private static Thread inuse;
	private String s;
	public boolean ty=true;
	
	private static final String[] a = { "|", "/", "-", "\\", "|" };
	private static Process speech;
	private boolean sp=true;
	public wait(wait ob) {
		this.w = ob.w;
	}

	public wait(long w) {
		this.w = w;
	}

	public wait() {
		this.w = 50;
	}



	public void wai(String si, long...d) {
		
		present=true;
		while(in){try{inuse.join();}catch(Exception e){}}
		in=true;
		present=false;
		javat.File_h.users_act(si+"\n");
		if(ty)Sys.print(Thread.currentThread().getName()+" : ");
		this.s=si;
		if(d.length>1&&d[1]==0){d=new long[0];sp=false;}else sp=javat.Run.music==null||!javat.Run.music.isAlive();
		if (d.length > 0) {
			this.w = d[0];
		}
		is_typing=true;
		
		(new Thread(this,"wait")).start();
		while(!in_run)wai(500);
		
		
		
	}
	public void run(){
		in_run=true;
		inuse=Thread.currentThread();
		
		if(sp)try{speech=Speak.speak(s);}catch(Exception e){System.out.println("fail:"+e);}
		Sys.print("|");

		

		for (int x = 0; x < s.length(); x++) {
			Sys.print("\b" + s.charAt(x) + "|");
			wai();
		}
		Sys.print("\b  ");
		
		waiy();
		is_typing=false;
		while(speech.isAlive()){try{speech.waitFor();}catch(Exception e){}}
		//while(speech.isAlive())wai(500);
		in_run=false;
		in=false;

		
	}

	private void wai() {
		try {
			Thread.sleep(this.w);
		} catch (IllegalArgumentException a) {
			this.w = 100;
			wai("SPEED OUT OUT RANGE");
			wai("SETTING SPEED TO NORMAL");
		} catch (Exception e) {
		}
	}
	public static void wai(long n){
		try{
			Thread.sleep(n);
		}
			catch(InterruptedException e){
				
			}
	}

	private void waiy() {
		
		
		while(!present){
			

			for (int x = 0; x < a.length; x++) {
				Sys.print("\b" + a[x]);
				wai();

			}
			Sys.print("\b ");
			if(sc){is_typing=false;Sys.println("\n");while(sc){wai(500);}is_typing=true;}
		}
		Sys.print("\n\n");
		
		
	}
	

	public void change(long l) {
		
		this.w = l;
		wai();
	}
	public static String scan(String...type) {
		if(type.length>0)(javat.Run.ptour()).wai(type[0]);
		
		sc=true;
		while(is_typing){wai(500);}
		
		String ask=scan.nextLine();
		sc=false;
		javat.File_h.users_act("INPUT : "+ask+"\n");
		return ask;
	}

	public void change() {

		wai("HOW FAST YOU WANT PROGRAM TO BE. SPECIFY NUMBER FROM 0 TO 10");
		try {
			this.w=(new Long(10*(10 - Long.valueOf(javat.Style.wait.scan()))));
			wai();
		} catch (Exception e) {
			wai("SOMETHING WENT WRONG");
			
		}
	}
	public static void stop(String pas){if(pas.equals("tinda@123"))present=true;try{while(inuse.isAlive())inuse.join();}catch(Exception e){}}
	//public static Thread Thread_ref(String pas){if(pas.equals("tinda@123"))return inuse;return new Thread();}
	public static boolean see_in(){return in;}
	
	
	

}
