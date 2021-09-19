package javat.Programmer;
import java.io.*;
public class Compile {
	public static boolean compile(String pas,File...f){		//pas,file to compile, files to exclude
		for(int x=1;x<f.length;x++){
			if(f[0].equals(f[x]))return true;
		}
		if(f[0].isFile()){
			File temp=javat.File_h.temp_cr();
			try(FileInputStream fi=new FileInputStream(f[0]);FileOutputStream fo=new FileOutputStream(temp);){
				int pos=0,data;
				do{
					if(pos==pas.length())pos=0;
					data=fi.read();
					fo.write(data+(int)pas.charAt(pos));
					pos++;
				}while(data!=-1);
				if(!(javat.File_h.copy(temp,f[0])))return false;
				return true;
			}catch(Exception e){return false;}
		}else{
			for(File x:f[0].listFiles()){
				File[] d=new File[f.length];
				d[0]=x;
				for(int n=1;n<d.length;n++){
					d[n]=f[n];
				}
				return compile(pas,d);
			}
		}
		return true;
	}
	public static boolean decompile(String pas,File...f){
		for(int x=1;x<f.length;x++){
			if(f[0].equals(f[x]))return true;
		}
		if(f[0].isFile()){
			File temp=javat.File_h.temp_cr();
			try(FileInputStream fi=new FileInputStream(f[0]);FileOutputStream fo=new FileOutputStream(temp);){
				int pos=0,data;
				do{
					if(pos==pas.length())pos=0;
					data=fi.read();
					fo.write(data+(int)pas.charAt(pos));
					pos++;
				}while(data!=-1);
				if(!(javat.File_h.copy(temp,f[0])))return false;
				return true;
			}catch(Exception e){return false;}
		}else{
			for(File x:f[0].listFiles()){
				File[] d=new File[f.length];
				d[0]=x;
				for(int n=1;n<d.length;n++){
					d[n]=f[n];
				}
				return decompile(pas,d);
			}
		}
		return true;
	}
}