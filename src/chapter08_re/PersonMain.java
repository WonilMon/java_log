package chapter08_re;

public class PersonMain {

	public static void main(String[] args) {
		
		Person kim = new Person();
		System.out.println(kim.name);
		System.out.println(kim.height);
		System.out.println(kim.weight);
		
		Person lee = new Person("이순신");
		System.out.println(lee.name);
		System.out.println(lee.height);
		System.out.println(lee.weight);
		
		Person seo = new Person("서원일",170,60);
		System.out.println(seo.name);
		System.out.println(seo.height);
		System.out.println(seo.weight);
		
	}

}
