package UC3_parttime;

	public class toCal {
		private int wageperhr=20;
		private int fulldayhr=8;
		private int parttimehr=8;
		public int total;
		public int cal() {
		Check a = new Check();
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
	}

