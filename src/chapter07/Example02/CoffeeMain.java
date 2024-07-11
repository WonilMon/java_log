package chapter07.Example02;

import chapter07.Example02.Customer;
import chapter07.Example02.Store;

public class CoffeeMain {
	
	public static void main(String[] args) {
		
		//Store의 name엔 스타벅스라는 값이 들어가겠죠
		Store starCoffee = new Store("스타벅스");
		Store beanCoffee = new Store("빈커피");
		starCoffee.showInfo(); //임시 1차
		System.out.println("-------------------");
		
		Customer customer1 = new Customer("김철수", 10000); //오버로딩으로 Customer에 값을 저장
		Customer customer2 = new Customer("이영희", 15000);
	
		customer1.buyCoffee(starCoffee, "아메리카노"); 
		customer1.showInfo();
		customer2.buyCoffee(starCoffee, "모카"); 
		customer2.showInfo();
		customer2.buyCoffee(beanCoffee, "카푸치노");
		customer2.showInfo();
		
		//Customer클래스의 buyCoffee메서드가 수행이 되는데 스타커피를 끌고가요
		System.out.println("-------------------");
		starCoffee.showInfo(); //2차
		beanCoffee.showInfo();
		
	}

}

/*
1. 판매자(class)와 고객(class)에 private 필요한 필드를 지정해준다
2. 조건문 우선이므로 판매자(class)에 오버로딩과 조건문 코딩
3. 판매자(class)는 수익(+), 고객(class)는 지출(-) 관계 확인
4. 고객(class)에 오버로딩과 "판매자(class)-고객(class)-메인(main)" 객체 연결
5. 메인(class)에서 오버로딩을 통한 값집어넣을 수 있는 코딩
6. 최종 함수를 이용해 결과값만
7. showInfo등은 각 class에 만들어서 함수만 가져오기 (클래스 오버로딩?)
*/
