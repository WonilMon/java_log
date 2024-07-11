package chapter14.HashCode;

public class HashCodeMain {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("누렁이","진돗개");
		Dog dog2 = new Dog("흰둥이","풍산개");
		Dog dog3 = new Dog("흰둥이","풍산개");
		Dog dog4 = dog3;
		
		System.out.println(dog1.hashCode());
		System.out.println(dog2.hashCode());
		System.out.println(dog3.hashCode());
		
		System.out.println(dog2.equals(dog3));
		System.out.println("수정된 해시코드 : " + (dog2.hashCode()==dog3.hashCode()));
		
		//진짜 주소를 바꾸는게 아니라 위장된 주소값을 쓰는 것
		
		System.out.println("실질적 해시코드 : " + (dog2 == dog3));
		System.out.println("실질적 해시코드 : " + (dog3 == dog4));

	}

}
