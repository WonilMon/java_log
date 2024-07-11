package chapter06;

public class FunTest05 {

	public String channel;
	public int channelInt;
	public int volume;
	
	public void channelUp(int volume) {
		
		System.out.println("소리를 " + volume + "만큼 올립니다");
		
	} //channelUp
	
	public void channelDown(int volume) {
		
		System.out.println("소리를 " + volume + "만큼 올립니다");
		
	} //channelDown
	
	public void channelChange(String channel) {
		
		System.out.println("TV채널을 " + channel + "로 바꿉니다");
		
	} //channelChange
	

	public void channelChange(int channel) {
		
		System.out.println("TV채널을 " + channel + "로 바꿉니다");
		
	} //channelChange
	
	public static void main(String[] args) {
		
		//channelUp(4);
		//channelDown(5); 
		//static의 경우 이런식으로 바로 불러오기가 가능한데, 비효율적
		
		FunTest05 tv = new FunTest05();
		tv.channelUp(4);
		tv.channelDown(5);
		
		tv.channelChange("EBS");
		tv.channelChange(13);
		tv.channelChange("131");
		
		
	} //main

} //class
