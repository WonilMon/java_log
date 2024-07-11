package chapter16;

public class CarEngine {
	
	private Car car;
	
	public CarEngine (Car car) {  //객체가 생성될 때 Car 라는 객체가 가진 것들을 다 들어옴
		this.car = car;
	}
	public void start () {
		System.out.println("충전 레벨 확인 : " + car.getChargeLevel1());
		System.out.println(car.getModel() + "의 엔진을 구동합니다");
	}
	
	//어딘가에서 Car 를 사용하면 모든 값들이 이미 다 들어와서 get 을 썼을때 바른 값을 끌고옴
	
}
