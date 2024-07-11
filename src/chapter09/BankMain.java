package chapter09;

public class BankMain {

	public static void main(String[] args) {
		
		Bank.interest = 0.2f;
		
		Bank bk1 = new Bank("종각점", "010-1111-2222");
		bk1.getBank();
		
		System.out.println("-----------------------");
		
		Bank bk2 = new Bank("강남점", "010-3333-4444");
		bk2.getBank();

	}

}
