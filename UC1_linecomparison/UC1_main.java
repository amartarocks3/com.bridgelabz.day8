package UC1_linecomparison;

import java.util.Scanner;

public class UC1_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to line comparison problem");
		UC1_line line1 = new UC1_line();
		
		line1.p1 = new UC1_point();
		line1.p2 = new UC1_point();
		System.out.println("Enter x for point1");
		line1.p1.x=sc.nextInt();
		System.out.println("Enter y for point1");
		line1.p1.y=sc.nextInt();
		System.out.println("Enter x for point2");
		line1.p2.x=sc.nextInt();
		System.out.println("Enter y for point2");
		line1.p2.y=sc.nextInt();
			
		
		line1.length = line1.getLength();
		System.out.println(line1.length);
	}
}
