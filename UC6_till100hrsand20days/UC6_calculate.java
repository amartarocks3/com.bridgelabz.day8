package UC6_till100hrsand20days;

public class UC6_calculate {
	private int wageperhr=20;
	private int fulldayhr=8;
	private int parttimehr=8;
	public int total,monthtotal,totalworkinghrs,totalworkingdays;
	public int cal() {
	UC6_toCheck a = new UC6_toCheck();
	int val=a.rand();
	if(val==0) {
	total=0;
	}
	else if(val==1) {
	total=Math.abs(val*this.wageperhr*this.fulldayhr);
	}
	else if(val==2) {

	totalworkinghrs=fulldayhr+parttimehr;
	total=Math.abs(wageperhr*totalworkinghrs);
	}
	return total;
	}
	public int month(){
		while(totalworkinghrs<=100 && totalworkingdays<=20) {
			totalworkingdays++;
			int monthcal=this.cal();
			monthtotal+=monthcal;
		}
		return monthtotal;
	}
}
