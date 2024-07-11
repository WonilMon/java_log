package chapter23;import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreams {

	public static void main(String[] args) {
		
		try (DataOutputStream out = new DataOutputStream
									(new BufferedOutputStream
									(new FileOutputStream("c"))))
		//DataOutputStream : 기본 자료형 데이터를 바이트 스트림으로 쓰는 클래스
		{
		
			Book book = new Book("자바의 정석", 30000, 1.2);
			out.writeUTF(book.getTitle());
			out.writeInt(book.getPrice());
			out.writeDouble(book.getDiscount());
			//타입에 맞게 객체를 저장헤서 '데이터 쓰기' (UTF, Int, Double)
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//데이터를 저장했고,
		//==========================================================
		//데이터를 가져올게요
		
		try (
			DataInputStream in = new DataInputStream
								(new BufferedInputStream
								(new FileInputStream("c")))	
			)
		{
			//순서 지켜서 가져와야 함
			String title = in.readUTF();
			int price = in.readInt();
			double discount = in.readDouble();
			
			Book book = new Book(title, price, discount);
			System.out.println(book);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
