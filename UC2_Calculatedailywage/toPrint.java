package UC2_Calculatedailywage;

public class toPrint {
	public String Print(){

		return "Welcome to employee wage problem";
		}
		public String toPrintCalculated() {
		toCalculate c = new toCalculate();
		return "The wage for employee is " + c.calculate();
		}
}
