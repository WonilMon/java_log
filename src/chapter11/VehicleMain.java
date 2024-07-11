package chapter11;

public class VehicleMain {

	public static void main(String[] args) {
		
		// *new OOO을 한다는것은 새로운 주소값공간을 만들으라는거
		
		Driver d = new Driver();
		d.drive(new Vehicle()); //drive 메서드 참조변수에 new Vehicle 이라는 생성자를 보낸것 -> 부모(Vehicle)클래스의 run 함수 사용됨
		
		d.drive(new Bus());     //new Bus 라는 생성자를 보낸 것 -> 자식(Bus/Taxi)클래스의 '재정의된' run 함수 사용됨
		d.drive(new Taxi());    //업캐스팅
		
		//-------------------------------------------------------------------------------------------------
		
		Taxi taxi = new Taxi();
		d.drive(taxi); //taxi 의 주소값을 drive 메서드에 보이면 taxi 가 재정의한 값이 나오죠 (주소값의 메서드 실행)

	}

}
