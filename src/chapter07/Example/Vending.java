package chapter07.Example;

import java.util.Scanner;

public class Vending {
	
	//멤버변수
	private Can[] can = new Can[5];
	private int money;
	
	//생성자생략
	
	//메서드
	public void init() {
		
		can[0] = new Can("환타", 1000);
		can[1] = new Can("사이다", 1200);
		can[2] = new Can("오렌지쥬스", 1100);
		can[3] = new Can("바나나우류", 1400);
		can[4] = new Can("콜라", 1000);
		
	}//init
	
	public void showCans(int m) { //사용가능한 음료만 보여주기 , 1100이라는 값을 넣어주면 작거나 같은가격의 음료만 표시
			
		money = m;	

		for (int i=0 ; i<can.length; i++) {
			if(can[i].getPrice()<=m) {
			System.out.println(can[i].getCanName() + "-" + can[i].getPrice() + "원");
			}
		}
			
			
	}//showCans
	
	public void outCan(String name) { // 선택한 음료의 제공과 잔액 
		
		for (int i = 0 ; i < can.length ; i++) {
			if(can[i].getCanName().equals(name)) {
				System.out.println(name + "을 선택하셨습니다");
				money -= can[i].getPrice();
			}
		}
		System.out.println("잔액 : " + money + "원");
		
		
	}//outCan

}//class

