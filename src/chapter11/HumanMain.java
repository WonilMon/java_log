package chapter11;

public class HumanMain {

	public static void main(String[] args) {
		
		Human h = null; //주소를 담을 수 있는 변수 하나만 선언할게요
		int i = 2;
		
		if (i==1) {
			h = new Student(); 
		}else if (i==2) {
			h = new Professor();
		}else if (i==3) {
			h = new SalesMan();
		}
		// 학생/교수/사원 모두 Human의 자식이죠
		// 자식이 가지고 있는 메서드는 쓸수 없지만 재정의된 것은 쓸 수 있다
		
		//학생 = new 학생
		//교수 = new 교수
		//사원 = new 사원
		//이렇게 하는게 바로 메서드 쓸 수 있긴하지만, 코드가 길어짐
		//업캐스팅을 하면 상황에 따라 간단하게 쓸 수 있음
		
		h.action();
	}

}
