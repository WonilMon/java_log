package chapter20;

class AutoCloseObj implements AutoCloseable{
//AutoCloseable : try 문에서 선언된 객체들에 대해 try 가 종료되는 시점(finally)에서 자원을 자동으로 해제해주는 인터페이스
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다");
			
	}

}

//=====================================================================================================

public class AutoCloseTest1 {
	
	public static void main(String[] args) {
		
		/* <close 없이>
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 부분입니당");
		}
		*/
		
		/* <close 넣고>
		try (AutoCloseObj obj1 = new AutoCloseObj()){
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 부분입니당");
		}
		*/
		
		//	<close 분리>
		AutoCloseObj obj1 = new AutoCloseObj();	//나중에 try 안에 넣을것도 많으니까 이렇게 분리해서
		
		try (obj1){
			throw new Exception(); // 예외상황을 일부러 발생시키는 메서드
		} catch (Exception e) {
			System.out.println("예외 부분입니당");
		}
		
	}
	
}
