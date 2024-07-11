package chapter15;

public class StringMethod {
		
	public static void main(String[] args) {
		
		String str1 = "Hello Java Java";
		String str2 = "";
		String str3 = "    ";
		String str4 = "HELLO WORLD";
		String str5 = "hello world";
		
		System.out.println("문자열의 길이 : " + str1.length()); 
		System.out.println("7번째 문자열 : " + str1.charAt(7));
		System.out.println("문자열에 'Java'가 포함되어 있는지 : " + str1.contains("Java")); //boolean 타입
		System.out.println("문자열에서 'Java'의 첫번째 인덱스 : " + str1.indexOf("Java"));
		System.out.println("문자열이 비어있는지 : " + str1.isEmpty()); //boolean 타입 (공백 취급 ㅇㅇ)
		System.out.println("문자열이 비어있는지 : " + str2.isEmpty()); //boolean 타입
		System.out.println("문자열이 비어있는지 : " + str3.isEmpty()); //boolean 타입 
		System.out.println("문자열이 비어있거나 공백이거나 : " + str1.isBlank()); //boolean 타입 (공백 취급 ㄴㄴ)
		System.out.println("문자열이 비어있거나 공백이거나 : " + str2.isBlank()); //boolean 타입
		System.out.println("문자열이 비어있거나 공백이거나 : " + str3.isBlank()); //boolean 타입 
		System.out.println("str4와 str5의 논리적 비교 : " + str4.equals(str5));
		System.out.println("str4와 str5의 논리적 비교(대소문자 무시) : " + str4.equalsIgnoreCase(str5));
		
		System.out.println("---------- New Class ----------");
		
		String str01 = "Hello Java Java";
		String str02 = "      Hello World    ";
		String str03 = "HELLO world";
		
		System.out.println("인덱스 6부터 부분 문자열 : " + str01.substring(6)); 
		System.out.println("인덱스 6부터 8까지 부분문자열 : " + str01.substring(0,2)); 
		System.out.println("문자열 결합 : " + str01.concat(" Oracle"));
		System.out.println("Java를 World로 대체 : " + str01.replace("Java", "World"));
		System.out.println("앞 뒤 공백 제거 : \"" + str02.trim() + "\" "); // 쌍따옴표 넣기 : \"
		System.out.println("앞 뒤 공백 제거 : \"" + str02.strip() + "\" "); // 성능 굿, 이거쓰셈
		System.out.println("소문자로 반환 : " + str03.toLowerCase());
		System.out.println("대문자로 반환 : " + str03.toUpperCase());
		
		System.out.println("---------- New Class ----------");
		
		//매개변수 중심으로 문자열을 분리
		
		String str = "개,고양이,햄스터";
		String joinStr1 = "";
		String joinStr2 = "";
		
		String stringList [] = str.split(",");
		for(String s1 : stringList) {
			System.out.println(s1);
		}
		/*
		for(String s1 : stringList) {
			joinStr1 += s1 + ",";
			System.out.println(joinStr1);
		}
		for(int i=0; i<stringList.length; i++) {
			String s2 = stringList[i];
			joinStr2 += s2;
			if(i != stringList.length-1) {
				joinStr2 += ",";
			}
			System.out.println(joinStr2);
		}
		*/
		
		String result1 = String.join(",", stringList);
		System.out.println(result1);
		
		String result2 = String.join(",", "거북이", "악어", "이구아나");
		System.out.println(result2);
		
		
	}

}
