package UC2_Calculatedailywage;

public class toCalculate {
	private int wageperhr=20;
	private int fulldayhr=8;

	public int calculate() {
	toCheck a = new toCheck();
	int val=a.rand();
	return Math.abs(val*this.wageperhr*this.fulldayhr);
	}
}
