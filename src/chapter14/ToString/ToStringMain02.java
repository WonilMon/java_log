package chapter14.ToString;

public class ToStringMain02 {

	public static void main(String[] args) {
		
		System.out.println("1. toString 호출");
		
		Cat02 cat = new Cat02("노숲"); //Cat 같은 경우 재정의를 안했죠
		System.out.println(cat.toString()); //따라서 정보값만 나옴
		
		System.out.println("----------------------------------");
		
		Dog02 dog1 = new Dog02("진돗개", 2);		
		Dog02 dog2 = new Dog02("풍산개", 4);
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());

		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		System.out.println("2. 참조변수");
		
		System.out.println(cat);
		System.out.println(dog1);
		System.out.println(dog2);
		
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		System.out.println("3. 다형성 활용");
		
		ObjectPrint.print(cat);
		ObjectPrint.print(dog1);
		ObjectPrint.print(dog2);
		
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		
		//주소값 반환,, 몰라도됨 
		String refVal = Integer.toHexString(System.identityHashCode(dog1));
		System.out.println("참조값 : " + refVal);
		
	}

}
