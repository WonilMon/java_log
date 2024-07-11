package chapter07.Example;

import chapter07.Example02.Store;

public class Student {

	public String studentName;
	public int money;
	
	//디폴트 생성자 생략
	public Student (String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		
		this.money-=1000;
		//수행하는 순간 학생돈 1000원이 빠져나가게 -3
		
		bus.passengerCount ++;
		bus.money += 1000;
		//bus의 멤버변수를 public으로 설정해놨기에 그냥 가져올 수 있다
		//보통 멤버변수는 private으로 설정(클래스의 객체는 숨겨놓는게 원칙)
		//private으로 해둔 경우 get,set / take메서드 등으로 가져옴
		
		/*
		bus.take(1000);
		*/
		
	}
	
	public void takeSubway(Subway sub) {
		this.money-=1500;
		sub.passengerCount ++;
		sub.money += 1500;
	}
		
	public void showInfo () {
		
		System.out.println(this.studentName + "님의 남은 잔액은 : " + this.money + "원 입니다");
		
	}
	
}
