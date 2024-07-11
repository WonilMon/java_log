package chapter08_re;

public class OverLoadMain {

	public static void main(String[] args) {
		
		OverLoad obj1 = new OverLoad();
		obj1.disp();
		System.out.println("----------------");
		
		OverLoad obj2 = new OverLoad(22, 172.7f);
		obj2.disp();
		System.out.println("-----------------");
		
		OverLoad obj3 = new OverLoad(22,172.7f, "이순신");
		obj3.disp();
		
		
	}

}
