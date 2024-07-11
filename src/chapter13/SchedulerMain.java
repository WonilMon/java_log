package chapter13;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무Skill값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			String a = scan.nextLine();
			
			if(a.equals("R") | a.equals("r")) {
				tem(new RoundRobin());
			}else if(a.equals("L") | a.equals("l")) {
				tem(new LeastJob());
			}else if(a.equals("P") | a.equals("p")) {
				tem(new PriorityAllocation());
			}else if (a.equals("S") | a.equals("s")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
		}
		
	}
	
	public static void tem (Scheduler sch) {
		sch.getNextCall();
		sch.sendCalltoAgent();
	}
	

}
