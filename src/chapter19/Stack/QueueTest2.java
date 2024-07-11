package chapter19.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("1번");
		queue.offer("2번");
		queue.offer("3번");
		queue.offer("4번");
		queue.offer("5번");
		
		while(!queue.isEmpty()) {
			String str = queue.poll();		// poll : 가장 먼저 입력한 데이터가 추출 + 삭제
			System.out.println(str);
		}
		
	}
	
}
