package chapter23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;

	//객체를 보낼 땐 작업이 좀 필요함 
public class Book implements Serializable{
	//seriaLizable : 객체직렬화, 1열로 된 문자열로 만들어줌
	
	private static final long serialVersionUTD = 1L;
	//serialVersionUTD : 클래스의 버전을 식별하기 위한 고유 ID, 직렬화된 객체의 호환성을 확인하기 위해 사용
	private String title;
	private int price;
	private double discount;
	
	public Book(String title,  int price, double discount) {
		this.title = title;
		this.price = price;
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", discount=" + discount + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	

	
}
