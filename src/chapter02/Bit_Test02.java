package chapter02;

public class Bit_Test02 {

	public static void main(String[] args) {
		int num = 0B000000101;
		System.out.println(num);
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		
		System.out.println("-------------");
		
		int a, b, c;
		a = 5;
		b = 2;
		c = a >> b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		c = a << b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
		
		
		
	}

}
