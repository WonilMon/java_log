package chapter12;

public class HttpServletMain {

	public static void main(String[] args) {
		
		method(new LoginService());
		method(new FileDownloadService()); //2. method(new OO) 하면 바로 메서드 실행

	}
	
	public static void method (HttpServlet h) { //1. 이렇게 메서드를 올려놓고 (객체소환 귀찮아서 static 으로함)
		h.service();
	}

}
