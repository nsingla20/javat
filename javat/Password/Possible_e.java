package javat.Password;

import javat.Style.*;


public class Possible_e   {
	private static long no_pass = 0l;
	
	private static String s = "1234567890/*+qwertyuiop[]\\asdfghjkl;\'zxcvbnm,.!@#$%^&*()_{}|:\"<>? ";
	private static char[] cha;
	private static wait tour;

	public static void main(String[] args) {
		tour = javat.Run.ptour();Thread.currentThread().setName("Possible_e");

		// FORMAT : (LENGTH OF PASSWORD) (STRING FROM WHICH PASSWORD IS CHOSEN(OPTIONAL)
		int naman = 0;
		if (args.length > 0)
			tour.wai("FORMAT : (LENGTH OF PASSWORD) (STRING FROM WHICH PASSWORD IS CHOSEN(OPTIONAL))");
		if (args.length >= 2) {
			s = "";
			for (int x = 1; x < args.length; x++)
				s = s + args[x] + " ";
			s = s + "\b";

		}
		if (args.length == 0)
			System.out.println("TYPE LENGTH OF PASSWORD:");
		naman = args.length == 0 ? Integer.valueOf(javat.Style.wait.scan()) : Integer.valueOf(args[0]);
		pass(naman, s.length());
		tour.wai("NO. OF PASSWORD(S) GENERATED : " + no_pass);
	}

	private static void pass(int l, int lg) {
		String result = "";
		int[] arr = new int[l];
		for (int x = 0; x < l; x++)
			arr[x] = 0;
		l--;
		for (;; arr[l]++) {
			for (int x = l; x > 0; x--) {
				if (arr[x] == lg) {
					arr[x] = 0;
					arr[x - 1]++;
				}
			}
			if (arr[0] == lg)
				break;
			for (int x = 0; x <= l; x++)
				result += s.charAt(arr[x]);
			System.out.println(result);
			no_pass++;
			result = "";
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