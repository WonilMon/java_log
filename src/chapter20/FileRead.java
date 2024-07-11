package chapter20;

import java.awt.BufferCapabilities;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	void read () throws IOException {		

		// 외부에있는 파일을 가져오는 메서드
		// 외부파일은 반드시 예외처리를 해줘야함 ! 그래서 그냥 짜면 오류 어떻게 처리할거냐고 물음
		// 1. 오류가 발생할 수 있으니.. 던지겠다 ! main 으로	
		
		BufferedReader butteredReader = new BufferedReader(new FileReader("ab.txt"));
		String text;
		while ((text = butteredReader.readLine())!=null) {
			System.out.println(text);
		}
		butteredReader.close();
	}
	
}