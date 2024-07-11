package chapter07;

public class AccessTest01 {

	//필드
	private int aa;
	private int bb;
	public int cc;
	
	public void disp() {
		System.out.println("aa값 : " + aa + " | bb값 : " + bb + " | cc값 : " + cc);
	}
	
	public static void main(String[] args) {
		
		AccessTest01 obj = new AccessTest01();
		obj.disp();
		System.out.println("---------------------");
		obj.aa = 10;
		obj.bb = 20;
		obj.cc = 30;
		obj.disp();
	}//main

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

	public int getBb() {
		return bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	
	
}//class
