package chapter08_re;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("박자바", "010-111-2222");
		System.out.println("국가 : " + k1.nation); //객체들이 public으로 돼있어서 그냥 가져올수있다
		System.out.println("이름 : " + k1.name);
		System.out.println("번호 : " + k1.ssn);
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		Korean k2 = new Korean("김자바", "011-333-4444");
		System.out.println("국가 : " + k2.nation); 
		System.out.println("이름 : " + k2.name);
		System.out.println("번호 : " + k2.ssn);
		
	}

}
