package chapter08_re;

public class OverLoad {

	private String name;
	private int age;
	private float h;
	
	public OverLoad() {}
	
	//매개변수와 멤버변수의 이름이 같을 경우만 'this'사용
	public OverLoad(int a, float b, String c) {
		age = a;
		h = b;
		name = c;
	}
	public OverLoad(int age, float h) {
		this.age = age;
		this.h = h;
	}
	
	public void disp(){
		
			System.out.println("이름 : " + (name == null ? "익명":name));
			System.out.println("나이 : " + age);
			System.out.println("키 : " + h);
		
		}
	}

