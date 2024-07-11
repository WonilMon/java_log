package chapter23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams02 {

		public static void main(String[] args) {
			
			// 이렇게 한번에 처리하면 알아서 열고 닫음
			try (FileInputStream fis = new FileInputStream("a");
				FileOutputStream fos = new FileOutputStream("b")) {

				int c;
				while((c = fis.read())!=-1) {
					System.out.print((char)c + " ");
					fos.write(c);
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

}
