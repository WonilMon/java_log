package chapter14;

public class ParentMain_Object {

	public static void main(String[] args) {
		
		Child child  = new Child();
		child.childMethod();
		child.parentMethod();
		
		String str = child.toString(); 
		System.out.println(str);
		
		//.toString() : 객체를 문자열로 처리
		//.equals() : 객체가 서로 같은지
		//.getClass() : 클래스 정보를 반환
	}

}
