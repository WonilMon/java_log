package chapter03.SWITCH;


public class SwitchCase05 {

	public static void main(String[] args) {
		
	
		int num = (int)(Math.random()*10)+1;
		String aa;
		
		switch (num) {
		case 1: case 2: case 3: case 4: case 5: case 6: 
			aa = num + "점 획득 !";
			break;
			
		default:
			aa = "잘못된 숫자 입니다";
		
			break;
		}
		

		System.out.print("주사위 눈의 수 : " + aa);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
