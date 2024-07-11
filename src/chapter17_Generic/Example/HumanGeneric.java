package chapter17_Generic.Example;

public class HumanGeneric <T extends Human> { 
	//메터리얼을 가지고 있는 부모, 자식까지로 제한
	//Object 마냥 전혀 상관없는 객체가 들어올 수 있음 
	
	T human;
	
	//메서드로 주소값 옮겨서 불러오기
	public void act() {
		human.act();
	}
	
	//-------------------------------
	public T getHuman() {
		return human;
	}

	public void setHuman(T human) {
		this.human = human;
	}
	//-------------------------------
	
}
