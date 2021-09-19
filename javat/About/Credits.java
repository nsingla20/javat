package javat.About;
import javat.Style.*;
import java.io.*;
class Credits {
	private static wait tour=javat.Run.ptour();
	private static java.io.PrintStream Sys=new java.io.PrintStream(System.out,false);
	private static final File dat=(new File("../Data/About/Credits"));
	public static void main(String args[]){
		dat.mkdirs();
		tour.ty=false;
		/*Sys.print("◘◘◘◘◘◘◘◘◘◘◘◘◘		  ◘◘◘◘◘			◘◘◘◘◘	◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘
				   ◘◘◘◘◘◘◘◘◘◘◘◘◘        ◘◘◘◘◘◘◘◘◘		 ◘◘◘◘◘	◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘
					   ◘◘◘◘◘		  ◘◘◘◘◘◘ ◘◘◘◘◘◘		  ◘◘◘◘◘		 ◘◘◘◘◘
					   ◘◘◘◘◘		◘◘◘◘◘		◘◘◘◘◘	   ◘◘◘◘◘	 ◘◘◘◘◘
					   ◘◘◘◘◘	   ◘◘◘◘◘		 ◘◘◘◘◘		◘◘◘◘◘	 ◘◘◘◘◘
					   ◘◘◘◘◘	   ◘◘◘◘◘		 ◘◘◘◘◘		 ◘◘◘◘◘	 ◘◘◘◘◘
					   ◘◘◘◘◘	   ◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘		  ◘◘◘◘◘  ◘◘◘◘◘
				◘◘◘◘◘  ◘◘◘◘◘	   ◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘		   ◘◘◘◘◘ ◘◘◘◘◘
				◘◘◘◘◘  ◘◘◘◘◘       ◘◘◘◘◘		 ◘◘◘◘◘	 		 ◘◘◘◘◘
				◘◘◘◘◘◘◘◘◘          ◘◘◘◘◘         ◘◘◘◘◘           ◘◘◘◘◘                    ");*/
		tour.wai("		JAVAT v"+javat.Naman.ver+"		");
		tour.wai("						...A TASTE OF JAVA");
		tour.wai("Version : "+javat.Naman.ver);
		tour.wai("Author : "+javat.Naman.author);
		tour.wai("This software or hardware is developed for general use in a  \n"+
				  "variety of information management applications. It is not  \n"+
				  "developed or intended for use in any inherently dangerous  \n"+
				  "applications, including applications that may create a risk  \n"+
				  "of personal injury. If you use this software or hardware in  \n"+
				  "dangerous applications, then you shall be responsible to  \n"+
				  "take all appropriate fail-safe, backup, redundancy, and  \n"+
				  "other measures to ensure its safe use. Naman Corporation  \n"+
				  "and its affiliates disclaim any liability for any damages  \n"+
				  "caused by use of this software or hardware in dangerous  \n"+
				  "applications.");
		tour.wai("Copyright © 2002, 2015, 2018, NAMAN and/or its affiliates.");
		tour.wai("All rights reserved.");
	}
	
}