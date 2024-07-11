package chapter20;

public class MultipleCatch {

	public static void main(String[] args) {
		
		int arr [] = new int[5];
		
		try {
			
			int result = arr[1]/arr[0];						// 수 계산의 오류
			
			for(int i=0; i<=5; i++) {						// 배열의 오류
				arr[i] = i;
				System.out.println(arr[i]);			
			}
			
		} catch (ArithmeticException e) {					// 오류 발생 시 바로 넘어가기 때문에
															// catch 를 두개 잡아서 각각 처리
			System.out.println(e.getMessage());	
			System.out.println("0으로 나눌 수 없습니다");
			
		} catch (IndexOutOfBoundsException e) {			
			
			System.out.println(e.getMessage());
			System.out.println("배열의 크기를 초과했습니다");

		} 
			
	
	}

}
