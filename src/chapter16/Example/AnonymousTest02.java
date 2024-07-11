package chapter16.Example;

import java.util.Scanner;

interface Manager {
	void regist();
}

//======================================================================

public class AnonymousTest02 {
	
	private Scanner scan = new Scanner(System.in);
	private String student [];
	private String professor [];
	
	public void execute() {
		
		int select;
		
		while (true) {
			
			System.out.println("=========================");
			System.out.println("1. 등록 | 2. 출력 | 3. 종료");
			System.out.println("=========================");
			System.out.print("번호 선택 ㄱㄱ >> ");
			select = Integer.parseInt(scan.nextLine());
			
			if(select == 1) {
				System.out.print("학생 등록은 1번, 교수 등록은 2번 ㄱㄱ");
				select = Integer.parseInt(scan.nextLine());
				initializeManager(select);
			}else if(select == 2) {
				System.out.print("학생 등록은 1번, 교수 등록은 2번 ㄱㄱ ");
				select = Integer.parseInt(scan.nextLine());
				show(select);
			}else if(select == 3) {
				System.out.println("ㅃㅃ");
				break;
			}else {
				System.out.println("1~3까지의 숫자만 입력ㄱㄱ");
			}
			
		}//while
	
	}//execute
	
	//이 메서드만 가지고 놀거라서 그냥 프라이빗 할게요
	private void initializeManager(int num) {
		if(num==1) {
			
			//형식1 익명클래스
			Manager m = new Manager() {
				@Override
				public void regist() {
					countPeople(num); // 배열의 크기가 만들어졌죠
					for(int i=0; i<student.length;i++) {
						System.out.println("학생 " + (i+1) + "의 이름을 입력하셈");
						student[i] = scan.nextLine();
					}
				}
			};
			m.regist();
			
		}else if(num==2) {
			
			//형식2 익명클래스
			new Manager() {
				@Override
				public void regist() {
					countPeople(num); // 배열의 크기가 만들어졌죠
					for(int i=0; i<professor.length;i++) {
						System.out.println("교수 " + (i+1) + "의 이름을 입력하셈");
						professor[i] = scan.nextLine();
					}
				}
			}.regist();
			
			//이렇게는 잘 안하죠. 이벤트 처리할때나 하지
			//익명클래스구나 알고 해석만 할 줄 알면 됨
			
		}
	}//initializeManager
	
	private void countPeople(int num) {
		System.out.print("인원을 입력하세요 >> ");
		int count = Integer.parseInt(scan.nextLine());
		if(num==1) {
			student = new String[count]; //크기를 설정해줘야
		}else if(num==2) {
			professor = new String[count];
		}
	}//countPeople
	
	private void show(int num) {
		if(num==1) {
			System.out.println("====학생 목록====");
			for(int i=0; i<student.length; i++) {
				System.out.println("학생 " + (i+1) + student[i]);
			}
		}else if(num==2) {
			System.out.println("====교수 목록====");
			for(int i=0; i<professor.length; i++) {
				System.out.println("교수 " + (i+1) + professor[i]);
			}
		}else {
			System.out.println("다시 선택하셈");
		}
	}
	
	
}








