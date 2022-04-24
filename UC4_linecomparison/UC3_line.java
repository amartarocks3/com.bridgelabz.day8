package UC4_linecomparison;

public class UC3_line {
	UC3_point p1;
	UC3_point p2;
	float length;
	
	public float getLength() {
	
		return (float)Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
	
	}
}
