package Login;

public class Reminder {
	
	int reminderID;
	String type;
	Time time;
	boolean alertType;
	
	Reminder()
	{
		this.reminderID = 0;
		this.type = "Other";
		this.time = new Time(0,0);
		this.alertType = false;
	}
	
	Reminder(int id,String type,Time t,boolean atype)
	{
		this.reminderID = id;
		this.type = type;
		this.time = t;
		this.alertType = atype;
	}
	
	public String toString() {
		return this.reminderID+":"+this.type+":"+this.time+":"+this.alertType+"\n";
	}
	
	
	
}
