package chapter09;

public class CompanyMain {

	public static void main(String[] args) {
		
		Company com1 = new Company();
		Company com2 = new Company();
		
		//일반적인 객체 생성(heep)
		System.out.println(com1);
		System.out.println(com2);
		
		System.out.println("---------------");
		
		//정적 메서드 getInstance를 호출하여 싱글톤 객체를 생성
		Company myCom1 = Company.getInstance();
		Company myCom2 = Company.getInstance();
		
		System.out.println(myCom1);
		System.out.println(myCom2);
		
	}

}
