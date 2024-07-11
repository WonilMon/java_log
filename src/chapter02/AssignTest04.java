package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		
		System.out.println("==전위연산==");
		int gameScore = 150;
		int lastScore = ++gameScore;
		System.out.println("gameScore : " + gameScore); //151
		System.out.println("lastScore : " + lastScore); //151
		
		System.out.println("=================");

		lastScore = --gameScore;
		System.out.println("gameScore : " + gameScore); //150
		System.out.println("lastScore : " + lastScore); //150
		
		System.out.println("==후위연산==");
		int lastScore3 = gameScore++;
		System.out.println("lastScore : " + lastScore3); //150
		System.out.println("gameScore : " + gameScore); //151
		
		System.out.println("=================");
		
		int lastScore4 = gameScore--;
		System.out.println("lastScore : " + lastScore4); //151
		System.out.println("gameScore : " + gameScore); //150
		
		
		
		
		
		
		
		
		
		

	}

}
