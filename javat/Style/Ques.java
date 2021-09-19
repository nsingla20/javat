package javat.Style;
public class Ques{
	private static wait w= new wait();
	public static int YN(String ques){
		String s="";
		for(;;){
			s=w.scan(ques);
			if(s.equalsIgnoreCase("y"))return 1;
			else if(s.equalsIgnoreCase("n"))return 0;
			else if(s.equalsIgnoreCase("yes"))return 1;
			else if(s.equalsIgnoreCase("no"))return 0;
		}
	}
}