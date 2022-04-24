package UC5_wageformonth;


public class UC5_calculate {
	private int wageperhr=20;
	private int fulldayhr=8;
	private int parttimehr=8;
	public int total,monthtotal;
	
	public int cal() {
	UC5_toCheck a = new UC5_toCheck();
	int val=a.rand();
	if(val==0) {
	total=0;
	}
	else if(val==1) {
	total=Math.abs(val*this.wageperhr*this.fulldayhr);
	}
	else if(val==2) {

	int totalworkinghrs=fulldayhr+parttimehr;
	total=Math.abs(wageperhr*totalworkinghrs);
	}
	return total;
	}
	public int month(){
		for(int i=0;i<20;i++) {
			int monthcal=this.cal();
			monthtotal+=monthcal;
		}
		return monthtotal;
	}
}
