package javat.Style;
import java.io.*;
public class Get  {
	private static wait tour=javat.Run.ptour();
	/*public static String getPassword(){
		File temp=javat.File_h.temp_cr(".bat",String.valueOf((new java.util.Random()).nextLong()),"@echo off\n set /p n=\necho %n% ");
		try{tour.wai("type password : ");
		Process p;
		ProcessBuilder pd=new ProcessBuilder(temp.getCanonicalPath());
		//pd.redirectError(ProcessBuilder.Redirect.DISCARD);
		pd.redirectOutput(ProcessBuilder.Redirect.PIPE);
		pd.redirectInput(ProcessBuilder.Redirect.INHERIT);
		p=pd.start();
		p.waitFor();
		
		String s="";
		InputStream i=p.getInputStream();
		int data;
		do{
			data=i.read();
			if(data!=-1)s+=(char)data;
		}while(data!=-1);
		return s;}catch(Exception e){return "";}finally{javat.File_h.delete(temp);}
	}*/
	public static String getPassword(){
		tour.wai("TYPE PASSWORD :");
		String pas;
		for(;;){pas=new String((System.console()).readPassword());if(pas.length()>7)break;tour.wai("YOUR PASSWORD MUST HAVE ATLEAST 8 CHARACTERS");}
		String s="";
		for(int x=0;x<pas.length();x++){s+="*";}
		tour.wai(s,0,0);
		s="";
		tour.wai("Confirm your Password :");
		final String pas2=new String ((System.console()).readPassword());
		for(int x=0;x<pas2.length();x++){s+="*";}
		tour.wai(s,0,0);
		s="";
		if(pas.equals(pas2))return pas;else {tour.wai("Password mismatch");return getPassword();}
		
	}
}