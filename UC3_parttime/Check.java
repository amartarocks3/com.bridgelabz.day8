package UC3_parttime;

import java.util.Random;

public class Check {
	public int a;
	String st;
	public int rand(){
	Random rand=new Random();
	a = rand.nextInt()%3;
	if(a==0) {
	System.out.println("absent");
	}
	else if(a==1) {
	System.out.println("present");
	}
	else if(a==2) {
	System.out.println("parttime");
	}
	return a;
	}
}




