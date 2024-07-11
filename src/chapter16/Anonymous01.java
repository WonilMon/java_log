package chapter16;

public class Anonymous01 {  //익명클래스는 상위클래스가 필요
	
	private int outInstanceVal = 1;
	
	public void outMethod(int paramVal) {
		int localVal = 2;
		
		/*
		<원래 인터페이스 재정의할 때>
		class Test implements Printer { 
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}
			
		}
		*/
		
		//print() 라는 메서드밖에 없는 Printer interface 쓸게요
		
		Printer printer = new Printer() { //상위 클래스나 인터페이스를 상속받아 구체화하는 역할만 !
			
			int value = 4;
			
			@Override
			public void print() {
				System.out.println("외부클래스의 멤버변수 : " + outInstanceVal);
				System.out.println("외부클래스의 지역변수 : " + localVal);
				System.out.println("외부클래스의 매개변수 : " + paramVal);
				System.out.println("익명클래스의 멤버변수 : " + value);
			}
		}; //<----하나의 코드 조각임 그냥 (여기서 구체화 한 뒤)
		
		printer.print(); // 재정의된 printer 의 print 를 사용 (지역변수의 일종)
		
	}
	
}

//익명클래스는 선언과 생성을 동시에 구현한 클래스
//생성자 불가
//반드시 상위클래스나 인터페이스가 필요
//장점 : 클래스를 별도로 정의하지 않고도 인터페이스나 추상클래스를 바로 구현이 가능해 코드가 간편


