package chapter03.FOR;

public class ForTest03 {

	public static void main(String[] args) {
		
		//1부터 100까지의 누적 합을 구하되, 합이 100이하
		
		int i;
		int sum = 0;
		
		for (i=1; i<=100; i++) {
			
			sum += i;
			
			if (sum > 100) {
				break;
			}
			
		}
		
		System.out.println(sum-i);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
