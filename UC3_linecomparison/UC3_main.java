package UC3_linecomparison;

import java.util.Scanner;

public class UC3_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to line comparison problem");
		UC3_line line1 = new UC3_line();
		UC3_line line2 = new UC3_line();
		line1.p1 = new UC3_point();
		line1.p2 = new UC3_point();
		System.out.println("For line1");
		System.out.println("Enter x for point1");
		line1.p1.x=sc.nextInt();
		System.out.println("Enter y for point1");
		line1.p1.y=sc.nextInt();
		System.out.println("Enter x for point2");
		line1.p2.x=sc.nextInt();
		System.out.println("Enter y for point2");
		line1.p2.y=sc.nextInt();
		
		System.out.println("for line 2");
		line2.p1 = new UC3_point();
		line2.p2 = new UC3_point();
		System.out.println("Enter x for point1");
		line2.p1.x=sc.nextInt();
		System.out.println("Enter y for point1");
		line2.p1.y=sc.nextInt();
		System.out.println("Enter x for point2");
		line2.p2.x=sc.nextInt();
		System.out.println("Enter y for point2");
		line2.p2.y=sc.nextInt();
		
		line1.length = line1.getLength();
		System.out.println(line1.length);
		line2.length = line2.getLength();
		System.out.println(line1.length);
		
		UC3_commpareTo com = new UC3_commpareTo();
		String val=com.compareTo(line1, line2);
		System.out.println(val);
	}
}
