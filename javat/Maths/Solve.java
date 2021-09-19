package javat.Maths;
import java.util.regex.*;
import javat.Style.*;
import java.util.ArrayList;
class Solve {
	
	private static final wait tour=javat.Run.ptour();
	public static double main(String[] args) {
		tour.wai("type expression");
		Pattern p = Pattern.compile("((\\-?+\\d++\\.\\d++|\\-?+\\d++)\\s*+([\\+\\-\\*\\/])\\s*+(\\-?+\\d++\\.\\d++|\\-?+\\d++))");
		Pattern p2=Pattern.compile("\\((\\-?+(\\d++\\.\\d++|\\d++))\\)");
		Pattern p3=Pattern.compile("([\\+\\-\\*\\/])([\\+\\-\\*\\/])");
		String ex;
		if(args.length>0)ex=args[0];else ex=wait.scan();
		if(ex.equalsIgnoreCase("exit"))return -1;
		Matcher m;
		String ex2="";
		//ex=make(ex);
		//tour.wai(ex);
		
		out:{
			for (;;) {
				if(ex2.equals(ex)){tour.wai("Sorry! I stuck.");break out;}
				ex2=ex;
				m = p.matcher(ex);
				
			
				
				if(m.find()){
					int xm=0;
					boolean pl=false,mi=false,ml=false,d=false,c=false;
					while(xm!=-1){
						if(!(m.find(xm))){m.find(0);c=true;}
						xm=m.end(3)-1;
						switch(m.group(3)){
							case "+":
								if(c){if(!ml&&!d)xm=-1;}else pl=true;break;
							case "-":
								if(c){if(!pl&&!ml&&!d)xm=-1;}else mi=true;break;
							case "*":
								if(c){if(!d)xm=-1;}else ml=true;break;
							case "/":
								if(c){xm=-1;}else d=true;break;
						
						}
					
					}
					/*xm=0;
					boolean c=true;
					while(c){
						if(m.find(xm)){
							switch(m.group(3)){
								case "/":c=false;break;
								case "*":if(!d)c=false;break;
								case "+":if(!ml&&!d)c=false;break;
								case "-":if(!pl&&!ml&&!d)c=false;break;
							}
						}else{tour.wai("Sorry! I stuck");break out;}
						xm=m.end();
					}*/
					
					
					
					
					//System.out.println("matches");
					double d1=Double.parseDouble(m.group(2)),d2=Double.parseDouble(m.group(4)),d3;
					switch(m.group(3)){
						case "+":d3=d1+d2;break;
						case "-":d3=d1-d2;break;
						case "*":d3=d1*d2;break;
						case "/":d3=d1/d2;break;
						default :tour.wai("Sorry! can't solve");break out;
					}
					String rep= String.valueOf(d3);
					 try{if(d3>=0&&Character.isDigit((int)ex.charAt(m.start(1)-1)))rep="+"+rep;}catch(Exception e){}
					ex=ex.substring(0,m.start(1))+rep+ex.substring(m.end(1),ex.length());
				}
				ex = ex.replaceAll("\\(\\s*+\\)", "");
				m=p2.matcher(ex);
				if(m.find()){ex=ex.replaceAll("\\("+m.group(1)+"\\)",m.group(1));}
				m=p3.matcher(ex);
				if(m.find())switch(m.group(1)){
					case "+":ex.replaceAll(m.group(0),m.group(2));break;
					
					
				}
			//}
			tour.wai(ex);
			//try{Thread.sleep(1000);}catch(Exception e){}
			try {System.out.println(Double.parseDouble(ex));return Double.parseDouble(ex);}catch(Exception e) {}
			}
		}
		if(args.length!=0)return -1;else return main(args);
		

	}

	public static String make(String ex) {
		char[] ar={'/','*','+','-'};
		for(int n=0;n<ar.length;n++){
			char x=ar[n];
			if(ex.contains(Character.toString(x))){
				Integer[] as=positions(ex,x);
				for(int m=0;m<as.length;m++){
					
					ex=help(ex,as[m].intValue());
				}
			}
		}
		return ex;
		
	}
	private static Integer[] positions(String arg,char c){
		ArrayList<Integer> ar=new ArrayList<Integer>();
		for(int x=0;x<arg.length();x++){
			if(arg.charAt(x)==c)ar.add(Integer.valueOf(x));
		}
		Integer[] d=new Integer[ar.size()];
		d=ar.toArray(d);
		return d;
	}
	private static String help(String ex,int n){
		int l=0;
		ex="("+ex+")";
		StringBuilder sb=new StringBuilder(ex);
		for(int x=n-1;x>-1;x--){
			if(!(Character.isDigit((int)ex.charAt(x)))){
				if(ex.charAt(x)==')'){
					l++;
				}else{
					if(ex.charAt(x)=='('){
						if(l==0) {sb=sb.insert(x+1,'(');break;}
						l--;
						if(l==0) {sb=sb.insert(x+1,'(');break;}
					}else{
						if(l==0) {sb=sb.insert(x+1,'(');break;}
					}
					
				}
			}else{}
		}
		//ex=new String(sb);
		for(int x=n+1;x<ex.length();x++){
			if(!(Character.isDigit((int)ex.charAt(x)))){
				if(ex.charAt(x)=='('){
					l++;
				}else{
					if(ex.charAt(x)==')'){
						if(l==0) {sb=sb.insert(x+1,')');break;}
						l--;
						if(l==0) {sb=sb.insert(x+1,')');break;}
					}else{
						if(l==0) {sb=sb.insert(x+1,')');break;}
					}
					
				}
			}else{}
		}
		return new String (sb);
		//return ex.substring(0,ex.length());
		
	}
}