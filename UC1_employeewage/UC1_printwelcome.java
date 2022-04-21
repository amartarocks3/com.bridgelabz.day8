package UC1_employeewage;


	import java.util.Random;

	public class UC1_printwelcome {
	public int value1=0;
	public int random(){
	Random rand=new Random();
	value1=(rand.nextInt()%2);
	return value1;
	}
	public String toPrint(){

	return "Welcome to employee wage problem";
	}
	public static void main(String[] args) {
	String print;
	int value=0;
	UC1_printwelcome pr = new UC1_printwelcome();
	print=pr.toPrint();
	System.out.println(print);
	System.out.println("The employee is ");
	value=pr.random();
	if(value==0) {
	System.out.println("Absent");
	}
	else {
	System.out.println("present");
	}

	}
	}


