package UC5_wageformonth;


public class UC5_print {
	public String Print(){

		return "Welcome to employee wage problem";
		}
		public String toPrintCalculated() {
		UC5_calculate c = new UC5_calculate();
		return "The wage for employee per month is " + c.month();
		}
}
