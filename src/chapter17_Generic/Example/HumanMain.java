package chapter17_Generic.Example;

public class HumanMain {

	public static void main(String[] args) {
		
		//제네릭을 스튜던트로 정의한 그 순간에 T라는 값은 스튜던트 객체를 담을 수 있는 값으로 바뀜 
		HumanGeneric<Student> student = new HumanGeneric<Student>();
		student.setHuman(new Student("김씨", "20", "1학년"));		 //setHuman(Generic) 에는 값을 넣는 것이 아닌 주소값을 넣어야 함
		student.act();										 //메서드 실행같은 경우, 제네릭에 실행메서드 하나만들어서 ㅇㅇ
		System.out.println(student.getHuman());
		
		System.out.println("--------------------------");
		
		HumanGeneric<Professor> professor = new HumanGeneric<Professor>();
		professor.setHuman(new Professor("이씨", "45", "컴퓨터공학과"));
		professor.act();
		System.out.println(professor.getHuman());
		
		System.out.println("--------------------------------------------");
		
		Student stu = new Student("정씨", "55", "2학년");
		stu.act();
		//System.out.println(stu.get);
		
		
		

	}

}
