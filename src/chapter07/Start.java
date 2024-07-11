package chapter07;

import java.util.Random;

public class Start {

	private int pcNum = new Random().nextInt(50) + 1; //1~50까지의 정수 중 랜덤한 수
	private int count;
	private String result = "FAIL";
	
	public String check (int myNumber) {
		
		count++;
		if(myNumber < pcNum) {
			System.out.println("UP!!");
		} else if(myNumber > pcNum) {
			 System.out.println("DOWN!!");
		} else {
			System.out.println(count + "회 만에 정답 ! ㅋ");
			result = "SUCCESS";
		}
		return result;
	}//check
	
	
}//class
