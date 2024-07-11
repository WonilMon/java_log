package chapter15.Example;

public class StringTest06 {
	

	public static void main(String[] args) {
	
		String animal = "개,고양이,참새,거북이";
		
		//문자열을 분리해 배열에 담으세요
		
		String arr [] = animal.split(",");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		//분리된 문자열을 합치세요
		
		String join = String.join(",", arr);
		
		System.out.println(join);
		
	}
	
}
