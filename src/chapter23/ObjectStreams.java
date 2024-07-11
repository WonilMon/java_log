package chapter23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreams {

	public static void main(String[] args) {
		
		try (
			ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("d")));
			//ObjectOutputStream : 객체를 직렬화하여 출력 스트림에 쓰는 클래스
			)	
		{
			
			Book b1 = new Book("자바의 정석", 30000, 1.5);
			Book b2 = new Book("오라클의 정석", 25000, 1.4);
			
			Cart cart = new Cart();
			cart.add(b1);
			cart.add(b2);
			
			//Cart 객체를 외부로 저장 (writeObject)
			out.writeObject(cart);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//==========================================================================================================
		
		try (
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("d")))	
				
			)
		{
			/*	
			String title = in.readUTF();
			int price = in.readInt();
			double discount = in.readDouble();
			오브젝트니까 오브젝트로 불러오면 돼 */
			
			Cart cart = (Cart)in.readObject();
			System.out.println(cart.getBooks());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
