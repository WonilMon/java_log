package chapter16;

public class Car {
	
	private String model;
	private int chargeLevel1;
	private CarEngine engine; 
	// Car 가 객체로 생성되는 순간 engine 멤버변수 생성
	
	public Car(String model, int chargeLevel) {
		this.model = model;
		this.chargeLevel1 = chargeLevel;
		this.engine = new CarEngine(this); //Car 가 생성될 때 값이 주입될 engine
		//엔진 생성, model 과 chargeLevel 의 값이 Car 로 들어가고 
		//엔진이라는 매개변수는 그 순간에 엔진이라는 객체를 만들면서 주소를 던져줌
		//그 값을 멤버변수로 다 쓸 수 있는 것
	}
	
	public void start() {
		engine.start();
		System.out.println("준비완료");
	}
	
	//----------------------------
	public String getModel() {
		return model;
	}

	public int getChargeLevel1() {
		return chargeLevel1;
	}
	//----------------------------	
	//get 메서드랑 위의 engine 은 메인 말고 CarEngine에서 쓰잖아요.
	//CarMain에서 쓰는 메서드가 아니죠. 
	//ㅈㄴ 복잡하니까 Car라는 클래스에서 CarEngine을 포함시키면 간결해짐 ㅇㅇ
}
