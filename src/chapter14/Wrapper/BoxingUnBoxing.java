package chapter14.Wrapper;

public class BoxingUnBoxing {

	public static void main(String[] args) {
		
		//오토박싱
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf(200);
		
		Integer total = obj1 + obj2;
		System.out.println(total);
		
		//언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		
		int sum = value1 + value2;
		System.out.println(sum);
		
	}
	
}
