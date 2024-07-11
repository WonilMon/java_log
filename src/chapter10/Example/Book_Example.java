package chapter10.Example;

public class Book_Example {
	
	String title;
	String author;
	
	public Book_Example (String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void disp () {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
	}
}

//--------------------------------------------------------------------------

class Ebook_Example extends Book_Example {
	
	String period;
	
	public Ebook_Example (String title, String author, String period) {
		
		super(title, author);
		this.period = period;
		
	}
	
	@Override
	public void disp() {
		super.disp();
		System.out.println("기간 : " + period);
	}
	
}