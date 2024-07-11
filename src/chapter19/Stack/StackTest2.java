package chapter19.Stack;

import java.util.Stack;

public class StackTest2 {
	
	public static void main(String[] args) {
		
		Object obj;
		
		Stack<Object> st = new Stack<Object>();
		// java 에서 스택을 제공해줌,,, 거의 안쓰지만
		
		if(st.empty()) { //empty : null 이면 true 반환, 그렇지 않으면 false 반환
		
			for(int i=0; i<5; i++) {
				st.push(new String(i+"Hi"));
				// push 로 스택에 데이터 저장
				System.out.println("입력" + i + "번째 : " + st.peek());
				// peek : Stack 의 가장 위에 무엇이 있는지 물어보는 메서드
			}
			
		}
		
		System.out.println(st);
		System.out.println(st.pop() + " : 추출");
		System.out.println(st.pop() + " : 추출");
		System.out.println(st.pop() + " : 추출");
		System.out.println(st.pop() + " : 추출");
		System.out.println(st.pop() + " : 추출");
		
	}
	
}
