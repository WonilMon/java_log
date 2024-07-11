package chapter02;

public class Incre_Test01 {

	public static void main(String[] args) {
		
		int a, b;
		
		a = 10;
		b = 20;
		
		System.out.println("++a : " + (++a));
		System.out.println("++a : " + (a++));
		System.out.println("a : " + a);
		
		System.out.println("==============");
		
		System.out.println("++a + b++ : " + (++a + b++));//a=12->13, b=20
		System.out.println("b : " + b);//b=20->21
		
		System.out.println("==============");
		
		System.out.println("++a : " + (++a));
		System.out.println("b++ : " + b++);
		System.out.println("b : " + b);
		System.out.println("++a + b++ : " + (++a + b++));//a=15->16, b=22
		System.out.println("b : " + b);//b=22->23
		
		
		
		
		
		
		

	}

}
