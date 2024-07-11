package chapter15.Example;

public class StringTest01 {

	public static void main(String[] args) {
		
		//length()메서드를 이용해 arr 배열에 들어간 모든 문자열 길이의 합을 구하시오
		String [] arr = {"개", "고양이", "햄스터", "너구리", "고라니"};
		int count=0;
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i] + " : " + arr[i].length());
			count += arr[i].length();
		}
		System.out.println("문자열들의 길이 합 : " + count);
		
		
	}

}
