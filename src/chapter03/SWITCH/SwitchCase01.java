package chapter03.SWITCH;

public class SwitchCase01 {

	public static void main(String[] args) {
		
		int ranking = (int)(Math.random()*4)+1;
		char medalColor;
		
		switch (ranking) {
		case 1:
			medalColor = '금';
			break;
		case 2:
			medalColor = '은';
			break;
		case 3:
			medalColor = '동';
			break;
			
		default:
			medalColor = '노';
			break;
		}
		
		
		System.out.println("ㅊㅋㅊㅋ " + ranking + "등 메달은 " + medalColor + "메달입니다 ㅎㅎ!");
		
		
		
		
		
		
		
		

	}

}
