package chapter16;

public class Anonymous06 {
	
	public void test() {
		
		//1번 방법
		Process p = new Process() {
			
			@Override
			public void run() {
					System.out.println("금요일");
				
			}
		};
			
		p.run();
		
		//2번 방법
		new Process() {
			
			@Override
			public void run() {
				System.out.println("목요일");
				
			}
		}.run();
		
	}
	
	public static void main(String[] args) {
		
		Anonymous06 a = new Anonymous06();
		a.test();
		
		
	}
	
}
