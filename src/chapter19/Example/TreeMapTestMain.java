package chapter19.Example;

public class TreeMapTestMain {

	public static void main(String[] args) {
		
		TreeMapTest tree = new TreeMapTest();			// 메서드를 쓰기 위해 소환, 클래스에서 코딩
		Student s1 = new Student(1000, "여의동");			// 객체에 새로운 주소값을 입력
		Student s2 = new Student(1001, "문성현");
		Student s3 = new Student(1002, "김하경");
		Student s4 = new Student(1003, "한유정");
		Student s5 = new Student(1004, "지은영");
		
		tree.addStudent(s5, 65);						//입력한 주소값으로 Map 에 점수와 함께 기입 (생성자 이용)
		tree.addStudent(s3, 75);
		tree.addStudent(s2, 85);
		tree.addStudent(s1, 95);
		tree.addStudent(s4, 85);
		
		tree.showInfo();
		
		System.out.println("------------------");
		
		tree.removeStudent(1003);
		
		tree.showInfo();

	}

}
