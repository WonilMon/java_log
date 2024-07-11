package chapter10;

public class FruitMain {

	public static void main(String[] args) {
		FruitStrawBerry st = new FruitStrawBerry();
		
		st.disp();
		
		System.out.println("---------------");
		
		/*
		StrawBerry s = new StrawBerry();
		b.set2("빨강", 7000);
		 */
		
		st.set2("빨강", 7000);
		st.disp();

	}

}
