package javat.Accounts;
import java.io.*;
import javat.Style.*;
//import java.nio.file.Files;
public class AcManager extends Exception implements Runnable {
	private static final wait tour=javat.Run.ptour();
	public static final AcManager ac=new AcManager();
	private static final Thread t=new Thread(ac,"AcManager");
	private static boolean stop=false;
	private String pass="";
	private String name="";
	private File op=new File("");
	private static void create(String name,String pass) throws Exception{		//false if account already exists otherwise true
		String tem="";
		for(int x=0;x<name.length();x++){
			tem+=String.valueOf((int)name.charAt(x));
		}
		
		File f=new File("../Data/Accounts/"+tem);
		if(f.exists())throw new Exception("Account already present.");
		f.mkdirs();
		f=new File(f.getPath()+"/pass.ac");
		try{f.createNewFile();}catch(Exception e){throw new Exception("Unable to create account properly.");}
		try(FileOutputStream fo=new FileOutputStream(f);){
			int c;
			int pos=0;
			for(int x=0;x<pass.length();x++){
				if(pos==name.length())pos=0;
				c=(int)(pass.charAt(x))+(int)(name.charAt(pos));
				pos++;
				fo.write(c);
			}
		}catch(Exception e){throw new Exception("Unable to create account properly.");}
		
		
	}
	private AcManager(){}
	private AcManager(File op,String pass,String name){
		this.op=op;
		this.pass=pass;
		this.name=name;
	}
	public static void sign_up(String...arg) throws Exception{
		if(arg.length>1){
			create(arg[0],arg[1]);
		}else{
			create(javat.Style.wait.scan("Type your name :"),javat.Style.Get.getPassword());
		}
		
		
	}
	public static AcManager log_in(String...arg) throws Exception{
		String nam;
		String pas;
		File a;
			if(arg.length>1){
				nam=arg[0];
				pas=arg[1];
				a= (access(nam,pas));
			}else{
				nam=javat.Style.wait.scan("Type your name :");
				pas=javat.Style.Get.getPassword();
				a= (access(nam,pas));
			}
		
		//try{javat.Programmer.Compile.decompile((java.nio.file.Files.readAllLines((new File(a.getPath()+"/pass.ac")).toPath())).get(0),a,new File(a.getPath()+"/pass.ac"));}catch(Exception e){/*throw new Exception("Unable to transfer data of the Account");*/throw e;}
		boolean af,b;
		try{b=(new File(a.getPath()+"/login_b.ac")).createNewFile();}catch(Exception e){throw new Exception("Unable to log in properly");}
		if(b)javat.Programmer.Compile.decompile(pas,a,new File(a.getPath()+"/pass.ac"));
		try{af=(new File(a.getPath()+"/login_a.ac")).createNewFile();}catch(Exception e){throw new Exception("Unable to log in properly");}
		if(b&&!af){tour.wai("You have not log out your Account properly and may be, it has been corrupted !");}
		if(!b)tour.wai("Always logout your Account properly");
		return new AcManager(a,pas,nam);
	}
	
	public void log_out() throws Exception{
		try{if(!(new File(this.op.getPath()+"/login_b.ac")).delete())throw new Exception("");}catch(Exception e){throw new Exception("Unable to logout.");}
		javat.Programmer.Compile.compile(pass,op,new File(op.getPath()+"/pass.ac"));
		try{if(!(new File(this.op.getPath()+"/login_a.ac")).delete())throw new Exception("");}catch(Exception e){throw new Exception("Unable to logout properly.");}
		//try{javat.Programmer.Compile.compile((java.nio.file.Files.readAllLines((new File(this.op.getPath()+"/pass.ac")).toPath())).get(0),this.op,new File(this.op.getPath()+"/pass.ac"));}catch(Exception e){throw new Exception("Unable to transfer data of the Account");}
		
	}
	public String toString(){
		return "NOT ALLOWED!";
	}
	public int hashCode(){
		return -1;
	}
	public boolean equals(Object obj){
		return false;
	}
	
	private static File access(String name,String pass) throws Exception{
		String tem="";
		for(int x=0;x<name.length();x++){
			tem+=String.valueOf((int)name.charAt(x));
		}
		
		File f=new File("../Data/Accounts/"+tem+"/pass.ac");
		if(!(f.exists()))throw new Exception("Account not found!");
		String pas="";
		try(FileInputStream fi=new FileInputStream(f);){
			int data=0;
			
			for(int x=0;data!=-1;x++){
				data=fi.read();
				if(x==name.length())x=0;
				if(data!=-1)pas+=(char)(data-(int)name.charAt(x));
			}
		}catch(Exception e){throw new Exception("Error!");}
		if(pas.equals(pass))return f.getParentFile();else throw new Exception("Wrong Password");
	}
	public void run(){
		File f=new File("../Data/Accounts");
		while(!stop){
			
			
			javat.Style.wait.wai(10000);
		}
	}
	static{
		File f=new File("../Data/Accounts");
		f.mkdirs();
		for(File x:f.listFiles()){
				long def=0;
				try{def=(System.currentTimeMillis())-(java.nio.file.Files.getLastModifiedTime(x.toPath())).toMillis();}catch(Exception e){System.out.print("help");}
				//if((java.util.concurrent.TimeUnit.DAYS).convert(def,java.util.concurrent.TimeUnit.MILLISECONDS)>2){
					if(def>(2*86400000))try{javat.Programmer.Command.execute("rd /s /q "+x.getCanonicalPath());}catch(Exception e){System.out.print("help");}
				//}
		}
		t.setDaemon(true);
		//t.start();
		
	}
}