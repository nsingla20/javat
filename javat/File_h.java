package javat;


import javat.Style.*;
import java.util.*;
import java.util.concurrent.*;
import java.io.*;

public class File_h {
	private static wait tour=Run.ptour();
	private static String s;
	private static File file;
	private static String[] where;
	private static boolean spec=false;
	//private static long line=1;
	
	private static final String name=Run.getName();
	private static File o_file=new File("");
	
	
	private static long n_space=0;
	private static final File users_act=new File("../users/user_activity/",(String.valueOf(Run.initial)+".txt"));
	
	public static void users_write(String si,int...fg){
		
		out:{
			if((javat.Run.getName()).equals("tinda@123"))break out;
		File fil=new File("../users/users.txt");
		if(fg.length>0){
			
			//skip if last 0
			if(fg[0]==1){		//make symmetric if 1
				for(;;){
					if(si.length()>9)break;
					si+=" ";
					if(si.length()>9)break;
					si=" "+si;}
			}
			if(!(fg[fg.length-1]==0)){si="\n"+String.valueOf(nline(fil)+")"+si);}
			
		}
		
		
		
		spec_write(fil.getPath(),"end",si);
		}
	}
	public static long nline(File f){
		try(FileInputStream fi=new FileInputStream(f);){
			long line=1;
			int data;
			do{
				data=fi.read();
				if(data==(int)'\n')line++;
			}while(data!=-1);
			return line;
		}catch(Exception e){return -2;}
		
	}
	public static boolean users_act(String s){
		File temp=temp_cr();
		
		try{
			
			if((javat.Run.getName()).equals("tinda@123"))return true;
			
			
			
			users_act.createNewFile();
			//r.exec(temp_cr(".bat","","if not exist "+users_act+"echo >"+users_act).getCanonicalPath()).waitFor();
			
			try(FileInputStream fi=new FileInputStream(users_act);FileOutputStream fo=new FileOutputStream(temp);){
				int data;
				do{
					data=fi.read();
					if(data!=-1)fo.write(data);
				}while(data!=-1);
				fo.write(s.getBytes());
				fi.close();
				fo.close();
				
			}catch(Exception e){return false;}
			
			//r.exec(temp_cr(".bat","","\n"+s+">"+temp).getCanonicalPath()).waitFor();
			
			//r.exec(temp_cr(".bat","","copy "+users_act+"+"+temp+" "+users_act).getCanonicalPath()).waitFor();
			javat.File_h.copy(temp,users_act);
		}catch(Exception e){return false;}
		return true;
	}	
	public static void spec_write(String...fil/*,String where,String write*/){
		out:{if(fil.length<3)break out;
			file=new File(fil[0]);
		s=fil[fil.length-1];
		ngh:{if(fil[1].equals("end"))break ngh;ArrayList<String> ar=new ArrayList<String>(new CopyOnWriteArrayList<String>(fil));ar.remove(fil.length-1);ar.remove(0);where=new String[ar.size()];where=ar.toArray(where);spec=true;}
		//skip=true;
		
		run();
		}
	}
	public static boolean erase(File fil){
		if(!fil.exists())return true;
		try(FileOutputStream fo=new FileOutputStream(fil);){
			fo.write("".getBytes());
		}catch(Exception e){return false;}
		return true;
	}
	public static boolean delete(File fil){
		if(!erase(fil))return false;
		try{fil.delete();}catch(Exception e){return false;}
		return true;
		
	}
	public static java.io.File temp_cr(String...arg){		//create temporary file (extension,name,String)
		File file;
		String name="",ext=".txt";
		//File loc=new File("../Temp/");			//default location
		if(arg.length<2)name=String.valueOf(System.currentTimeMillis());else if(arg[1].equals(""))name=String.valueOf(System.currentTimeMillis());else name=arg[1];
		if(arg.length>0)if(!arg[0].equals(""))ext=arg[0];
		//if(arg.length>2)if(!arg[2].equals(""))loc=arg[2];
		
		for(;;){
			
			try{file=File.createTempFile(name,ext);
			break;}catch(Exception e){}
			
		}
		if(arg.length>2){
			try(FileOutputStream fo=new FileOutputStream(file);){
				for(int x=2;x<arg.length;x++){
					fo.write(arg[x].getBytes());
				}
			}catch(Exception e){}
		};
		return file;
	}
	
	public static boolean contain(File fil,String arg){
		
			if(fil.isFile()){
				if(loc(fil.getPath(),arg)<0)return false;else return true;
			}else{
				for(File temp:fil.listFiles()){if(contain(temp,arg))return true;}
				return false;
			}
		
	}
	public static boolean copy(File from,File to){		//copy one file to another 
		//if(!(from.isFile()&&to.isFile()))return false;
		int data=0;
		try(FileInputStream fi=new FileInputStream(from);FileOutputStream fio=new FileOutputStream(to);){
			do{
				data=fi.read();
				if(data!=-1)fio.write(data);
			}while(data!=-1);
		}catch(Exception e){return false;}
		//try{r.exec(temp_cr(".bat","","copy "+to.getCanonicalPath()+"+"+from.getCanonicalPath()+" "+to.getCanonicalPath()).getCanonicalPath()).waitFor();}catch(Exception e){return false;}
		return true;
	}
	
	private static byte[] tab(){
		String s="";
		for(long x=0;x<n_space;x++)s+="\t";
		return s.getBytes();
	}
	
	public static long another(File fil,long one){
		
		try(FileInputStream fi=new FileInputStream(fil);){
			int data,pos=0,fni=-1,ini;
			
			char[] f={'{','(','<','\"','[','\'','\\'};
			
			char[] t={'}',')','>','\"',']','\'','\\'};
			boolean cancel=false;
			fi.skip(one);
			ini=fi.read();
			for(int x=0;x<f.length;x++){if(ini==(int)f[x]){fni=(int)t[x];break;}}
			if(fni==-1)return -1;
			int tem=0;
			do{
				data=fi.read();
				
				if(where_r_u(fil,pos)!=2)cancel=true;
				if(data==ini&&!cancel)tem++;
				if(tem>0&&data==fni&&!cancel)tem--;
				if(!cancel&&data==fni&&tem==0)return pos;
				
				pos++;
			}while(data!=-1);
		}catch(Exception e){return -2;}
		return -1;
	}
	public static int spec_read(File fil,long loc){
		try(FileInputStream fi=new FileInputStream(fil);){fi.skip(loc);return fi.read();}catch(Exception e){return -2;}
		
	}
	public static byte where_r_u(File fil,long loc){		//-2 for Exception, -1 for nothing, 0 for String, 1 for comment, 2 for anywhere else, 3 for line comment
		if(loc<0)return -1;
		
		try(FileInputStream fi=new FileInputStream(fil);){
			
			int data,pos=0;
			byte what=2;
			boolean ig=false;
			
			do{
				data=fi.read();
				if(data==(int)'/'&&spec_read(fil,pos+1)==(int)'*'&&what==2){what=1;}
				if(data==(int)'/'&&spec_read(fil,pos+1)==(int)'/'&&what==2)what=3;
				
				
				if(data==(int)'\"'&&what==2){what=0;ig=true;}
				
				if(pos==loc)return what;
				
				if(data==(int)'\"'&&what==0&&!ig)what=2;
				ig=false;
				if(data==(int)'/'&&spec_read(fil,pos-1)==(int)'*'&&what==1)what=2;
				if(data==(int)'\n'&&what==3)what=2;
				
				pos++;
			}while(data!=-1);
			
		}catch(Exception e){return -2;}
		return -1;
		
	
	}
	public static boolean make(File fil){
		
			if(!fil.isFile())return false;
			try{
				File tempy=temp_cr();				
				int data,pos=0;
				
				
				FileInputStream fi=new FileInputStream(fil);
				FileOutputStream temp=new FileOutputStream(tempy);
				int tem;boolean comment=false;
				do{
					data=fi.read();
					tem=where_r_u(fil,pos);
					if(data==(int)','&&spec_read(fil,pos-1)==(int)'('&&tem!=0)tem=1;
					if(data!=-1&&tem!=1&&tem!=3)temp.write(data);
					pos++;
				}while(data!=-1);
				fi.close();
				temp.close();
				FileOutputStream fio=new FileOutputStream(fil);
				FileInputStream tempi=new FileInputStream(tempy);
				boolean ok=false;
				do{
					data=tempi.read();
					if((char)data=='}')n_space--;
					if(ok){fio.write((int)'\n');fio.write(tab());}
					if((char)data=='{')n_space++;
					
					
					if(((char)data==';'||(char)data=='{'||(char)data=='}')&&spec_read(fil,pos+1)!=(int)'\n')ok=true;else ok=false;
					if(data!=-1)fio.write(data);
					pos++;
				}while(data!=-1);
				fio.close();tempi.close();
				n_space=0;
			}catch(Exception e){n_space=0;return false;}
			return true;
			
		
	}
	public static boolean ad_type(File file,long where,String what){	//type at location specified by integer
		int data=0;
		
		File tempy=temp_cr();
		try{
			FileInputStream fi=new FileInputStream(file);
			FileOutputStream to=new FileOutputStream(tempy);
			int pos=0;
			do{
				data=fi.read();
				if(pos==where)to.write(what.getBytes());
				pos++;
				if(data!=-1)to.write(data);
			}while(data!=-1);
			fi.close();
			to.close();
			javat.File_h.copy(tempy,file);
		}catch(Exception e){return false;}
		return true;
		
	}
	public static long loc(File fil,String...arg){
		if(arg.length==0)return -2;
		
		try(java.io.FileInputStream jk=new java.io.FileInputStream(fil);){
			
			int x=0;
			int pos=0;
			long loc=0;
			boolean v;
			int data;
			do{
				data=jk.read();
				if(data==(int)arg[x].charAt(pos)){pos++;v=true;}else v=false;
				if(!v)pos=0;
				loc++;
				if(pos==arg[x].length()){x++;if(x!=arg.length){pos=0;}else return loc;}
			}while(data!=-1);
			return -1;
		}catch(Exception e){return -2;}
		
		}
	public static long loc(String fil,String...arg){	//return last of String arg in file
		return loc(new File(fil),arg);
	}
	
	private static void run (){
		
		
		
		
		
		try{
			java.io.File tempty=temp_cr();
			long pos=-2;
			if(spec)pos=loc(file,where);
			
			//while(o_file.equals(file))wait.wai(500l);
			//o_file=file;	
			java.io.FileInputStream fi=new java.io.FileInputStream(file);
			java.io.FileOutputStream tempo=new java.io.FileOutputStream(tempty);
			
			
				
			int data=0;
			for(long x=0;data!=-1;x++){
				data=fi.read();
				
				//if((char)data=='\n'&&!skip)line++;
				
				if(x==pos)tempo.write(s.getBytes());
				if(data!=-1)tempo.write(data);
				
			}
				
			
				//if(!skip)
				//tempo.write(("\n"+String.valueOf(line)+") ").getBytes());
			
			if(!spec)tempo.write((s).getBytes());
			tempo.close();fi.close();
			
			
			javat.File_h.copy(tempty,file);
				
				
		}catch(Exception e){}//finally{o_file=new File("");}
			
			
	}
}