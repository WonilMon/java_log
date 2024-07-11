package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("ab.txt");
			// Stream 은 자원낭비가 심해서 사용 후 닫아줘야함
			// 근데 오류가 나는 순간 바로 catch 로 들어가서 바로 닫아줄 수가 없긴 함
			// fis.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			//지역변수니까 try 에서 값을 넣었다고 해도 finally 에서는 인식을 못함
			//그래서 finally 안에다가 또 try catch 써야 함
			try {		// try - try 는 연속적으로 작용하기 때문에 이 안에 넣어줘야함 
				fis.close();
			} catch (IOException e2) {
				System.out.println(e2.getMessage());
				e2.printStackTrace();
			} 
			System.out.println("finally");
		}

	}

}
