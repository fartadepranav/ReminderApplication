package Login;

public class Time {
	int hh;
	int mm;
	
	Time(){
		hh = 0;
		mm = 0;
	}
	
	Time(int h,int m){
		this.hh = h;
		this.mm = m;
	}
	
	String getTime(){
		String hour = String.format("%02d", this.hh);
		String min = String.format("%02d", this.mm);
		
		return hour+":"+min;
	}
	
	public String toString() {
		String hour = String.format("%02d", this.hh);
		String min = String.format("%02d", this.mm);
		
		return "["+hour+":"+min+"]";
	}

}
