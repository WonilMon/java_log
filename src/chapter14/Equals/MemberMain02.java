package chapter14.Equals;

public class MemberMain02 {
	public static void main(String[] args) {
		
		Member02 mem1 = new Member02("001");
		Member02 mem2 = new Member02("001");
		
		System.out.println("mem1 == mem2 는 물리적으로 동일하냐? " + (mem1 == mem2));
		System.out.println("mem1.equals(mem2)는 논리적으로 동등하냐? " + (mem1.equals(mem2)));
		//equals 재정의를 했기 때문에 논리적 동등이 뜨는 모습
		
	}
}
