package chapter03.FOR;

public class ForTest04 {
		
	public static void main(String[] args) {
		
		// 0 ~ 100까지 누적된 합(홀수 값만 합)
		
		int i;
		int sum =0;
		
		for (i=1; i<=100; i++) {
			if(i%2==0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);

		System.out.println("--------------");
		System.out.println("--------------");
		
		int num;
		int total = 0;
		
		for (num=1; num<=100; num++) {
			if (num%2 == 1) {
				total += num;
			}
		}
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
