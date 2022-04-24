package UC2_linecomparison;

import java.util.Scanner;

public class UC2_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to line comparison problem");
		UC2_line line1 = new UC2_line();
		UC2_line line2 = new UC2_line();
		line1.p1 = new UC2_point();
		line1.p2 = new UC2_point();
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
		line2.p1 = new UC2_point();
		line2.p2 = new UC2_point();
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
		if(line1.length == line2.length) {
			System.out.println("The lines are equal");
		}
		else {
			System.out.println("The lines are not equal");
		}
	}
}
