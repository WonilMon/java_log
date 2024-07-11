package chapter11;

public class AirplaneSupersonicMain {
	
	public static void main(String[] args) {
		
		AirplaneSupersonic s = new AirplaneSupersonic();
		
		s.takeoff();
		s.fly();
		s.flyMode  =  s.SUPERSONIC;
		s.fly();
		s.land();
		
		
		
	}
	
}
