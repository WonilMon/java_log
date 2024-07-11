package chapter01;

public class LongVariable {

	public static void main(String[] args) {
		
		//int num1 = 12345678900;
		long num1 = 12345678900L;
		long num2 = 1000;
		
		int level;
		level = 1000;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2); //형 변환이 되어 long으로
		System.out.println(level);
	}

}
