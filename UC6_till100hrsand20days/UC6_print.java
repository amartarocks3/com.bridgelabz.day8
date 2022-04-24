package UC6_till100hrsand20days;

public class UC6_print {
	public String Print(){

		return "Welcome to employee wage problem";
		}
		public String toPrintCalculated() {
		UC6_calculate c = new UC6_calculate();
		return "The wage for employee per month is " + c.month();
		}
}
