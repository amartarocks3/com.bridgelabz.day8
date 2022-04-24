package UC4_switchcase;

import java.util.Random;

public class Checkrand {
	
		public int a;
		String st;
		public int rand(){
		Random rand=new Random();
		a = rand.nextInt()%3;
		switch(a) {
		case 0: System.out.println("absent");
		break;
		case 1: System.out.println("present");
		break;
		case 2 : System.out.println("parttime");
		break;

		}
		return a;
		}
}
