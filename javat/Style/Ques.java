package javat.Style;
public class Ques{
	//private static wait w= new wait();
	public static int YN(String ques){
		String s="";
		for(;;){
			s=wait.scan(ques);
			if(s.equalsIgnoreCase("y"))return 1;
			else if(s.equalsIgnoreCase("n"))return 0;
			else if(s.equalsIgnoreCase("yes"))return 1;
			else if(s.equalsIgnoreCase("no"))return 0;
		}
	}
	public static String q(String ques){
		String s="";
		s=wait.scan(ques);
		return s;
	}
}