package chapter08_re;

public class Car {

	private String color;
	private int cc;
	
	public Car() {}
	
	public Car(String color, int cc) {
		this.color = color;
		this.cc = cc;	
	}
	
	
	
	//--------------------------------------------------
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	//--------------------------------------------------	
	
}
