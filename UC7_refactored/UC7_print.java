package UC7_refactored;

public class UC7_print {
	public String Print(){

		return "Welcome to employee wage problem";
		}
		public String toPrintCalculated() {
		UC7_calculate c = new UC7_calculate();
		return "The wage for employee per month is " + c.month();
		}
}
