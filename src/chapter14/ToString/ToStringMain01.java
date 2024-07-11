package chapter14.ToString;

public class ToStringMain01 {
	public static void main(String[] args) {
		
		Object obj = new Object();
		String str = obj.toString();
		
		System.out.println(str); //객체에 무슨 정보가 있는지 알 수 없으므로 '재정의' 필요
		System.out.println(obj);
		
	}
}
