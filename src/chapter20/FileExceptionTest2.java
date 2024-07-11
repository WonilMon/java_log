package chapter20;

import java.io.IOException;

public class FileExceptionTest2 {

	public static void main(String[] args) throws IOException {
		
		FileRead fr = new FileRead();
		//fr.read();
		
		// 2. 오류를 받으면 내가 처리하던가, 나도 던지던가 (폭탄 던지기)
		// try catch 로 잡는거보다 오류 던지고 방치하는게 일반적이긴 함 ㅇㅇ
		// 모든 코드의 오류를 잡는 건 '불가능', 예상되는거 몇개만 잡고 던지기
		
		
		try {
			fr.read();
		} catch (IOException e) {
			System.out.println(e.getMessage());			
			e.printStackTrace(); 						//추적 메서드
		} 
		

	}

}
