package chapter14.Wrapper;

public class IntegerTest {
	
	public static void main(String[] args) {
		
		//기본 타입의 값들을 객체화시키는 것
		/*
		byte    =>   Byte
		short   =>   Short
		int     =>   Integer
		long    =>   Long
		
		float   =>   Float
		double  =>   Double
		
		char    =>   Character
		
		boolean =>   Boolean
		*/
		
		//Integer 라는 클래스 선언 후 정수형 데이터 담기 (100 이라는 데이터는 num 에 담겨서 객체화)
		Integer num = 100; //오토박싱 : 일반자료 => 클래스로 선언
		int iNum = num.intValue(); //언박싱 : 클래스 => 일반자료
		
		//오토언박싱
		int total = num + iNum; // 클래스 + 일반자료 = 원래는 안되지만 wrapper 한 것은 가능
		System.out.println(total);
		
		//오토박싱 (객체로 선언하고 그냥 변수값 넣으셈 그게 편함)
		Integer i = iNum; //그냥 혼용해서 쓸 수도 있음 ㅇㅇ
		System.out.println(i);
	}
	
}
