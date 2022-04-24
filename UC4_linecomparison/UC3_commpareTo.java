package UC4_linecomparison;

import java.util.Scanner;

public class UC3_commpareTo {
	public String compareTo(UC3_line line1,UC3_line line2){
		
		if(line1.getLength()>line2.getLength()) {
			return "Line 1 is greater than line2";
		}
		else if(line1.getLength()<line2.getLength()){
			return "Line 1 is less than line2";
		}
		else {
			return "Both lines are equal";
		}
	}
}
