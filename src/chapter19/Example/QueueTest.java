package chapter19.Example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		
		//Queue : 선입선출
		
		Queue<Message> messageQueue = new LinkedList<Message>();
		Message m1 = new Message("sendMail", "홍길동");
		Message m2 = new Message("sendSMS", "김유신");
		Message m3 = new Message("sendKakaotalk", "이순신");
		
		messageQueue.add(m1);
		messageQueue.add(m2);
		messageQueue.add(m3);	//m3
		messageQueue.add(m3);	//m3
		messageQueue.add(m3);	//m3

		while(!messageQueue.isEmpty()) {
			Message s = messageQueue.poll();
			System.out.println(s);
		}
		
	}

}
