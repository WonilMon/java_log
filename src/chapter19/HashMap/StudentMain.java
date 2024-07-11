package chapter19.HashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//---------------------------------------------------------------------------------------------

public class StudentMain {

	public static void main(String[] args) {
		
		// 객체를 안에 넣는것 또한 가능
		// 학생을 key, 해당 학생의 점수를 value
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		Scanner scan = new Scanner(System.in);
		
		map.put(new Student(1, "김유신"), 95);
		map.put(new Student(2, "계백"), 96);
		map.put(new Student(3, "을지문덕"), 98);
		map.put(new Student(4, "강감찬"), 85);
		map.put(new Student(5, "이순신"), 98);
		map.put(new Student(5, "이순신"), 97);				// 2 이순신이라 중복값 삭제인데
		
		System.out.println("총 Entry 수 : " + map.size()); 	// 맵에서는 같은 객체인지 모름. 알려줘야 댐
		
		Set<Map.Entry<Student, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<Student, Integer>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Map.Entry<Student, Integer> entry = entryIt.next();
			Student key = entry.getKey(); 					// toString 때문에 key 만 불러와도
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);		// 여기서 toString 이 적용됨
		}
		
		/*  내가 짠 코드 
		boolean pass = false;
		do {
			System.out.println("---------------------");
			System.out.print(" 학생 번호를 입력하세요 : " );
			int sno = Integer.parseInt(scan.nextLine());
			System.out.print(" 학생 이름을 입력하세요 : " );
			String name = scan.nextLine();
			
			Set<Map.Entry<Student, Integer>> entrySet1 = map.entrySet();
			Iterator<Map.Entry<Student, Integer>> entryIt1 = entrySet1.iterator();
			while(entryIt1.hasNext()) {
				Map.Entry<Student, Integer> entry = entryIt1.next();
				Student key = entry.getKey();
				Integer value = entry.getValue();
				if((key.name.equals(name)) && (key.sno==sno)) {
					System.out.println(" " + key.name + "학생의 점수는 : " + value);
					pass = true;
					break;
				}
			}
			if(pass!=true) {
				System.out.println(" 해당 학생의 데이터가 존재하지 않습니다");
			}
		} while(pass = false);
		*/
		
		//-------------------강사님이 짠 코드-------------------
		Student stu;
		while(true) {
			
			System.out.println("---------------------");
			System.out.print("학생 번호를 입력하세요 : " );
			int sno = Integer.parseInt(scan.nextLine());
			System.out.print("학생 이름을 입력하세요 : " );
			String name = scan.nextLine();
			stu = new Student(sno,name);
			
			if(map.containsKey(stu)) {		//객체 자체를 넣으면 그 안의 sno, name 까지 함께 있는 지 본다
				 System.out.println(name + "학생의 점수는 : " + map.get(stu));
				 break;
			}else {
				System.out.println("해당 학생의 데이터가 존재하지 않습니다");
			}
			
		}
		
	}//main

}//class
