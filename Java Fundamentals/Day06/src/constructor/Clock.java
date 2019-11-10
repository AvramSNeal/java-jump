package constructor;

public class Clock {
	private int hour;
	private int minute;
	private int second;
	
	public Clock() {
		this.setHour(0);
		this.setMinute(0);
		this.setSecond(0);
	}
	
	public Clock(int h) {
		this.setHour(h);
		this.setMinute(0);
		this.setSecond(0);
	}
	
	public Clock(int h, int m) {
		this.setHour(h);
		this.setMinute(m);
		this.setSecond(0);
	}
	
	public Clock(int h, int m, int s) {
		this.setHour(h);
		this.setMinute(m);
		this.setSecond(s);
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	
	public String toString() {
		return "Hr: " + hour + " Min: " + minute + " Sec: " + second;
	}
	
}
