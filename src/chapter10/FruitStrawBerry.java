package chapter10;

public class FruitStrawBerry extends FruitBerry{

	private String color;
	private int price;
	
	public void set2(String a, int b) {
		color = a;
		price = b;
		super.set1("딸기", "중");
	}
	
	@Override
	public void disp() {
		super.disp();
		System.out.println("색상 : " + color + " | 가격 : " + price);
	}
	
	
}
