package javat.Programmer;
import java.io.*;
public class Command {
	private static Runtime r=Runtime.getRuntime();
	public static void execute(String...s) throws Exception{
		String[] arg=new String[s.length+2];
		arg[0]=".bat";
		arg[1]="";
		for(int x=2;x<arg.length;x++)arg[x]=s[x-2];
		File temp=javat.File_h.temp_cr(arg);
		r.exec(temp.getCanonicalPath());
		//javat.File_h.delete(temp);
	}
	
}