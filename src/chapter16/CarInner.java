package chapter16;

public class CarInner {
	
	//외부에서 engine 을 끌어오는 게 아니라 이 안에 중첩클래스로
	
	private String model;
	private int chargeLevel;
	private CarEngine engine; 
	
	public CarInner (String model, int chargeLevel) { 
		// 생성되는 순간 입력한 멤버변수들은 각각의 변수에 들어가고,
		// 내부클래스인 CarEngine 이 생성되죠? 자기자신 내에서
		// 아까는 매개변수 자기자신을 넣었죠? (model 과 chargeLevel 을 가져가기 위해)
		// 이번엔 자기자신을 넣을 필요가없음 (private 이든 상관없음 ㅇㅇ 클래스 내라서)
		// 목적 : CarEngine과 같은 것을 CarInner에서만 쓸거라면 이걸 사용하는게 맞음
		
		this.model = model;
		this.chargeLevel = chargeLevel;
		this.engine = new CarEngine(); //CarInner 생성하자마자 CarEngine 생성해버리기
	}
	
	public void start () {
		
		engine.start();
		System.out.println("준비완료");
		
	}//외부클래스의 메서드
	
	private class CarEngine { //그냥 바로 model, chargeLevel 끌고오기가 가능
		
		public void start () {
			System.out.println("충전 레벨 확인 : " + chargeLevel);
			System.out.println(model + "의 엔진을 구동합니다");
		}//내부클래스의 메서드
		
	}//내부클래스
	
	
}//외부클래스
