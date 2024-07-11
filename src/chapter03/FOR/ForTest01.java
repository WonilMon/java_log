package chapter03.FOR;

public class ForTest01 {
	
	public static void main(String[] args) {
		
		/* 1부터 10까지의 누적 합
		
		int sum = 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);
		
		*/
		
		int i;
		System.out.println("1부터 10까지의 누적 합 : ");
		
		for(i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("i : " + i); // 1++이니까 출력후 증감
		System.out.println("---------");
		
		int j;
		int sum = 0;
		for(j=1; j<=10; j++) {
			sum += j;
		} 
		System.out.println("1부터 10까지의 누적 합 : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
