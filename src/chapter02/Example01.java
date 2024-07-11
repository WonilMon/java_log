package chapter02;

public class Example01 {

	public static void main(String[] args) {
		
		/*
		과수원에서 키우는 배, 사과, 오렌지의 하루 생상되는 양은 각각 5, 7, 5개이다.
		과수원에서 하루에 생산되는 총 과일의 개수를 출력하고, 시간당(24) 전체 과일의 평균 생산 개수를 출력하라
		 */
		
		int b = 5;
		int s = 7;
		int o = 5;
		
		double result = b + s + o;
		
		System.out.println("일일 총 생산 과일 개수 : " + (int)result + "개");
		
		double result24 = result/24;
		
 		System.out.println("시간당 전체 과일 평균 생산 개수 : " + result24 + "개");
		
		
		
		
		
		
		
		
		
		
	}

}
