package chapter17_Generic;

public class GenericMaterialMain {

	public static void main(String[] args) {
		
		//2. 이런 식으로 가져왔잖아요?
		ObjectTest obj1 = new ObjectTest();
		Powder p1 = new Powder();
		obj1.setM(p1);
		System.out.println(obj1.getM());
		
		ObjectTest obj2 = new ObjectTest();
		Plastic p2 = new Plastic();
		obj2.setM(p2);
		System.out.println(obj2.getM());
		//3. 부모클래스 안에 자식을 넣어두고, 자식이 가진 재정의 메서드를 쓰는 방식 (원래)
		//4. 제네릭으로도 가능합니다. GenericTest03 ㄱㄱ
	}

}
