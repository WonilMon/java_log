package chapter21;

interface A3 {
	void print();
}
//----------------------------------------------------------------------------
class B3 {
	void submit() {
		System.out.println("메서드 참조");
	}
}
//----------------------------------------------------------------------------
public class LambdaTest03 {

	public static void main(String[] args) {
		//다른 클래스가 가지고 있는 메서드를 interface 메서드 안으로
		//(submit 이라는 메서드를 print 에 넣기)
		
		B3 b =new B3();
		b.submit();
		
		System.out.println("==========================");
		
		A3 a3 = () -> b.submit();
		a3.print();
		//b 의 submit 메서드가 print 에 재정의가 돼요
		//매개변수와 리턴값이 둘 다 같을 때 !

		A3 a4 = b::submit;
		a4.print();
		//다른 클래스가 가지고 있는 메서드 참조할 때
		//매개변수와 리턴값이 둘 다 같을 때, 이렇게 가능
		
		
	}

}
