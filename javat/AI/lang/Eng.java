package javat.AI.lang;
import java.io.*;
import javat.Style.*;
public class Eng{
	/*public static final String[] f_per={"i","we"};
	public static final String[] s_per={"you"};
	public static final String[] t_per={"he","she","it"};
	public static final String[] wh={"how","why","what","when"};
	public static final String[] hp={"does","do","did","will","shall","is","am","are","was","were","will be","has","have","had","will have","shall have","has been","have been","had been","will have been","shall have been"};
	public static final String[] mod={"can","could","may","might","will","shall"};
	public static final String[] p_c_hp={"is","am","are"};*/
	private static boolean trust=false;
	private static final wait tour=javat.Run.ptour();
	public static final String Dic="../javat/AI/Dic/";
	private static String tempe[];
	public static void main(String[] args){		
		AIlangEng:{}
		
		try{(new File(Dic+"Dic.txt")).createNewFile();}catch(Exception e){tour.wai(e.toString());}
		if(javat.Run.getName().equals("tinda@123"))trust=true;
		
		
		tempe=new String[args.length];
		String ds;
		for(String x:args){
			try(FileInputStream fi=new FileInputStream(Dic+"Dic.txt");){
				
				int data=0;
				ds="";
				do{
					data=fi.read();
					if((char)data==':'||(char)data=='\n'){
						
						if(x.equals(ds)){
							ds="";
							for(;;){data=fi.read();if(!Character.isLetter((char)data))break;ds+=(char)data;}
							
							break;
						}else ds="";
					}else ds+=(char)data;
					if(data==-1){
						tour.wai("Can you tell \'"+x+"\' is what type of word ? Like noun or pronoun or verb,etc.");
						ds=wait.scan();
						(new javat.Run()).spec_write(Dic+"Dic.txt","end","\n"+x+":"+ds);
						(new File(Dic+ds)).mkdirs();
						(new File(Dic+ds+"/",x+".java")).createNewFile();
						tour.wai("THANK YOU");
						
					}
				}while(data!=-1);
			}catch(Exception e){tour.wai(e.toString());}
		}
	}
}