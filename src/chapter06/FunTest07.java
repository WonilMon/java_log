package chapter06;

import java.util.Scanner;

public class FunTest07 {
	
	public void EduStep(int number){ 
		
		if(number<=0 || number>4) {
		
			System.out.println("해당하는 스터디 단위가 없습니다");
			
		}//if
		else { 
			
			System.out.println("현재 스터디단계는 step " + number + "입니다");
		
		}//else
	}
	 
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("스터디 단계를 입력하세요 : ");
		int number = Integer.parseInt(scan.nextLine());
		
		//EduStep(number); (static 지정 안했을 때)
		
		FunTest07 edu = new FunTest07();
		edu.EduStep(number);
		
		
	}

}
