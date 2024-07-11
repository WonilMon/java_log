package chapter12;

public abstract class HttpServlet {
	public abstract void service ();
}

//----------------------------------------------------------------------

class  FileDownloadService extends HttpServlet {
	@Override
	public void service() {
		System.out.println("파일을 다운로드합니다");
	}	
}

//----------------------------------------------------------------------

class LoginService extends HttpServlet {
	@Override
	public void service() {
		System.out.println("로그인을 합니다");
	}
}