package chapter19.Stack;

import java.util.ArrayList;

//ArrayList로 스택 구현
class MyStack {
	// 스택 : 후입선출
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop () { 							// 위에서 한 칸씩 팡팡 터뜨리기 ㅋ
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("스택이 비어있습니다");
			return null;
		}return (arrayStack.remove(len-1));			// 가장 최근에 넣은 값이 제거, 반환값은 제거된 값
	}
}

//		pop
//------------
//		push
//------------
//		stack
//------------
//		main

//================================================================================

public class StackTest1 {
	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push("AAA");
		stack.push("BBB");
		stack.push("CCC");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
	
}


