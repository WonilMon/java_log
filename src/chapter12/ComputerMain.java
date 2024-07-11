package chapter12;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer c1 = new DeskTop();
		c1.display();
		c1.typing();
		
		System.out.println("------------------------");
		//Computer = c2 = new Computer(); //추상클래스는 객체로 만들 수 없음
		//NoteBook = c2 = new NoteBook(); //추상클래스는 객체로 만들 수 없음
		
		Computer c2 = new MyNoteBook(); // 추상클래스의 메서드를 전부 정의한 자식클래스만이 객체가능
		c2.display(); //자식 클래스(abstract)
		c2.typing(); //자식의 자식클래스
		
	}
	
}
