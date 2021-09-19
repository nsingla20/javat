package javat.Password;


import javat.Style.*;

public class Possible   {
	
	private static String s = "1234567890/*+qwertyuiop[]\\asdfghjkl;\'zxcvbnm,.!@#$%^&*()_{}|:\"<>? ";
	private static char[] cha;
	private static wait tour;
	private static int naman = 0;
	private static long no_pass = 0;
	private static char[] c;
	private static int[] gst;

	public static void main(String[] args) {
		Thread.currentThread().setName("Possible");
		tour = javat.Run.ptour();
		if (args.length > 0)
			tour.wai("FORMAT:(LENGTH OF PASSWORD) (STRING FROM WHICH PASSWORD IS CHOSEN(OPTIONAL))");

		if (args.length >= 2) {
			s = "";
			for (int x = 1; x < args.length; x++)
				s = s + args[x] + " ";
			s = s + "\b";
		}
		tour.wai("TYPE THE LENGTH OF PASSWORD");
		naman = (args.length == 0 ? Integer.valueOf(javat.Style.wait.scan()) : Integer.valueOf(args[0])) - 1;
		c = new char[naman + 1];
		gst = new int[naman + 1];

		gen(0);
		tour.wai("NO. OF PASSWORD(S) GENERATED : " + no_pass);
	}

	public static void gen(int no) {

		for (gst[no] = 0; gst[no] < s.length(); gst[no]++) {

			c[no] = s.charAt(gst[no]);
			if (no == naman) {
				for (char g : c) {
					System.out.print(g);
				}
				System.out.println("");
				no_pass++;
			}

			if (no < naman)
				gen(no + 1);

		}

	}

	
	static {
		
		
	
		char c;
		for (int x = 0; x <= 127; x++) {
			c = (char) x;

			s = s + c;

		}
		cha = new char[s.length()];
		cha = s.toCharArray();
		int y = 0;
		String sx = "";
		String sy;
		for (int x = 0; x < cha.length; x++) {
			y = x + 1;
			for (; y < cha.length; y++) {
				sx = String.valueOf(cha[x]);
				sy = String.valueOf(cha[y]);

				if (sx.equals(sy))
					cha[x] = 'n';
			}
		}
		s = String.valueOf(cha);
		s = s.replaceAll("n", "");
		s = s + "n";
	}
}
