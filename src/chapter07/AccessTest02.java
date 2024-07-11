package chapter07;

public class AccessTest02 {

	public static void main(String[] args) {
		
		AccessTest01 at = new AccessTest01();
		//at.aa = 11;
		at.setAa(11);
		
		//at.bb = 22;
		at.setBb(22);
		
		at.cc = 33;
		
		at.disp();
		
	}

}
