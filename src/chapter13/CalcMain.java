package chapter13;

public class CalcMain {
	
	public static void main(String[] args) {
		
	
		int num1 = 10;
		int num2 = 5;
		
		Calc calc1 = new CompleteCalc02(); //01은 받을 수 없기때문에 02로 받음 (업캐스팅)
		
		System.out.println("---Interface method 호출---");
		//calc1.showInfo(); //자식만 가지고있는거죠
		System.out.println("num1 + num2 : " + calc1.add(num1, num2));
		System.out.println("num1 - num2 : " + calc1.substract(num1, num2));
		System.out.println("num1 * num2 : " + calc1.times(num1, num2));
		System.out.println("num1 / num2 : " + calc1.divide(num1, num2));
		calc1.description();
		//calc1.myMethod();
		//calc1.myStaticMethod(); (얘네 안되니까 default 넣어서)
		
		//-------------------------------------------------------------------------
		
		System.out.println("---Child method 호출---");
		CompleteCalc02 calc2 = new CompleteCalc02();
		calc2.showInfo(); //자식만 가지고있는거죠
		System.out.println("num1 + num2 : " + calc2.add(num1, num2));
		System.out.println("num1 - num2 : " + calc2.substract(num1, num2));
		System.out.println("num1 * num2 : " + calc2.times(num1, num2));
		System.out.println("num1 / num2 : " + calc2.divide(num1, num2));
		
	
	}
	
}
