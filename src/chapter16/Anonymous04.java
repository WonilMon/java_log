package chapter16;

public class Anonymous04 {
	
		//Anonymous03에 있는 interface 가져옴
		
		public static  void hello(Process process) {
			System.out.println("프로그램 시작");
			process.run();
			System.out.println("프로그램 종료");
		}
		
		public static void main(String[] args) {
			
			//1번
			Process length = new Process() {
				@Override
				public void run() {
					String str = "Hello World";
					System.out.println("\"Hello World\"의 문자열 길이 : " + str.length());
				}
			};
						
			hello(length);
			System.out.println("------------------");
			
			//2번 (매개변수에 직접적으로 넣는법)
			hello(new Process() {
				@Override
				public void run() {
					int sum = 0;
					for(int i=1;i<=3;i++) {
						sum+=i;}
					System.out.println("1부터 3까지의 합 : " + sum);
				}});
			
		}
		
	}

