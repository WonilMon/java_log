package chapter18.Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public abstract class Person {
	
	private String name;
	private int age;
	private String tel;
	
	public abstract void showInfo();
	
	//--------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	//--------------------------------
}

//================================================================================================

class Student extends Person {
	
	private String grade;
	
	@Override
	public void showInfo() {
		System.out.println("이름 : " + getName());	
		System.out.println("학년 : " + grade);	
		System.out.println("나이 : " + getAge());	
		System.out.println("번호 : " + getTel());	
		System.out.println("====================");
	}
	
	//--------------------------------
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	//--------------------------------
}

//================================================================================================

class Professor extends Person {
	
	private String subject;
	
	@Override
	public void showInfo() {
		System.out.println("이름 : " + getName());	
		System.out.println("담당과목 : " + subject);	
		System.out.println("나이 : " + getAge());	
		System.out.println("번호 : " + getTel());	
		System.out.println("====================");
	}
	
	//--------------------------------
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	//--------------------------------
}

//================================================================================================

class ArrayListTest {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Person> personList = new ArrayList<Person>();
	Professor pro;
	Student stu;
	
	public void run () {
		
		while(true) {
			
			System.out.println("===========");
			System.out.println("1. 회원추가 ");
			System.out.println("2. 회원탈퇴 ");
			System.out.println("3. 회원정보 ");
			System.out.println("4. 종   료 ");
			System.out.println("===========");
			System.out.print("항목 선택 : ");
			int choice = Integer.parseInt(scan.nextLine());
			
			if(choice==1) {
				System.out.println("===정보등록===");
				System.out.println("학생은 1번, 교수는 2번을 누르세요");
				int num = Integer.parseInt(scan.nextLine());
				if(num==1) {
					stu = new Student();
					Person pTrans = Trans(num);
					System.out.print("학년 : ");
					String grade = scan.nextLine();

					stu.setGrade(grade);
					personList.add(stu);
					
				}else if(num==2) {
					pro = new Professor();
					Person pTrans = Trans(num);
					System.out.print("담당과목 : ");
					String subject = scan.nextLine();
				
					pro.setSubject(subject);
					personList.add(pro);
				
				}
				
			}else if(choice==2) {
				remove();
			}else if(choice==3) {
				System.out.println("===정보조회===");
				
				Iterator<Person> ps = personList.iterator();
				while(ps.hasNext()) {
					Person p = ps.next();
					p.showInfo();
				}
				
			}else if(choice==4) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("1~4까지의 숫자만 선택해주세요");
			}
			
		}//while
		
	}//run
	
	public boolean remove () {
		System.out.println("===정보수정===");
		System.out.print("삭제할 이름 : ");
		String name = scan.nextLine();
		int count = 0;
			
		Iterator<Person> ps = personList.iterator();
		while(ps.hasNext()) {
			Person p = ps.next();
			if(p.getName().equals(name)) {
				personList.remove(p);
				return true;
			}
		}
		return false;
	}
	
	public Person Trans (int num) {
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("나이 : ");
		int age = Integer.parseInt(scan.nextLine());
		System.out.print("번호 : ");
		String tel = scan.nextLine();					
		
		if(num==1) {
			stu.setName(name);;
			stu.setAge(age);
			stu.setTel(tel);
			return stu;
		}else if(num==2) {
			pro.setName(name);;
			pro.setAge(age);
			pro.setTel(tel);
			return pro;
		}
		return null;
	}
	
}



















