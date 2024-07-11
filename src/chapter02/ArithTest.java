package chapter02;

public class ArithTest {

	public static void main(String[] args) {
		
		//총점, 평균 출력
		
		int mathScore = 96;
		int engScore = 87;
		
		//총점
		int result = mathScore + engScore;
		
		System.out.println("총 점 : " + result);
		
		//평균
		int avg = (mathScore + engScore)/2;
		
		System.out.println("평 균 : " + avg);
		
		//평균
		double average1 = result/2; //double(정수/정수=정수)
		
		System.out.println(average1);
		
		double average2 = result/2.0; //double(정수/실수=실수)
		
		System.out.println(average2); 
		
		
		
		
		
		
		
		
		
		
		

	}

}
