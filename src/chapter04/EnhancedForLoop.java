package chapter04;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		String strArray[] = {"Java", "Oracle", "HTML/CSS/JS/JQ", "JSP", "Spring", "Python"};
		
		for (int i = 0 ; i < strArray.length ; i++) {
			
			System.out.println(strArray[i]);
			
		}
		
		for (String lang : strArray) {
			
			System.out.println(lang);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
