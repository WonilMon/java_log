package chapter14.Equals;

public class MemberMain01 {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 3;
		String c ="안녕";
		String d ="안녕"; //String 도 객체다. 
		System.out.println(a == b); //물리적 비교 
		System.out.println(c.equals(d)); //논리적 비교 : 보고있는 값이 일치하냐 안하냐
		
		System.out.println("-----------------------------------------------");
		
		Member01 mem1 = new Member01("001"); //멤버변수로 넣음, 따라서 논리적일치로 만들어줘야 함
		Member01 mem2 = new Member01("001");
		Member01 mem3 = mem1;
		System.out.println("mem1 == mem2 는 물리적으로 동일하냐? " + (mem1 == mem2)); //물리적으로 '다른' 주소값
		System.out.println("mem1 == mem3 는물리적으로 동일하냐? " + (mem1 == mem3)); //물리적으로 '동일한' 주소값
		System.out.println("mem1.equals(mem2)는 논리적으로 동등하냐? " + (mem1.equals(mem2))); 
	
		
	}

}
