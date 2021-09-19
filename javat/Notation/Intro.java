package javat.Notation;

public class Intro   {

	public static void intro(String args[]) {
		Thread.currentThread().setName("Intro");
		switch (javat.Intro.intro("Convert_basic")) {
		case 1:
			Convert_basic.main(args);
			break;
		case -1:
			intro(args);

		}
	}
	
}