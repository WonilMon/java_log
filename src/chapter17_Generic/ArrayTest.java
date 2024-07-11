package chapter17_Generic;

class Array{
	
	//1. 배열 받을때, 상위클래스인 오브젝트로 해놓고 메서드도 하나
	private Object[] array = new Object [10];
	int count;
	
	//2. Object 로 받았다는 건 어떠한 객체든 들어갈 수 있다는 것
	//4. 하나씩 배열에 담기겠죠
	public void add(Object obj) {
		array[count++] = obj;
	}
	
	public Object get(int index) {
		return array[index];
	}
	
}

//================================================

public class ArrayTest {

	public static void main(String[] args) {
		
		//여러타입의 객체를 담을때, object 로 
		
		String s1 = new String ("test");
		int i1 = Integer.valueOf(100);
		
		Array arr = new Array();
		arr.add(s1);
		arr.add(i1);
		
		//3. Object 는 모든 것의 부모이기 때문의 이 객체들이 들어오죠
		
		//5. 배열방에서 하나하나씩 꺼내서 메인에 담아놓을겁니다 
		//String s2 = arr.get(0); 
		//제대로 됐다면 0번방엔 s1, 1번방엔 i1이겠죠 (근데오류)
		//스트링을 했으니, 꺼내올 때는 다운캐스팅해야 함
		String s2 = (String)arr.get(0);
		Integer i2 = (Integer)arr.get(1);
		System.out.println(s2 + " | " + i2);
		
		//Q. 무조건 object 매개변수 저장해서 받아야하냐?.. 
		//index 를 이용해서 꺼내오고, 다운캐스팅 일일히 다 해줘야 함 (ㅈㄴ 귀찮고, 과부하가 심함)
		
	}

}
