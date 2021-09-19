package javat.Accounts;
import java.nio.channels.*;
import java.io.*;
import java.nio.file.*;
public class Locker extends FileLock {
	private FileLock fl;
	private Locker(){}
	private Locker(File f){fl=new FileLock(FileChannel.open(f.toPath(),0,Files.size(f.toPath()),false))}
	public static Locker lock(File f){
		return new Locker(f);
	}
	public void unLock(){
		fl.close();
	}
}