package javat.Notation;



import javat.Style.wait;

public class Convert_basic   {
	
	private static final wait tour=javat.Run.ptour();
	public char[] rep = { 't', 'e', 'T' };
	public String no = "2";
	public int bits_av = 32;
	public long f_sys = 10;
	public long t_sys = 2;
	private byte df=0;
	private int gfh=0;
	private int[] test_t;
	private String out ;
	private long[] exper;
	boolean neg=false;

	public static void main(String[] args) {
		Thread.currentThread().setName("Convert_basic");
		String ask1;long ask2,ask3;int ask4;char[] ask5;
		a:{
			if(args.length>4){
				ask1=args[0];
				ask2=Long.valueOf(args[1]);
				ask3=Long.valueOf(args[2]);
				ask4=Integer.valueOf(args[3]);
				ask5=args[4].toCharArray();
				
				break a;
			}
			tour.wai("TYPE NUMBER TO BE CHANGED :");
			ask1 = javat.Style.wait.scan();
			
			tour.wai("TYPE FROM SYSTEM :");
			ask2 = Long.valueOf(javat.Style.wait.scan());
			tour.wai("TYPE TO SYSTEM :");
			ask3 = Long.valueOf(javat.Style.wait.scan());
			tour.wai("TYPE NUMBER OF BITS AVAILABLE :");
			ask4 = Integer.valueOf(javat.Style.wait.scan());
			tour.wai("TYPE CHARACTERS FOR GREATER THAN 9 IN SQUENCE");
			ask5 = (javat.Style.wait.scan()).toCharArray();
		}
		Convert_basic handle = new Convert_basic(ask1, ask2, ask3, ask4, ask5);
		ask1=handle.change();
		tour.wai("AFTER CHANGING THE SYSTEM : " + ask1);
		ask1=handle.pc_store();

		tour.wai("PC STORED VALUE : " + ask1);

	}

	public String pc_store() {
		//tour.wai("SETTING VALUES FOR PC STORE");
		t_sys = 2;df++;
		install();
		test_t[0]=0;
		//tour.wai("CALCULATING PC STORED VALUE");
		return change();
	}

	public String represent() {
		//tour.wai("REPRESENTING THE VALUES");
		out="";
		for (int x : test_t) {
			if (x > 9) {
				x -= 9;
				if (x > rep.length) {
					out += "(" + x + ")";
				} else {
					out += rep[--x];
				}
			} else
				out += String.valueOf(x);
		}
		if(neg&&df==0)return "-"+out;else return out;
	}

	public String change() {
		//tour.wai("CONVERTING NO TO NUMBER");
		exper = new long[(String.valueOf(no)).length()];
		
		int nsd=0;
		if(neg) nsd=1;
		for (; nsd < exper.length; nsd++) {
			try{
				exper[nsd] = Long.valueOf(String.valueOf((String.valueOf(no)).charAt(nsd)));
				} 
			catch(Exception e){
				for(int n=0;n<rep.length;n++){
					if((String.valueOf((String.valueOf(no)).charAt(nsd))).equals(String.valueOf(rep[n]))){
						exper[nsd]=10+n;
						break;
					}
					if(n==rep.length-1)return "NO NUMBER FOUND FOR : "+String.valueOf((String.valueOf(no)).charAt(nsd));
					}
				}
		}
		//tour.wai("CALCULATING");

		for (;;) {

			exper[exper.length - 1]--;
			for (int x = exper.length - 1; x > 0; x--) {
				if (exper[x] < 0) {
					exper[x - 1]--;
					exper[x] += f_sys;
				}
			}

			if (exper[0] < 0) {
				//tour.wai("CALCULATED");

				return represent();
			}
			test_t[bits_av - 1]++;
			for (int x = bits_av - 1; x > df||(gfh==1&&x>0);x-- ) {
				if (test_t[x] == t_sys) {
					test_t[x] = 0;
					test_t[x-1]++;
				}
			}
			if (test_t[df] >= t_sys) {
				return "OUT OF RANGE : " + represent();
			}

		}
	}

	Convert_basic(String a, long b, long c, int d, char... e) {
		no = a;
		if (b > 1)
			f_sys = b;
		if (c > 1)
			t_sys = c;
		if (d > 0)
			bits_av = d;
		if (e.length > 0)
			rep = e;
		//tour.wai("VALUES RECIEVED");
		install();

	}

	Convert_basic() {
		tour.wai("DEFAULT VALUES SET");
		install();
	}

	private void install() {
		//tour.wai("INSTALLING VALUES");
		test_t = new int[bits_av];
		
		if(neg&&df==1)gfh++;
		for (int x = gfh; x < test_t.length; x++) {
			test_t[x] = gfh;
		}
		if (String.valueOf(no.charAt(0)).equals("-")) {
			neg = true;
			
		}


	}
	

}
