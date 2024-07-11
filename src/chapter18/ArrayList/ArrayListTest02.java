package chapter18.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class User {
	
	private String id;
	private int pwd;

	//---------------------------------
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	//---------------------------------
}

//=======================================================

public class ArrayListTest02 { //객체를 배열에 담는 이 ArrayList 꼭 복습

	public static void main(String[] args) {
		
		//ArrayList 불러오고 여기다 User 객체 담겠습니다
		ArrayList<User> arr = new ArrayList<User>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디 생성 : ");
			String id = scan.nextLine();
			System.out.print("패스워드 생성 : ");
			int pw = Integer.parseInt(scan.nextLine());
			
			User user = new User(); //입력을 하면 user 라는 하나의 객체가 만들어지고 set 을 통해 값을 주입 
			user.setId(id);
			user.setPwd(pw);
			
			arr.add(user);
			//그럼 반복문이 돌 때마다 user 객체들이 ArrayList에 하나씩 들어가겠죠			
			
			//모든 User 정보 출력
			for(User u : arr) {
				System.out.println(u.getId());
				System.out.println(u.getPwd());
				System.out.println("====================");
			}
			
		}//while
		
	}//main

}
