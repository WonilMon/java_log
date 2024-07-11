package chapter20;

public class ArrayExceptionTest {
	
	public static void main(String[] args) {
		
		int arr []= new int [5];						// 5개의 방
		
		/*
		for (int i=0; i<=5; i++) {						// 5개의 방에 6번 돌리기 -> 오류
			arr[i] = i;
			System.out.println(arr[i]);
		}
		*/
		
		// ArrayIndexOutOfBoundsException: 정해진 배열의 크기보다 크거나 음수 index 에 대한 요청
		
		// 그럼 어떻게 처리해야 할까요
		
		try {											// 예외가 발생할 수 있는 코드
			for (int i=0; i<=5; i++) {		
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) { 	// catch 오류를 잡다 ( 오류를 괄호 안으로 )
														// 매개변수로 예외에 대한 정보를 담고 있는 객체 전달
			System.out.println(e.getMessage());			// 오류를 메시지로 
			System.out.println("배열의 크기를 초과했습니다");	// 원하는대로 설정할수도 ㅇㅇ
			
		} finally {										// try 에서 오류가 없으면 바로 finally 로 감
			System.out.println("Finally");				// 예외가 발생하든, 안하든 수행되는 코드
		}
		
	}
	
}


