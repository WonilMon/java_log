package chapter04.Example;

public class Example02 {

	public static void main(String[] args) {
		
		//array 배열의 값 중 가장 큰 값을 출력하시오
		
		int array [] = {1,6,9,2,35,167,234,4,5,11};
		int max = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			if (max < array[i]) {
				max = array[i];
			}
			
		}
		
		System.out.println("가장 큰 수 : " + max);

	}

}
