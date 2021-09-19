package javat;
/*import java.util.*;
import javat.Style.*;
import javat.Clendar.*;
import javat.Danger.*;
import javat.Notation.*;
import javat.Password.*;
import javat.*;*/
import java.io.*;
import javat.Style.*;
public class Naman {
	public static final String ver=version();
	public static final String author="NAMAN SINGLA";
	private static final wait tour=javat.Run.ptour();
	private static boolean isUpdate=false;
	//private static boolean c=false;
	/*private static String hj;
	
	private static String file;
	private static ArrayList<String> p=new ArrayList<String>();
	//private static int[] depth=new int[8];
	public static String[] extra=new String[p.size()];*/
	
	/*
	public static void main(String[] args){}
	
	public static void explore(){
		trip(new File("../javat"));
	}
	public static boolean trip(File f){
		if(!f.isDirectory())return false;
		for(File x:f.listFiles()){
			if(x.isFile()){
				
			}else{trip(x);}
		}
	}
	/*public static boolean explore(File gf,File gt){
		
		if(!gt.isFile()||!gf.isDirectory())return false;
		
		try{
			gt.createNewFile();
			
			
			gf.createNewFile();}catch(Exception e){}
		File_h.erase(gt);
		hj=gf.getName();
		file=gt.getPath();
		
		add(file);
		
		add("{");
			
		add("public static void trip(String[] args){");
		
		
		File_h.spec_write(file , "end" , "package javat;class "+gt.getName().substring(0,gt.getName().length()-5)+" {}" );
			
		File_h.spec_write(file , "end" , "public static void trip(String[] args){}" );
		
		add("/*"+hj+"*switch(javat.Intro.nintro()){}");
					
				File_h.spec_write(extra );
				remove();
		add("/*"+hj+"*switch(javat.Intro.nintro(");
		
		trip(gf);
		
		javat.File_h.make(gt);
		//long tem=javat.File_h.loc(gt,"public static void trip(String[] args){");
		//if(!(tem<0)){
			
			File_h.ad_type(gt,File_h.another(gt,tem-1)+1,"*");		//this statement is not working correctly
		//	File_h.ad_type(gt,tem-"public static void trip(String[] args){".length(),"/*");
		//}
		
		/*tem=javat.File_h.loc(gt,"class","{");
		File temp=File_h.temp_cr();
		try(FileInputStream fi=new FileInputStream(file);FileInputStream f=new FileInputStream(gt);FileOutputStream tempo=new FileOutputStream(temp);){
			int data=0;
			for(long x=0;data!=-1;x++){
				
				
				if(x==tem){
					
					
					
					do{
						data=fi.read();
						if(data!=-1)tempo.write(data);
					}while(data!=-1);
				}
				data=f.read();
				if(data!=-1)tempo.write(data);
			}
			javat.File_h.copy(temp,gt);
		}catch(Exception e){return false;}
		File_h.make(temp);
		return true;
	
	
	}
	public static long nloc(String...arg){		//return last of String arg in arg[0]
		boolean f=true;
		String[] ne=new String[arg.length-1];
		for(int x=0;x<arg.length;x++){
			out:{if(f)break out;ne[x-1]=arg[x];}
			f=false;
		}
		return javat.File_h.loc(arg[0],ne);
	}
	private static void add(String df){
		p.add(df);
		extra=new String[p.size()];extra=p.toArray(extra);
		
	}
	private static void remove(){p.remove(p.size()-1);extra=new String[p.size()];extra=p.toArray(extra);}
	private static void trip(File f1){
		//j++;
		//System.out.println(f1.getName());
		int fgh=0;
		
		
		File[] file_ar=f1.listFiles();
		for(File x:file_ar){
			
			
			if(x.isFile()){
				if(x.getName().endsWith(".java")){
					if(nloc(x.getPath(),"main(String")>-1){
						fgh++;
						add( ",\""+x.getName().substring(0,x.getName().length()-5)+"\"");
						File_h.spec_write(extra);
						add(")){");
						
						add("/*"+hj+"."+x.getName().substring(0,x.getName().length()-5)+"*case "+String.valueOf(fgh)+" :"+hj+"."+x.getName().substring(0,x.getName().length()-5)+".main(args);break;");
						
						
						
							File_h.spec_write(extra );
						
						
						
						
						remove();
						remove();
						remove();
				
						
					}
				}
			}else{
				if(!File_h.contain(x,"public static void main"))continue;
				fgh++;
				hj+="."+x.getName();
				add( ",\""+x.getName()+"\"");
				File_h.spec_write(extra);
				
				
				
				add(")){");
				
				add("/*"+hj+"*case "+String.valueOf(fgh)+" :");
				
				
					File_h.spec_write(extra );
				add("/*"+hj+"*switch(Intro.nintro()){}");
							
							File_h.spec_write(extra );
							remove();
							
							add("/*"+hj+"*switch(Intro.nintro(");
				
				trip(x);
				
				
				
				
				
					
				
				
				hj=hj.substring(0,hj.lastIndexOf((int)'.'));
				remove();
				remove();
				remove();
				remove();
			}
			
			
				
		}
		
	} */
	private static String version(){
		
		File f=new File("../Data/Naman");
		f.mkdirs();
		f=new File("../Data/Naman/version.txt");
		try{
			if(!(f.exists())){
				f.createNewFile();
				Integer ar[]={0,0,0};
				switch(javat.Run.name){
					case "u_major":ar[0]++;isUpdate=true;break;
					case "u_minor":ar[1]++;isUpdate=true;break;
					case "u_security":ar[2]++;isUpdate=true;break;
				}
				String s="";
				for(int x=0;x<ar.length;x++){
					s+=ar[x];
					if(x!=ar.length-1)s+=".";
					
				}
				javat.File_h.ad_type(f,0,s+".");
				return s;
			}else {
				//java.util.ArrayList<Integer> ar=new java.util.ArrayList<Integer>();
				Integer[] ar=new Integer[3];
				FileInputStream fi=new FileInputStream(f);
				int data;
				byte pos=0;
				String s="";
				do{
					data=fi.read();
					if(data==(int)'.'){ar[pos]=(Integer.valueOf(s));s="";pos++;if(pos==3)break;}else{s+=(char)data;}
				}while(data!=-1);
				fi.close();
				//s="";
				//if((javat.Run.name).equals("tinda@123")&&(new java.util.Random()).nextBoolean){ar.add(ar.size()-1,ar.get(ar.size()-1)+1);ar.remove(ar.size()-1);}
				//for(int x=ar.size()-1;x>0;x--)if(ar.get(x)==10){ar.remove(x);ar.add(x,0);ar.add(x-1,ar.get(x-1)+1);ar.remove(x);}
				for(int x=0;x<ar.length;x++){
					switch(x){
						case 0:if(javat.Run.name.equalsIgnoreCase("u_major")){ar[0]=ar[0]+1;ar[1]=0;ar[2]=0;isUpdate=true;}break;
						case 1:if(javat.Run.name.equalsIgnoreCase("u_minor")){ar[1]=ar[1]+1;isUpdate=true;}break;
						case 2:if(javat.Run.name.equalsIgnoreCase("u_security")){ar[2]=ar[2]+1;isUpdate=true;}break;
					}
				}
				javat.File_h.erase(f);
				for(int x=0;x<ar.length;x++){s+=String.valueOf(ar[x]);if(x!=ar.length-1)s+=".";}
				javat.File_h.ad_type(f,0,s+".");
				return s;
			}
		}catch(Exception e){return "0.0.0";}
	}
	static {
		File f=(new File("../Data/Naman"));
		f.mkdirs();
		
		
	
	}
}