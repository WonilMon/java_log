package chapter23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterStreams01 {
	public static void main(String[] args) {
		
		//FileInput 은 한글넣으면 다 깨짐
		//2바이트이상의 단위를 처리를 하는
		try (
			FileReader fr = new FileReader("a");//파일에서 문자를 읽는 클래스
			FileWriter fw = new FileWriter("b"))//파일에서 문자를 쓰는 클래스
			
		{
			int c;
			while((c = fr.read())!=-1) {
				System.out.println((char)c + " ");
				fw.write(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//------------------------------------버퍼이용------------------------------------
		try (
				BufferedReader br = new BufferedReader(new FileReader("a"));
				//문자 입력 스트링에 버퍼링 기능을 추가해 성능을 향상
				BufferedWriter bw = new BufferedWriter(new FileWriter("b"));
				//문자 출력 스트링에 버퍼링 기능을 추가해 성능을 향상
			)
			{
				int c;
				while((c = br.read())!=-1) {
					System.out.println((char)c + " ");
					bw.write(c);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		
	}
}
