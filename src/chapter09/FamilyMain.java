package chapter09;

public class FamilyMain {

	public static void main(String[] args) {
		
		//Family myFamily1 = new Family();
		Family myFamily1 = Family.getInstance();
		Family myFamily2 = Family.getInstance();
		
		System.out.println(myFamily1);
		System.out.println(myFamily2);		
		System.out.println(myFamily1==myFamily2);		
		
		
	}

}
