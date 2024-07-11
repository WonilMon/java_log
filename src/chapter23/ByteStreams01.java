package chapter23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams01 {
	
	//스트림 : 데이터의 읽기, 쓰기를 효율적으로 수행하기 위한 매커니즘 제공
	public static void main(String[] args) {
		
		
		FileInputStream fis = null;
		//파일에서 데이터를 바이트 단위로 읽는 클래스
		//외부 파일을 그냥 끌고올 순 없고, 이런식으로 byte 로 변환해서 가져와야함
		
		//예외처리 필수
		try {
			fis = new FileInputStream("a");	// a 파일
			int c;
			while((c = fis.read())!=-1) {
				System.out.print((char)c + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {  							//try 안에서만 정의가 가능, 따라서 finally 안에 try  를 넣어버리기
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		//--------------------------------------------------------------------------------------------
		//자바에 있는 것들을 외부로 출력
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("a");	// a 파일
			int c;
			while((c = fis.read())!=-1) {
				System.out.print((char)c + " ");
				fos.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {  							//try 안에서만 정의가 가능, 따라서 finally 안에 try  를 넣어버리기
				fis.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
