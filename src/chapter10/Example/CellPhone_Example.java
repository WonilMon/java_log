package chapter10.Example;

public class CellPhone_Example {
	
	String model;
	String color;
	
	public void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다");		
	}
	
	public void bell () {
		System.out.println(" ♪ ♪ 벨이 울립니다 ♪ ♪ ");
	}
	
	public void sendVoice (String message) {
		System.out.println(message);
	}
	
	public void reveiveVoice (String message) {
		System.out.println(message);
	}
	
	public void hangUp () {
		System.out.println("전원을 끕니다");
	}

}

class DmbCellPhone_Example extends CellPhone_Example {
	
	int channel;
	
	public DmbCellPhone_Example(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	public void turnOnDmb () {
		System.out.println("채널 " + channel + "번 DMB방송을 시작합니다");
	}
	
	public void turnOffDmb () {
		System.out.println("DMB수신을 종료합니다");
	}
	
	public void changeChannelDmb (int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다");
	}
	
	
	
}