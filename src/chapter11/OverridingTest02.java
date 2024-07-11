package chapter11;

import chapter10.Customer;
import chapter10.CustomerVIP;

public class OverridingTest02 {

	public static void main(String[] args) {
		
		Customer vc = new CustomerVIP(1003, "김씨", 2000);
		//VIP자식에서 호출 (업캐스팅 : 부모는 자식을 담을 수 있음, 덮어씌우기)
		//부모는 id=1003
		//부모는 name = "김씨"
		//자식은 할인율 = 2000
		
		//vc.getAgentID(); 자식이 가진 메서드는 쓸 수 없다
		//그러나 자식이 재정의한 것은 가져올 수 있다
		
		System.out.println(vc.showCustomer()); //부모와 자식 둘다 가지고있는 메서드
		//김씨님의 등급은 VIP이며 보너스 포인트는 0.0입니다
		//전문상담원은 2000입니다

	}

}
