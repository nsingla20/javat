package javat.Style;
public class Speak{
	public static final java.io.File txTsp=new java.io.File("../balcon");
	private static javat.Stack<Process> list=new javat.Stack<Process>();
	public static Process speak(String s) throws SecurityException,java.io.IOException,NullPointerException,IllegalArgumentException{
		Process p=(Runtime.getRuntime()).exec(txTsp.getCanonicalPath()+"/balcon.exe -t \""+s+"\"",null,txTsp);
		//list.add(p);
		return p;
	}
}