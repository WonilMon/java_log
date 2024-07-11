package chapter13;

public interface Searchable {

	void search(String ur1);
	
}

//==================================

interface Remote {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}

//----------------------------------

class SmartTelevision implements Remote, Searchable{ //다중 상속

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
	}
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	@Override
	public void setVolume(int volume) {
		if(volume > Remote.MAX_VOLUME) {
			this.volume = Remote.MAX_VOLUME;
			System.out.println("최대 볼륨은 " + Remote.MAX_VOLUME + "입니다");
		}else if(volume < Remote.MIN_VOLUME) {
			this.volume = Remote.MIN_VOLUME;
			System.out.println("최소 볼륨은 " + Remote.MIN_VOLUME + "입니다");
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	} 
	
}












