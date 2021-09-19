package javat;
public class terminate extends Thread{
	
	private static String pas="tinda@123";
	private String ty;
	public void run(){
		if(this.ty==pas){
		if(Run.music!=null)Run.music.destroy();
		}
	}
	terminate(String i){
		this.ty=i;
	}
}