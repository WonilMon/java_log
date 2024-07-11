package chapter23;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable{
	//객체에 객체를 담아서 보낼거기 때문에 이것도 진열화가 필요하다
	
	private static final long serialVersionUTD = 1L; 
	
	private List<Book> books = new ArrayList<Book>();
	
	public void add(Book book) {
		books.add(book);
	}
	
	public void print () {
		System.out.println(books);
	}
	
	//arrayList 를 가져올 수 있는 get 메서드 하나
	public List<Book> getBooks() {
		return books;
	}
	
}
