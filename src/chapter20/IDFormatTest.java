package chapter20;

class IDFormatException extends Exception{
	
	public IDFormatException(String message) { 		// 예외를 발생시키면 얘가 생성이 되면서
		super(message);							 // 오류 뜨는 메시지를 수정해서 그대로 보내는 것
	}
	
}

//=====================================================================================================

public class IDFormatTest {
	
	private String id;
	
	//----------------------
	public String getId() {
		return id;
	}
	
	public void setId(String id) throws IDFormatException { //값을 주입하기 전에 제어문을 줘보자 (커스텀 예외 일단 만들기)
		if(id == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		}else if(id.length() < 8 || id.length() > 20) {
			throw new IDFormatException("아이디는 8글자 이상 20자 이하로 쓰세요.");
		}
		this.id = id;
	}
	//----------------------

	public static void main(String[] args) {
		
		IDFormatTest test = new IDFormatTest();
		
		String userID = "YAMAMOTOSENSEIHELLOFUCKHELLOSENSE";
		try {
			test.setId(userID);
		} catch (IDFormatException e) {
			e.printStackTrace();
		}
		
	}
	
}
