package chapter22.Example;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public class StreamTest {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> arrayStd = new ArrayList<Student>();
	
	public void run() {
		while(true) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.학생등록 | 2.검색 | 3.학생목록 | 4.학생삭제 | 5.통계 | 6.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택 >> ");
			int select = Integer.parseInt(scan.nextLine());
			
			if(select==1) {
				System.out.println("이름 : ");
				String name = scan.nextLine();
				System.out.println("학과 : ");
				String department = scan.nextLine();
				System.out.println("학년 : ");
				int grade = Integer.parseInt(scan.nextLine());
				System.out.println("나이 : ");
				int age = Integer.parseInt(scan.nextLine());
				
				arrayStd.add(new Student(name, department, grade, age));

			}else if(select==2) {
				System.out.print("1 - 이름검색 | 2 - 학과검색 >> ");
				int searchSelect = Integer.parseInt(scan.nextLine());
				
				if(searchSelect==1) {
					System.out.print("검색할 학생의 이름 : ");
					String searchName = scan.nextLine();
					arrayStd.stream().filter(student->student.getName().equals(searchName)).forEach(student->System.out.println(student));
					
				}else if(searchSelect==2) {
					System.out.print("검색할 학과명 : ");
					String searchDepartment = scan.nextLine();
					arrayStd.stream().filter(student->student.getDepartment().equals(searchDepartment)).forEach(student->System.out.println(student));
					
				}else {
					System.out.println("잘못 입력하셨습니다");
				}
				
			}else if(select==3) {
				System.out.println("등록된 학생 수 : " + arrayStd.size());
				arrayStd.stream().forEach(student->System.out.println(student));
				
			}else if(select==4) {
				System.out.print("삭제할 학생의 학번을 입력하세요 : ");
				int searchStdNum = Integer.parseInt(scan.nextLine());
				
				for(int i=0; i<arrayStd.size();i++) {
					if(searchStdNum == arrayStd.get(i).getNum()) {
						arrayStd.remove(i);
					}
				}
				
			}else if(select==5) {
				System.out.println("1.학과별 나이평균 | 2.학년별 나이평균 | 3.전체 나이평균");
				System.out.print("선택 >> ");
				int searchAverage = Integer.parseInt(scan.nextLine());
				if(searchAverage==1) {
					System.out.print("검색할 학과 : ");
					String departments = scan.nextLine();
					OptionalDouble optDepartment = 
							arrayStd.stream().filter(student->student.getDepartment().equals(departments))
											.mapToInt(member->member.getAge()).average();
					optDepartment.ifPresentOrElse(age->System.out.println(age)
													,()->System.out.println("회원이 존재하지 않습니다"));
				}else if(searchAverage==2) {
					System.out.print("검색할 학년 : ");
					int grades = Integer.parseInt(scan.nextLine());
					OptionalDouble optStdNum = 
							arrayStd.stream().filter(student->student.getGrade()==(grades))
											.mapToInt(member->member.getAge()).average();
					optStdNum.ifPresentOrElse(age->System.out.println(age)
													,()->System.out.println("회원이 존재하지 않습니다"));
				}else if(searchAverage==3) {
					
					OptionalDouble optDepartment = 
							arrayStd.stream().mapToInt(member->member.getAge()).average();
					optDepartment.ifPresentOrElse(age->System.out.println(age)
													,()->System.out.println("회원이 존재하지 않습니다"));
				}
				
			}else if(select==6) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("1~6까지의 번호만 선택해주세요");
			}
		}
	}
	
}
