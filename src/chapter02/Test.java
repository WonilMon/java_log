package chapter02;

public class Test {

	public static void main(String[] args) {
		
		//Q1 바이트 크기가 작은 자료형을 더 큰 자료형으로 대입하는 자동 형 변환 코드 2가지 구현
		System.out.println("Q1");
		
		byte bNum = 1;
		int iNum = bNum;
		
		System.out.println("bVal + iVal = " + (bNum + iNum));
		
		int a = 111111111;
		long b = 11000000000L;
		
		System.out.println("a + b = " + (a + b));
		
		System.out.println("==============");
		
		/*Q2 실수를 정수형 변수에 대입하는 경우, 
		형 변환이 자동으로 수행되고 소수점 이하 부분이 소실되는 형 변환 코드 2가지 구현*/
		System.out.println("Q2");
		
		float c = 0.5f;
		double d = 10.5;
		
		int e = (int)(c + d);
		int f = (int)(c) + (int)(d);
		
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		System.out.println("==============");
		
		//Q3 변수 2개를 선언해 각각 10과 2.5를 대입하고 두 변수의 사칙 연산 결과를 정수로만 출력
		System.out.println("Q3");
		
		int aa = 10;
		double bb = 2.5;
		
		System.out.println("aa + bb = " + (aa + (int)bb));
		System.out.println("aa - bb = " + (aa - (int)bb));
		System.out.println("aa * bb = " + (aa * (int)bb));
		System.out.println("aa / bb = " + (aa / (int)bb));
		
		System.out.println("--------------");
		
		int bb2 = (int)bb;
		
		System.out.println("aa + bb = " + (aa + bb2));
		System.out.println("aa - bb = " + (aa - bb2));
		System.out.println("aa * bb = " + (aa * bb2));
		System.out.println("aa / bb = " + (aa / bb2));
		
		System.out.println("==============");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
