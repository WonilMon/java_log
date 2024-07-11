package chapter18.ArrayList;

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
	ArrayList<Person> pList = new ArrayList<Person>();
	Person person;
	Professor pro;
	Student stu;
	
	public void run() {
		while(true) {
		
			System.out.println("===========");
			System.out.println("1. 회원추가 ");
			System.out.println("2. 회원탈퇴 ");
			System.out.println("3. 회원정보 ");
			System.out.println("4. 종   료 ");
			System.out.println("===========");
			System.out.print("항목 선택 : ");
			int select = Integer.parseInt(scan.nextLine());
			
			switch (select) {
			case 1:{
				System.out.println("학생은 1번, 교수는 2번을 누르세요");
				select = Integer.parseInt(scan.nextLine());
				addPerson(select);
				break;
			}
			case 2:{
				System.out.println("-----정보삭제-----");
				System.out.print("삭제할 이름 : " );
				String deleteName = scan.nextLine();
				removePerson(deleteName);
				break;
			}
			case 3:{
				System.out.println("-----정보확인-----");
				System.out.println("현재 등록인원 : " + pList.size() + "명");
				
				for(Person p : pList) {
					p.showInfo();
				}
				break;
			}
			case 4:{
				System.out.println("-----종   료-----");
				return;
			}
			default:
				break;
			}
		}
	}//run
	
	private void addPerson(int select) {
		
		if(select==1) {
			person = new Student();
			selectPerson(person, select);
			pList.add(person);
		}else if(select==2) {
			person = new Professor();
			selectPerson(person, select);
			pList.add(person);
		}
		
	}//adddPerson
	
	private void selectPerson(Person person, int select) {
		System.out.println("-----정보 추가-----");
		System.out.print("이름 : " );
		person.setName(scan.nextLine());
		System.out.print("나이 : " );
		person.setAge(Integer.parseInt(scan.nextLine()));
		System.out.print("전화 : " );
		person.setTel(scan.nextLine());
		
		if(select==1) {
			System.out.print("학년 : " );
			((Student)person).setGrade(scan.nextLine()); //다운캐스팅으로 자식이 가진 set 메서드
		}else if(select==2) {
			System.out.print("담당과목 : " );
			((Professor)person).setSubject(scan.nextLine()); 
		}
		
	}
	
	private void removePerson(String deleteName) {
		Iterator<Person> it = pList.iterator();
		while(it.hasNext()) {
			Person person = it.next();
			if(deleteName.equals(person.getName())) {
				it.remove();
				System.out.println(deleteName + "님의 정보를 삭제했습니다");
				return;	
				//Iterator 로 대상을 삭제하고 return 을 사용함으로써 그 즉시 메서드 사용한 곳으로 돌아가기
			}
		}
		System.out.println(deleteName + "가 존재하지 않습니다");
	}
	
}














	