package chapter10;

public class HumanMain {

	public static void main(String[] args) {
		
		/*//중복되는것을 싫어한다
		Student s = new Student();
		s.action();
		
		Professor p = new Professor();
		p.action();
		*/
		
		Human h = new Human();
		Student s = new Student();
		Professor p = new Professor();
		
		HumanMain test = new HumanMain();
		test.actionTest(h);
		test.actionTest(s);
		test.actionTest(p);
		
	}
	
	public void actionTest(Human here) {
		
		here.action();
		
	}

}
