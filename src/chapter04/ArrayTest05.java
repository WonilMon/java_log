package chapter04;

public class ArrayTest05 {

	public static void main(String[] args) {
		
		int score [] = {98,90,87};
		int sum = 0;
		
		for (int i=0; i<score.length; i++) {
			
			System.out.println("score[" + i + "] : " + score[i]);
			sum+=score[i];
		}
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (sum/(double)score.length));
		
		System.out.println("평균(반올림) : " + Math.round(sum/(double)score.length));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
