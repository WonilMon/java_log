package chapter08_re;

public class ConstTest {
	
	private int aa;
	private int bb;
	
	public ConstTest() {}
	
	
	public ConstTest(int aa, int bb) {
		this.aa = aa;
		this.bb = bb;
	}
	
	public static void main(String[] args) {
		
		ConstTest obj1 = new ConstTest();
		obj1.aa =10;
		obj1.bb =20;
		System.out.println(obj1.aa);
		System.out.println(obj1.bb);
		
		System.out.println("----------------");
		
		ConstTest obj2 = new ConstTest(30,40);
		System.out.println(obj2.aa);
		System.out.println(obj2.bb);
		
	}//main
	

}//class
