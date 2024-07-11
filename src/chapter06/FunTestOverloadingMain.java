package chapter06;

public class FunTestOverloadingMain {

	public static void main(String[] args) {
		
		FunTestOverloading obj = new FunTestOverloading();
		
		obj.gerResult(5);
		obj.gerResult('A');
		obj.gerResult("가나다");
		obj.gerResult(1,'B',"가나다");
		
	}

}
