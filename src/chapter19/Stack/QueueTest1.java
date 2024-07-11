package chapter19.Stack;

import java.util.ArrayList;

//ArrayList로 스택 구현
class MyQueue {
	// 스택 : 후입선출
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue () { 							// 위에서 한 칸씩 팡팡 터뜨리기 ㅋ
		int len = arrayQueue.size();
		if(len==0) {
			System.out.println("큐가 비어있습니다");
			return null;
		}return (arrayQueue.remove(len-1));			// 가장 먼저 넣은 값이 제거, 반환값은 제거된 값
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

public class QueueTest1 {
	// 큐 : 선입선출
	
	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		queue.enQueue("AAA");
		queue.enQueue("BBB");
		queue.enQueue("CCC");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
	}
	
}
