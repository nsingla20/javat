package javat.About;
public class Intro {
	public static void intro(String args[]){
		switch(javat.Intro.intro("Credits")){
			case 1:javat.About.Credits.main(args);break;
			case -1:intro(args);break;
		}
	}
}