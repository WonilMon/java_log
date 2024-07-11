package chapter23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStreams03 {

	public static void main(String[] args) {
		
			//지금은 a 에 데이터가 하나씩 있지만 몇백, 몇천줄 되면 무리가 감 -> 버퍼를 이용 
		try (
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a"));
			//BufferedInputStream : 입력 스트림에 버퍼링 기능을 추가해, 여러 바이트를 한 번에 읽어 I/O 성능을 향상
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b"));
			//BufferedOutputStream : 출력 스트림에 버퍼링 기능을 추가해, 여러 바이트를 한 번에 읽어 I/O 성능을 향상
		) // 버퍼를 사용해 매개변수 부르기
		{	
			int c;
			while((c=bis.read())!=-1) {
				System.out.println((char)c + "");	//입력
				bos.write(c);						//출력 (저장)
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
