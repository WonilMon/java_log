package chapter07;

public class MyDateMain {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		date.setYear(2024);
		date.setMonth(4);
		date.setDay(22);
		
		System.out.print(date.getYear() + "년 ");
		System.out.print(date.getMonth() + "월 ");
		System.out.print(date.getDay() + "일");
		
	}

}
