package javat.Maths;
public class Intro {
	public static void intro(String[] args){
		switch(javat.Intro.intro("Solve")){
			case 1:javat.Maths.Solve.main(args);break;
			case -1:intro(args);break;
		}
	}
}